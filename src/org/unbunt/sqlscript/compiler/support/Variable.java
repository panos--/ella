package org.unbunt.ella.compiler.support;

import org.unbunt.ella.lang.Str;

public class Variable {
    public final int address;
    public final String name;
    public final Str nameStr;
    public final boolean defined;
    public final boolean implicit;

    public Variable(int address, String name, boolean defined, boolean implicit) {
        this.address = address;
        this.name = name.intern();
        this.nameStr = Str.toSym(this.name);
        this.defined = defined;
        this.implicit = implicit;
    }

    public String toString() {
        return "VAR[" + name + "]";
    }
}
