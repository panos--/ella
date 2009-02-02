package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.ScriptProcessor;
import org.unbunt.sqlscript.support.Env;

public class SlotExpression extends AbstractExpression {
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

    public void accept(ScriptProcessor processor, Env env) {
    }
}
