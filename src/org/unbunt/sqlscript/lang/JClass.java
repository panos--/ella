package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.statement.Expression;
import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;
import org.unbunt.sqlscript.exception.SQLScriptRuntimeException;

import java.util.List;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

/**
 * User: tweiss
 * Date: 23.04.2009
 * Time: 08:36:57
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
public class JClass extends Obj {
    public final Class cls;

    public static final Native nativeCreateInstance = new Native() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj[] args) throws ClosureTerminatedException {
            if (args.length != 0) {
                throw new SQLScriptRuntimeException("Multi-argument calls to Java constructors not implemented yet");
            }

            Object result = null;
            Class cls = ((JClass) context).cls;

            Constructor[] ctors = cls.getConstructors();
            for (Constructor ctor : ctors) {
                int mods = ctor.getModifiers();
                if (Modifier.isAbstract(mods)
                    || Modifier.isInterface(mods)
                    || Modifier.isPrivate(mods)
                    || Modifier.isProtected(mods)) {
                    continue;
                }
                if (ctor.getParameterTypes().length == 0) {
                    try {
                        result = ctor.newInstance();
                        break;
                    } catch (InstantiationException e) {
                        throw new SQLScriptRuntimeException(e);
                    } catch (IllegalAccessException e) {
                        throw new SQLScriptRuntimeException(e);
                    } catch (InvocationTargetException e) {
                        throw new SQLScriptRuntimeException(e);
                    }
                }
            }

            return result instanceof Obj ? (Obj) result : new JObject(result);
        }
    };

    public JClass(Class cls) {
        this.cls = cls;
        slots.put(Str.Sym.parent.str, JClassProto.instance);
    }

    @Override
    public Class toJavaObject() {
        return cls;
    }

    public String toString() {
        return "[JClass " + cls.toString() + "]";
    }
}
