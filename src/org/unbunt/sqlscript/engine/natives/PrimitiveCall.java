package org.unbunt.sqlscript.engine.natives;

import org.unbunt.sqlscript.exception.ClosureTerminatedException;
import org.unbunt.sqlscript.engine.Engine;

public class PrimitiveCall extends AbstractObj implements Call {
    public static enum Type {
        ID,
        NI,
        LOOP,
        LOOP_BREAK,
        LOOP_CONTINUE,
        EXIT;

        public final PrimitiveCall primitive;

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

    public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
        return engine.invoke(this, context, args);
    }

    public Obj call(Engine engine, Obj context, Obj receiver, Obj... args) throws ClosureTerminatedException {
        return call(engine, context, args);
    }

    public void trigger(Engine engine, Obj context, Obj... args) {
        engine.trigger(this, context, args);
    }
}
