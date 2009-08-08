package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.engine.*;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;
import org.unbunt.sqlscript.lang.NativeWrapper;
import org.unbunt.sqlscript.engine.natives.ObjUtils;
import org.unbunt.sqlscript.engine.natives.*;
import org.unbunt.sqlscript.engine.context.Context;

import java.lang.reflect.Array;

public class JArray extends AbstractObj {
    public final Object array;
    public final int length;
    public final NNum lengthObj;

    public JArray(Object array, int length) {
        this.array = array;
        this.length = length;
        this.lengthObj = new NNum(length);
    }

    public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    public int getObjectID() {
        return OBJECT_ID;
    }

    public static void registerInContext(Context ctx) {
        JArrayProto.registerInContext(ctx);
        ctx.registerProto(OBJECT_ID, JArrayProto.OBJECT_ID);
    }

    @Override
    public Obj getSlot(Context ctx, Obj key) {
        if (Str.SYM_length.equals(key)) {
            return lengthObj;
        }
        return super.getSlot(ctx, key);
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
    public static class JArrayProto extends AbstractObj implements NativeObj {
        public static final NativeCall nativeEach = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj[] args) throws ClosureTerminatedException {
                JArray ctx = (JArray) context;
                Obj code = args[0];
                Object array = ctx.array;
                int length = Array.getLength(ctx.array);
                for (int i = 0; i < length; i++) {
                    Object elem = Array.get(array, i);
                    Obj wrappedIndex = new NNum(i);
                    Obj wrappedElem = NativeWrapper.wrap(engine.getContext(), elem);
                    engine.invoke(code, engine.getObjNull(), wrappedIndex, wrappedElem);
                }
                return context;
            }
        };

        public static final NativeCall nativeGet = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj[] args) throws ClosureTerminatedException {
                JArray ctx = (JArray) context;
                Object array = ctx.array;
                NNumeric num = ObjUtils.ensureType(NNumeric.class, args[0]);
                int idx = num.intValue();
                return NativeWrapper.wrap(engine.getContext(), Array.get(array, idx));
            }
        };

        public static final NativeCall nativeSet = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj[] args) throws ClosureTerminatedException {
                JArray ctx = (JArray) context;
                Object array = ctx.array;
                NNumeric num = ObjUtils.ensureType(NNumeric.class, args[0]);
                int idx = num.intValue();
                Obj value = args[1];
                Object jvalue = value.toJavaObject();
                Array.set(array, idx, jvalue);
                return value;
            }
        };

        public static final Call NATIVE_CONSTRUCTOR = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj[] args) throws ClosureTerminatedException {
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

        private JArrayProto() {
            slots.put(Str.SYM_each, nativeEach);
            slots.put(Str.SYM_get, nativeGet);
            slots.put(Str.SYM_set, nativeSet);
        }

        public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

        public int getObjectID() {
            return OBJECT_ID;
        }

        public static void registerInContext(Context ctx) {
            Base.registerInContext(ctx);
            ctx.registerProto(OBJECT_ID, Base.OBJECT_ID);
            if (!ctx.hasObject(OBJECT_ID)) {
                ctx.registerObject(new JArrayProto());
            }
        }

        public Call getNativeConstructor() {
            return NATIVE_CONSTRUCTOR;
        }
    }
}
