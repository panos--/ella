package org.unbunt.sqlscript.support;

import org.unbunt.sqlscript.lang.Obj;

public abstract class AbstractEnv implements Env {
    protected Env parent;

    protected AbstractEnv() {
        this.parent = null;
    }

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
