package apexrunner.ast;

import apexrunner.parser.ApexParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class AbstractSyntaxTreeLoader {
    public ApexClass loadClass(ApexParser.TypeDeclarationContext ctx) {
        var modifiers = ctx.classOrInterfaceModifier();
        ApexClass apexClass = new ApexClass();

        if (modifiers != null) {
            for (var modifier : modifiers) {
                if (modifier.getChildCount() == 1 && modifier.getChild(0) instanceof TerminalNode terminal) {
                    switch (terminal.getSymbol().getType()) {
                        case ApexParser.ABSTRACT -> apexClass.abstraction = ApexAbstraction.ABSTRACT;
                        case ApexParser.VIRTUAL -> apexClass.abstraction = ApexAbstraction.VIRTUAL;
                        case ApexParser.PRIVATE -> apexClass.accessModifier = ApexAccessModifier.PRIVATE;
                        case ApexParser.PROTECTED -> apexClass.accessModifier = ApexAccessModifier.PROTECTED;
                        case ApexParser.GLOBAL -> apexClass.accessModifier = ApexAccessModifier.GLOBAL;
                    }
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

                    if (variable.variableInitializer() != null) {
                        apexField.initializer = loadExpression(variable.variableInitializer().expression());
                    }

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
            for (var topMod : modifiers) {
                ApexParser.ClassOrInterfaceModifierContext modifier = topMod.classOrInterfaceModifier();

                if (modifier.getChildCount() == 1 && modifier.getChild(0) instanceof TerminalNode terminal) {
                    switch (terminal.getSymbol().getType()) {
                        case ApexParser.VIRTUAL -> apexField.abstraction = ApexAbstraction.VIRTUAL;
                        case ApexParser.PUBLIC -> apexField.accessModifier = ApexAccessModifier.PUBLIC;
                        case ApexParser.PROTECTED -> apexField.accessModifier = ApexAccessModifier.PROTECTED;
                        case ApexParser.GLOBAL -> apexField.accessModifier = ApexAccessModifier.GLOBAL;
                        case ApexParser.FINAL -> apexField.isFinal = true;
                        case ApexParser.STATIC -> apexField.isStatic = true;
                    }
                }
            }
        }

        return apexField;
    }

    public ApexExpression loadExpression(ApexParser.ExpressionContext expressionContext) {
        if (expressionContext.NEW() != null && expressionContext.creator() != null) {
            ApexExpression.ApexClassInitExpersion expression = new ApexExpression.ApexClassInitExpersion();
            expression.typeIdentifier = expressionContext.creator().createdName().getText();

            return expression;
        }

        if (expressionContext.primary() != null && expressionContext.primary().literal() != null) {
            var literal = expressionContext.primary().literal();

            if (literal.getChildCount() == 1 && literal.getChild(0) instanceof TerminalNode terminal) {
                return switch (terminal.getSymbol().getType()) {
                    case ApexParser.BooleanLiteral -> new ApexExpression.ApexBooleanLiteral(Boolean.parseBoolean(terminal.getText()));
                    case ApexParser.FloatingPointLiteral -> new ApexExpression.ApexFloatLiteral(literal.getText());
                    case ApexParser.IntegerLiteral -> new ApexExpression.ApexIntLiteral(Integer.parseInt(literal.getText()));
                    case ApexParser.NullLiteral -> new ApexExpression.ApexNullLiteral();

                    default -> throw new IllegalStateException("Unknown literal");
                };
            }
        }

        return null;
    }
}
