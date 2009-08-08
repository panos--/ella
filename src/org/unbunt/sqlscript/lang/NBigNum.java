package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.exception.*;
import org.unbunt.sqlscript.engine.*;
import org.unbunt.sqlscript.engine.natives.*;
import org.unbunt.sqlscript.lang.NumUtils;
import static org.unbunt.sqlscript.lang.NumUtils.toBigInteger;
import static org.unbunt.sqlscript.lang.NumUtils.toBigDecimal;
import static org.unbunt.sqlscript.engine.natives.ObjUtils.ensureType;

import java.math.BigDecimal;
import java.math.BigInteger;

public class NBigNum extends AbstractObj implements NNumeric {
    public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    public final BigInteger value;

    public NBigNum(BigInteger value) {
        this.value = value;
    }

    public int getType() {
        return NNumeric.TYPE_BIGNUM;
    }

    public boolean isNum() {
        return false;
    }

    public boolean isBigNum() {
        return true;
    }

    public boolean isReal() {
        return false;
    }

    public boolean isBigReal() {
        return false;
    }

    public byte byteValue() {
        return value.byteValue();
    }

    public short shortValue() {
        return value.shortValue();
    }

    public int intValue() {
        return value.intValue();
    }

    public long longValue() {
        return value.longValue();
    }

    public float floatValue() {
        return value.floatValue();
    }

    public double doubleValue() {
        return value.doubleValue();
    }

    public BigInteger bigIntegerValue() {
        return value;
    }

    public BigDecimal bigDecimalValue() {
        return toBigDecimal(value);
    }

    public Obj add(long arg) {
        return new NBigNum(value.add(toBigInteger(arg)));
    }

    public Obj add(double arg) {
        try {
            return new NBigReal(toBigDecimal(value).add(toBigDecimal(arg)));
        } catch (DoubleNaNException e) {
            return new NReal(arg);
        } catch (DoublePositiveInfinityExcepetion doublePositiveInfinityExcepetion) {
            return new NReal(arg);
        } catch (DoubleNegativeInfinityException e) {
            return new NReal(arg);
        }
    }

    public Obj add(BigInteger arg) {
        return new NBigNum(value.add(arg));
    }

    public Obj add(BigDecimal arg) {
        return new NBigReal(arg.add(toBigDecimal(value)));
    }

    public Obj subtractRev(long arg) {
        return new NBigNum(toBigInteger(arg).subtract(value));
    }

    public Obj subtractRev(double arg) {
        try {
            return new NBigReal(toBigDecimal(arg).subtract(toBigDecimal(value)));
        } catch (DoubleNaNException e) {
            return new NReal(arg);
        } catch (DoublePositiveInfinityExcepetion doublePositiveInfinityExcepetion) {
            return new NReal(arg);
        } catch (DoubleNegativeInfinityException e) {
            return new NReal(arg);
        }
    }

    public Obj subtractRev(BigInteger arg) {
        return new NBigNum(arg.subtract(value));
    }

    public Obj subtractRev(BigDecimal arg) {
        return new NBigReal(arg.subtract(toBigDecimal(value)));
    }

    public Obj multiply(long arg) {
        return new NBigNum(value.multiply(toBigInteger(arg)));
    }

    public Obj multiply(double arg) {
        try {
            return new NBigReal(toBigDecimal(value).multiply(toBigDecimal(arg)));
        } catch (DoubleNaNException e) {
            return new NReal(arg);
        } catch (DoublePositiveInfinityExcepetion doublePositiveInfinityExcepetion) {
            return new NReal(arg);
        } catch (DoubleNegativeInfinityException e) {
            return new NReal(arg);
        }
    }

    public Obj multiply(BigInteger arg) {
        return new NBigNum(value.multiply(arg));
    }

    public Obj multiply(BigDecimal arg) {
        return new NBigReal(toBigDecimal(value).multiply(arg));
    }

    public Obj divideRev(long arg) throws CheckedArithmeticException {
        return divideRev(toBigInteger(arg));
    }

    public Obj divideRev(double arg) throws CheckedArithmeticException {
        try {
            return NumUtils.divide(toBigDecimal(arg), toBigDecimal(value));
        } catch (DoubleNaNException e) {
            return new NReal(arg);
        } catch (DoublePositiveInfinityExcepetion doublePositiveInfinityExcepetion) {
            return new NReal(arg);
        } catch (DoubleNegativeInfinityException e) {
            return new NReal(arg);
        }
    }

    public Obj divideRev(BigInteger arg) throws CheckedArithmeticException {
        return NumUtils.divide(arg, value);
    }

    public Obj divideRev(BigDecimal arg) throws CheckedArithmeticException {
        return NumUtils.divide(arg, toBigDecimal(value));
    }

