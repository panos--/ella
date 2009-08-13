package org.unbunt.ella.engine.environment;

import org.unbunt.ella.compiler.support.Variable;
import org.unbunt.ella.engine.corelang.Obj;

public interface DynamicVariableResolver {
    Obj resolve(Variable var);
}
