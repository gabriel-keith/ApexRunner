package apexrunner.ast;

public class ApexField {
    public ApexAccessModifier accessModifier = ApexAccessModifier.PRIVATE;
    public ApexAbstraction abstraction = ApexAbstraction.FINAL;
    public boolean isFinal;
    public boolean isStatic;

    public String identifier;
    public String typeIdentifier;

    public ApexExpression initializer;
}
