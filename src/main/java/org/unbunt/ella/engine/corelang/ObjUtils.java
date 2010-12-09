/* ObjUtils.java
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
