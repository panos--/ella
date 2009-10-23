package org.unbunt.ella.compiler.support;

import org.unbunt.ella.compiler.stmtbase.Statement;
import org.unbunt.ella.engine.environment.Env;

import java.util.List;

/**
 * Represents activatable objects.
 */
public interface Callable {
    List<Variable> getArguments();

    int getArgCount();

    Statement getBody();

    Env getEnv();
}
