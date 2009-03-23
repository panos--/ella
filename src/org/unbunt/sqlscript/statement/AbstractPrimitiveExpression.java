package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.lang.Obj;

import java.util.Map;

public abstract class AbstractPrimitiveExpression extends AbstractExpression implements PrimitiveExpression {
    protected Map<String, Obj> arguments;

    public void setArguments(Map<String, Obj> arguments) {
        this.arguments = arguments;
    }

    public Map<String, Obj> getArguments() {
        return arguments;
    }
}
