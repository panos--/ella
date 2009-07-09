package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;
import org.unbunt.sqlscript.exception.CheckedArithmeticException;
import org.unbunt.sqlscript.exception.SQLScriptRuntimeException;
import org.unbunt.sqlscript.support.Context;
import org.unbunt.sqlscript.support.ProtoRegistry;
import static org.unbunt.sqlscript.utils.NumUtils.*;
import static org.unbunt.sqlscript.utils.NumUtils.toBigDecimal;
import static org.unbunt.sqlscript.utils.ObjUtils.ensureType;
import org.unbunt.sqlscript.utils.NumUtils;

import static java.lang.Double.isInfinite;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.Locale;

public class Num extends PlainObj implements Numeric {
    public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    protected final double value;

    public Num(double value) {
        this.value = value;
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

    public double doubleValue() {
        return value;
    }

    public BigInteger bigIntegerValue() {
        return toBigInteger(value);
    }

    public BigDecimal bigDecimalValue() {
        return toBigDecimal(value);
    }

    public Obj add(double arg) {
        double result = value + arg;
        if (isInfinite(result)) {
            return new BigNum(toBigInteger(value).add(toBigInteger(arg)));
        }
        return new Num(result);
    }

    public Obj add(BigInteger arg) {
        return narrow(toBigInteger(value).add(arg));
    }

    public Obj addReal(double arg) {
        double result = value + arg;
        if (isInfinite(result)) {
            return new BigReal(toBigDecimal(value).add(toBigDecimal(arg)));
        }
        return new Real(result);
    }

    public Obj addReal(BigDecimal arg) {
        return new BigReal(toBigDecimal(value).add(arg));
    }

    public Obj subtract(double arg) {
        double result = value - arg;
        if (isInfinite(result)) {
            return new BigNum(toBigInteger(value).subtract(toBigInteger(arg)));
        }
        return new Num(result);
    }

    public Obj subtractRev(double arg) {
        double result = arg - value;
        if (isInfinite(result)) {
            return new BigNum(toBigInteger(arg).subtract(toBigInteger(value)));
        }
        return new Num(result);
    }

    public Obj subtractRev(BigInteger arg) {
        return narrow(arg.subtract(toBigInteger(value)));
    }

    public Obj subtractRealRev(double arg) {
        double result = arg - value;
        if (isInfinite(result)) {
            return new BigReal(toBigDecimal(arg).subtract(toBigDecimal(value)));
        }
        return new Real(result);
    }

    public Obj subtractRealRev(BigDecimal arg) {
        return new BigReal(arg.subtract(toBigDecimal(value)));
    }

    public Obj multiply(double arg) {
        double result = arg - value;
        if (isInfinite(result)) {
            return new BigNum(toBigInteger(arg).multiply(toBigInteger(value)));
        }
        return new Num(result);
    }

    public Obj multiply(BigInteger arg) {
        return narrow(toBigInteger(value).multiply(arg));
    }

    public Obj multiplyReal(double arg) {
        double result = value * arg;
        if (isInfinite(result)) {
            return new BigReal(toBigDecimal(value).multiply(toBigDecimal(arg)));
        }
        return new Real(result);
    }

    public Obj multiplyReal(BigDecimal arg) {
        return new BigReal(toBigDecimal(value).multiply(arg));
    }

    public Obj divide(double arg) throws CheckedArithmeticException {
        return NumUtils.divide(value, arg);
    }

    public Obj divideRev(double arg) throws CheckedArithmeticException {
        return NumUtils.divide(arg, value);
    }

    public Obj divideRev(BigInteger arg) throws CheckedArithmeticException {
        BigInteger result;
        try {
            result = arg.divide(toBigInteger(value));
        } catch (ArithmeticException e) {
            throw new CheckedArithmeticException(e);
        }
        return narrow(result);
    }

    public Obj divideRealRev(double arg) throws CheckedArithmeticException {
        double result = arg / value;
        if (isInfinite(result)) {
            if (value == 0) {
                throw new CheckedArithmeticException("Division by zero");
            }
            return divideRealRev(toBigDecimal(arg));
        }
        return new Real(result);
    }

    public Obj divideRealRev(BigDecimal arg) throws CheckedArithmeticException {
        BigDecimal divisor = toBigDecimal(value);
        BigDecimal result;
        try {
            result = arg.divide(divisor);
        } catch (ArithmeticException e) {
            if (BigDecimal.ZERO.equals(divisor)) {
                throw new CheckedArithmeticException("Division by zero");
            }
            result = arg.divide(divisor, Numeric.DECIMAL_FALLBACK_SCALE, Numeric.DECIMAL_FALLBACK_ROUNDING_MODE);
        }
        return new BigReal(result);
    }

    @Override
    public Number toJavaObject() {
        if (value < Long.MIN_VALUE || value > Long.MAX_VALUE) {
            return toBigInteger(value);
        }
        return (long) value;
    }

    @Override
    public String toString() {
        return String.format(Locale.ENGLISH, "%.0f", value);
    }

    @Override
    public int getObjectID() {
        return OBJECT_ID;
    }

    public static void registerInContext(Context ctx) {
        NumProto.registerInContext(ctx);
        ctx.registerProto(OBJECT_ID, NumProto.OBJECT_ID);
    }

    public static class NumProto extends PlainObj implements NativeObj {
        public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

        protected static final NativeCall NATIVE_CONSTRUCTOR = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Numeric arg = ensureType(args[0]);
                return new Num(arg.doubleValue());
            }
        };

        protected static final NativeCall nativeAdd = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Num thiz = ensureType(context);
                Numeric arg = ensureType(args[0]);
                if (arg.isNum()) {
                    return thiz.add(((Num)arg).value);
                }
                else {
                    return arg.add(thiz.value);
                }
            }
        };

        protected static final NativeCall nativeSubtract = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Num thiz = ensureType(context);
                Numeric arg = ensureType(args[0]);
                if (arg.isNum()) {
                    return thiz.subtract(((Num)arg).value);
                }
                else {
                    return arg.subtractRev(thiz.value);
                }
            }
        };

        protected static final NativeCall nativeMultiply = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Num thiz = ensureType(context);
                Numeric arg = ensureType(args[0]);
                if (arg.isNum()) {
                    return thiz.multiply(((Num)arg).value);
                }
                else {
                    return arg.multiply(thiz.value);
                }
            }
        };

        protected static final NativeCall nativeDivide = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Num thiz = ensureType(context);
                Numeric arg = ensureType(args[0]);
                try {
                    if (arg.isNum()) {
                        return thiz.divide(((Num)arg).value);
                    }
                    else {
                        return arg.divideRev(thiz.value);
                    }
                } catch (CheckedArithmeticException e) {
                    throw new SQLScriptRuntimeException(e);
                }
            }
        };

        protected static final NativeCall nativeValueOf = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                String s = args[0].toString();
                double value;
                try {
                    value = Double.valueOf(s);
                } catch (NumberFormatException e) {
                    throw new SQLScriptRuntimeException(e);
                }
                if (isInfinite(value) || Double.isNaN(value)) {
                    throw new SQLScriptRuntimeException("Invalid number: " + s);
                }
                return new Num(value);
            }
        };

        private NumProto() {
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
            ctx.registerObject(new NumProto());
        }
    }
}
