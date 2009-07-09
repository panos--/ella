package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.support.ProtoRegistry;
import org.unbunt.sqlscript.support.Context;
import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.utils.ObjUtils;
import org.unbunt.sqlscript.utils.NumUtils;
import static org.unbunt.sqlscript.utils.NumUtils.toBigDecimal;
import static org.unbunt.sqlscript.utils.NumUtils.toBigInteger;
import static org.unbunt.sqlscript.utils.ObjUtils.ensureType;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;
import org.unbunt.sqlscript.exception.CheckedArithmeticException;
import org.unbunt.sqlscript.exception.SQLScriptRuntimeException;

import static java.lang.Double.isInfinite;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Real extends PlainObj implements Numeric {
    public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    public final double value;

    public Real(double value) {
        this.value = value;
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
        return addReal(arg);
    }

    public Obj add(BigInteger arg) {
        return addReal(toBigDecimal(arg));
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

    public Obj subtractRev(double arg) {
        double result = arg - value;
        if (isInfinite(result)) {
            return new BigReal(toBigDecimal(arg).subtract(toBigDecimal(value)));
        }
        return new Real(result);
    }

    public Obj subtractRev(BigInteger arg) {
        return new BigReal(toBigDecimal(value).subtract(toBigDecimal(arg)));
    }

    public Obj subtractReal(double arg) {
        double result = value - arg;
        if (isInfinite(result)) {
            return new BigReal(toBigDecimal(value).subtract(toBigDecimal(arg)));
        }
        return new Real(result);
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
        return multiplyReal(arg);
    }

    public Obj multiply(BigInteger arg) {
        return new BigReal(toBigDecimal(value).multiply(toBigDecimal(arg)));
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

    public Obj divideReal(double arg) throws CheckedArithmeticException {
        return NumUtils.divideReal(value, arg);
    }

    public Obj divideRev(double arg) throws CheckedArithmeticException {
        return NumUtils.divideReal(arg, value);
    }

    public Obj divideRev(BigInteger arg) throws CheckedArithmeticException {
        return NumUtils.divideReal(toBigDecimal(arg), toBigDecimal(value));
    }

    public Obj divideRealRev(double arg) throws CheckedArithmeticException {
        return NumUtils.divideReal(arg, value);
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
        return "" + value;
    }

    @Override
    public int getObjectID() {
        return OBJECT_ID;
    }

    public static void registerInContext(Context ctx) {
        RealProto.registerInContext(ctx);
        ctx.registerProto(OBJECT_ID, RealProto.OBJECT_ID);
    }

    public static class RealProto extends PlainObj implements NativeObj {
        public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

        protected static final NativeCall NATIVE_CONSTRUCTOR = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Numeric arg = ensureType(args[0]);
                return new Real(arg.doubleValue());
            }
        };

        protected static final NativeCall nativeAdd = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Real thiz = ensureType(context);
                Numeric arg = ensureType(args[0]);
                if (arg.isReal()) {
                    thiz.addReal(((Real)arg).value);
                }
                return arg.addReal(thiz.value);
            }
        };

        protected static final NativeCall nativeSubtract = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Real thiz = ensureType(context);
                Numeric arg = ensureType(args[0]);
                if (arg.isReal()) {
                    thiz.subtractReal(((Real)arg).value);
                }
                return arg.subtractRealRev(thiz.value);
            }
        };

        protected static final NativeCall nativeMultiply = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Real thiz = ensureType(context);
                Numeric arg = ensureType(args[0]);
                if (arg.isReal()) {
                    return thiz.multiplyReal(((Real)arg).value);
                }
                return arg.multiplyReal(thiz.value);
            }
        };

        protected static final NativeCall nativeDivide = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Real thiz = ensureType(context);
                Numeric arg = ensureType(args[0]);
                try {
                    if (arg.isReal()) {
                        return thiz.divideReal(((Real)arg).value);
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
                Double value;
                try {
                    value = Double.valueOf(s);
                    if (isInfinite(value) || Double.isNaN(value)) {
                        return new BigReal(new BigDecimal(s));
                    }
                    return new Real(value);
                } catch (NumberFormatException e) {
                    throw new SQLScriptRuntimeException(e);
                }
            }
        };

        private RealProto() {
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
            ctx.registerObject(new RealProto());
        }
    }
}
