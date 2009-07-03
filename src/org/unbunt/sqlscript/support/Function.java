package org.unbunt.sqlscript.support;

import org.unbunt.sqlscript.statement.Statement;

import java.util.List;

public class Function extends AbstractCallable implements Callable {
    protected String name = null;

    public Function() {
    }

    public Function(String name) {
        this.name = name;
    }

    public Function(Statement body) {
        this(null, body);
    }

    public Function(String name, Statement body) {
        super(body);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name == null ? "FUN<anon>" : "FUN[" + name + "]";
    }
}
