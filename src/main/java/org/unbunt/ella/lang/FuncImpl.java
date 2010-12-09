/* FuncImpl.java
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

import org.unbunt.ella.engine.corelang.ProtoRegistry;
import org.unbunt.ella.engine.corelang.*;
import org.unbunt.ella.exception.ClosureTerminatedException;
import org.unbunt.ella.compiler.support.Function;
import org.unbunt.ella.engine.context.Context;

/**
 * Represents a default implementation of the EllaScript core object <code>Func</code>.
 */
public class FuncImpl extends AbstractObj implements Func {
    protected Function function;

    /**
     * Creates a new Func wrapping the given function.
     *
     * @param function the function to wrap.
     */
    public FuncImpl(Function function) {
        this.function = function;
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
        FuncProto.registerInContext(ctx);
        ctx.registerProto(OBJECT_ID, FuncProto.OBJECT_ID);
    }

    public Obj call(Engine engine, Obj context, Obj[] args) throws ClosureTerminatedException {
        return engine.invoke(this, context, null, args);
    }

    public Obj call(Engine engine, Obj context, Obj receiver, Obj... args) throws ClosureTerminatedException {
        return engine.invoke(this, context, receiver, args);
    }

    public void trigger(Engine engine, Obj context, Obj... args) {
        engine.trigger(this, context, args);
    }

    public Function getFunction() {
        return function;
    }

    /**
     * Represents the implicit parent object for Func objects.
     */
    public static class FuncProto extends AbstractObj {
        public static NativeCall nativeCall = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Obj[] callArgs = new Obj[args.length - 1];
                System.arraycopy(args, 1, callArgs, 0, callArgs.length);
                return engine.invoke(context, args[0], callArgs);
            }
        };

        private FuncProto() {
            slots.put(Str.SYM_call, nativeCall);
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
                ctx.registerObject(new FuncProto());
            }
        }
    }
}
