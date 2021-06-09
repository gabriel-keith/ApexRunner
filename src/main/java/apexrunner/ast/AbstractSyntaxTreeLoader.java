package apexrunner.ast;

import apexrunner.parser.ApexParser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class AbstractSyntaxTreeLoader {
    public ApexClass loadClass(ApexParser.TypeDeclarationContext ctx) {
        var modifiers = ctx.classOrInterfaceModifier();
        ApexClass apexClass = new ApexClass();

        if (modifiers != null) {
            for (var modifier : modifiers) {
                switch (getTerminalSymbol(modifier).getType()) {
                    case ApexParser.ABSTRACT -> apexClass.abstraction = ApexAbstraction.ABSTRACT;
                    case ApexParser.VIRTUAL -> apexClass.abstraction = ApexAbstraction.VIRTUAL;
                    case ApexParser.PRIVATE -> apexClass.accessModifier = ApexAccessModifier.PRIVATE;
                    case ApexParser.PROTECTED -> apexClass.accessModifier = ApexAccessModifier.PROTECTED;
                    case ApexParser.GLOBAL -> apexClass.accessModifier = ApexAccessModifier.GLOBAL;
                }
            }
        }

        var classDeclaration = ctx.classDeclaration();

        apexClass.identifier = classDeclaration.Identifier().getText();

        var classBody = classDeclaration.classBody().classBodyDeclaration();
        for (var dec : classBody) {
            var memberMods = dec.modifier();
            var memberCtx = dec.memberDeclaration();

            var field = memberCtx.fieldDeclaration();
            if (field != null) {
                var variables = field.variableDeclarators().variableDeclarator();
                var type = field.type_();
                for (var variable : variables) {
                    ApexField apexField = this.loadField(memberMods, type, variable);

                    apexClass.fields.put(apexField.identifier, apexField);
                }
            }
        }

        return apexClass;
    }

    public ApexField loadField(List<ApexParser.ModifierContext> modifiers, ApexParser.Type_Context type, ApexParser.VariableDeclaratorContext declaration) {
        ApexField apexField = new ApexField();
        apexField.identifier = declaration.variableDeclaratorId().Identifier().getText();
        apexField.typeIdentifier = type.getText();

        if (modifiers != null) {
            for (var modifier : modifiers) {
                switch (getTerminalSymbol(modifier.classOrInterfaceModifier()).getType()) {
                    case ApexParser.VIRTUAL -> apexField.abstraction = ApexAbstraction.VIRTUAL;
                    case ApexParser.PUBLIC -> apexField.accessModifier = ApexAccessModifier.PUBLIC;
                    case ApexParser.PROTECTED -> apexField.accessModifier = ApexAccessModifier.PROTECTED;
                    case ApexParser.GLOBAL -> apexField.accessModifier = ApexAccessModifier.GLOBAL;
                    case ApexParser.FINAL -> apexField.isFinal = true;
                    case ApexParser.STATIC -> apexField.isStatic = true;
                }
            }
        }

        if (declaration.variableInitializer() != null) {
            apexField.initializer = loadExpression(declaration.variableInitializer().expression());
        }

        return apexField;
    }

    public ApexExpression loadExpression(ApexParser.ExpressionContext expressionContext) {
        if (expressionContext.NEW() != null && expressionContext.creator() != null) {
            ApexExpression.ApexClassInitExpression expression = new ApexExpression.ApexClassInitExpression();
            expression.typeIdentifier = expressionContext.creator().createdName().getText();

            return expression;
        }

        if (expressionContext.primary() != null && expressionContext.primary().literal() != null) {
            return this.loadLiteral(expressionContext.primary().literal());
        }

        return null;
    }

    public ApexExpression.ApexLiteral loadLiteral(ApexParser.LiteralContext literalContext) {
        Token symbol = getTerminalSymbol(literalContext);

        return switch (symbol.getType()) {
            case ApexParser.BooleanLiteral -> new ApexExpression.ApexBooleanLiteral(Boolean.parseBoolean(symbol.getText()));
            case ApexParser.FloatingPointLiteral -> new ApexExpression.ApexFloatLiteral(symbol.getText());
            case ApexParser.IntegerLiteral -> new ApexExpression.ApexIntLiteral(Integer.parseInt(symbol.getText()));
            case ApexParser.NullLiteral -> new ApexExpression.ApexNullLiteral();

            default -> throw new IllegalStateException("Unknown literal");
        };
    }

    private static Token getTerminalSymbol(ParseTree tree) {
        if (tree.getChildCount() != 0 && tree.getChild(0) instanceof TerminalNode terminal) {
            return terminal.getSymbol();
        }
        throw new IllegalArgumentException("ParseTree is not terminal node.");
    }
}
