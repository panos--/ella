package org.unbunt.sqlscript.lang;

import java.util.Map;
import java.util.HashMap;

public class Obj {
    protected Map<Obj, Obj> slots = new HashMap<Obj, Obj>();

    public Obj() {
    }

    public Obj addSlot(Obj key, Obj value) {
        return slots.put(key, value);
    }

    public Obj setSlot(Obj key, Obj value) {
        return slots.put(key, value);
    }

    public Obj getSlot(Obj key) {
        return slots.get(key);
    }

    public Map<Obj, Obj> getSlots() {
        return slots;
    }

    public void setSlots(Map<Obj, Obj> slots) {
        this.slots = slots;
    }
}
