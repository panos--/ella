package org.unbunt.sqlscript.support;

import org.unbunt.sqlscript.statement.Statement;

import java.util.List;

public class Function {
    protected String name = null;
    protected List<String> arguments = null;
    protected Statement body = null;
    protected Env env = null;

    public Function() {
    }

    public Function(String name) {
        this.name = name;
    }

    public Function(Statement body) {
        this(null, body);
    }

    public Function(String name, Statement body) {
        this.name = name;
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getArguments() {
        return arguments;
    }

    public void setArguments(List<String> arguments) {
        this.arguments = arguments;
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

    public String toString() {
        return name == null ? "FUN<anon>" : "FUN[" + name + "]";
    }
}
