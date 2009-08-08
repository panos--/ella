package org.unbunt.sqlscript.compiler.statement;

import org.unbunt.sqlscript.compiler.statement.ExpressionVisitor;

public class SlotCallExpression extends AbstractFunctionCallExpression {
    protected SlotExpression slotExpression;

    public SlotCallExpression(SlotExpression slotExpression) {
        this.slotExpression = slotExpression;
    }

    public SlotCallExpression() {
    }

    public SlotExpression getSlotExpression() {
        return slotExpression;
    }

    public void setSlotExpression(SlotExpression slotExpression) {
        this.slotExpression = slotExpression;
    }

    public boolean isSuperCall() {
        return (callFlags & CALL_FLAG_SUPER) != 0;
    }

    public void setSuperCall(boolean superCall) {
        if (superCall) {
            callFlags |= CALL_FLAG_SUPER;
        }
        else {
            callFlags &= ~CALL_FLAG_SUPER;
        }
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}