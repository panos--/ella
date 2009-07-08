package org.unbunt.sqlscript.support;

import org.unbunt.sqlscript.lang.Obj;

public interface DynamicVariableResolver {
    Obj resolve(Variable var);
    Obj resolve(String name);
}
