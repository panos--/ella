package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.statement.*;

public class Int extends BaseObj {
    protected static Int instance = null;

    private Int() {
        primitives.put(new Str("+"), new PrimIntAddExpression());
        primitives.put(new Str("-"), new PrimIntSubExpression());
        primitives.put(new Str("*"), new PrimIntMulExpression());
        primitives.put(new Str("/"), new PrimIntDivExpression());
        primitives.put(new Str("%"), new PrimIntModExpression());
        primitives.put(new Str("=="), new PrimIntEqExpression());
        primitives.put(new Str("!="), new PrimIntNeExpression());
        primitives.put(new Str("==="), new PrimIntEqExpression());
        primitives.put(new Str("!=="), new PrimIntNeExpression());
    }

    public static synchronized Int getInstance() {
        if (instance == null) {
            instance = new Int();
        }
        return instance;
    }
}
