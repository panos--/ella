package org.unbunt.sqlscript.lang;

public class Int extends BaseObj {
//    public static final PrimIntAddExpression primIntAdd = new PrimIntAddExpression();
//    public static final PrimIntSubExpression primIntSub = new PrimIntSubExpression();
//    public static final PrimIntMulExpression primIntMul = new PrimIntMulExpression();
//    public static final PrimIntDivExpression primIntDiv = new PrimIntDivExpression();
//    public static final PrimIntModExpression primIntMod = new PrimIntModExpression();
//    public static final PrimIntEqExpression primIntEq = new PrimIntEqExpression();
//    public static final PrimIntNeExpression primIntNe = new PrimIntNeExpression();

    public static final Int instance = new Int();

    private Int() {
        /*
        primitives.put(new Str("+").intern(), Primitive.Type.INT_ADD);
        primitives.put(new Str("-").intern(), Primitive.Type.INT_SUB);
        primitives.put(new Str("*").intern(), Primitive.Type.INT_MUL);
        primitives.put(new Str("/").intern(), Primitive.Type.INT_DIV);
        primitives.put(new Str("%").intern(), Primitive.Type.INT_MOD);
        primitives.put(new Str("==").intern(), Primitive.Type.INT_EQ);
        primitives.put(new Str("!=").intern(), Primitive.Type.INT_NE);
        primitives.put(new Str("===").intern(), Primitive.Type.INT_EQ);
        primitives.put(new Str("!==").intern(), Primitive.Type.INT_NE);
        */

        slots.put(new Str("+").intern(), Primitive.Type.INT_ADD.primitive);
        slots.put(new Str("-").intern(), Primitive.Type.INT_SUB.primitive);
        slots.put(new Str("*").intern(), Primitive.Type.INT_MUL.primitive);
        slots.put(new Str("/").intern(), Primitive.Type.INT_DIV.primitive);
        slots.put(new Str("%").intern(), Primitive.Type.INT_MOD.primitive);
        slots.put(new Str("==").intern(), Primitive.Type.INT_EQ.primitive);
        slots.put(new Str("!=").intern(), Primitive.Type.INT_NE.primitive);
        slots.put(new Str("===").intern(), Primitive.Type.INT_EQ.primitive);
        slots.put(new Str("!==").intern(), Primitive.Type.INT_NE.primitive);
    }
}
