package org.unbunt.sqlscript.utils;

import org.unbunt.sqlscript.lang.Obj;

public class ObjUtils {
    public static Obj getParent(Obj obj) {
        Obj parent = obj.getParent();
        if (parent == null) {
            parent = obj.getImplicitParent();
        }
        return parent;
    }

    public static Obj getSlot(Obj obj, Obj slot) {
        Obj value = obj.getSlot(slot);
        while (value == null) {
            obj = getParent(obj);
            if (obj == null) {
                return null;
            }
        }
        return value;
    }
}
