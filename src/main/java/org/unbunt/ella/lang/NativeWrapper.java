/* NativeWrapper.java
   Copyright (C) 2009, 2010 Thomas Weiß <panos@unbunt.org>

This file is part of the Ella scripting language interpreter.

Ella is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2, or (at your option)
any later version.

Ella is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License
along with Ella; see the file COPYING.  If not, write to the
Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
02110-1301 USA.

Linking this library statically or dynamically with other modules is
making a combined work based on this library.  Thus, the terms and
conditions of the GNU General Public License cover the whole
combination.

As a special exception, the copyright holders of this library give you
permission to link this library with independent modules to produce an
executable, regardless of the license terms of these independent
modules, and to copy and distribute the resulting executable under
terms of your choice, provided that you also meet, for each linked
independent module, the terms and conditions of the license of that
module.  An independent module is a module which is not derived from
or based on this library.  If you modify this library, you may extend
this exception to your version of the library, but you are not
obligated to do so.  If you do not wish to do so, delete this
exception statement from your version. */

package org.unbunt.ella.lang;

import org.unbunt.ella.engine.context.Context;
import org.unbunt.ella.engine.corelang.Obj;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.lang.reflect.Method;

/**
 * Helper class providing methods for wrapping Java objects in EllaScript objects an vice versa.
 */
public class NativeWrapper {
    public static Obj wrap(int i) {
        return new NNum(i);
    }

    public static Obj wrap(long l) {
        return new NNum(l);
    }

    /**
     * NOTE: We *have* to find a way to retrieve the context's singleton objects (like Null) without having callers
     *       pass the context object explicitly.
     *
     * @param ctx the execution context
     * @param o the Java object to wrap
     * @return an Ella object wrapping the given Java object
     */
    public static Obj wrap(Context ctx, Object o) {
        if (o == null) {
            return ctx.getObjNull();
        }
        else if (o instanceof Boolean) {
            return (Boolean) o ? ctx.getObjTrue() : ctx.getObjFalse();
        }
        else if (o instanceof Number) {
            if (o instanceof Integer || o instanceof Long || o instanceof Byte || o instanceof Short) {
                return new NNum(((Number) o).longValue());
            }
            else if (o instanceof Double || o instanceof Float) {
                return new NReal(((Number) o).doubleValue());
            }
            else if (o instanceof BigDecimal) {
                return new NBigReal((BigDecimal) o);
            }
            else if (o instanceof BigInteger) {
                return new NBigNum((BigInteger) o);
            }
        }
        else if (o instanceof String) {
            return new Str((String) o);
        }
        else if (o instanceof Character || o instanceof CharSequence) {
            return new Str(o.toString());
        }
        else if (o instanceof Object[]) {
            return new JArray(o, ((Object[]) o).length);
        }
        else if (o instanceof Class) {
            return new JClass((Class) o);
        }
        else if (o instanceof Method) {
            return new JMethod(new Method[] { (Method) o });
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
