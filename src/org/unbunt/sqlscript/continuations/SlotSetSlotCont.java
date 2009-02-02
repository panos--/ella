package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.lang.Obj;
import org.unbunt.sqlscript.statement.Expression;

public class SlotSetSlotCont implements Continuation {
    protected Obj receiver;
    protected Expression valueExpression;

    public SlotSetSlotCont(Obj receiver, Expression valueExpression) {
        this.receiver = receiver;
        this.valueExpression = valueExpression;
    }

    public Obj getReceiver() {
        return receiver;
    }

    public Expression getValueExpression() {
        return valueExpression;
    }
}
