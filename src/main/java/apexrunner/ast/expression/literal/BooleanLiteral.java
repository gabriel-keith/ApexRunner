package apexrunner.ast.expression.literal;

public class BooleanLiteral extends Literal {
    private boolean value;

    public BooleanLiteral(boolean value) {
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }
}
