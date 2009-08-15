package org.unbunt.ella.compiler.support;

import org.unbunt.ella.lang.Str;

/**
 * Represents a variable in the EllaScript language.
 */
public class Variable {
    /**
     * The address of the variable.
     */
    public final int address;

    /**
     * The name of the variable.
     */
    public final String name;

    /**
     * The name of the variable as a native EllaScript string object.
     */
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
