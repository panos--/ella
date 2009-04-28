package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;

import java.lang.reflect.Array;

public class JArray extends Obj {
    public final Object array;
    public final int length;
    public final Int lengthObj;

    public static final Native nativeCreateInstance = new Native() {
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

    public JArray(Object array, int length) {
        this.array = array;
        this.length = length;
        this.lengthObj = new Int(length);
        slots.put(Str.Sym.parent.str, JArrayProto.instance);
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
}
