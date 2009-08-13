package org.unbunt.sqlscript.engine.environment;

import org.unbunt.sqlscript.engine.corelang.Obj;
import org.unbunt.sqlscript.engine.environment.DynamicVariableResolver;
import org.unbunt.sqlscript.compiler.support.Variable;

public interface WritableVariableResolver extends DynamicVariableResolver {
    public void update(Variable var, Obj value);
}
