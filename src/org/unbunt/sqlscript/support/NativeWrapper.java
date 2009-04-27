package org.unbunt.sqlscript.support;

import org.unbunt.sqlscript.lang.*;

public class NativeWrapper {
    public static Obj wrap(Object o) {
        if (o == null) {
            return Null.instance;
        }
        else if (o instanceof Boolean) {
            return Bool.valueOf((Boolean) o);
        }
        else if (o instanceof Number) {
            if (o instanceof Integer || o instanceof Byte || o instanceof Short) {
                return new Int(((Number) o).intValue());
            }
        }
        else if (o instanceof String) {
            return new Str((String) o);
        }
        else if (o instanceof Character || o instanceof CharSequence) {
            return new Str(o.toString());
        }
        return new JObject(o);
    }

    public static Object[] unwrap(Obj[] objects) {
        Object[] jobjects = new Object[objects.length];
        for (int i = 0; i < objects.length; i++) {
            jobjects[i] = objects[i].toJavaObject();
        }
        return jobjects;
    }
}
