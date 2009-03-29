package org.unbunt.sqlscript.statement;

import java.util.List;

public abstract class AbstractFunctionCallExpression extends AbstractExpression {

    protected List<Expression> arguments = null;

    protected Expression[] argumentsArray = null;

    public Expression[] getArgumentsArray() {
        return argumentsArray;
    }

    public List<Expression> getArguments() {
        return arguments;
    }

    public void setArguments(List<Expression> arguments) {
        this.arguments = arguments;
        this.argumentsArray = arguments.toArray(new Expression[arguments.size()]);
    }

}
