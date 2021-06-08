package apexrunner.ast;

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

            if (field.initializer instanceof ApexExpression.ApexLiteral literal) {
                builder.append(" = ");
                builder.append(literal(literal));
            }

            builder.append(";\n");
        }

        builder.append("}\n");

        return builder;
    }

    private static String accessModifier(ApexAccessModifier modifier) {
        return switch (modifier) {
            case PUBLIC, GLOBAL -> "public ";
            case PRIVATE -> "private ";
            case PROTECTED -> "protected ";
        };
    }

    private static String abstraction(ApexAbstraction abstraction) {
        return switch (abstraction) {
            case FINAL -> "final ";
            case ABSTRACT -> "abstract ";
            case VIRTUAL -> "";
        };
    }

    private static String type(String typeIdentifier) {
        return switch (typeIdentifier) {
            case "Integer" -> "int";
            case "Float" -> "float";
            case "Double" -> "double";
            case "Boolean" -> "boolean";
            default -> typeIdentifier;
        };
    }

    private static String literal(ApexExpression.ApexLiteral literal) {
        if (literal instanceof ApexExpression.ApexStringLiteral stringLiteral) {
            return "\"" + stringLiteral.value + "\"";
        }
        if (literal instanceof ApexExpression.ApexIntLiteral intLiteral) {
            return String.valueOf(intLiteral.value);
        }
        if (literal instanceof ApexExpression.ApexFloatLiteral floatLiteral) {
            return floatLiteral.value;
        }
        if (literal instanceof ApexExpression.ApexNullLiteral) {
            return "null";
        }
        if (literal instanceof ApexExpression.ApexBooleanLiteral booleanLiteral) {
            return String.valueOf(booleanLiteral.value);
        }

        return "";
    }

    private static String indent(int indentLevel) {
        return "    ".repeat(indentLevel);
    }
}
