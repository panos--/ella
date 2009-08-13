package org.unbunt.sqlscript.engine.continuations;

import org.unbunt.sqlscript.engine.corelang.NativeCall;
import org.unbunt.sqlscript.engine.corelang.Obj;
import org.unbunt.sqlscript.engine.continuations.ContinuationVisitor;

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