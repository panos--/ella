package org.unbunt.sqlscript.engine.environment;

import org.unbunt.sqlscript.compiler.support.Variable;
import org.unbunt.sqlscript.engine.corelang.Obj;

public interface DynamicVariableResolver {
    Obj resolve(Variable var);
}
