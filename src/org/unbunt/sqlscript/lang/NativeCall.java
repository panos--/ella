package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;

public abstract class NativeCall extends AbstractObj implements Call {
    public Obj getParent() {
        return null;
    }

    public Obj call(SQLScriptEngine engine, Obj context, Obj receiver, Obj... args) throws ClosureTerminatedException {
        return call(engine, context, args);
    }

    public void trigger(SQLScriptEngine engine, Obj context, Obj... args) {
        engine.trigger(this, context, args);
    }
}
