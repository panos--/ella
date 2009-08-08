package org.unbunt.sqlscript.engine;

import org.unbunt.sqlscript.engine.Obj;
import org.unbunt.sqlscript.compiler.Variable;

public interface DynamicVariableResolver {
    Obj resolve(Variable var);
}