    public int compareTo(NNumeric arg) throws NumberNotComparableException {
        switch (arg.getType()) {
            case NNumeric.TYPE_NUM: {
                BigInteger cmp = toBigInteger(((NNum) arg).value);
                return value.compareTo(cmp);
            }
            case NNumeric.TYPE_BIGNUM: {
                return value.compareTo(((NBigNum) arg).value);
            }
            case NNumeric.TYPE_REAL: {
                try {
                    return toBigDecimal(value).compareTo(toBigDecimal(((NReal) arg).value));
                } catch (DoubleNaNException e) {
                    throw new NumberNotComparableException();
                } catch (DoublePositiveInfinityExcepetion doublePositiveInfinityExcepetion) {
                    return -1;
                } catch (DoubleNegativeInfinityException e) {
                    return 1;
                }
            }
            case NNumeric.TYPE_BIGREAL: {
                return toBigDecimal(value).compareTo(((NBigReal) arg).value);
            }
        }
        throw new SQLScriptRuntimeException("Unknown numeric type: " + arg.getType());
    }

    @Override
    public Object toJavaObject() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public int getObjectID() {
        return OBJECT_ID;
    }

    public static void registerInContext(Context ctx) {
        NBigNumProto.registerInContext(ctx);
        ctx.registerProto(OBJECT_ID, NBigNumProto.OBJECT_ID);
    }

    public static final class NBigNumProto extends AbstractObj implements NativeObj {
        public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

        protected static final NativeCall NATIVE_CONSTRUCTOR = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                try {
                    NNumeric arg = (NNumeric)args[0];
                    return new NBigNum(arg.bigIntegerValue());
                } catch (ClassCastException e) {
                    return null;
                }
            }
        };

        protected static final NativeCall nativeAdd = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                NBigNum thiz = ensureType(NBigNum.class, context);
                NNumeric arg = ensureType(NNumeric.class, args[0]);
                if (arg.isBigNum()) {
                    return new NBigNum(thiz.value.add(((NBigNum)arg).value));
                }
                return arg.add(thiz.value);
            }
        };

        protected static final NativeCall nativeSubtract = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                NBigNum thiz = ensureType(NBigNum.class, context);
                NNumeric arg = ensureType(NNumeric.class, args[0]);
                if (arg.isBigNum()) {
                    return new NBigNum(thiz.value.subtract(((NBigNum) arg).value));
                }
                return arg.subtractRev(thiz.value);
            }
        };

        protected static final NativeCall nativeMultiply = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                NBigNum thiz = ensureType(NBigNum.class, context);
                NNumeric arg = ensureType(NNumeric.class, args[0]);
                if (arg.isBigNum()) {
                    return new NBigNum(thiz.value.multiply(((NBigNum) arg).value));
                }
                return arg.multiply(thiz.value);
            }
        };

        protected static final NativeCall nativeDivide = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                NBigNum thiz = ensureType(NBigNum.class, context);
                NNumeric arg = ensureType(NNumeric.class, args[0]);
                if (arg.isBigNum()) {
                    try {
                        return new NBigNum(thiz.value.divide(((NBigNum)arg).value));
                    } catch (ArithmeticException e) {
                        throw new SQLScriptRuntimeException(e);
                    }
                }
                try {
                    return arg.divideRev(thiz.value);
                } catch (CheckedArithmeticException e) {
                    throw new SQLScriptRuntimeException(e);
                }
            }
        };

        protected static final NativeCall nativeNegate = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                NBigNum thiz = ensureType(NBigNum.class, context);
                return new NBigNum(thiz.value.negate());
            }
        };

        protected static final NativeCall nativeValueOf = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                try {
                    return new NBigNum(new BigInteger(args[0].toString()));
                } catch (NumberFormatException e) {
                    throw new SQLScriptRuntimeException(e);
                }
            }
        };

        private NBigNumProto() {
            slots.put(Str.SYM__plus, nativeAdd);
            slots.put(Str.SYM__minus, nativeSubtract);
            slots.put(Str.SYM__star, nativeMultiply);
            slots.put(Str.SYM__slash, nativeDivide);
            slots.put(Str.SYM_neg, nativeNegate);
            slots.put(Str.SYM_valueOf, nativeValueOf);
        }

        @Override
        public int getObjectID() {
            return OBJECT_ID;
        }

        public static void registerInContext(Context ctx) {
            NNumericProto.registerInContext(ctx);
            ctx.registerProto(OBJECT_ID, NNumericProto.OBJECT_ID);
            ctx.registerObject(new NBigNumProto());
        }

        public Call getNativeConstructor() {
            return NATIVE_CONSTRUCTOR;
        }
    }
}