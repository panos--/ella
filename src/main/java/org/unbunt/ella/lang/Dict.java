/* Dict.java
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

import org.unbunt.ella.engine.corelang.ObjUtils;
import org.unbunt.ella.engine.corelang.*;
import static org.unbunt.ella.engine.corelang.ObjUtils.ensureType;
import org.unbunt.ella.exception.ClosureTerminatedException;
import org.unbunt.ella.exception.LoopContinueException;
import org.unbunt.ella.exception.LoopBreakException;
import org.unbunt.ella.engine.context.Context;

import java.util.Map;
import java.util.ArrayList;

/**
 * Represents an EllaScript object wrapping another EllaScript object for use as associative array.
 */
public class Dict extends AbstractObj {
    protected static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    protected final Obj value;

    /**
     * Creates a new Dict wrapping the given object.
     *
     * @param value the object to wrap.
     */
    public Dict(Obj value) {
        this.value = value;
    }

    @Override
    public int getObjectID() {
        return OBJECT_ID;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Dict dict = (Dict) o;

        return value.equals(dict.value);
    }

    public int hashCode() {
        return value.hashCode();
    }

    /**
     * Registers this EllaScript object within the given execution context.
     *
     * @param ctx the execution context to register this object in.
     */
    public static void registerInContext(Context ctx) {
        DictProto.registerInContext(ctx);
        ctx.registerProto(OBJECT_ID, DictProto.OBJECT_ID);
    }

    /**
     * Represents the implicit parent object of Dict objects.
     */
    public static class DictProto extends AbstractObj implements NativeObj {
        public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

        protected static final NativeCall NATIVE_CONSTRUCTOR = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                return new Dict(args.length == 0 ? new PlainObj() : args[0]);
            }
        };

        protected static final NativeCall nativeEach = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Dict thiz = ensureType(Dict.class, context);
                Obj closure = args[0];
                Obj _null = engine.getObjNull();

                Map<Obj,Obj> slots = thiz.value.getSlots();
                for (Map.Entry<Obj, Obj> entry : slots.entrySet()) {
                    try {
                        engine.invokeInLoop(closure, _null, entry.getKey(), entry.getValue());
                    } catch (LoopContinueException e) {
                        continue;
                    } catch (LoopBreakException e) {
                        break;
                    }
                }

                return null;
            }
        };

        protected static final NativeCall nativeSize = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) {
                Dict thiz = ensureType(Dict.class, context);
                return new NNum(thiz.value.getSlots().size());
            }
        };

        protected static final NativeCall nativeGet = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Dict thiz = ensureType(Dict.class, context);
                Obj slot = args[0];
                Obj value = thiz.value.getSlot(engine.getContext(), slot);
                return value == null ? engine.getObjNull() : value;
            }
        };

        protected static final NativeCall nativeSet = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Dict thiz = ensureType(Dict.class, context);
                Obj slot = args[0];
                Obj value = args[1];
                thiz.value.setSlot(engine.getContext(), slot, value);
                return thiz;
            }
        };

        protected static final NativeCall nativeHas = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Dict thiz = ensureType(Dict.class, context);
                return thiz.value.getSlot(engine.getContext(), args[0]) == null
                        ? engine.getObjFalse() : engine.getObjTrue();
            }
        };

        protected static final NativeCall nativeRemove = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Dict thiz = ensureType(Dict.class, context);
                Obj removedSlot = thiz.value.removeSlot(engine.getContext(), args[0]);
                return removedSlot == null ? engine.getObjNull() : removedSlot;
            }
        };

        protected static final NativeCall nativeMap = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) {
                Dict thiz = ensureType(Dict.class, context);
                Clos clos = ensureType(Clos.class, args[0]);
                Obj _null = engine.getObjNull();

                Map<Obj, Obj> slots = thiz.value.getSlots();
                Dict result = new Dict(new PlainObj());
                Map<Obj, Obj> resultSlots = result.value.getSlots();
                for (Map.Entry<Obj, Obj> entry : slots.entrySet()) {
                    try {
                        resultSlots.put(entry.getKey(),
                                        engine.invokeInLoop(clos, _null, entry.getKey(), entry.getValue()));
                    } catch (LoopContinueException e) {
                        continue;
                    } catch (LoopBreakException e) {
                        break;
                    }
                }

                return result;
            }
        };

        public static final NativeCall nativeValues = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) {
                Dict thiz = ensureType(Dict.class, context);
                return new Lst(new ArrayList<Obj>(thiz.value.getSlots().values()));
            }
        };

        // NOTE: this is added to Base, not DictProto
        protected static final NativeCall nativeToDict = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                return new Dict(context);
            }
        };

        private DictProto() {
            slots.put(Str.SYM_each, nativeEach);
            slots.put(Str.SYM_size, nativeSize);
            slots.put(Str.SYM_map, nativeMap);
            slots.put(Str.SYM_values, nativeValues);
            slots.put(Str.SYM_get, nativeGet);
            slots.put(Str.SYM_set, nativeSet);
            slots.put(Str.SYM_has, nativeHas);
            slots.put(Str.SYM_remove, nativeRemove);
        }

        public Call getNativeConstructor() {
            return NATIVE_CONSTRUCTOR;
        }

        @Override
        public int getObjectID() {
            return OBJECT_ID;
        }

        /**
         * Registers this EllaScript object within the given execution context.
         *
         * @param ctx the execution context to register this object in.
         */
        public static void registerInContext(Context ctx) {
            Base.registerInContext(ctx);
            ctx.registerProto(OBJECT_ID, Base.OBJECT_ID);
            DictProto proto = new DictProto();
            ctx.registerObject(proto);
            // NOTE: toDict() method added to Base here, not in Base itself, to avoid circular dependency
            Base base = ObjUtils.ensureType(Base.class, ctx.getObjectProto(proto));
            base.setSlot(ctx, Str.SYM_toDict, nativeToDict);
        }
    }
}
