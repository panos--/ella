package org.unbunt.sqlscript.support;

import org.unbunt.sqlscript.statement.Statement;
import org.unbunt.sqlscript.engine.Env;

import java.util.List;

public interface Callable {
    List<Variable> getArguments();

    int getArgCount();

    Statement getBody();

    Env getEnv();
}
