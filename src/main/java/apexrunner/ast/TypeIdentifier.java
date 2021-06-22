package apexrunner.ast;

import java.util.ArrayList;
import java.util.List;

public class TypeIdentifier {
    private String name;
    private final List<TypeIdentifier> generics = new ArrayList<>();

    public TypeIdentifier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
