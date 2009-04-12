package org.unbunt.sqlscript.statement;

import java.util.List;
import java.util.ArrayList;

public abstract class AbstractFunctionCallExpression extends AbstractExpression {

    protected List<Expression> arguments = null;

    public List<Expression> getArguments() {
        return arguments;
    }

    public void setArguments(List<Expression> arguments) {
        this.arguments = arguments;
    }

    public void addArgument(Expression argument) {
        if (arguments == null) {
            arguments = new ArrayList<Expression>();
        }
        arguments.add(argument);
    }
}
