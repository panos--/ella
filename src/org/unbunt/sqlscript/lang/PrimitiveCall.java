package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;

public class PrimitiveCall extends PlainObj implements Call {
    public static enum Type {
        ID,
        NI,
        LOOP,
        LOOP_BREAK,
        LOOP_CONTINUE,
        EXIT;

        protected final PrimitiveCall primitive;

        Type() {
            primitive = new PrimitiveCall(this);
        }
    }

    public final Type type;
    public final int code;

    public PrimitiveCall(Type type) {
        this.type = type;
        this.code = type.ordinal();
    }

    public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
        return engine.invoke(this, context, args);
    }

    public Obj call(SQLScriptEngine engine, Obj context, Obj receiver, Obj... args) throws ClosureTerminatedException {
        return call(engine, context, args);
    }

    public void trigger(SQLScriptEngine engine, Obj context, Obj... args) {
        engine.trigger(this, context, args);
    }
}
