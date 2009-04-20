package org.unbunt.sqlscript.lang;

import java.util.HashMap;
import java.util.Map;

public class Obj {
    protected Map<Obj, Obj> slots = new HashMap<Obj, Obj>();

//    private static final Str SLOT_ID = new Str("===").intern();
//    private static final Str SLOT_NI = new Str("!==").intern();

//    protected static Map<Obj, PrimitiveExpression> primitives = new HashMap<Obj, PrimitiveExpression>();
//
//    static {
//        primitives.put(new Str("===").intern(), new PrimIdExpression());
//        primitives.put(new Str("!==").intern(), new PrimNiExpression());
//    }

    public Obj() {
//        slots.put(SLOT_ID, Primitive.Type.ID.primitive);
//        slots.put(SLOT_NI, Primitive.Type.NI.primitive);
    }

//    public boolean hasPrimitiveInSlot(Obj key) {
//        return primitives.containsKey(key);
//    }
//
//    public PrimitiveExpression getPrimitiveForSlot(Obj key) {
//        return primitives.get(key);
//    }

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
