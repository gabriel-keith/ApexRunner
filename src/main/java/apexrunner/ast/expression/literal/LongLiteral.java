package apexrunner.ast.expression.literal;

public class LongLiteral extends Literal {
    private long value;

    public LongLiteral(long value) {
        this.value = value;
    }

    public long getValue() {
        return this.value;
    }
}
