package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.support.Env;

public class CatchCont implements Continuation {
    protected Env env;

    public CatchCont(Env env) {
        this.env = env;
    }

    public Env getEnv() {
        return env;
    }
}
