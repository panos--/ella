package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.support.Env;
import org.unbunt.sqlscript.support.ContinuationVisitor;

public class FunArgAssignCont implements Continuation {
    protected Env env;

    public FunArgAssignCont(Env env) {
        this.env = env;
    }

    public Env getEnv() {
        return env;
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}
