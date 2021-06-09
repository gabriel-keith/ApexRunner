package apexrunner.ast;

import java.util.ArrayList;
import java.util.List;

public class ApexExpression {


    public static class ApexClassInitExpression extends ApexExpression {
        public String typeIdentifier;
        public List<String> generics = new ArrayList<>(); // only applies to a small number of types
        public List<ApexExpression> arguments = new ArrayList<>();
    }

    public static class ApexLiteral extends ApexExpression {
    }

    public static class ApexStringLiteral extends ApexLiteral {
        public String value;

        public ApexStringLiteral(String value) {
            this.value = value;
        }
    }

    public static class ApexBooleanLiteral extends ApexLiteral {
        public boolean value;

        public ApexBooleanLiteral(boolean value) {
            this.value = value;
        }
    }

    public static class ApexFloatLiteral extends ApexLiteral {
        public String value; // don't parse to account for varying precision

        public ApexFloatLiteral(String value) {
            this.value = value;
        }
    }

    public static class ApexDoubleLiteral extends ApexLiteral {
        public double value;

        public ApexDoubleLiteral(double value) {
            this.value = value;
        }
    }

    public static class ApexCharLiteral extends ApexLiteral {
        public char value;

        public ApexCharLiteral(char value) {
            this.value = value;
        }
    }

    public static class ApexIntLiteral extends ApexLiteral {
        public int value;

        public ApexIntLiteral(int value) {
            this.value = value;
        }
    }

    public static class ApexNullLiteral extends ApexLiteral {
    }
}
