package org.unbunt.sqlscript.support;

import org.unbunt.sqlscript.engine.Obj;

public interface DynamicVariableResolver {
    Obj resolve(Variable var);
}
