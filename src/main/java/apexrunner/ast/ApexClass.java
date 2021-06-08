package apexrunner.ast;

import java.util.HashMap;
import java.util.Map;

public class ApexClass {
    public ApexAccessModifier accessModifier = ApexAccessModifier.PUBLIC;
    public ApexAbstraction abstraction = ApexAbstraction.FINAL;

    public String identifier;

    public Map<String, ApexField> fields = new HashMap<>();
}
