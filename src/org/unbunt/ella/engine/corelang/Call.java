package org.unbunt.ella.engine.corelang;

import org.unbunt.ella.exception.ClosureTerminatedException;

public interface Call extends Obj {
    Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException;

    Obj call(Engine engine, Obj context, Obj receiver, Obj... args) throws ClosureTerminatedException;

    void trigger(Engine engine, Obj context, Obj... args);
}
