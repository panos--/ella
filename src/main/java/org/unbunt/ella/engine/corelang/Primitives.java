package org.unbunt.ella.engine.corelang;

import org.unbunt.ella.engine.context.Context;

import java.util.Map;

/**
 * Convenience enum around the <code>Primitive</code> interface. Declares an enum property for every operation code
 * defined by the Primitive interface.
 */
public enum Primitives implements Primitive {
    ID (Primitive.CODE_ID),
    NI (Primitive.CODE_NI),
    LOOP (Primitive.CODE_LOOP),
    LOOP_BREAK (Primitive.CODE_LOOP_BREAK),
    LOOP_CONTINUE (Primitive.CODE_LOOP_CONTINUE),
    EXIT (Primitive.CODE_EXIT);

    public final int code;

    Primitives(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    /*
     * Call interface
     */

    public Obj call(Engine engine, Obj context, Obj... args) {
        return engine.invoke(this, context, args);
    }

    public Obj call(Engine engine, Obj context, Obj receiver, Obj... args) {
        return engine.invoke(this, context, args);
    }

    public void trigger(Engine engine, Obj context, Obj... args) {
        engine.trigger(this, context, args);
    }

    /*
     * Obj interface
     */

    public int getObjectID() {
        return -1;
    }

    public Obj setSlot(Context ctx, Obj key, Obj value) {
        return null;
    }

    public Obj getSlot(Context ctx, Obj key) {
        return null;
    }

    public Obj removeSlot(Context ctx, Obj key) {
        return null;
    }

    public Map<Obj, Obj> getSlots() {
        return null;
    }

    public void setSlots(Map<Obj, Obj> slots) {
    }

    public Object toJavaObject() {
        return this;
    }
}
