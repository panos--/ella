package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.exception.*;
import org.unbunt.sqlscript.support.Context;
import org.unbunt.sqlscript.support.NativeWrapper;
import org.unbunt.sqlscript.support.ProtoRegistry;
import org.unbunt.sqlscript.utils.NumUtils;
import static org.unbunt.sqlscript.utils.NumUtils.toBigInteger;
import static org.unbunt.sqlscript.utils.NumUtils.toBigDecimal;
import static org.unbunt.sqlscript.utils.ObjUtils.ensureType;

import java.math.BigDecimal;
import java.math.BigInteger;

public class NNum extends PlainObj implements NNumeric {
    public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    public final long value;

    public NNum(long value) {
        this.value = value;
    }

    public int getType() {
        return NNumeric.TYPE_NUM;
    }

    public boolean isNum() {
        return true;
    }

    public boolean isBigNum() {
        return false;
    }

    public boolean isReal() {
        return false;
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
        return value;
    }

    public float floatValue() {
        return (float)value;
    }

    public double doubleValue() {
        return value;
    }

    public BigInteger bigIntegerValue() {
        return toBigInteger(value);
    }

    public BigDecimal bigDecimalValue() {
        return toBigDecimal(value);
    }

    public Obj add(long arg) {
        return new NNum(value + arg);
    }

    public Obj add(double arg) {
        return new NReal(value + arg);
    }

    public Obj add(BigInteger arg) {
        return new NBigNum(arg.add(toBigInteger(value)));
    }

    public Obj add(BigDecimal arg) {
        return new NBigReal(arg.add(toBigDecimal(value)));
    }

    public Obj subtractRev(long arg) {
        return new NNum(arg - value);
    }

    public Obj subtractRev(double arg) {
        return new NReal(arg - value);
    }

    public Obj subtractRev(BigInteger arg) {
        return new NBigNum(arg.subtract(toBigInteger(value)));
    }

    public Obj subtractRev(BigDecimal arg) {
        return new NBigReal(arg.subtract(toBigDecimal(value)));
    }

    public Obj multiply(long arg) {
        return new NNum(value * arg);
    }

    public Obj multiply(double arg) {
        return new NReal(value * arg);
    }

    public Obj multiply(BigInteger arg) {
        return new NBigNum(toBigInteger(value).multiply(arg));
    }

    public Obj multiply(BigDecimal arg) {
        return new NBigReal(toBigDecimal(value).multiply(arg));
    }

    public Obj divideRev(long arg) throws CheckedArithmeticException {
        try {
            return new NNum(arg / value);
        } catch (ArithmeticException e) {
            throw new CheckedArithmeticException(e);
        }
    }

    public Obj divideRev(double arg) throws CheckedArithmeticException {
        try {
            return new NReal(arg / value);
        } catch (ArithmeticException e) {
            throw new CheckedArithmeticException(e);
        }
    }

    public Obj divideRev(BigInteger arg) throws CheckedArithmeticException {
        return NumUtils.divide(arg, toBigInteger(value));
    }

    public Obj divideRev(BigDecimal arg) throws CheckedArithmeticException {
        return NumUtils.divide(arg, toBigDecimal(value));
    }

