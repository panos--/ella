package org.unbunt.ella.engine.environment;

import org.unbunt.ella.engine.corelang.Obj;
import org.unbunt.ella.engine.environment.DynamicVariableResolver;
import org.unbunt.ella.compiler.support.Variable;

public interface WritableVariableResolver extends DynamicVariableResolver {
    public void update(Variable var, Obj value);
}
