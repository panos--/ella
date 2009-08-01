package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.engine.Obj;
import org.unbunt.sqlscript.statement.Expression;
import org.unbunt.sqlscript.continuations.ContinuationVisitor;

public class ObjLitSlotCont implements Continuation {
    protected Obj obj;
    protected Expression slotValue;

    public ObjLitSlotCont(Obj obj, Expression slotValue) {
        this.obj = obj;
        this.slotValue = slotValue;
    }

    public Obj getObj() {
        return obj;
    }

    public void setObj(Obj obj) {
        this.obj = obj;
    }

    public Expression getSlotValue() {
        return slotValue;
    }

    public void setSlotValue(Expression slotValue) {
        this.slotValue = slotValue;
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}
