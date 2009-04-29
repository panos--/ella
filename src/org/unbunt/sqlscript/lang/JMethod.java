package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.utils.ReflectionUtils;
import org.unbunt.sqlscript.support.NativeWrapper;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;
import org.unbunt.sqlscript.exception.SQLScriptRuntimeException;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

public class JMethod extends NativeCall {
    public final Method[] methods;

    public JMethod(Method[] methods) {
        this.methods = methods;
    }

    public Obj call(SQLScriptEngine engine, Obj context, Obj[] args) throws ClosureTerminatedException {
        Object jcontext = context.toJavaObject();
        Object[] jargs = NativeWrapper.unwrap(args);

        try {
            Method method = ReflectionUtils.findMatchingMethod(methods, ReflectionUtils.getArgTypes(jargs));
            if (method == null) {
                throw new SQLScriptRuntimeException("No such method");
            }
            Object jresult = method.invoke(jcontext, jargs);
            return NativeWrapper.wrap(jresult);
        } catch (IllegalAccessException e) {
            throw new SQLScriptRuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new SQLScriptRuntimeException(e);
        }
    }

    @Override
    public Object toJavaObject() {
        return methods;
    }
}
