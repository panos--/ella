package org.unbunt.ella.engine.continuations;

import org.unbunt.ella.engine.corelang.Obj;
import org.unbunt.ella.compiler.stmtbase.Expression;
import org.unbunt.ella.engine.continuations.ContinuationVisitor;

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
