package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.lang.Obj;

public abstract class AbstractPrimitiveExpression extends AbstractExpression implements PrimitiveExpression {
    protected Obj[] arguments;

    public void setArguments(Obj[] arguments) {
        this.arguments = arguments;
    }

    public Obj[] getArguments() {
        return arguments;
    }
}
