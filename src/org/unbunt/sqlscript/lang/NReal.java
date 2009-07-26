package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.exception.*;
import org.unbunt.sqlscript.support.Context;
import org.unbunt.sqlscript.support.ProtoRegistry;
import org.unbunt.sqlscript.utils.NumUtils;
import static org.unbunt.sqlscript.utils.NumUtils.toBigInteger;
import static org.unbunt.sqlscript.utils.NumUtils.toBigDecimal;
import static org.unbunt.sqlscript.utils.ObjUtils.ensureType;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Native script object representing floating point values.
 * Uses Java's double primitive internally.
 *
 * NOTE: We do not implement special script objects to represent double's special values like NaN and infinity.
 *       Instead we rely on Java's native handling of these values on operations with values of other types
 *       and in case of operations involving BigInteger and BigDecimal we handle the errors provoked by such
 *       operations and follow the Java principle that any operation involving NaN will result in NaN extending
 *       this principle to also apply for operations involving BigInteger or BigDecimal and one of the double
 *       infinity values.
 *
 *       By not representing the special values by special objects we avoid the nessessity of having to check for
 *       NaN (and the others). On the other hand we have to check for them on comparison operations to stay consistent
 *       with the Java Language Specification. Depending on the usage scenario either way could prove better or worse
 *       than the other.
 */
public class NReal extends AbstractObj implements NNumeric {
    public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    public final double value;

    public NReal(double value) {
        this.value = value;
    }

    public int getType() {
        return NNumeric.TYPE_REAL;
    }

    public boolean isNum() {
        return false;
    }

    public boolean isBigNum() {
        return false;
    }

    public boolean isReal() {
        return true;
    }

    public boolean isBigReal() {
        return false;
    }

    public byte byteValue() {
        return (byte)value;
    }

    public short shortValue() {
        return (short)value;
    }

    public int intValue() {
        return (int)value;
    }

    public long longValue() {
        return (long) value;
    }

    public float floatValue() {
        return (float)value;
    }

    public double doubleValue() {
        return value;
    }

    public BigInteger bigIntegerValue() {
        // NOTE: The exact error message text generated here is checked for in some unit tests
        try {
            return toBigInteger(value);
        } catch (DoubleNaNException e) {
            throw new SQLScriptRuntimeException("Cannot convert NaN to BigInteger");
        } catch (DoublePositiveInfinityExcepetion doublePositiveInfinityExcepetion) {
            throw new SQLScriptRuntimeException("Cannot convert Infinity to BigInteger");
        } catch (DoubleNegativeInfinityException e) {
            throw new SQLScriptRuntimeException("Cannot convert -Infinity to BigInteger");
        }
    }

    public BigDecimal bigDecimalValue() {
        // NOTE: The exact error message text generated here is checked for in some unit tests
        try {
            return toBigDecimal(value);
        } catch (DoubleNaNException e) {
            throw new SQLScriptRuntimeException("Cannot convert NaN to BigDecimal");
        } catch (DoublePositiveInfinityExcepetion doublePositiveInfinityExcepetion) {
            throw new SQLScriptRuntimeException("Cannot convert Infinity to BigDecimal");
        } catch (DoubleNegativeInfinityException e) {
            throw new SQLScriptRuntimeException("Cannot convert -Infinity to BigDecimal");
        }
    }

    public Obj add(long arg) {
        return new NReal(value + arg);
    }

    public Obj add(double arg) {
        return new NReal(value + arg);
    }

    public Obj add(BigInteger arg) {
        try {
            return new NBigReal(toBigDecimal(value).add(toBigDecimal(arg)));
        } catch (DoubleNaNException e) {
            return this;
        } catch (DoublePositiveInfinityExcepetion doublePositiveInfinityExcepetion) {
            return this;
        } catch (DoubleNegativeInfinityException e) {
            return this;
        }
    }

    public Obj add(BigDecimal arg) {
        try {
            return new NBigReal(toBigDecimal(value).add(arg));
        } catch (DoubleNaNException e) {
            return this;
        } catch (DoublePositiveInfinityExcepetion doublePositiveInfinityExcepetion) {
            return this;
        } catch (DoubleNegativeInfinityException e) {
            return this;
        }
    }

    public Obj subtractRev(long arg) {
        return new NReal(arg - value);
    }

    public Obj subtractRev(double arg) {
        return new NReal(arg - value);
    }

    public Obj subtractRev(BigInteger arg) {
        try {
            return new NBigReal(toBigDecimal(arg).subtract(toBigDecimal(value)));
        } catch (DoubleNaNException e) {
            return this;
        } catch (DoublePositiveInfinityExcepetion doublePositiveInfinityExcepetion) {
            return this;
        } catch (DoubleNegativeInfinityException e) {
            return this;
        }
    }

