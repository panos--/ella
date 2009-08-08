package org.unbunt.sqlscript.engine.continuations;

import org.unbunt.sqlscript.compiler.stmtbase.Expression;
import org.unbunt.sqlscript.engine.continuations.ContinuationVisitor;

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
