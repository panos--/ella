package org.unbunt.sqlscript.engine;

import org.unbunt.sqlscript.exception.ClosureTerminatedException;

public abstract class NativeCall extends AbstractObj implements Call {
    // NOTE: Here we have a circular dependency between SQLScriptEngine and NativeCall
    // TODO: Break up by using interface instead of concrete class
    public Obj call(SQLScriptEngine engine, Obj context, Obj receiver, Obj... args) throws ClosureTerminatedException {
        return call(engine, context, args);
    }

    public void trigger(SQLScriptEngine engine, Obj context, Obj... args) {
        engine.trigger(this, context, args);
    }
}
