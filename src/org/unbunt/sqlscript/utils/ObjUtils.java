package org.unbunt.sqlscript.utils;

import org.unbunt.sqlscript.lang.Obj;
import org.unbunt.sqlscript.support.Context;

public class ObjUtils {
    public static Obj getImplicitParent(Context ctx, Obj obj) {
        return ctx.getObjectProto(obj);
    }

    public static Obj getParent(Context ctx, Obj obj) {
        Obj parent = obj.getParent();
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
}
