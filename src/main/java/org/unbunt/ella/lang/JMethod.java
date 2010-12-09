/* JMethod.java
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
import org.unbunt.ella.engine.corelang.Engine;
import org.unbunt.ella.engine.corelang.*;
import static org.unbunt.ella.engine.corelang.ObjUtils.ensureType;
import org.unbunt.ella.exception.CheckedClassCastException;
import org.unbunt.ella.exception.ClosureTerminatedException;
import org.unbunt.ella.exception.EllaRuntimeException;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Represents an EllaScript object wrapping a set of Java methods.
 */
public class JMethod extends NativeCall {
    public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    /**
     * The wrapped Java methods.
     */
    public final Method[] methods;

    /**
     * Specifies if this method wrapped by this object was explicitly selected.
     * If this is the case, conversions causing potential information loss
     * (e.g. long to int) are activated for calls to this method.
     */
    protected final boolean selected;

    /**
     * Creates a new JMethod wrapping the given methods.
     *
     * @param methods the methods to wrap.
     */
    public JMethod(Method[] methods) {
        this(methods, false);
    }

    private JMethod(Method[] methods, boolean selected) {
        this.methods = methods;
        this.selected = selected;
    }

    public Obj call(Engine engine, Obj context, Obj[] args) throws ClosureTerminatedException {
        Object jcontext = context.toJavaObject();
        Object[] jargs = NativeWrapper.unwrap(args);

        try {
            Method method;
            if (methods.length == 1) {
                method = methods[0];
                if (selected) {
                    jargs = ReflectionUtils.adaptTypes(method, jargs);
                }
            }
            else {
                method = ReflectionUtils.findMatchingMethod(methods, ReflectionUtils.getArgTypes(jargs, args), jargs);
            }
            if (method == null) {
                throw new EllaRuntimeException("No such method");
            }
            return ReflectionUtils.invokeMethod(engine.getContext(), method, jcontext, jargs);
        } catch (IllegalArgumentException e) {
            throw new EllaRuntimeException("No such method: " + e.getMessage(), e);
        } catch (RuntimeException e) {
            throw new EllaRuntimeException(e);
        } catch (InvocationTargetException e) {
            throw ReflectionUtils.wrapInvocationTargetException(e);
        } catch (IllegalAccessException e) {
            throw new EllaRuntimeException(e);
        } catch (CheckedClassCastException e) {
            throw new EllaRuntimeException("Argument conversion failed: " + e.getMessage(), e);
        }
    }

    @Override
    public Object toJavaObject() {
        return methods;
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
        JMethodProto.registerInContext(ctx);
        ctx.registerProto(OBJECT_ID, JMethodProto.OBJECT_ID);
    }

    protected static class JMethodProto extends AbstractObj {
        public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

        protected static final NativeCall nativeSelect = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                JMethod thiz = ensureType(JMethod.class, context);
                String[] typeNames = new String[args.length];
                for (int i = 0; i < args.length; i++) {
                    Obj arg = args[i];
                    if (arg instanceof Null) {
                        typeNames[i] = null;
                    }
                    else {
                        typeNames[i] = arg.toString();
                    }
                }
                Method[] selectedMethods = ReflectionUtils.selectMethods(thiz.methods, typeNames);
                if (selectedMethods.length == 0) {
                    throw new EllaRuntimeException("No such method");
                }
                return new JMethod(selectedMethods, true);
            }
        };

        protected static final NativeCall nativeCall = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                JMethod thiz = ensureType(JMethod.class, context);
                Obj[] methodArgs = Arrays.copyOfRange(args, 1, args.length);
                return thiz.call(engine, args[0], methodArgs);
            }
        };

        private JMethodProto() {
            slots.put(Str.SYM_select, nativeSelect);
            slots.put(Str.SYM_call, nativeCall);
        }

        @Override
        public int getObjectID() {
            return OBJECT_ID;
        }

        public static void registerInContext(Context ctx) {
            Base.registerInContext(ctx);
            ctx.registerProto(OBJECT_ID, Base.OBJECT_ID);
            ctx.registerObject(new JMethodProto());
        }
    }
}
