package org.unbunt.ella.engine.corelang;

import org.unbunt.ella.engine.context.Context;

import java.util.Map;

/**
 * Represents an EllaScript object.
 */
public interface Obj {
    /**
     * Returns this object's identifier.
     *
     * @return the identifier.
     */
    int getObjectID();

    /**
     * Set the given slot to the given value.
     *
     * @param ctx the execution context to use.
     * @param key the slot.
     * @param value the value.
     * @return the value previously associated with the given slot
     *         or <code>null</code> if there was no such slot before.
     */
    Obj setSlot(Context ctx, Obj key, Obj value);

    /**
     * Returns the value associated with the given slot.
     *
     * @param ctx the execution context to use.
     * @param key the slot.
     * @return the value associated with the given slot or <code>null</code> if there is no such slot.
     */
    Obj getSlot(Context ctx, Obj key);

    /**
     * Removes the given slot.
     *
     * @param ctx the execution context to use.
     * @param key the slot to remove.
     * @return the value of the removed slot or <code>null</code> if there was no such slot.
     */
    Obj removeSlot(Context ctx, Obj key);

    /**
     * Returns this object's slots as map.
     *
     * @return this object's slots.
     */
    Map<Obj, Obj> getSlots();

    /**
     * Sets this object's slots from the given map.
     *
     * @param slots the slots.
     */
    void setSlots(Map<Obj, Obj> slots);

    /**
     * Returns this object's value in it's corresponding native java representation.
     *
     * @return the value as java object.
     */
    Object toJavaObject();
}
