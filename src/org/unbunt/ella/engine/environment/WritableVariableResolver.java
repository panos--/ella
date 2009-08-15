package org.unbunt.ella.engine.environment;

import org.unbunt.ella.compiler.support.Variable;
import org.unbunt.ella.engine.corelang.Obj;

/**
 * Provides an interface for updating values of dynamically resolved variables.
 */
public interface WritableVariableResolver extends DynamicVariableResolver {
    /**
     * Associates the given variable with the specified value.
     *
     * @param var the variable.
     * @param value the value.
     */
    public void update(Variable var, Obj value);
}
