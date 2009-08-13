package org.unbunt.sqlscript.engine.corelang;

import org.unbunt.sqlscript.exception.EllaRuntimeException;
import org.unbunt.sqlscript.engine.corelang.Consts;
import org.unbunt.sqlscript.engine.context.Context;

public class ObjUtils {
    public static final Obj SLOT_PARENT = Consts.SLOT_PARENT;

    public static Obj getImplicitParent(Context ctx, Obj obj) {
        return ctx.getObjectProto(obj);
    }

    public static Obj getParent(Context ctx, Obj obj) {
        Obj parent = obj.getSlot(ctx, SLOT_PARENT);
        if (parent == null) {
            parent = getImplicitParent(ctx, obj);
        }
        return parent;
    }

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

    public static void setSlot(Context ctx, Obj obj, Obj slot, Obj value) {
        obj.setSlot(ctx, slot, value);
    }

    public static <T> T ensureType(Class<T> type, Obj object) {
        try {
            return type.cast(object);
        } catch (ClassCastException e) {
            throw new EllaRuntimeException("Unexpected type: " + object.getClass() + ": Expected: " + type);
        }
    }

    /*
    @SuppressWarnings({"unchecked"})
    public static <T> T ensureType(Obj object) {
        try {
            return (T) object;
        } catch (ClassCastException e) {
            throw new EllaRuntimeException("Unexpected type: " + object.getClass());
        }
    }
    */
}
