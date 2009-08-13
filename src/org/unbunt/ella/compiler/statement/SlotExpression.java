package org.unbunt.ella.compiler.statement;

import org.unbunt.ella.compiler.statement.ExpressionVisitor;
import org.unbunt.ella.compiler.stmtbase.Expression;

public class SlotExpression implements Expression {
    protected Expression receiver;
    protected Expression slot;

    public SlotExpression(Expression receiver, Expression slot) {
        this.receiver = receiver;
        this.slot = slot;
    }

    public SlotExpression() {
    }

    public Expression getReceiver() {
        return receiver;
    }

    public void setReceiver(Expression receiver) {
        this.receiver = receiver;
    }

    public Expression getSlot() {
        return slot;
    }

    public void setSlot(Expression slot) {
        this.slot = slot;
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}
