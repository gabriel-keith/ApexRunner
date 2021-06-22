package apexrunner.ast.expression;

import apexrunner.ast.TypeIdentifier;

import java.util.ArrayList;
import java.util.List;

public class ObjectCreationExpression extends Expression {
    public TypeIdentifier typeIdentifier;
    public List<Expression> arguments = new ArrayList<>();
}
