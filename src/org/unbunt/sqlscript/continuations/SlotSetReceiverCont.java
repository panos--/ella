package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.statement.Expression;

public class SlotSetReceiverCont implements Continuation {
    protected Expression slotExpression;
    protected Expression valueExpression;

    public SlotSetReceiverCont(Expression slotExpression, Expression valueExpression) {
        this.slotExpression = slotExpression;
        this.valueExpression = valueExpression;
    }

    public Expression getSlotExpression() {
        return slotExpression;
    }

    public Expression getValueExpression() {
        return valueExpression;
    }
}
