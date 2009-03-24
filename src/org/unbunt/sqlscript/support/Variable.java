package org.unbunt.sqlscript.support;

import org.unbunt.sqlscript.lang.Obj;

public class Variable {
    protected int address;
    protected String name;
    protected boolean defined;

    protected Obj value;

    private Variable() {
        this(null);
    }

    private Variable(String name) {
        this.name = name;
    }

    public Variable(int address, String name) {
        this(address, name, false);
    }

    public Variable(int address, String name, boolean defined) {
        this.address = address;
        this.name = name;
        this.defined = defined;
    }

    public int getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public boolean isDefined() {
        return defined;
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