    public Obj subtractRev(BigDecimal arg) {
        try {
            return new NBigReal(arg.subtract(toBigDecimal(value)));
        } catch (DoubleNaNException e) {
            return this;
        } catch (DoublePositiveInfinityExcepetion doublePositiveInfinityExcepetion) {
            return this;
        } catch (DoubleNegativeInfinityException e) {
            return this;
        }
    }

    public Obj multiply(long arg) {
        return new NReal(value * arg);
    }

    public Obj multiply(double arg) {
        return new NReal(value * arg);
    }

    public Obj multiply(BigInteger arg) {
        try {
            return new NBigReal(toBigDecimal(value).multiply(toBigDecimal(arg)));
        } catch (DoubleNaNException e) {
            return this;
        } catch (DoublePositiveInfinityExcepetion doublePositiveInfinityExcepetion) {
            return this;
        } catch (DoubleNegativeInfinityException e) {
            return this;
        }
    }

    public Obj multiply(BigDecimal arg) {
        try {
            return new NBigReal(toBigDecimal(value).multiply(arg));
        } catch (DoubleNaNException e) {
            return this;
        } catch (DoublePositiveInfinityExcepetion doublePositiveInfinityExcepetion) {
            return this;
        } catch (DoubleNegativeInfinityException e) {
            return this;
        }
    }

    public Obj divideRev(long arg) {
        return new NReal(arg / value);
    }

    public Obj divideRev(double arg) {
        return new NReal(arg / value);
    }

    public Obj divideRev(BigInteger arg) throws CheckedArithmeticException {
        try {
            return NumUtils.divide(toBigDecimal(arg), toBigDecimal(value));
        } catch (DoubleNaNException e) {
            return this;
        } catch (DoublePositiveInfinityExcepetion doublePositiveInfinityExcepetion) {
            return this;
        } catch (DoubleNegativeInfinityException e) {
            return this;
        }
    }

    public Obj divideRev(BigDecimal arg) throws CheckedArithmeticException {
        return NumUtils.divide(arg, value);
    }

