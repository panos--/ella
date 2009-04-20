package org.unbunt.sqlscript.lang;

public class Bool extends Obj {
    public final static Bool TRUE = new Bool(true);
    public final static Bool FALSE = new Bool(false);

    protected boolean value;

    public Bool(boolean value) {
        this.value = value;
        slots.put(Str.Sym.parent.str, Base.instance);
    }

    public boolean isTrue() {
        return value;
    }

    public boolean isFalse() {
        return !value;
    }

    public boolean getValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bool bool = (Bool) o;

        return value == bool.value;
    }

    public int hashCode() {
        return (value ? 1 : 0);
    }

    public String toString() {
        return "" + value;
    }
}
