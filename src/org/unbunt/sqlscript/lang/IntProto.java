package org.unbunt.sqlscript.lang;

public class IntProto extends BaseObj {
    public static final IntProto instance = new IntProto();

    private IntProto() {
        slots.put(Str.Sym.parent.str, Base.instance);
        slots.put(Str.Sym._add.str, Primitive.Type.INT_ADD.primitive);
        slots.put(Str.Sym._sub.str, Primitive.Type.INT_SUB.primitive);
        slots.put(Str.Sym._mul.str, Primitive.Type.INT_MUL.primitive);
        slots.put(Str.Sym._div.str, Primitive.Type.INT_DIV.primitive);
        slots.put(Str.Sym._mod.str, Primitive.Type.INT_MOD.primitive);
        slots.put(Str.Sym._eq.str, Primitive.Type.INT_EQ.primitive);
        slots.put(Str.Sym._ne.str, Primitive.Type.INT_NE.primitive);
        slots.put(Str.Sym._gt.str, Primitive.Type.INT_GT.primitive);
        slots.put(Str.Sym._ge.str, Primitive.Type.INT_GE.primitive);
        slots.put(Str.Sym._lt.str, Primitive.Type.INT_LT.primitive);
        slots.put(Str.Sym._le.str, Primitive.Type.INT_LE.primitive);
        slots.put(Str.Sym._id.str, Primitive.Type.INT_EQ.primitive);
        slots.put(Str.Sym._ni.str, Primitive.Type.INT_NE.primitive);
    }
}
