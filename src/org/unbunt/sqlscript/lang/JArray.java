package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.support.NativeWrapper;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;

import java.lang.reflect.Array;

public class JArray extends PlainObj {
    public static final JArrayProto PROTOTYPE = new JArrayProto();

    public final Object array;
    public final int length;
    public final Int lengthObj;

    public JArray(Object array, int length) {
        this.array = array;
        this.length = length;
        this.lengthObj = new Int(length);
    }

    @Override
    public Obj getImplicitParent() {
        return PROTOTYPE;
    }

    @Override
    public Obj getSlot(Obj key) {
        if (Str.Sym.length.str.equals(key)) {
            return lengthObj;
        }
        return super.getSlot(key);
    }

    @Override
    public Object toJavaObject() {
        return array;
    }

    /**
 * User: tweiss
     * Date: 28.04.2009
     * Time: 08:23:56
     * <p/>
     * Copyright: (c) 2007 marketoolz GmbH
     */
    public static class JArrayProto extends PlainObj implements NativeObj {
        public static final NativeCall nativeEach = new NativeCall() {
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

        public static final NativeCall nativeGet = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj[] args) throws ClosureTerminatedException {
                JArray ctx = (JArray) context;
                Object array = ctx.array;
                int idx = ((Number) args[0].toJavaObject()).intValue();
                return NativeWrapper.wrap(Array.get(array, idx));
            }
        };

        public static final NativeCall nativeSet = new NativeCall() {
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

        public static final Call NATIVE_CONSTRUCTOR = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj[] args) throws ClosureTerminatedException {
                Class componentType;
                int length = 0;
                int[] dimensions = null;
                int nargs = args.length;
                if (nargs > 0) {
                    componentType = (Class) args[0].toJavaObject();
                    if (nargs == 2) {
                        length = ((Number) args[1].toJavaObject()).intValue();
                    }
                    else if (nargs > 2) {
                        int ndims = nargs - 1;
                        dimensions = new int[ndims];
                        for (int i = 1; i < nargs; i++) {
                            Obj arg = args[i];
                            dimensions[i - 1] = ((Number) arg.toJavaObject()).intValue();
                        }
                    }
                    else {
                        length = 0;
                    }
                }
                else {
                    componentType = Object.class;
                }
                Object array;
                if (dimensions != null) {
                    array = Array.newInstance(componentType, dimensions);
                    length = dimensions[0];
                }
                else {
                    array = Array.newInstance(componentType, length);
                }
                return new JArray(array, length);
            }
        };

        public JArrayProto() {
            slots.put(Str.Sym.each.str, nativeEach);
            slots.put(Str.Sym.get.str, nativeGet);
            slots.put(Str.Sym.set.str, nativeSet);
        }

        @Override
        public Obj getImplicitParent() {
            return Base.instance;
        }

        public Call getNativeConstructor() {
            return NATIVE_CONSTRUCTOR;
        }
    }
}
