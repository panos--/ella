package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.exception.SQLScriptRuntimeException;
import org.unbunt.sqlscript.engine.natives.Obj;
import org.unbunt.sqlscript.engine.natives.AbstractObj;
import org.unbunt.sqlscript.engine.natives.ProtoRegistry;
import org.unbunt.sqlscript.lang.NativeWrapper;
import org.unbunt.sqlscript.lang.ReflectionUtils;
import org.unbunt.sqlscript.engine.context.Context;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JObject extends AbstractObj {
    protected static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    public final Object value;
    public final Class<?> clazz;

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
                throw new SQLScriptRuntimeException(e.getCause());
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
                throw new SQLScriptRuntimeException(e.getCause());
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

    public static void registerInContext(Context ctx) {
        Base.registerInContext(ctx);
        ctx.registerProto(OBJECT_ID, Base.OBJECT_ID);
    }
}
