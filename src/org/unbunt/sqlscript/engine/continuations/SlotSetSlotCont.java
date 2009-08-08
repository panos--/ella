package org.unbunt.sqlscript.engine.continuations;

import org.unbunt.sqlscript.engine.natives.Obj;
import org.unbunt.sqlscript.compiler.stmtbase.Expression;
import org.unbunt.sqlscript.engine.continuations.ContinuationVisitor;

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
