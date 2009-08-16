package org.unbunt.ella.engine.corelang;

import org.unbunt.ella.exception.ClosureTerminatedException;

/**
 * Base class for native activatable EllaScript objects.
 */
public abstract class NativeCall extends AbstractObj implements Native {
    public Obj call(Engine engine, Obj context, Obj receiver, Obj... args) throws ClosureTerminatedException {
        return call(engine, context, args);
    }

    public void trigger(Engine engine, Obj context, Obj... args) {
        engine.trigger(this, context, args);
    }
}
