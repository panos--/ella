package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.ScriptProcessor;
import org.unbunt.sqlscript.support.Env;

public class CatchStatement extends AbstractStatement {
    protected String variable;
    protected Statement body;

    public CatchStatement(String variable, Statement body) {
        this.variable = variable;
        this.body = body;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
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
