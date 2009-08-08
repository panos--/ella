package org.unbunt.sqlscript.engine;

import org.unbunt.sqlscript.engine.SQLScriptEngine;
import org.unbunt.sqlscript.engine.Obj;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;

public interface Call extends Obj {
    Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException;

    Obj call(SQLScriptEngine engine, Obj context, Obj receiver, Obj... args) throws ClosureTerminatedException;

    void trigger(SQLScriptEngine engine, Obj context, Obj... args);
}
