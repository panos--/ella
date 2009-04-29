package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;

public class Int extends PlainObj {
    public static final IntProto PROTOTYPE = new IntProto();

    public final int value;

    public Int(int value) {
        this.value = value;
    }

    @Override
    public Obj getImplicitParent() {
        return PROTOTYPE;
    }

    public int getValue() {
        return value;
    }

    @Override
    public Object toJavaObject() {
        return value;
    }

    public String toString() {
        return "" + value;
    }

    public static class IntProto extends PlainObj implements NativeObj {
        public static final Call NATIVE_CONSTRUCTOR = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj[] args) throws ClosureTerminatedException {
                // TODO: what about just returning args[0] as is?
                return new Int(((Int)args[0]).getValue());
            }
        };

        private IntProto() {
            slots.put(Str.Sym._add.str, PrimitiveCall.Type.INT_ADD.primitive);
            slots.put(Str.Sym._sub.str, PrimitiveCall.Type.INT_SUB.primitive);
            slots.put(Str.Sym._mul.str, PrimitiveCall.Type.INT_MUL.primitive);
            slots.put(Str.Sym._div.str, PrimitiveCall.Type.INT_DIV.primitive);
            slots.put(Str.Sym._mod.str, PrimitiveCall.Type.INT_MOD.primitive);
            slots.put(Str.Sym._eq.str, PrimitiveCall.Type.INT_EQ.primitive);
            slots.put(Str.Sym._ne.str, PrimitiveCall.Type.INT_NE.primitive);
            slots.put(Str.Sym._gt.str, PrimitiveCall.Type.INT_GT.primitive);
            slots.put(Str.Sym._ge.str, PrimitiveCall.Type.INT_GE.primitive);
            slots.put(Str.Sym._lt.str, PrimitiveCall.Type.INT_LT.primitive);
            slots.put(Str.Sym._le.str, PrimitiveCall.Type.INT_LE.primitive);
            slots.put(Str.Sym._id.str, PrimitiveCall.Type.INT_EQ.primitive);
            slots.put(Str.Sym._ni.str, PrimitiveCall.Type.INT_NE.primitive);
        }

        public Call getNativeConstructor() {
            return NATIVE_CONSTRUCTOR;
        }

        @Override
        public Obj getImplicitParent() {
            return Base.instance;
        }
    }
}
