package org.unbunt.sqlscript.engine.continuations;

import org.unbunt.sqlscript.engine.environment.Env;
import org.unbunt.sqlscript.engine.continuations.ContinuationVisitor;
import org.unbunt.sqlscript.compiler.support.BlockClosure;

public class ClosRetCont implements Continuation {
    protected BlockClosure closure;
    protected Env savedEnv;

    public ClosRetCont(BlockClosure closure, Env savedEnv) {
        this.closure = closure;
        this.savedEnv = savedEnv;
    }

    public BlockClosure getClosure() {
        return closure;
    }

    public Env getSavedEnv() {
        return savedEnv;
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}