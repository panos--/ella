package org.unbunt.ella.engine.continuations;

import org.unbunt.ella.engine.corelang.Obj;
import org.unbunt.ella.engine.corelang.Primitive;

public class PrimitiveCont implements Continuation {
    protected Primitive primitive;
    protected Obj context;

    public PrimitiveCont(Primitive primitive, Obj context) {
        this.primitive = primitive;
        this.context = context;
    }

    public Primitive getPrimitive() {
        return primitive;
    }

    public Obj getContext() {
        return context;
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}