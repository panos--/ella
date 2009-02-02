package org.unbunt.sqlscript.support;

import org.unbunt.sqlscript.lang.Obj;

public class Variable {
    protected String name;

    protected Obj value;

    public Variable() {
        this(null);
    }

    public Variable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Obj getValue() {
        return value;
    }

    public void setValue(Obj value) {
        this.value = value;
    }

    public String toString() {
        return name == null ? "VAR<tmp>" : "VAR[" + name + "]";
    }
}
