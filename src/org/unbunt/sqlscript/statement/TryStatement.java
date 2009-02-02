package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.ScriptProcessor;
import org.unbunt.sqlscript.support.Env;

public class TryStatement extends AbstractStatement {
    protected Statement body;
    protected CatchStatement catchClause = null;
    protected FinallyStatement finallyClause = null;

    public TryStatement(Statement body) {
        this.body = body;
    }

    public Statement getBody() {
        return body;
    }

    public void setBody(Statement body) {
        this.body = body;
    }

    public boolean hasCatchClause() {
        return catchClause != null;
    }

    public CatchStatement getCatchClause() {
        return catchClause;
    }

    public void setCatchClause(CatchStatement catchClause) {
        this.catchClause = catchClause;
    }

    public boolean hasFinallyClause() {
        return finallyClause != null;
    }

    public FinallyStatement getFinallyClause() {
        return finallyClause;
    }

    public void setFinallyClause(FinallyStatement finallyClause) {
        this.finallyClause = finallyClause;
    }

    public void accept(ScriptProcessor processor, Env env) {
    }
}
