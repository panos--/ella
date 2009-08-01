package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.engine.Obj;
import org.unbunt.sqlscript.statement.Expression;
import org.unbunt.sqlscript.continuations.ContinuationVisitor;

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

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}
