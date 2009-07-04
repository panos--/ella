package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.lang.NativeCall;
import org.unbunt.sqlscript.lang.Obj;
import org.unbunt.sqlscript.support.ContinuationVisitor;

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