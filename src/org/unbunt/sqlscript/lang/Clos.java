package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.support.BlockClosure;
import org.unbunt.sqlscript.continuations.Continuation;

public class Clos extends Obj {
    protected BlockClosure closure;

    public Clos(BlockClosure closure) {
        this.closure = closure;
    }

    public BlockClosure getClosure() {
        return closure;
    }
}
