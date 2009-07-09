package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.support.ProtoRegistry;
import org.unbunt.sqlscript.support.Context;
import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.utils.ObjUtils;
import org.unbunt.sqlscript.utils.NumUtils;
import static org.unbunt.sqlscript.utils.NumUtils.toBigDecimal;
import static org.unbunt.sqlscript.utils.ObjUtils.ensureType;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;
import org.unbunt.sqlscript.exception.CheckedArithmeticException;
import org.unbunt.sqlscript.exception.SQLScriptRuntimeException;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class BigReal extends PlainObj implements Numeric {
    public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    public final BigDecimal value;

    public BigReal(BigDecimal value) {
        this.value = value;
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

    public double doubleValue() {
        double result = value.doubleValue();
        if (result == Double.POSITIVE_INFINITY) {
            return Double.MAX_VALUE;
        }
        else if (result == Double.NEGATIVE_INFINITY) {
            return -1 * Double.MAX_VALUE;
        }
        else {
            return result;
        }
    }

    public BigInteger bigIntegerValue() {
        return value.toBigInteger();
    }

    public BigDecimal bigDecimalValue() {
        return value;
    }

    public Obj add(double arg) {
        return new BigReal(value.add(toBigDecimal(arg)));
    }

    public Obj add(BigInteger arg) {
        return new BigReal(value.add(toBigDecimal(arg)));
    }

    public Obj addReal(double arg) {
        return new BigReal(value.add(toBigDecimal(arg)));
    }

    public Obj addReal(BigDecimal arg) {
        return new BigReal(value.add(arg));
    }

    public Obj subtractRev(double arg) {
        return new BigReal(toBigDecimal(arg).subtract(value));
    }

    public Obj subtractRev(BigInteger arg) {
        return new BigReal(toBigDecimal(arg).subtract(value));
    }

    public Obj subtractRealRev(double arg) {
        return new BigReal(toBigDecimal(arg).subtract(value));
    }

    public Obj subtractRealRev(BigDecimal arg) {
        return new BigReal(arg.subtract(value));
    }

    public Obj subtractReal(BigDecimal arg) {
        return new BigReal(value.subtract(arg));
    }

    public Obj multiply(double arg) {
        return new BigReal(value.multiply(toBigDecimal(arg)));
    }

    public Obj multiply(BigInteger arg) {
        return new BigReal(value.multiply(toBigDecimal(arg)));
    }

    public Obj multiplyReal(double arg) {
        return new BigReal(value.multiply(toBigDecimal(arg)));
    }

    public Obj multiplyReal(BigDecimal arg) {
        return new BigReal(value.multiply(arg));
    }

    public Obj divideReal(BigDecimal arg) throws CheckedArithmeticException {
        return NumUtils.divideReal(value, arg);
    }

    public Obj divideRev(double arg) throws CheckedArithmeticException {
        return NumUtils.divideReal(toBigDecimal(arg), value);
    }

    public Obj divideRev(BigInteger arg) throws CheckedArithmeticException {
        return NumUtils.divideReal(toBigDecimal(arg), value);
    }

    public Obj divideRealRev(double arg) throws CheckedArithmeticException {
        return NumUtils.divideReal(toBigDecimal(arg), value);
    }

    public Obj divideRealRev(BigDecimal arg) throws CheckedArithmeticException {
        return NumUtils.divideReal(arg, value);
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
        BigRealProto.registerInContext(ctx);
        ctx.registerProto(OBJECT_ID, BigRealProto.OBJECT_ID);
    }

    public static class BigRealProto extends PlainObj implements NativeObj {
        public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

        protected static final NativeCall NATIVE_CONSTRUCTOR = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Numeric arg = ensureType(args[0]);
                return new BigReal(arg.bigDecimalValue());
            }
        };

        protected static final NativeCall nativeAdd = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                BigReal thiz = ensureType(context);
                Numeric arg = ensureType(args[0]);
                if (arg.isBigReal()) {
                    return thiz.addReal(((BigReal)arg).value);
                }
                return arg.addReal(thiz.value);
            }
        };

        protected static final NativeCall nativeSubtract = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                BigReal thiz = ensureType(context);
                Numeric arg = ensureType(args[0]);
                if (arg.isBigReal()) {
                    return thiz.subtractReal(((BigReal)arg).value);
                }
                return arg.subtractRealRev(thiz.value);
            }
        };

        protected static final NativeCall nativeMultiply = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                BigReal thiz = ensureType(context);
                Numeric arg = ensureType(args[0]);
                if (arg.isBigReal()) {
                    return thiz.multiplyReal(((BigReal)arg).value);
                }
                return arg.multiplyReal(thiz.value);
            }
        };

        protected static final NativeCall nativeDivide = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                BigReal thiz = ensureType(context);
                Numeric arg = ensureType(args[0]);
                try {
                    if (arg.isBigReal()) {
                        return thiz.divideReal(((BigReal)arg).value);
                    }
                    else {
                        return arg.divideRealRev(thiz.value);
                    }
                } catch (CheckedArithmeticException e) {
                    throw new SQLScriptRuntimeException(e);
                }
            }
        };

        protected static final NativeCall nativeValueOf = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                String s = args[0].toString();
                try {
                    return new BigReal(new BigDecimal(s));
                } catch (NumberFormatException e) {
                    throw new SQLScriptRuntimeException(e);
                }
            }
        };

        private BigRealProto() {
            slots.put(Str.SYM__plus, nativeAdd);
            slots.put(Str.SYM__minus, nativeSubtract);
            slots.put(Str.SYM__star, nativeMultiply);
            slots.put(Str.SYM__slash, nativeDivide);
            slots.put(Str.SYM_valueOf, nativeValueOf);
        }

        public Call getNativeConstructor() {
            return NATIVE_CONSTRUCTOR;
        }

        @Override
        public int getObjectID() {
            return OBJECT_ID;
        }

        public static void registerInContext(Context ctx) {
            Base.registerInContext(ctx);
            ctx.registerProto(OBJECT_ID, Base.OBJECT_ID);
            ctx.registerObject(new BigRealProto());
        }
    }
}