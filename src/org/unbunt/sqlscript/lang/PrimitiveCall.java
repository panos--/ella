package org.unbunt.sqlscript.lang;

public class PrimitiveCall extends PlainObj {
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
        INT_LE;

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
}
