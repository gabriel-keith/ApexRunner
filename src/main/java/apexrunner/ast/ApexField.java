package apexrunner.ast;

import apexrunner.ast.expression.Expression;

public class ApexField {
    public AccessLevel accessModifier = AccessLevel.PRIVATE;
    public AbstractionLevel abstraction = AbstractionLevel.FINAL;
    public boolean isFinal;
    public boolean isStatic;

    public String identifier;
    public TypeIdentifier typeIdentifier;

    public Expression initializer;
}
