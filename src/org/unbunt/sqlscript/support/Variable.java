package org.unbunt.sqlscript.support;

public class Variable {
    public int address;
    public String name;
    public boolean defined;

    public Variable(int address, String name) {
        this(address, name, false);
    }

    public Variable(int address, String name, boolean defined) {
        this.address = address;
        this.name = name.intern();
        this.defined = defined;
    }

    public String toString() {
        return "VAR[" + name + "]";
    }
}
