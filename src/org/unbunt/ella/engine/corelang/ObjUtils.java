package org.unbunt.ella.engine.corelang;

import org.unbunt.ella.engine.context.Context;
import org.unbunt.ella.exception.EllaRuntimeException;

/**
 * Helper providing various methods for interaction with EllaScript objects.
 */
public class ObjUtils {
    public static final Obj SLOT_PARENT = Consts.SLOT_PARENT;

    /**
     * Returns the implicit parent object of the given object or <code>null</code> if no implicit parent object is
     * defined for the given object.
     *
     * @param ctx the execution context to use.
     * @param obj the object in question.
     * @return the implicit parent object or <code>null</code> if there is none.
     */
    public static Obj getImplicitParent(Context ctx, Obj obj) {
        return ctx.getObjectProto(obj);
    }

    /**
     * Returns the given object's parent object.
     *
     * @param ctx the execution context to use.
     * @param obj the object in question.
     * @return the parent object or <code>null</code> if there is none.
     */
    public static Obj getParent(Context ctx, Obj obj) {
        Obj parent = obj.getSlot(ctx, SLOT_PARENT);
        if (parent == null) {
            parent = getImplicitParent(ctx, obj);
        }
        return parent;
    }

    /**
     * Returns the given slot's value in the given object.
     *
     * @param ctx the execution context to use.
     * @param obj the object in question.
     * @param slot the slot.
     * @return the slot's value or <code>null</code> if there is no such slot.
     */
    public static Obj getSlot(Context ctx, Obj obj, Obj slot) {
        Obj value;
        while ((value = obj.getSlot(ctx, slot)) == null) {
            obj = getParent(ctx, obj);
            if (obj == null) {
                return null;
            }
        }
        return value;
    }

    /**
     * Sets the specified slot in the given object.
     *
     * @param ctx the execution context to use.
     * @param obj the object to set the slot in.
     * @param slot the slot.
     * @param value the value of the slot.
     */
    public static void setSlot(Context ctx, Obj obj, Obj slot, Obj value) {
        obj.setSlot(ctx, slot, value);
    }

    /**
     * Casts the given object to the given type.
     *
     * @param type the type to cast the object to.
     * @param object the object in question.
     * @return the casted object.
     * @throws EllaRuntimeException if the object could not be casted to the specified type.
     */
    public static <T> T ensureType(Class<T> type, Obj object) {
        try {
            return type.cast(object);
        } catch (ClassCastException e) {
            throw new EllaRuntimeException("Unexpected type: " + object.getClass() + ": Expected: " + type);
        }
    }
}
