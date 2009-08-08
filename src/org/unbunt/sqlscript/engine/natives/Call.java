package org.unbunt.sqlscript.engine.natives;

import org.unbunt.sqlscript.engine.Engine;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;

public interface Call extends Obj {
    Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException;

    Obj call(Engine engine, Obj context, Obj receiver, Obj... args) throws ClosureTerminatedException;

    void trigger(Engine engine, Obj context, Obj... args);
}
