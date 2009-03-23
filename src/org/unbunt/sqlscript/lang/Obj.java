package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.statement.PrimitiveExpression;
import org.unbunt.sqlscript.statement.PrimIdExpression;
import org.unbunt.sqlscript.statement.PrimNiExpression;

import java.util.HashMap;
import java.util.Map;

public class Obj {
    protected Map<Obj, Obj> slots = new HashMap<Obj, Obj>();

    protected static Map<Obj, PrimitiveExpression> primitives = new HashMap<Obj, PrimitiveExpression>();

    static {
        primitives.put(new Str("==="), new PrimIdExpression());
        primitives.put(new Str("!=="), new PrimNiExpression());
    }

    public Obj() {
    }

    public boolean hasPrimitiveInSlot(Obj key) {
        return primitives.containsKey(key);
    }

    public PrimitiveExpression getPrimitiveForSlot(Obj key) {
        return primitives.get(key);
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
