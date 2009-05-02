package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.support.ExpressionVisitor;

public class SlotSetExpression extends AbstractExpression {
    protected SlotExpression slotExpression;
    protected Expression valueExpression;

    public SlotSetExpression(SlotExpression slotExpression, Expression valueExpression) {
        this.slotExpression = slotExpression;
        this.valueExpression = valueExpression;
    }

    public SlotSetExpression() {
    }

    public SlotExpression getSlotExpression() {
        return slotExpression;
    }

    public void setSlotExpression(SlotExpression slotExpression) {
        this.slotExpression = slotExpression;
    }

    public Expression getValueExpression() {
        return valueExpression;
    }

    public void setValueExpression(Expression valueExpression) {
        this.valueExpression = valueExpression;
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}
