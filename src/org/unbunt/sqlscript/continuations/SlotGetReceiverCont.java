package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.statement.Expression;

public class SlotGetReceiverCont implements Continuation {
    protected Expression slotExpression;

    public SlotGetReceiverCont(Expression slotExpression) {
        this.slotExpression = slotExpression;
    }

    public Expression getSlotExpression() {
        return slotExpression;
    }
}
