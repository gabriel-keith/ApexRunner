package apexrunner.ast.type;

import apexrunner.ast.Modifiers;

public abstract class ApexTypeDeceleration {
    private String identifier;
    protected Modifiers modifiers;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}
