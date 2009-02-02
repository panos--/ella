package org.unbunt.sqlscript.statement;

import java.util.Map;

public abstract class AbstractFunctionCallExpression extends AbstractExpression {

    protected Map<String, Expression> arguments = null;

    public Map<String, Expression> getArguments() {
        return arguments;
    }

    public void setArguments(Map<String, Expression> arguments) {
        this.arguments = arguments;
    }

}
