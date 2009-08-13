package org.unbunt.ella.compiler.support;

import org.unbunt.ella.compiler.stmtbase.Statement;
import org.unbunt.ella.engine.environment.Env;
import org.unbunt.ella.compiler.support.Variable;

import java.util.List;

public interface Callable {
    List<Variable> getArguments();

    int getArgCount();

    Statement getBody();

    Env getEnv();
}