    public int compareTo(NNumeric arg) {
        switch (arg.getType()) {
            case NNumeric.TYPE_NUM: {
                long cmp = ((NNum) arg).value;
                return value < cmp ? -1 : value == cmp ? 0 : 1;
            }
            case NNumeric.TYPE_BIGNUM: {
                BigInteger cmp = ((NBigNum) arg).value;
                BigInteger value = toBigInteger(this.value);
                return value.compareTo(cmp);
            }
            case NNumeric.TYPE_REAL: {
                double cmp = ((NReal) arg).value;
                return value < cmp ? -1 : value == cmp ? 0 : 1;
            }
            case NNumeric.TYPE_BIGREAL: {
                BigDecimal cmp = ((NBigReal) arg).value;
                BigDecimal value = toBigDecimal(this.value);
                return value.compareTo(cmp);
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
        NNumProto.registerInContext(ctx);
        ctx.registerProto(OBJECT_ID, NNumProto.OBJECT_ID);
    }

    public static final class NNumProto extends PlainObj implements NativeObj {
        public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

        protected static final NativeCall NATIVE_CONSTRUCTOR = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                try {
                    NNumeric arg = (NNumeric)args[0];
                    return new NNum(arg.longValue());
                } catch (ClassCastException e) {
                    // TODO: Try JObject, JPrimitive, ...
                }
                return null;
            }
        };

        protected static final NativeCall nativeAdd = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                NNum thiz = ensureType(context);
                NNumeric arg = ensureType(args[0]);
                if (arg.isNum()) {
                    return new NNum(thiz.value + ((NNum)arg).value);
                }
                return arg.add(thiz.value);
            }
        };

        protected static final NativeCall nativeSubtract = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                NNum thiz = ensureType(context);
                NNumeric arg = ensureType(args[0]);
                if (arg.isNum()) {
                    return new NNum(thiz.value - ((NNum) arg).value);
                }
                return arg.subtractRev(thiz.value);
            }
        };

        protected static final NativeCall nativeMultiply = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                NNum thiz = ensureType(context);
                NNumeric arg = ensureType(args[0]);
                if (arg.isNum()) {
                    return new NNum(thiz.value * ((NNum) arg).value);
                }
                return arg.multiply(thiz.value);
            }
        };

        protected static final NativeCall nativeDivide = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                NNum thiz = ensureType(context);
                NNumeric arg = ensureType(args[0]);
                try {
                    if (arg.isNum()) {
                        try {
                            return new NNum(thiz.value / ((NNum)arg).value);
                        } catch (ArithmeticException e) {
                            throw new CheckedArithmeticException(e);
                        }
                    }
                    return arg.divideRev(thiz.value);
            } catch (CheckedArithmeticException e) {
                    throw new SQLScriptRuntimeException(e);
                }
            }
        };

        protected static final NativeCall nativeValueOf = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                try {
                    return new NNum(Long.valueOf(args[0].toString()));
                } catch (NumberFormatException e) {
                    throw new SQLScriptRuntimeException(e);
                }
            }
        };

        public static final Call nativeTo = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                NNum numStart = ensureType(context);
                NNum numStop = ensureType(args[0]);
                long start = numStart.value;
                long stop  = numStop.value;
                long step  = start < stop ? 1 : -1;


                Obj closure = args[1];
                long i = start;

                Null _null = engine.getObjNull();
                try {
                    engine.invokeInLoop(closure, _null, NativeWrapper.wrap(i));
                } catch (LoopBreakException e) {
                    return null;
                } catch (LoopContinueException e) {
                    // nothing to do here just proceed to next iteration
                }

                while (i != stop) {
                    try {
                        i += step;
                        engine.invokeInLoop(closure, _null, NativeWrapper.wrap(i));
                    } catch (LoopBreakException e) {
                        return null;
                    } catch (LoopContinueException e) {
                        // nothing to do here just proceed to next iteration
                    }
                }

                return null;
            }
        };

        protected static final NativeCall nativeRange = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                NNum thiz = ensureType(context);
                NNum stop = ensureType(args[0]);
                return new NRange(thiz.value, stop.value);
            }
        };

        private NNumProto() {
            slots.put(Str.SYM__plus, nativeAdd);
            slots.put(Str.SYM__minus, nativeSubtract);
            slots.put(Str.SYM__slash, nativeDivide);
            slots.put(Str.SYM__star, nativeMultiply);
            slots.put(Str.SYM__dotdot, nativeRange);
            slots.put(Str.SYM_valueOf, nativeValueOf);
            slots.put(Str.SYM_to, nativeTo);
        }

        @Override
        public int getObjectID() {
            return OBJECT_ID;
        }

        public static void registerInContext(Context ctx) {
            NNumericProto.registerInContext(ctx);
            ctx.registerProto(OBJECT_ID, NNumericProto.OBJECT_ID);
            ctx.registerObject(new NNumProto());
        }

        public Call getNativeConstructor() {
            return NATIVE_CONSTRUCTOR;
        }
    }
}
