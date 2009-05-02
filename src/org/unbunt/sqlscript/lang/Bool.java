package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;

public class Bool extends PlainObj implements NativeObj {
    public final static Bool TRUE = new Bool(true);
    public final static Bool FALSE = new Bool(false);

    protected final boolean value;

    public static final Call NATIVE_CONSTRUCTOR = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj[] args) throws ClosureTerminatedException {
            return ((Bool) args[0]).getValue() ? Bool.TRUE : Bool.FALSE;
        }
    };

    private Bool(boolean value) {
        this.value = value;
        slots.put(Str.SYM_parent, Base.instance);
    }

    public Call getNativeConstructor() {
        return NATIVE_CONSTRUCTOR;
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
