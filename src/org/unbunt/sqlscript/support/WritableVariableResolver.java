package org.unbunt.sqlscript.support;

import org.unbunt.sqlscript.engine.Obj;

public interface WritableVariableResolver extends DynamicVariableResolver {
    public void update(Variable var, Obj value);
}