    public int compareTo(NNumeric arg) throws NumberNotComparableException {
        if (Double.isNaN(this.value)) {
            throw new NumberNotComparableException();
        }
        switch (arg.getType()) {
            case NNumeric.TYPE_NUM: {
                long cmp = ((NNum) arg).value;
                return value < cmp ? -1 : value == cmp ? 0 : 1;
            }
            case NNumeric.TYPE_BIGNUM: {
                try {
                    return toBigDecimal(value).compareTo(toBigDecimal(((NBigNum) arg).value));
                } catch (DoubleNegativeInfinityException e) {
                    return -1;
                } catch (DoublePositiveInfinityExcepetion doublePositiveInfinityExcepetion) {
                    return 1;
                } catch (DoubleNaNException e) {
                    return 1;
                }
            }
            case NNumeric.TYPE_REAL: {
                double cmp = ((NReal) arg).value;
                return value < cmp ? -1 : value == cmp ? 0 : 1;
            }
            case NNumeric.TYPE_BIGREAL: {
                try {
                    return toBigDecimal(value).compareTo(((NBigReal) arg).value);
                } catch (DoubleNegativeInfinityException e) {
                    return -1;
                } catch (DoublePositiveInfinityExcepetion doublePositiveInfinityExcepetion) {
                    return 1;
                } catch (DoubleNaNException e) {
                    return 1;
                }
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
        return "" + value;
    }

    @Override
    public int getObjectID() {
        return OBJECT_ID;
    }

    public static void registerInContext(Context ctx) {
        NRealProto.registerInContext(ctx);
        ctx.registerProto(OBJECT_ID, NRealProto.OBJECT_ID);
    }

    public static final class NRealProto extends AbstractObj implements NativeObj {
        public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

        protected static final NativeCall NATIVE_CONSTRUCTOR = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                try {
                    NNumeric arg = (NNumeric)args[0];
                    return new NReal(arg.doubleValue());
                } catch (ClassCastException e) {
                    throw new SQLScriptRuntimeException();
                }
            }
        };

        protected static final NativeCall nativeAdd = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                NReal thiz = ensureType(NReal.class, context);
                NNumeric arg = ensureType(NNumeric.class, args[0]);
                if (arg.isReal()) {
                    return new NReal(thiz.value + ((NReal)arg).value);
                }
                return arg.add(thiz.value);
            }
        };

        protected static final NativeCall nativeSubtract = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                NReal thiz = ensureType(NReal.class, context);
                NNumeric arg = ensureType(NNumeric.class, args[0]);
                if (arg.isReal()) {
                    return new NReal(thiz.value - ((NReal) arg).value);
                }
                return arg.subtractRev(thiz.value);
            }
        };

        protected static final NativeCall nativeMultiply = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                NReal thiz = ensureType(NReal.class, context);
                NNumeric arg = ensureType(NNumeric.class, args[0]);
                if (arg.isReal()) {
                    return new NReal(thiz.value * ((NReal) arg).value);
                }
                return arg.multiply(thiz.value);
            }
        };

        protected static final NativeCall nativeDivide = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                NReal thiz = ensureType(NReal.class, context);
                NNumeric arg = ensureType(NNumeric.class, args[0]);
                if (arg.isReal()) {
                    return new NReal(thiz.value / ((NReal)arg).value);
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
                NReal thiz = ensureType(NReal.class, context);
                return new NReal(- thiz.value);
            }
        };

        protected static final NativeCall nativeValueOf = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                try {
                    return new NReal(Double.valueOf(args[0].toString()));
                } catch (NumberFormatException e) {
                    throw new SQLScriptRuntimeException(e);
                }
            }
        };

        /*
        protected static final NativeCall nativeGreaterThan = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                NReal thiz = ensureType(NReal.class, context);
                NNumeric arg = ensureType(NNumeric.class, args[0]);
                return thiz.compareTo(arg) > 0 ? engine.getObjTrue() : engine.getObjFalse();
            }
        };

        protected static final NativeCall nativeGreaterOrEqual = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                NReal thiz = ensureType(NReal.class, context);
                NNumeric arg = ensureType(NNumeric.class, args[0]);
                if (Double.isNaN(thiz.value)) {
                    return engine.getObjFalse();
                }
                return thiz.compareTo(arg) >= 0 ? engine.getObjTrue() : engine.getObjFalse();
            }
        };

        protected static final NativeCall nativeLessThan = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                NReal thiz = ensureType(NReal.class, context);
                NNumeric arg = ensureType(NNumeric.class, args[0]);
                if (Double.isNaN(thiz.value)) {
                    return engine.getObjFalse();
                }
                return thiz.compareTo(arg) < 0 ? engine.getObjTrue() : engine.getObjFalse();
            }
        };

        protected static final NativeCall nativeLessOrEqual = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                NReal thiz = ensureType(NReal.class, context);
                NNumeric arg = ensureType(NNumeric.class, args[0]);
                if (Double.isNaN(thiz.value)) {
                    return engine.getObjFalse();
                }
                return thiz.compareTo(arg) <= 0 ? engine.getObjTrue() : engine.getObjFalse();
            }
        };
        */

        protected static final NativeCall nativeIsNaN = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                NReal thiz = ensureType(NReal.class, context);
                return Double.isNaN(thiz.value) ? engine.getObjTrue() : engine.getObjFalse();
            }
        };

        protected static final NativeCall nativeIsInfinity = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                NReal thiz = ensureType(NReal.class, context);
                return thiz.value == Double.POSITIVE_INFINITY || thiz.value == Double.NEGATIVE_INFINITY
                       ? engine.getObjTrue()
                       : engine.getObjFalse();
            }
        };

        protected static final NativeCall nativeIsPositiveInfinity = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                NReal thiz = ensureType(NReal.class, context);
                return thiz.value == Double.POSITIVE_INFINITY ? engine.getObjTrue() : engine.getObjFalse();
            }
        };

        protected static final NativeCall nativeIsNegativeInfinity = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                NReal thiz = ensureType(NReal.class, context);
                return thiz.value == Double.NEGATIVE_INFINITY ? engine.getObjTrue() : engine.getObjFalse();
            }
        };

        private NRealProto() {
            slots.put(Str.SYM__plus, nativeAdd);
            slots.put(Str.SYM__minus, nativeSubtract);
            slots.put(Str.SYM__star, nativeMultiply);
            slots.put(Str.SYM__slash, nativeDivide);
            slots.put(Str.SYM_neg, nativeNegate);
            slots.put(Str.SYM_valueOf, nativeValueOf);
            slots.put(Str.SYM_isNaN, nativeIsNaN);
            slots.put(Str.SYM_isInfinity, nativeIsInfinity);
            slots.put(Str.SYM_isPositiveInfinity, nativeIsPositiveInfinity);
            slots.put(Str.SYM_isNegativeInfinity, nativeIsNegativeInfinity);

            // Override behaviour from NNumericProto for special handling of NaN
            /*
            slots.put(Str.SYM__gt, nativeGreaterThan);
            slots.put(Str.SYM__ge, nativeGreaterOrEqual);
            slots.put(Str.SYM__lt, nativeLessThan);
            slots.put(Str.SYM__le, nativeLessOrEqual);
            */
        }

        @Override
        public int getObjectID() {
            return OBJECT_ID;
        }

        public static void registerInContext(Context ctx) {
            NNumericProto.registerInContext(ctx);
            ctx.registerProto(OBJECT_ID, NNumericProto.OBJECT_ID);
            ctx.registerObject(new NRealProto());
        }

        public Call getNativeConstructor() {
            return NATIVE_CONSTRUCTOR;
        }
    }
}