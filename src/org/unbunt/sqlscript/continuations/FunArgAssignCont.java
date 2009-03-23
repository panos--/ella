package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.support.Env;
import org.unbunt.sqlscript.support.ContinuationVisitor;

public class FunArgAssignCont implements Continuation {
    protected String name;
    protected Env env;

    public FunArgAssignCont(String name, Env env) {
        this.name = name;
        this.env = env;
    }

    public String getName() {
        return name;
    }

    public Env getEnv() {
        return env;
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}
