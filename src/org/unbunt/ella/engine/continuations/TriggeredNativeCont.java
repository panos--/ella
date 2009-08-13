package org.unbunt.ella.engine.continuations;

import org.unbunt.ella.engine.corelang.NativeCall;
import org.unbunt.ella.engine.corelang.Obj;
import org.unbunt.ella.engine.continuations.ContinuationVisitor;

public class TriggeredNativeCont implements Continuation {
    protected NativeCall nat;
    protected Obj context;
    protected Obj[] args;

    public TriggeredNativeCont(NativeCall nat, Obj context, Obj[] args) {
        this.nat = nat;
        this.context = context;
        this.args = args;
    }

    public NativeCall getNative() {
        return nat;
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