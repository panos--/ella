package org.unbunt.sqlscript.engine.continuations;

import org.unbunt.sqlscript.engine.corelang.Obj;
import org.unbunt.sqlscript.engine.corelang.NativeCall;

public class NativeCont implements Continuation {
    protected NativeCall nat;
    protected Obj context;

    public NativeCont(NativeCall nat, Obj context) {
        this.nat = nat;
        this.context = context;
    }

    public NativeCall getNative() {
        return nat;
    }

    public Obj getContext() {
        return context;
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}