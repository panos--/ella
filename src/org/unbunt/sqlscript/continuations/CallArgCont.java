package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.statement.Statement;
import org.unbunt.sqlscript.support.Callable;
import org.unbunt.sqlscript.support.ContinuationVisitor;
import org.unbunt.sqlscript.support.Env;

public class CallArgCont implements Continuation {
    protected Callable callable;

    protected Env funcEnv;
    protected Env savedEnv;

    public CallArgCont(Callable callable, Env funcEnv, Env savedEnv) {
        this.callable = callable;
        this.funcEnv = funcEnv;
        this.savedEnv = savedEnv;
    }

    public Callable getCallable() {
        return callable;
    }

    public Env getCallEnv() {
        return funcEnv;
    }

    public Env getSavedEnv() {
        return savedEnv;
    }

    public Statement getBody() {
        return callable.getBody();
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}
