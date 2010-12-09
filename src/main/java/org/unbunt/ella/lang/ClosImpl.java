/* ClosImpl.java
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

import org.unbunt.ella.compiler.support.BlockClosure;
import org.unbunt.ella.exception.ClosureTerminatedException;
import org.unbunt.ella.exception.LoopBreakException;
import org.unbunt.ella.exception.LoopContinueException;
import org.unbunt.ella.engine.corelang.*;
import static org.unbunt.ella.engine.corelang.ObjUtils.ensureType;
import org.unbunt.ella.engine.context.Context;

/**
 * Represents a default implementation of the EllaScript core object <code>Clos</code>.
 */
public class ClosImpl extends AbstractObj implements Clos {
    protected BlockClosure closure;

    /**
     * Creates a new Clos wrapping the given closure.
     *
     * @param closure the closure to wrap.
     */
    public ClosImpl(BlockClosure closure) {
        this.closure = closure;
    }

    public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    public int getObjectID() {
        return OBJECT_ID;
    }

    /**
     * Registers this EllaScript object within the given execution context.
     *
     * @param ctx the execution context to register this object in.
     */
    public static void registerInContext(Context ctx) {
        ClosProto.registerInContext(ctx);
        ctx.registerProto(OBJECT_ID, ClosProto.OBJECT_ID);
    }

    public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
        return engine.invoke(this, args);
    }

    public Obj call(Engine engine, Obj context, Obj receiver, Obj... args) throws ClosureTerminatedException {
        return engine.invoke(this, args);
    }

    public void trigger(Engine engine, Obj context, Obj... args) {
        engine.trigger(this, args);
    }

    public BlockClosure getClosure() {
        return closure;
    }

    /**
     * Represents the implicit parent object for Clos objects.
     */
    public static class ClosProto extends AbstractObj {
        protected static final NativeCall nativeWhileTrue = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) {
                Call cond = ensureType(Call.class, context);
                Obj _null = engine.getObjNull();
                Obj result = _null;
                while (true) {
                    Obj condValue = cond.call(engine, null);
                    if (!engine.toBoolean(condValue)) {
                        break;
                    }

                    try {
                        result = engine.invokeInLoop(args[0], _null);
                    } catch (LoopBreakException e) {
                        break;
                    } catch (LoopContinueException e) {
                        continue;
                    }
                }
                return result;
            }
        };

        private ClosProto() {
            this.slots.put(Str.SYM_whileTrue, nativeWhileTrue);
        }

        public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

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
            if (!ctx.hasObject(OBJECT_ID)) {
                ctx.registerObject(new ClosProto());
            }
        }
    }
}
