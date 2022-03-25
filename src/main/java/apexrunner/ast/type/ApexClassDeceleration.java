package apexrunner.ast.type;

import apexrunner.ast.ApexFieldDeceleration;
import apexrunner.ast.Modifiers;
import apexrunner.ast.type.ApexTypeDeceleration;

import java.util.HashMap;
import java.util.Map;

public class ApexClassDeceleration extends ApexTypeDeceleration {
    private final Map<String, ApexFieldDeceleration> fields = new HashMap<>();

    public ApexClassDeceleration(Modifiers modifiers) {
        this.modifiers = modifiers;
    }

    public void putField(String name, ApexFieldDeceleration apexFieldDeceleration) {
        fields.put(name, apexFieldDeceleration);
    }

    public ApexFieldDeceleration getField(String name) {
        return fields.get(name);
    }
}
