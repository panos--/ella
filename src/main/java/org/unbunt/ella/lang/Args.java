/* Args.java
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

import org.unbunt.ella.exception.ClosureTerminatedException;
import org.unbunt.ella.exception.EllaRuntimeException;
import org.unbunt.ella.exception.LoopBreakException;
import org.unbunt.ella.exception.LoopContinueException;
import org.unbunt.ella.engine.corelang.*;
import static org.unbunt.ella.engine.corelang.ObjUtils.ensureType;
import org.unbunt.ella.engine.context.Context;

/**
 * Represents an EllaScript object wrapping an array of function arguments.
 */
public class Args extends AbstractObj {
    /**
     * The arguments this object wraps.
     */
    public final Obj[] args;

    /**
     * A value representing an empty set of arguments.
     */
    public static final Args emptyArgs = new Args(new Obj[0]);

    /**
     * Creates a new Args object wrapping the given array.
     * @param args the arguments to wrap.
     */
    public Args(Obj[] args) {
        this.args = args;
    }

    protected static final int OBJECT_ID = ProtoRegistry.generateObjectID();

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
        ArgsProto.registerInContext(ctx);
        ctx.registerProto(OBJECT_ID, ArgsProto.OBJECT_ID);
    }

    protected static class ArgsProto extends AbstractObj {
        protected static final NativeCall nativeGet = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Args thiz = ensureType(Args.class, context);
                NNumeric idxObj = ensureType(NNumeric.class, args[0]);
                int idx = idxObj.intValue(); // TODO: maybe throw exception if value doesn't fit in int
                try {
                    return thiz.args[idx];
                } catch (IndexOutOfBoundsException e) {
                    throw new EllaRuntimeException(e);
                }
            }
        };

        protected static final NativeCall nativeSize = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) {
                Args thiz = ensureType(Args.class, context);
                return new NNum(thiz.args.length);
            }
        };

        protected static final NativeCall nativeEach = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) {
                Args thiz = ensureType(Args.class, context);
                Obj clos = args[0];

                for (Obj arg : thiz.args) {
                    try {
                        engine.invokeInLoop(clos, engine.getObjNull(), arg);
                    } catch (LoopBreakException e) {
                        break;
                    } catch (LoopContinueException e) {
                        continue;
                    }
                }

                return null;
            }
        };

        private ArgsProto() {
            slots.put(Str.SYM_get, nativeGet);
            slots.put(Str.SYM_size, nativeSize);
            slots.put(Str.SYM_each, nativeEach);
        }

        public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

        @Override
        public int getObjectID() {
            return OBJECT_ID;
        }

        public static void registerInContext(Context ctx) {
            Base.registerInContext(ctx);
            ctx.registerProto(OBJECT_ID, Base.OBJECT_ID);
            ctx.registerObject(new ArgsProto());
        }
    }
}
