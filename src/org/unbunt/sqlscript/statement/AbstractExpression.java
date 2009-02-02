package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.lang.Obj;

public abstract class AbstractExpression extends AbstractStatement implements Expression {
    protected Obj value = null;

    public AbstractExpression() {
    }

    public Obj getValue() {
        return value;
    }

    public void setValue(Obj value) {
        this.value = value;
    }
}
