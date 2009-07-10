package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.exception.SQLScriptRuntimeException;
import org.unbunt.sqlscript.support.NativeWrapper;
import org.unbunt.sqlscript.support.Context;
import org.unbunt.sqlscript.utils.ReflectionUtils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class JObject extends PlainObj {
    public final Object value;
    public final Class cls;

    public JObject(Object value) {
        this.value = value;
        this.cls = value.getClass();
    }

    @Override
    public Obj getSlot(Context context, Obj key) {
        Obj val = slots.get(key);
        if (val != null) {
            return val;
        }

        String keyStr = key.toString();

        // try to load method named exactly like the slot
        List<Method> directMatches = ReflectionUtils.getMethods(cls, keyStr);
        if (!directMatches.isEmpty()) {
            JMethod method = new JMethod(directMatches.toArray(new Method[directMatches.size()]));
            slots.put(key, method);
            return method;
        }

        // interpret given slot name as property name and try to find and invoke corresponding getter method
        String propStr = ReflectionUtils.getterFromProperty(keyStr);
        Method getter = null;
        try {
            getter = cls.getMethod(propStr, (Class<?>[])null);
        } catch (NoSuchMethodException ignored) {
        }
        if (getter != null) {
            try {
                Object result = getter.invoke(value, (Object[])null);
                return NativeWrapper.wrap(context, result);
            } catch (IllegalAccessException ignored) {
                // access to getter denied by vm -> act as if no getter method was found;
            } catch (InvocationTargetException e) {
                // exception thrown by getter -> re-throw as script exception
                throw new SQLScriptRuntimeException(e.getCause());
            }
        }

        // try to find property named like the slot
        try {
            Field field = cls.getField(keyStr);
            Object fieldValue = field.get(value);
            return NativeWrapper.wrap(context, fieldValue);
        } catch (NoSuchFieldException ignored) {
        } catch (IllegalAccessException ignored) {
        }

        return context.getObjNull();
    }

    @Override
    public Obj setSlot(Context context, Obj key, Obj val) {
        if (slots.containsKey(key)) {
            slots.put(key, val);
            return this;
        }

        String keyStr = key.toString();
        Object jvalue = val.toJavaObject();

        // interpret given slot name as property name and try to find and invoke corresponding setter method
        String propStr = ReflectionUtils.setterFromProperty(keyStr);
        Method[] methods = cls.getMethods();
        Method setter = ReflectionUtils.findMatchingMethod(methods, propStr,
                                                           new Class[] {
                                                                   jvalue == null ? null : jvalue.getClass()
                                                           },
                                                           new Object[] { jvalue });
        if (setter != null) {
            try {
                Object result = setter.invoke(value, jvalue);
                return NativeWrapper.wrap(context, result);
            } catch (IllegalAccessException ignored) {
                // access to setter denied by vm -> act as if no setter method was found;
            } catch (InvocationTargetException e) {
                // exception thrown by setter -> re-throw as script exception
                throw new SQLScriptRuntimeException(e.getCause());
            }
        }

        // try to find property named like the slot and set it's value
        try {
            Field field = cls.getField(keyStr);
            field.set(value, val);
            return this;
        } catch (NoSuchFieldException ignored) {
        } catch (IllegalAccessException ignored) {
        }

        // fall back to using normal script object property (slot)
        slots.put(key, val);

        return this;
    }

    @Override
    public Object toJavaObject() {
        return value;
    }

    public String toString() {
        return "" + value;
    }
}
