package org.unbunt.ella.engine.continuations;

import org.unbunt.ella.engine.continuations.ContinuationVisitor;
import org.unbunt.ella.engine.corelang.Obj;
import org.unbunt.ella.engine.corelang.PrimitiveCall;

public class PrimitiveCont implements Continuation {
    protected PrimitiveCall primitive;
    protected Obj context;

    public PrimitiveCont(PrimitiveCall primitive, Obj context) {
        this.primitive = primitive;
        this.context = context;
    }

    public PrimitiveCall getPrimitive() {
        return primitive;
    }

    public Obj getContext() {
        return context;
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}