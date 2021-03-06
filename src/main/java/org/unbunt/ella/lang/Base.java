/* Base.java
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
import org.unbunt.ella.engine.corelang.*;
import static org.unbunt.ella.engine.corelang.Consts.SLOT_CLONE_INIT;
import static org.unbunt.ella.engine.corelang.Consts.SLOT_PARENT;
import static org.unbunt.ella.engine.corelang.ObjUtils.ensureType;
import org.unbunt.ella.exception.ClosureTerminatedException;
import org.unbunt.ella.exception.LoopBreakException;
import org.unbunt.ella.exception.LoopContinueException;

import java.util.Map;

/**
 * Represents the root of the EllaScript object hierarchy. Every EllaScript objects uses this object as parent object.
 */
public class Base extends AbstractObj {
    protected static final Call nativeEquals = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            return context.equals(args[0]) ? engine.getObjTrue() : engine.getObjFalse();
        }
    };

    protected static final Call nativeNotEquals = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            return context.equals(args[0]) ? engine.getObjFalse() : engine.getObjTrue();
        }
    };

    protected static final Call nativeEach = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            if (context == null) {
                return engine.getObjNull();
            }

            Obj call = args[0];

            for (Map.Entry<Obj, Obj> entry : context.getSlots().entrySet()) {
                try {
                    engine.invokeInLoop(call, context, entry.getKey(), entry.getValue());
                } catch (LoopBreakException e) {
                    break;
                } catch (LoopContinueException e) {
                    continue;
                }
            }

            return context;
        }
    };

    protected static final Call nativeEachSlot = nativeEach;

    protected static final NativeCall nativeHasSlot = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            return context != null && context.getSlot(engine.getContext(), args[0]) != null
                    ? engine.getObjTrue()
                    : engine.getObjFalse();
        }
    };

    protected static final NativeCall nativeRemoveSlot = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            if (context == null) {
                return engine.getObjNull();
            }
            Obj removedSlot = context.removeSlot(engine.getContext(), args[0]);
            return removedSlot == null ? engine.getObjNull() : removedSlot;
        }
    };

    protected static final NativeCall nativeAnd = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            Clos closure = ensureType(Clos.class, args[0]);
            engine.trigger(closure);
            return null;
        }
    };

    protected static final NativeCall nativeOr = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            return engine.getObjTrue();
        }
    };

    protected static final NativeCall nativeNot = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            return engine.getObjFalse();
        }
    };

    protected static final NativeCall nativeClone = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            Context ctx = engine.getContext();

            Obj clone = new PlainObj();
            clone.setSlot(ctx, SLOT_PARENT, context);
            engine.invokeSlotIfPresent(clone, SLOT_CLONE_INIT);

            return clone;
        }
    };

    public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    private Base() {
        slots.put(Str.SYM__id, Primitives.ID);
        slots.put(Str.SYM__ni, Primitives.NI);
        slots.put(Str.SYM__eq, nativeEquals);
        slots.put(Str.SYM__ne, nativeNotEquals);
        slots.put(Str.SYM__logic_and, nativeAnd);
        slots.put(Str.SYM__logic_or, nativeOr);
        slots.put(Str.SYM__logic_not, nativeNot);
        slots.put(Str.SYM_not, nativeNot);
        slots.put(Str.SYM_clone, nativeClone);
        slots.put(Str.SYM_each, nativeEach);
        slots.put(Str.SYM_eachSlot, nativeEachSlot);
        slots.put(Str.SYM_hasSlot, nativeHasSlot);
        slots.put(Str.SYM_removeSlot, nativeRemoveSlot);
    }

    /**
     * Registers this EllaScript object within the given execution context.
     *
     * @param ctx the execution context to register this object in.
     */
    public static void registerInContext(Context ctx) {
        if (!ctx.hasObject(OBJECT_ID)) {
            ctx.registerObject(new Base());

            // to avoid circular dependency between PlainObj and Base we trigger registration of
            // Base as proto (implicit parent) of PlainObj here, not in PlainObj itself
            ctx.registerProto(PlainObj.OBJECT_ID, OBJECT_ID);

            // same for Str and StrProto
            ctx.registerProto(Str.StrProto.OBJECT_ID, OBJECT_ID);
            ctx.registerObject(new Str.StrProto());
            ctx.registerProto(Str.OBJECT_ID, Str.StrProto.OBJECT_ID);
        }
    }

    @Override
    public int getObjectID() {
        return OBJECT_ID;
    }
}
