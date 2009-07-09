package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;
import org.unbunt.sqlscript.exception.CheckedArithmeticException;
import org.unbunt.sqlscript.exception.SQLScriptRuntimeException;
import org.unbunt.sqlscript.support.Context;
import org.unbunt.sqlscript.support.ProtoRegistry;
import static org.unbunt.sqlscript.utils.NumUtils.toBigInteger;
import static org.unbunt.sqlscript.utils.NumUtils.narrow;
import static org.unbunt.sqlscript.utils.NumUtils.toBigDecimal;
import static org.unbunt.sqlscript.utils.ObjUtils.ensureType;
import org.unbunt.sqlscript.utils.NumUtils;

import java.math.BigInteger;
import java.math.BigDecimal;

public class BigNum extends PlainObj implements Numeric {
    public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    public final BigInteger value;

    public BigNum(BigInteger value) {
        this.value = value;
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
        return value;
    }

    public BigDecimal bigDecimalValue() {
        return toBigDecimal(value);
    }

    public Obj add(double arg) {
        return narrow(value.add(toBigInteger(arg)));
    }

    public Obj add(BigInteger arg) {
        return narrow(value.add(arg));
    }

    public Obj addReal(double arg) {
        return new BigReal(toBigDecimal(value).add(toBigDecimal(arg)));
    }

    public Obj addReal(BigDecimal arg) {
        return new BigReal(toBigDecimal(value).add(arg));
    }

    public Obj substract(BigInteger arg) {
        return narrow(value.subtract(arg));
    }

    public Obj subtractRev(BigInteger arg) {
        return narrow(arg.subtract(value));
    }

    public Obj subtractRev(double arg) {
        return narrow(toBigInteger(arg).subtract(value));
    }

    public Obj subtractRealRev(double arg) {
        return new BigReal(toBigDecimal(arg).subtract(toBigDecimal(value)));
    }

    public Obj subtractRealRev(BigDecimal arg) {
        return new BigReal(arg.subtract(toBigDecimal(value)));
    }

    public Obj multiply(double arg) {
        return narrow(value.multiply(toBigInteger(arg)));
    }

    public Obj multiply(BigInteger arg) {
        return narrow(value.multiply(arg));
    }

    public Obj multiplyReal(double arg) {
        return new BigReal(toBigDecimal(value).multiply(toBigDecimal(arg)));
    }

    public Obj multiplyReal(BigDecimal arg) {
        return new BigReal(toBigDecimal(value).multiply(arg));
    }

    public Obj divide(BigInteger arg) throws CheckedArithmeticException {
        try {
            return narrow(value.divide(arg));
        } catch (ArithmeticException e) {
            throw new CheckedArithmeticException(e);
        }
    }

    public Obj divideRev(double arg) throws CheckedArithmeticException {
        return divideRev(toBigInteger(arg));
    }

    public Obj divideRev(BigInteger arg) throws CheckedArithmeticException {
        try {
            return narrow(arg.divide(value));
        } catch (ArithmeticException e) {
            throw new CheckedArithmeticException(e);
        }
    }

    public Obj divideRealRev(double arg) throws CheckedArithmeticException {
        return divideRealRev(toBigDecimal(arg));
    }

    public Obj divideRealRev(BigDecimal arg) throws CheckedArithmeticException {
        return NumUtils.divideReal(arg, toBigDecimal(value));
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
        BigNumProto.registerInContext(ctx);
        ctx.registerProto(OBJECT_ID, BigNumProto.OBJECT_ID);
    }

    public static class BigNumProto extends PlainObj implements NativeObj {
        public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

        protected static final NativeCall NATIVE_CONSTRUCTOR = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Numeric arg = ensureType(args[0]);
                return new BigNum(arg.bigIntegerValue());
            }
        };

        protected static final NativeCall nativeAdd = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                BigNum thiz = ensureType(context);
                Numeric arg = ensureType(args[0]);
                if (arg.isBigNum()) {
                    return thiz.add(((BigNum)arg).value);
                }
                else {
                    return arg.add(thiz.value);
                }
            }
        };

        protected static final NativeCall nativeSubtract = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                BigNum thiz = ensureType(context);
                Numeric arg = ensureType(args[0]);
                if (arg.isBigNum()) {
                    return thiz.substract(((BigNum)arg).value);
                }
                else {
                    return arg.subtractRev(thiz.value);
                }
            }
        };

        protected static final NativeCall nativeMultiply = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                BigNum thiz = ensureType(context);
                Numeric arg = ensureType(args[0]);
                if (arg.isBigNum()) {
                    return thiz.multiply(((BigNum)arg).value);
                }
                else {
                    return arg.multiply(thiz.value);
                }
            }
        };

        protected static final NativeCall nativeDivide = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                BigNum thiz = ensureType(context);
                Numeric arg = ensureType(args[0]);
                try {
                    if (arg.isBigNum()) {
                        return thiz.divide(((BigNum)arg).value);
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
                try {
                    return new BigNum(new BigInteger(s));
                } catch (NumberFormatException e) {
                    throw new SQLScriptRuntimeException(e);
                }
            }
        };

        private BigNumProto() {
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
            ctx.registerObject(new BigNumProto());
        }
    }
}
