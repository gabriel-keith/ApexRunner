package apexrunner.ast;

import apexrunner.ast.expression.Expression;

public class ApexFieldDeceleration {
    private Modifiers modifiers;
    public boolean isFinal;
    public boolean isStatic;

    public String identifier;
    public TypeIdentifier typeIdentifier;

    public Expression initializer;
}
