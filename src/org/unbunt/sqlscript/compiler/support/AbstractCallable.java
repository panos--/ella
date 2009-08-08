package org.unbunt.sqlscript.compiler.support;

import org.unbunt.sqlscript.compiler.stmtbase.Statement;
import org.unbunt.sqlscript.engine.environment.Env;

import java.util.List;

public class AbstractCallable implements Callable {
    protected List<Variable> arguments = null;
    protected int argCount = 0;
    protected Statement body = null;
    protected Env env = null;

    public AbstractCallable() {
    }

    public AbstractCallable(Statement body) {
        this.body = body;
    }

    public List<Variable> getArguments() {
        return arguments;
    }

    public void setArguments(List<Variable> arguments) {
        this.arguments = arguments;
        this.argCount = arguments.size();
    }

    public int getArgCount() {
        return argCount;
    }

    public Statement getBody() {
        return body;
    }

    public void setBody(Statement body) {
        this.body = body;
    }

    public Env getEnv() {
        return env;
    }

    public void setEnv(Env env) {
        this.env = env;
    }
}
