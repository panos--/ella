package org.unbunt.ella.engine.corelang;

import org.unbunt.ella.engine.context.Context;

import java.util.HashMap;
import java.util.Map;

/**
 * Base class for EllaScript objects.
 */
public abstract class AbstractObj implements Obj {
    protected Map<Obj, Obj> slots = new HashMap<Obj, Obj>();

    /**
     * Creates a new, empty EllaScript object.
     */
    public AbstractObj() {
    }

    public int getObjectID() {
        return -1;
    }

    public Obj setSlot(Context ctx, Obj key, Obj value) {
        return slots.put(key, value);
    }

    public Obj getSlot(Context ctx, Obj key) {
        return slots.get(key);
    }

    public Obj removeSlot(Context ctx, Obj key) {
        return slots.remove(key);
    }

    public Map<Obj,Obj> getSlots() {
        return slots;
    }

    public void setSlots(Map<Obj, Obj> slots) {
        this.slots = slots;
    }

    public Object toJavaObject() {
        return this;
    }
}
