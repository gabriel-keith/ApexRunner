package apexrunner.ast;

import java.util.HashMap;
import java.util.Map;

public class ApexClass {
    public AccessLevel accessModifier = AccessLevel.PRIVATE;
    public AbstractionLevel abstraction = AbstractionLevel.FINAL;

    public String identifier;

    public Map<String, ApexField> fields = new HashMap<>();
}
