package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;

public class Null extends PlainObj implements NativeObj {
    public static final Null instance = new Null();

    /**
     * NOTE: Undefined variables in scripts will have the null value (Null.instance) assigned.
     * NOTE: With specifying a special constructor for the Null object we ensure nothing is created
     * NOTE: out of null.
     * TODO: Maybe we should throw an expception instead of just returning null...
     */
    public static final NativeCall NATIVE_CONSTRUCTOR = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            return Null.instance;
        }
    };

    public Null() {
        slots.put(Str.SYM_parent, Base.instance);
    }

    public Call getNativeConstructor() {
        return NATIVE_CONSTRUCTOR;
    }

    @Override
    public Object toJavaObject() {
        return null;
    }

    public String toString() {
        return "Null";
    }
}
