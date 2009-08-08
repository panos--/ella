package org.unbunt.sqlscript.engine.environment;

import org.unbunt.sqlscript.compiler.support.Variable;
import org.unbunt.sqlscript.engine.natives.Obj;

public interface DynamicVariableResolver {
    Obj resolve(Variable var);
}
