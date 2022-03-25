package apexrunner.ast;

public class Modifiers {
    private AccessLevel accessLevel;
    private AbstractionLevel abstractionLevel;

    public AccessLevel getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(AccessLevel accessLevel) {
        this.accessLevel = accessLevel;
    }

    public AbstractionLevel getAbstractionLevel() {
        return abstractionLevel;
    }

    public void setAbstractionLevel(AbstractionLevel abstractionLevel) {
        this.abstractionLevel = abstractionLevel;
    }

    public enum AbstractionLevel {
        FINAL, VIRTUAL, ABSTRACT
    }

    public enum AccessLevel {
        PUBLIC,
        GLOBAL,
        PRIVATE,
        PROTECTED
    }
}
