package org.unbunt.sqlscript.support;

import org.unbunt.sqlscript.statement.Statement;
import org.unbunt.sqlscript.continuations.Continuation;

import java.util.List;

public class BlockClosure implements Callable {
    protected List<String> arguments = null;
    protected int argCount = 0;
    protected Statement body = null;
    protected Env env = null;

    protected int homeOffset = -1;
    protected Continuation homeCont = null;

    public BlockClosure() {
    }

    public BlockClosure(Statement body) {
        this.body = body;
    }

    public List<String> getArguments() {
        return arguments;
    }

    public void setArguments(List<String> arguments) {
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

    public int getHomeOffset() {
        return homeOffset;
    }

    public void setHomeOffset(int homeOffset) {
        this.homeOffset = homeOffset;
    }

    public Continuation getHomeCont() {
        return homeCont;
    }

    public void setHomeCont(Continuation homeCont) {
        this.homeCont = homeCont;
    }

    public String toString() {
        return "BLOCK";
    }
}