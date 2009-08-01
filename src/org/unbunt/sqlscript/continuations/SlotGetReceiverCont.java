package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.statement.Expression;
import org.unbunt.sqlscript.continuations.ContinuationVisitor;

public class SlotGetReceiverCont implements Continuation {
    protected Expression slotExpression;

    public SlotGetReceiverCont(Expression slotExpression) {
        this.slotExpression = slotExpression;
    }

    public Expression getSlotExpression() {
        return slotExpression;
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}
