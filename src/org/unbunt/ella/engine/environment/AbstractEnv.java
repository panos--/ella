package org.unbunt.ella.engine.environment;

import org.unbunt.ella.compiler.support.Variable;
import org.unbunt.ella.engine.corelang.Obj;

/**
 * Base class for environments.
 */
public abstract class AbstractEnv implements Env {
    protected Env parent;

    /**
     * Creates a new environment having the given environment referenced as parent environment.
     *
     * @param parent the parent environment for the new environment.
     */
    protected AbstractEnv(Env parent) {
        this.parent = parent;
    }

    public Obj get(Variable var) {
        return get(var, var.address);
    }

    public void set(Variable var, Obj value) {
        set(var, var.address, value);
    }
}
