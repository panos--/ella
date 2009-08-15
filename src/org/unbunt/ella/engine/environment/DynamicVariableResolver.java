package org.unbunt.ella.engine.environment;

import org.unbunt.ella.compiler.support.Variable;
import org.unbunt.ella.engine.corelang.Obj;

/**
 * Provides an interface for dynamically resolving variables.
 */
public interface DynamicVariableResolver {
    /**
     * Returns the value associated with the given variable.
     *
     * @param var the variable to resolve.
     * @return the variable's associated value
     *         or <code>null</code> if the variable could not be resolved by this resolver.
     */
    Obj resolve(Variable var);
}
