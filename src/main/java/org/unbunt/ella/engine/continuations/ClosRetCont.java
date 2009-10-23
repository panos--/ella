package org.unbunt.ella.engine.continuations;

import org.unbunt.ella.engine.environment.Env;
import org.unbunt.ella.engine.continuations.ContinuationVisitor;
import org.unbunt.ella.compiler.support.BlockClosure;

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