package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.statement.*;

public class Int extends BaseObj {
    protected static Int instance = null;

    private Int() {
        primitives.put(new Str("+").intern(), new PrimIntAddExpression());
        primitives.put(new Str("-").intern(), new PrimIntSubExpression());
        primitives.put(new Str("*").intern(), new PrimIntMulExpression());
        primitives.put(new Str("/").intern(), new PrimIntDivExpression());
        primitives.put(new Str("%").intern(), new PrimIntModExpression());
        primitives.put(new Str("==").intern(), new PrimIntEqExpression());
        primitives.put(new Str("!=").intern(), new PrimIntNeExpression());
        primitives.put(new Str("===").intern(), new PrimIntEqExpression());
        primitives.put(new Str("!==").intern(), new PrimIntNeExpression());
    }

    public static synchronized Int getInstance() {
        if (instance == null) {
            instance = new Int();
        }
        return instance;
    }
}
