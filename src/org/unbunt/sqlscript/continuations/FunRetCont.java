package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.support.Env;
import org.unbunt.sqlscript.support.ContinuationVisitor;

public class FunRetCont implements Continuation {
    protected Env savedEnv;

    public FunRetCont(Env savedEnv) {
        this.savedEnv = savedEnv;
    }

    public Env getSavedEnv() {
        return savedEnv;
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}
