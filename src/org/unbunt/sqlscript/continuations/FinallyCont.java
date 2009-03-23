package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.support.Env;
import org.unbunt.sqlscript.support.ContinuationVisitor;
import org.unbunt.sqlscript.statement.Statement;

public class FinallyCont implements Continuation {
    protected Statement body;
    protected Env env;

    public FinallyCont(Statement body, Env env) {
        this.body = body;
        this.env = env;
    }

    public Statement getBody() {
        return body;
    }

    public Env getEnv() {
        return env;
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}
