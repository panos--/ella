package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;
import org.unbunt.sqlscript.support.Callable;

public abstract class Native extends Obj {
    public abstract Obj call(SQLScriptEngine engine, Obj context, Obj[] args) throws ClosureTerminatedException;
}
