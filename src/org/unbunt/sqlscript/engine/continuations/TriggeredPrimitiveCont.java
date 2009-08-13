package org.unbunt.ella.engine.continuations;

import org.unbunt.ella.engine.continuations.ContinuationVisitor;
import org.unbunt.ella.engine.corelang.Obj;
import org.unbunt.ella.engine.corelang.PrimitiveCall;

public class TriggeredPrimitiveCont implements Continuation {
    protected PrimitiveCall primitive;
    protected Obj context;
    protected Obj[] args;

    public TriggeredPrimitiveCont(PrimitiveCall primitive, Obj context, Obj[] args) {
        this.primitive = primitive;
        this.context = context;
        this.args = args;
    }

    public PrimitiveCall getPrimitive() {
        return primitive;
    }

    public Obj getContext() {
        return context;
    }

    public Obj[] getArgs() {
        return args;
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}