package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.SQLScriptEngine;

public abstract class NativeCall extends AbstractObj implements Call {
    public Obj getParent() {
        return null;
    }

    public void trigger(SQLScriptEngine engine, Obj context, Obj... args) {
        engine.trigger(this, context, args);
    }
}
