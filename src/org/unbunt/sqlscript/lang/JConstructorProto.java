package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;

public class JConstructorProto extends Obj {
    protected static final Native nativeNew = new Native() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj[] args) throws ClosureTerminatedException {
            return null;
        }
    };

    public static final JConstructorProto instance = new JConstructorProto();

    public JConstructorProto() {
        slots.put(Str.Sym.parent.str, Base.instance);
        slots.put(Str.Sym._new.str, nativeNew);
    }
}
