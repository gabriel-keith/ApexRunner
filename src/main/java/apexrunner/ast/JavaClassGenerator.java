package apexrunner.ast;

import apexrunner.ast.expression.literal.*;

public class JavaClassGenerator {


    public StringBuilder generate(ApexClass apexClass) {
        StringBuilder builder = new StringBuilder();

        builder.append(accessModifier(apexClass.accessModifier));

        builder.append(abstraction(apexClass.abstraction));

        builder.append("class ");
        builder.append(apexClass.identifier);
        builder.append(" {\n");

        int indentLevel = 1;

        for (var field : apexClass.fields.values()) {
            builder.append(indent(indentLevel));
            builder.append(accessModifier(field.accessModifier));

            if (field.isStatic) {
                builder.append("static ");
            }

            if (field.isFinal) {
                builder.append("final ");
            }

            builder.append(type(field.typeIdentifier));
            builder.append(" ");
            builder.append(field.identifier);

            if (field.initializer instanceof Literal literal) {
                builder.append(" = ");
                builder.append(literal(literal));
            }

            builder.append(";\n");
        }

        builder.append("}\n");

        return builder;
    }

    private static String accessModifier(AccessLevel modifier) {
        return switch (modifier) {
            case PUBLIC, GLOBAL -> "public ";
            case PRIVATE -> "private ";
            case PROTECTED -> "protected ";
        };
    }

    private static String abstraction(AbstractionLevel abstraction) {
        return switch (abstraction) {
            case FINAL -> "final ";
            case ABSTRACT -> "abstract ";
            case VIRTUAL -> "";
        };
    }

    private static String type(TypeIdentifier typeIdentifier) {
        return switch (typeIdentifier.getName()) {
            case "id", "string" -> "String";
            case "integer" -> "int";
            case "long" -> "long";
            case "float" -> "double";
            case "boolean" -> "boolean";

            case "list" -> "ArrayList";
            default -> typeIdentifier.getName();
        };
    }

    private static String literal(Literal literal) {
        if (literal instanceof StringLiteral stringLiteral) {
            return "\"" + stringLiteral.getValue() + "\"";
        } else if (literal instanceof IntegerLiteral intLiteral) {
            return String.valueOf(intLiteral.getValue());
        } else if (literal instanceof LongLiteral longLiteral) {
            return String.valueOf(longLiteral.getValue()) + 'L';
        } else if (literal instanceof DoubleLiteral floatLiteral) {
            return String.valueOf(floatLiteral.getValue());
        } else if (literal instanceof NullLiteral) {
            return "null";
        } else if (literal instanceof BooleanLiteral booleanLiteral) {
            return String.valueOf(booleanLiteral.getValue());
        }

        return "";
    }

    private static String indent(int indentLevel) {
        return "    ".repeat(indentLevel);
    }
}
