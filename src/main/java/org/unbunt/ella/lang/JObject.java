/* JObject.java
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
import org.unbunt.ella.engine.corelang.AbstractObj;
import org.unbunt.ella.engine.corelang.Obj;
import org.unbunt.ella.engine.corelang.ProtoRegistry;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Represents an EllaScript object wrapping an arbitrary Java object.
 */
public class JObject extends AbstractObj {
    protected static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    /**
     * The wrapped object.
     */
    public final Object value;

    /**
     * The type of the wrapped object.
     */
    public final Class<?> clazz;

    /**
     * Creates a new JObject wrapping the given Java object.
     *
     * @param value the Java object to wrap.
     */
    public JObject(Object value) {
        this.value = value;
        this.clazz = value.getClass();
    }

    @Override
    public Obj getSlot(Context ctx, Obj key) {
        Obj val = slots.get(key);
        if (val != null) {
            return val;
        }

        String keyStr = key.toString();

        // try to load method named exactly like the slot
        List<Method> directMatches = ReflectionUtils.getMethods(clazz, keyStr);
        if (!directMatches.isEmpty()) {
            JMethod method = new JMethod(directMatches.toArray(new Method[directMatches.size()]));
            slots.put(key, method);
            return method;
        }

        // interpret given slot name as property name and try to find and invoke corresponding getter method
        String propStr = ReflectionUtils.getterFromProperty(keyStr);
        Method getter = null;
        try {
            getter = clazz.getMethod(propStr, (Class[])null);
        } catch (NoSuchMethodException ignored) {
        }
        if (getter != null) {
            try {
                return ReflectionUtils.invokeMethod(ctx, getter, value, (Object[])null);
            } catch (IllegalAccessException ignored) {
                // access to getter denied by vm -> act as if no getter method was found;
            } catch (InvocationTargetException e) {
                // exception thrown by getter -> re-throw as script exception
                throw ReflectionUtils.wrapInvocationTargetException(e);
            }
        }

        // try to find property named like the slot
        try {
            Field field = clazz.getField(keyStr);
            Object fieldValue = field.get(value);
            return NativeWrapper.wrap(ctx, fieldValue);
        } catch (NoSuchFieldException ignored) {
        } catch (IllegalAccessException ignored) {
        }

        return null;
    }

    @Override
    public Obj setSlot(Context ctx, Obj key, Obj val) {
        if (slots.containsKey(key)) {
            slots.put(key, val);
            return this;
        }

        String keyStr = key.toString();
        Object jvalue = val.toJavaObject();

        // interpret given slot name as property name and try to find and invoke corresponding setter method
        String propStr = ReflectionUtils.setterFromProperty(keyStr);
        Method[] methods = clazz.getMethods();
        Method setter = ReflectionUtils.findMatchingMethod(methods, propStr,
                                                           new Class[] {
                                                                   jvalue == null ? null : jvalue.getClass()
                                                           },
                                                           new Object[] { jvalue });
        if (setter != null) {
            try {
                return ReflectionUtils.invokeMethod(ctx, setter, value, jvalue);
            } catch (IllegalAccessException ignored) {
                // access to setter denied by vm -> act as if no setter method was found;
            } catch (InvocationTargetException e) {
                // exception thrown by setter -> re-throw as script exception
                throw ReflectionUtils.wrapInvocationTargetException(e);
            }
        }

        // try to find property named like the slot and set it's value
        try {
            Field field = clazz.getField(keyStr);
            field.set(value, val);
            return this;
        } catch (NoSuchFieldException ignored) {
        } catch (IllegalAccessException ignored) {
        }

        // fall back to using normal script object property (slot)
        slots.put(key, val);

        return this;
    }

    // TODO: Merge with JClass.getSlots()
    @Override
    public Map<Obj, Obj> getSlots() {
        Map<Obj, Obj> result = new HashMap<Obj, Obj>();
        Map<String, List<Method>> methodsByName = new HashMap<String, List<Method>>();
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            String name = method.getName();
            List<Method> namedMethods = methodsByName.get(name);
            if (namedMethods == null) {
                namedMethods = new ArrayList<Method>();
                methodsByName.put(name, namedMethods);
            }
            namedMethods.add(method);
        }
        for (Map.Entry<String, List<Method>> entry : methodsByName.entrySet()) {
            List<Method> namedMethods = entry.getValue();
            String name = entry.getKey();
            result.put(
                    new Str(name),
                    new JMethod(namedMethods.toArray(new Method[namedMethods.size()]))
            );
        }
        result.putAll(slots);
        return result;
    }

    @Override
    public Object toJavaObject() {
        return value;
    }

    public String toString() {
        return "" + value;
    }

    @Override
    public int getObjectID() {
        return OBJECT_ID;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JObject jObject = (JObject) o;

        return value.equals(jObject.value);
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
        Base.registerInContext(ctx);
        ctx.registerProto(OBJECT_ID, Base.OBJECT_ID);
    }
}
