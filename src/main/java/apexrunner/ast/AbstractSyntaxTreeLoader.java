package apexrunner.ast;

import apexrunner.parser.ApexParser;

import java.util.List;

public class AbstractSyntaxTreeLoader {
    public ApexClass loadClass(ApexParser.TypeDeclarationContext ctx) {
        var modifiers = ctx.classOrInterfaceModifier();
        ApexClass apexClass = new ApexClass();

        if (modifiers != null) {
            for (var mod : modifiers) {
                if (mod.ABSTRACT() != null) {
                    apexClass.abstraction = ApexAbstraction.ABSTRACT;
                }
                if (mod.VIRTUAL() != null) {
                    apexClass.abstraction = ApexAbstraction.VIRTUAL;
                }

                if (mod.PRIVATE() != null) {
                    apexClass.accessModifier = ApexAccessModifier.PROTECTED;
                }
                if (mod.PROTECTED() != null) {
                    apexClass.accessModifier = ApexAccessModifier.PROTECTED;
                }
                if (mod.GLOBAL() != null) {
                    apexClass.accessModifier = ApexAccessModifier.GLOBAL;
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
                var mod = topMod.classOrInterfaceModifier();
                if (mod.ABSTRACT() != null) {
                    //Fields can't be abstract
                    //apexField.isAbstract = true;
                }
                if (mod.VIRTUAL() != null) {
                    apexField.abstraction = ApexAbstraction.VIRTUAL;
                }
                if (mod.FINAL() != null) {
                    apexField.isFinal = true;
                }
                if (mod.STATIC() != null) {
                    apexField.isStatic = true;
                }

                if (mod.PUBLIC() != null) {
                    apexField.accessModifier = ApexAccessModifier.PUBLIC;
                }
                if (mod.PROTECTED() != null) {
                    apexField.accessModifier = ApexAccessModifier.PROTECTED;
                }
                if (mod.GLOBAL() != null) {
                    apexField.accessModifier = ApexAccessModifier.GLOBAL;
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

            if (literal.BooleanLiteral() != null) {
                return new ApexExpression.ApexBooleanLiteral(Boolean.parseBoolean(literal.getText()));
            } else if (literal.StringLiteral() != null) {
                return new ApexExpression.ApexStringLiteral(literal.getText().substring(1, literal.getText().length() - 1));
            } else if (literal.FloatingPointLiteral() != null) {
                return new ApexExpression.ApexFloatLiteral(literal.getText());
            } else if (literal.IntegerLiteral() != null) {
                return new ApexExpression.ApexIntLiteral(Integer.parseInt(literal.getText()));
            } else if (literal.NullLiteral() != null) {
                return new ApexExpression.ApexNullLiteral();
            }
        }

        return null;
    }
}
