package org.unbunt.sqlscript.compiler;

import org.unbunt.sqlscript.statement.Statement;
import org.unbunt.sqlscript.engine.Env;
import org.unbunt.sqlscript.compiler.Variable;

import java.util.List;

public interface Callable {
    List<Variable> getArguments();

    int getArgCount();

    Statement getBody();

    Env getEnv();
}
