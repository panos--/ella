package org.unbunt.sqlscript.compiler.support;

import org.unbunt.sqlscript.compiler.stmtbase.Statement;
import org.unbunt.sqlscript.engine.environment.Env;
import org.unbunt.sqlscript.compiler.support.Variable;

import java.util.List;

public interface Callable {
    List<Variable> getArguments();

    int getArgCount();

    Statement getBody();

    Env getEnv();
}
