package org.unbunt.ella.engine.corelang;

import org.unbunt.ella.exception.ClosureTerminatedException;

/**
 * Represents primitive actions to be performed by the EllaScript execution engine.
 */
public class PrimitiveCall extends AbstractObj implements Call {
    /**
     * Specifies the various primitive actions known to the engine.
     */
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

    /**
     * The type of the primitive action represented by this object.
     */
    public final Type type;

    /**
     * The type code.
     */
    public final int code;

    /**
     * Creates a new PrimitiveCall with the given type.
     * @param type
     */
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
