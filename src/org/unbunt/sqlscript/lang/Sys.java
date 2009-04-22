package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;
import org.unbunt.utils.StringUtils;

public class Sys extends Obj {
    public static final Sys instance = new Sys();

    protected static final Native nativePrint = new Native() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj[] args) throws ClosureTerminatedException {
            System.out.println(StringUtils.join(" ", args));
            return Null.instance;
        }
    };

    public Sys() {
        slots.put(Str.Sym.parent.str, Base.instance);
        slots.put(Str.Sym.print.str, nativePrint);
    }
}
