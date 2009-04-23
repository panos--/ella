package org.unbunt.sqlscript.support;

public class Variable {
    public int address;
    public String name;
    public boolean defined;
    public boolean implicit;

    public Variable(int address, String name, boolean defined, boolean implicit) {
        this.address = address;
        this.name = name.intern();
        this.defined = defined;
        this.implicit = implicit;
    }

    public String toString() {
        return "VAR[" + name + "]";
    }
}
