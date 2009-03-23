package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.statement.CatchStatement;
import org.unbunt.sqlscript.support.Env;
import org.unbunt.sqlscript.support.ContinuationVisitor;

public class TryCont implements Continuation {
    protected CatchStatement catchClause;
    protected Env env;

    public TryCont(CatchStatement catchClause, Env env) {
        this.catchClause = catchClause;
        this.env = env;
    }

    public CatchStatement getCatchClause() {
        return catchClause;
    }

    public Env getEnv() {
        return env;
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}
