package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.engine.*;
import org.unbunt.sqlscript.utils.NumUtils;
import static org.unbunt.sqlscript.utils.NumUtils.toBigDecimal;
import static org.unbunt.sqlscript.utils.NumUtils.toBigInteger;
import static org.unbunt.sqlscript.utils.ObjUtils.ensureType;
import org.unbunt.sqlscript.exception.*;

import java.math.BigDecimal;
import java.math.BigInteger;

public class NBigReal extends AbstractObj implements NNumeric {
    public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    public final BigDecimal value;

    public NBigReal(BigDecimal value) {
        this.value = value;
    }

    public int getType() {
        return NNumeric.TYPE_BIGREAL;
    }

    public boolean isNum() {
        return false;
    }

    public boolean isBigNum() {
        return false;
    }

    public boolean isReal() {
        return false;
    }

    public boolean isBigReal() {
        return true;
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
        return toBigInteger(value);
    }

    public BigDecimal bigDecimalValue() {
        return value;
    }

    public Obj add(long arg) {
        return new NBigReal(value.add(toBigDecimal(arg)));
    }

    public Obj add(double arg) {
        try {
            return new NBigReal(value.add(toBigDecimal(arg)));
        } catch (DoubleNaNException e) {
            return new NReal(arg);
        } catch (DoublePositiveInfinityExcepetion doublePositiveInfinityExcepetion) {
            return new NReal(arg);
        } catch (DoubleNegativeInfinityException e) {
            return new NReal(arg);
        }
    }

    public Obj add(BigInteger arg) {
        return new NBigReal(value.add(toBigDecimal(arg)));
    }

    public Obj add(BigDecimal arg) {
        return new NBigReal(value.add(arg));
    }

    public Obj subtractRev(long arg) {
        return new NBigReal(toBigDecimal(arg).subtract(value));
    }

    public Obj subtractRev(double arg) {
        try {
            return new NBigReal(toBigDecimal(arg).subtract(value));
        } catch (DoubleNaNException e) {
            return new NReal(arg);
        } catch (DoublePositiveInfinityExcepetion doublePositiveInfinityExcepetion) {
            return new NReal(arg);
        } catch (DoubleNegativeInfinityException e) {
            return new NReal(arg);
        }
    }

    public Obj subtractRev(BigInteger arg) {
        return new NBigReal(toBigDecimal(arg).subtract(value));
    }

    public Obj subtractRev(BigDecimal arg) {
        return new NBigReal(arg.subtract(value));
    }

    public Obj multiply(long arg) {
        return new NBigReal(value.multiply(toBigDecimal(arg)));
    }

    public Obj multiply(double arg) {
        return NumUtils.multiply(value, arg);
    }

    public Obj multiply(BigInteger arg) {
        return new NBigReal(value.multiply(toBigDecimal(arg)));
    }

    public Obj multiply(BigDecimal arg) {
        return new NBigReal(value.multiply(arg));
    }

    public Obj divideRev(long arg) throws CheckedArithmeticException {
        return NumUtils.divide(toBigDecimal(arg), value);
    }

    public Obj divideRev(double arg) throws CheckedArithmeticException {
        try {
            return NumUtils.divide(toBigDecimal(arg), value);
        } catch (DoubleNaNException e) {
            return new NReal(arg);
        } catch (DoublePositiveInfinityExcepetion doublePositiveInfinityExcepetion) {
            return new NReal(arg);
        } catch (DoubleNegativeInfinityException e) {
            return new NReal(arg);
        }
    }

    public Obj divideRev(BigInteger arg) throws CheckedArithmeticException {
        return NumUtils.divide(toBigDecimal(arg), value);
    }

    public Obj divideRev(BigDecimal arg) throws CheckedArithmeticException {
        return NumUtils.divide(arg, value);
    }

    public int compareTo(NNumeric arg) throws NumberNotComparableException {
        switch (arg.getType()) {
            case NNumeric.TYPE_NUM: {
                return value.compareTo(toBigDecimal(((NNum) arg).value));
            }
            case NNumeric.TYPE_BIGNUM: {
                return value.compareTo(toBigDecimal(((NBigNum) arg).value));
            }
            case NNumeric.TYPE_REAL: {
                try {
                    return value.compareTo(toBigDecimal(((NReal) arg).value));
                } catch (DoubleNaNException e) {
                    throw new NumberNotComparableException();
                } catch (DoublePositiveInfinityExcepetion doublePositiveInfinityExcepetion) {
                    return -1;
                } catch (DoubleNegativeInfinityException e) {
                    return 1;
                }
            }
            case NNumeric.TYPE_BIGREAL: {
                return value.compareTo(((NBigReal) arg).value);
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
        NBigRealProto.registerInContext(ctx);
        ctx.registerProto(OBJECT_ID, NBigRealProto.OBJECT_ID);
    }

    public static final class NBigRealProto extends AbstractObj implements NativeObj {
        public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

        protected static final NativeCall NATIVE_CONSTRUCTOR = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                try {
                    NNumeric arg = (NNumeric)args[0];
                    return new NBigReal(arg.bigDecimalValue());
                } catch (ClassCastException e) {
                    return null;
                }
            }
        };

        protected static final NativeCall nativeAdd = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                NBigReal thiz = ensureType(NBigReal.class, context);
                NNumeric arg = ensureType(NNumeric.class, args[0]);
                if (arg.isBigReal()) {
                    return new NBigReal(thiz.value.add(((NBigReal)arg).value));
                }
                return arg.add(thiz.value);
            }
        };

        protected static final NativeCall nativeSubtract = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                NBigReal thiz = ensureType(NBigReal.class, context);
                NNumeric arg = ensureType(NNumeric.class, args[0]);
                if (arg.isBigNum()) {
                    return new NBigReal(thiz.value.subtract(((NBigReal) arg).value));
                }
                return arg.subtractRev(thiz.value);
            }
        };

        protected static final NativeCall nativeMultiply = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                NBigReal thiz = ensureType(NBigReal.class, context);
                NNumeric arg = ensureType(NNumeric.class, args[0]);
                if (arg.isBigReal()) {
                    return new NBigReal(thiz.value.multiply(((NBigReal) arg).value));
                }
                return arg.multiply(thiz.value);
            }
        };

        protected static final NativeCall nativeDivide = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                NBigReal thiz = ensureType(NBigReal.class, context);
                NNumeric arg = ensureType(NNumeric.class, args[0]);
                try {
                    if (arg.isBigReal()) {
                        return NumUtils.divide(thiz.value, ((NBigReal)arg).value);
                    }
                    return arg.divideRev(thiz.value);
                } catch (CheckedArithmeticException e) {
                    throw new SQLScriptRuntimeException(e);
                }
            }
        };

        protected static final NativeCall nativeNegate = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                NBigReal thiz = ensureType(NBigReal.class, context);
                return new NBigReal(thiz.value.negate());
            }
        };

        protected static final NativeCall nativeValueOf = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                try {
                    return new NBigReal(new BigDecimal(args[0].toString()));
                } catch (NumberFormatException e) {
                    throw new SQLScriptRuntimeException(e);
                }
            }
        };

        private NBigRealProto() {
            slots.put(Str.SYM__plus, nativeAdd);
            slots.put(Str.SYM__minus, nativeSubtract);
            slots.put(Str.SYM__slash, nativeDivide);
            slots.put(Str.SYM__star, nativeMultiply);
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
            ctx.registerObject(new NBigRealProto());
        }

        public Call getNativeConstructor() {
            return NATIVE_CONSTRUCTOR;
        }
    }
}