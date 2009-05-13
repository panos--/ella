package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;

public class PrimitiveCall extends PlainObj implements Call {
    public static enum Type {
        ID,
        NI,
        INT_ADD,
        INT_SUB,
        INT_MUL,
        INT_DIV,
        INT_MOD,
        INT_EQ,
        INT_NE,
        INT_GT,
        INT_GE,
        INT_LT,
        INT_LE,
        LOOP,
        LOOP_BREAK,
        LOOP_CONTINUE;

        protected final PrimitiveCall primitive;

        Type() {
            primitive = new PrimitiveCall(this);
        }
    }

    public final Type type;
    public final int code;

    public PrimitiveCall(Type type) {
        this.type = type;
        this.code = type.ordinal();
    }

    public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
        return engine.invoke(this, context, args);
    }
}
