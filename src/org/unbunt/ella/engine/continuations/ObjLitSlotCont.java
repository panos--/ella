package org.unbunt.ella.engine.continuations;

import org.unbunt.ella.engine.corelang.Obj;
import org.unbunt.ella.compiler.stmtbase.Expression;
import org.unbunt.ella.engine.continuations.ContinuationVisitor;

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
