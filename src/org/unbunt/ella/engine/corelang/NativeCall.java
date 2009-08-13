package org.unbunt.ella.engine.corelang;

import org.unbunt.ella.exception.ClosureTerminatedException;
import org.unbunt.ella.engine.Engine;

public abstract class NativeCall extends AbstractObj implements Call {
    // NOTE: Here we have a circular dependency between EllaEngine and NativeCall
    // TODO: Break up by using interface instead of concrete class
    public Obj call(Engine engine, Obj context, Obj receiver, Obj... args) throws ClosureTerminatedException {
        return call(engine, context, args);
    }

    public void trigger(Engine engine, Obj context, Obj... args) {
        engine.trigger(this, context, args);
    }
}
