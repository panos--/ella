package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.statement.*;

public class Int extends BaseObj {
    protected static Int instance = null;

    public static final PrimIntAddExpression primIntAdd = new PrimIntAddExpression();
    public static final PrimIntSubExpression primIntSub = new PrimIntSubExpression();
    public static final PrimIntMulExpression primIntMul = new PrimIntMulExpression();
    public static final PrimIntDivExpression primIntDiv = new PrimIntDivExpression();
    public static final PrimIntModExpression primIntMod = new PrimIntModExpression();
    public static final PrimIntEqExpression primIntEq = new PrimIntEqExpression();
    public static final PrimIntNeExpression primIntNe = new PrimIntNeExpression();

    private Int() {
        primitives.put(new Str("+").intern(), primIntAdd);
        primitives.put(new Str("-").intern(), primIntSub);
        primitives.put(new Str("*").intern(), primIntMul);
        primitives.put(new Str("/").intern(), primIntDiv);
        primitives.put(new Str("%").intern(), primIntMod);
        primitives.put(new Str("==").intern(), primIntEq);
        primitives.put(new Str("!=").intern(), primIntNe);
        primitives.put(new Str("===").intern(), primIntEq);
        primitives.put(new Str("!==").intern(), primIntNe);
    }

    public static synchronized Int getInstance() {
        if (instance == null) {
            instance = new Int();
        }
        return instance;
    }
}
