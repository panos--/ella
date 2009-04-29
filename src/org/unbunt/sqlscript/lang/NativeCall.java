package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;

public abstract class NativeCall extends PlainObj implements Call {
    public abstract Obj call(SQLScriptEngine engine, Obj context, Obj[] args) throws ClosureTerminatedException;
}
