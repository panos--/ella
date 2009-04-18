package org.unbunt.sqlscript.support;

import org.unbunt.sqlscript.statement.Statement;

public interface Callable {
    public int getArgCount();
    public Statement getBody();
    public Env getEnv();
}
