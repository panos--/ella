package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.support.DynamicEnv;
import org.unbunt.sqlscript.support.DynamicVariableResolver;
import org.unbunt.sqlscript.support.Variable;
import org.unbunt.sqlscript.support.CachingVariableResolver;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;
import org.unbunt.utils.StringUtils;

public class Sys extends PlainObj {
    protected static final NativeCall nativePrint = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj[] args) throws ClosureTerminatedException {
            System.out.println(StringUtils.join(" ", (Object[]) args));
            return Null.instance;
        }
    };

    protected static final NativeCall nativeImportPackage = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj[] args) throws ClosureTerminatedException {
            final String pkgPrefix = args[0].toString() + ".";
            final ClassLoader loader = engine.getClass().getClassLoader();
            DynamicEnv newEnv = new DynamicEnv(engine.getEnv(), new CachingVariableResolver(
                    new DynamicVariableResolver() {
                        public Obj resolve(Variable var) {
                            Class cls;
                            try {
                                cls = loader.loadClass(pkgPrefix + var.name);
                            } catch (ClassNotFoundException e) {
                                return null;
                            }
                            return new JClass(cls);
                        }
                    }));
            engine.setEnv(newEnv);
            return Null.instance;
        }
    };

    protected static final NativeCall nativeNoop = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            return Null.instance;
        }
    };

    public static final Sys instance = new Sys();

    public Sys() {
        slots.put(Str.SYM_parent, Base.instance);
        slots.put(Str.SYM_print, nativePrint);
        slots.put(Str.SYM_importPackage, nativeImportPackage);
        slots.put(Str.SYM_noop, nativeNoop);
    }
}
