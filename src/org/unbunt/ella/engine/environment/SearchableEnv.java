package org.unbunt.ella.engine.environment;

import org.unbunt.ella.engine.corelang.Obj;

/**
 * Provides an interface allowing to search for variables in the environment using the variable's name and bypassing
 * any lookups in parent environments.
 */
public interface SearchableEnv extends Env {
    /**
     * Returns the value associated with the variable specified by the given variable name. The variable is looked up
     * in this environment only. No lookups are made in parent environments.
     *
     * @param name the variable's name.
     * @return the variable's associated value or <code>null</code> if the variable could not be found in this
     *         environment.
     */
    public Obj findLocal(String name);

    /**
     * Associates the given value with the variable specified by the given variable name.
     *
     * @param name the variable's name
     * @param value the value.
     */
    public void putLocal(String name, Obj value);
}
