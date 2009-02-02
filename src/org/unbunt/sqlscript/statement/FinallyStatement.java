package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.ScriptProcessor;
import org.unbunt.sqlscript.support.Env;

public class FinallyStatement extends AbstractStatement {
    protected Statement body;

    public FinallyStatement(Statement body) {
        this.body = body;
    }

    public Statement getBody() {
        return body;
    }

    public void setBody(Statement body) {
        this.body = body;
    }

    public void accept(ScriptProcessor processor, Env env) {
    }
}
