/* AbstractObj.java
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

import java.util.HashMap;
import java.util.Map;

/**
 * Base class for EllaScript objects.
 */
public abstract class AbstractObj implements Obj {
    protected Map<Obj, Obj> slots = new HashMap<Obj, Obj>();

    /**
     * Creates a new, empty EllaScript object.
     */
    public AbstractObj() {
    }

    public int getObjectID() {
        return -1;
    }

    public Obj setSlot(Context ctx, Obj key, Obj value) {
        return slots.put(key, value);
    }

    public Obj getSlot(Context ctx, Obj key) {
        return slots.get(key);
    }

    public Obj removeSlot(Context ctx, Obj key) {
        return slots.remove(key);
    }

    public Map<Obj,Obj> getSlots() {
        return slots;
    }

    public void setSlots(Map<Obj, Obj> slots) {
        this.slots = slots;
    }

    public Object toJavaObject() {
        return this;
    }
}
