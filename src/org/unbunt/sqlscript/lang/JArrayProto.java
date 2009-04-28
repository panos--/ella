package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.support.NativeWrapper;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;

import java.lang.reflect.Array;

/**
 * User: tweiss
 * Date: 28.04.2009
 * Time: 08:23:56
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
public class JArrayProto extends Obj {
    public static final Native nativeEach = new Native() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj[] args) throws ClosureTerminatedException {
            JArray ctx = (JArray) context;
            Clos code = (Clos) args[0];
            Object array = ctx.array;
            int length = Array.getLength(ctx.array);
            for (int i = 0; i < length; i++) {
                Object elem = Array.get(array, i);
                Obj wrappedIndex = new Int(i);
                Obj wrappedElem = NativeWrapper.wrap(elem);
                engine.invoke(code, Null.instance, wrappedIndex, wrappedElem);
            }
            return context;
        }
    };

    public static final Native nativeGet = new Native() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj[] args) throws ClosureTerminatedException {
            JArray ctx = (JArray) context;
            Object array = ctx.array;
            int idx = ((Number) args[0].toJavaObject()).intValue();
            return NativeWrapper.wrap(Array.get(array, idx));
        }
    };

    public static final Native nativeSet = new Native() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj[] args) throws ClosureTerminatedException {
            JArray ctx = (JArray) context;
            Object array = ctx.array;
            int idx = ((Number) args[0].toJavaObject()).intValue();
            Obj value = args[1];
            Object jvalue = value.toJavaObject();
            Array.set(array, idx, jvalue);
            return value;
        }
    };

    public static final JArrayProto instance = new JArrayProto();

    public JArrayProto() {
        slots.put(Str.Sym.parent.str, Base.instance);
        slots.put(Str.Sym.each.str, nativeEach);
        slots.put(Str.Sym.get.str, nativeGet);
        slots.put(Str.Sym.set.str, nativeSet);
    }
}
