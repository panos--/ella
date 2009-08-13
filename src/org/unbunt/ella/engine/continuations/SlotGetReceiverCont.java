package org.unbunt.ella.engine.continuations;

import org.unbunt.ella.compiler.stmtbase.Expression;
import org.unbunt.ella.engine.continuations.ContinuationVisitor;

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
