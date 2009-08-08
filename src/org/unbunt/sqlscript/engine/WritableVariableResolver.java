package org.unbunt.sqlscript.engine;

import org.unbunt.sqlscript.engine.Obj;
import org.unbunt.sqlscript.engine.DynamicVariableResolver;
import org.unbunt.sqlscript.compiler.Variable;

public interface WritableVariableResolver extends DynamicVariableResolver {
    public void update(Variable var, Obj value);
}
