package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.support.Context;

import java.util.Map;
import java.util.HashMap;

public abstract class AbstractObj implements Obj {
    protected Map<Obj, Obj> slots = new HashMap<Obj, Obj>();

    public AbstractObj() {
    }

    public int getObjectID() {
        return -1;
    }

    public abstract Obj getParent();

    public Obj addSlot(Context ctx, Obj key, Obj value) {
        return slots.put(key, value);
    }

    public Obj setSlot(Context ctx, Obj key, Obj value) {
        return slots.put(key, value);
    }

    public Obj getSlot(Context ctx, Obj key) {
        return slots.get(key);
    }

    public Map<Obj, Obj> getSlots() {
        return slots;
    }

    public void setSlots(Map<Obj, Obj> slots) {
        this.slots = slots;
    }

    public Object toJavaObject() {
        return this;
    }
}
