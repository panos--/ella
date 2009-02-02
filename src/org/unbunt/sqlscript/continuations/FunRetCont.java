package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.support.Env;

public class FunRetCont implements Continuation {
    protected Env savedEnv;

    public FunRetCont(Env savedEnv) {
        this.savedEnv = savedEnv;
    }

    public Env getSavedEnv() {
        return savedEnv;
    }
}
