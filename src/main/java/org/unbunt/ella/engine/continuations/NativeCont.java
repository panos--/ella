package org.unbunt.ella.engine.continuations;

import org.unbunt.ella.engine.corelang.Native;
import org.unbunt.ella.engine.corelang.Obj;

public class NativeCont implements Continuation {
    protected Native nat;
    protected Obj context;

    public NativeCont(Native nat, Obj context) {
        this.nat = nat;
        this.context = context;
    }

    public Native getNative() {
        return nat;
    }

    public Obj getContext() {
        return context;
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}