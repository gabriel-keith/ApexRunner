package apexrunner.ast.expression.literal;

public class DoubleLiteral extends Literal {
    private double value;

    public DoubleLiteral(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
