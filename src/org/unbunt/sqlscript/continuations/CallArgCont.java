package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.statement.Statement;
import org.unbunt.sqlscript.support.Callable;
import org.unbunt.sqlscript.support.ContinuationVisitor;
import org.unbunt.sqlscript.support.Env;

public class CallArgCont implements Continuation {
    protected Callable callable;

    protected Env funcEnv;
    protected Env savedEnv;

    protected boolean tailCall;

    public CallArgCont(Callable callable, Env funcEnv, Env savedEnv) {
        this.callable = callable;
        this.funcEnv = funcEnv;
        this.savedEnv = savedEnv;
        this.tailCall = false;
    }

    public CallArgCont(Callable callable, Env funcEnv, Env savedEnv, boolean tailCall) {
        this.callable = callable;
        this.funcEnv = funcEnv;
        this.savedEnv = savedEnv;
        this.tailCall = tailCall;
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

    public boolean isTailCall() {
        return tailCall;
    }

    public Statement getBody() {
        return callable.getBody();
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}
