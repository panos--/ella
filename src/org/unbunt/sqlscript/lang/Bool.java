package org.unbunt.sqlscript.lang;

public class Bool extends Obj {
    public final static Bool TRUE = new Bool(true);
    public final static Bool FALSE = new Bool(false);

    protected final boolean value;

    private Bool(boolean value) {
        this.value = value;
        slots.put(Str.Sym.parent.str, Base.instance);
    }

    public static Bool valueOf(boolean bool) {
        return bool ? Bool.TRUE : Bool.FALSE;
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

    @Override
    public Object toJavaObject() {
        return value;
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
