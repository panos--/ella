/* NNum.java
   Copyright (C) 2009, 2010 Thomas Weiß <panos@unbunt.org>

This file is part of the Ella scripting language interpreter.

Ella is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2, or (at your option)
any later version.

Ella is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License
along with Ella; see the file COPYING.  If not, write to the
Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
02110-1301 USA.

Linking this library statically or dynamically with other modules is
making a combined work based on this library.  Thus, the terms and
conditions of the GNU General Public License cover the whole
combination.

As a special exception, the copyright holders of this library give you
permission to link this library with independent modules to produce an
executable, regardless of the license terms of these independent
modules, and to copy and distribute the resulting executable under
terms of your choice, provided that you also meet, for each linked
independent module, the terms and conditions of the license of that
module.  An independent module is a module which is not derived from
or based on this library.  If you modify this library, you may extend
this exception to your version of the library, but you are not
obligated to do so.  If you do not wish to do so, delete this
exception statement from your version. */

package org.unbunt.ella.lang;

import org.unbunt.ella.engine.context.Context;
import org.unbunt.ella.engine.corelang.Engine;
import org.unbunt.ella.engine.corelang.*;
import static org.unbunt.ella.engine.corelang.ObjUtils.ensureType;
import org.unbunt.ella.exception.*;
import static org.unbunt.ella.lang.NumUtils.toBigDecimal;
import static org.unbunt.ella.lang.NumUtils.toBigInteger;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Represents an EllaScript object wrapping a <code>long</code> value.
 */
public class NNum extends AbstractObj implements NNumeric {
    protected static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    /**
     * The wrapped value.
     */
    public final long value;

    /**
     * Creates a new NNum wrapping the given value.
     *
     * @param value the value to wrap.
     */
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

    public int compareTo(NNumeric arg) throws NumberNotComparableException {
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
                if (Double.isNaN(cmp)) {
                    throw new NumberNotComparableException();
                }
                return value < cmp ? -1 : value == cmp ? 0 : 1;
            }
            case NNumeric.TYPE_BIGREAL: {
                BigDecimal cmp = ((NBigReal) arg).value;
                BigDecimal value = toBigDecimal(this.value);
                return value.compareTo(cmp);
            }
        }
        throw new EllaRuntimeException("Unknown numeric type: " + arg.getType());
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

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        NNum nNum = (NNum) o;

        return value == nNum.value;
    }

    public int hashCode() {
        return (int) (value ^ (value >>> 32));
    }

    /**
     * Registers this EllaScript object within the given execution context.
     *
     * @param ctx the execution context to register this object in.
     */
    public static void registerInContext(Context ctx) {
        NNumProto.registerInContext(ctx);
        ctx.registerProto(OBJECT_ID, NNumProto.OBJECT_ID);
    }

    /**
     * Represents the implicit parent object for NNum objects.
     */
    public static final class NNumProto extends AbstractObj implements NativeObj {
        public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

        protected static final NativeCall NATIVE_CONSTRUCTOR = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
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
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                NNum thiz = ensureType(NNum.class, context);
                NNumeric arg = ensureType(NNumeric.class, args[0]);
                if (arg.isNum()) {
                    return new NNum(thiz.value + ((NNum)arg).value);
                }
                return arg.add(thiz.value);
            }
        };

        protected static final NativeCall nativeSubtract = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                NNum thiz = ensureType(NNum.class, context);
                NNumeric arg = ensureType(NNumeric.class, args[0]);
                if (arg.isNum()) {
                    return new NNum(thiz.value - ((NNum) arg).value);
                }
                return arg.subtractRev(thiz.value);
            }
        };

        protected static final NativeCall nativeMultiply = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                NNum thiz = ensureType(NNum.class, context);
                NNumeric arg = ensureType(NNumeric.class, args[0]);
                if (arg.isNum()) {
                    return new NNum(thiz.value * ((NNum) arg).value);
                }
                return arg.multiply(thiz.value);
            }
        };

        protected static final NativeCall nativeDivide = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                NNum thiz = ensureType(NNum.class, context);
                NNumeric arg = ensureType(NNumeric.class, args[0]);
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
                    throw new EllaRuntimeException(e);
                }
            }
        };

        protected static final NativeCall nativeNegate = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                NNum thiz = ensureType(NNum.class, context);
                return new NNum(- thiz.value);
            }
        };

        protected static final NativeCall nativeValueOf = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                try {
                    return new NNum(Long.valueOf(args[0].toString()));
                } catch (NumberFormatException e) {
                    throw new EllaRuntimeException(e);
                }
            }
        };

        protected static final Call nativeTo = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                NNum numStart = ensureType(NNum.class, context);
                NNum numStop = ensureType(NNum.class, args[0]);
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
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                NNum thiz = ensureType(NNum.class, context);
                NNum stop = ensureType(NNum.class, args[0]);
                return new NRange(thiz.value, stop.value);
            }
        };

        private NNumProto() {
            slots.put(Str.SYM__plus, nativeAdd);
            slots.put(Str.SYM__minus, nativeSubtract);
            slots.put(Str.SYM__slash, nativeDivide);
            slots.put(Str.SYM__star, nativeMultiply);
            slots.put(Str.SYM_neg, nativeNegate);
            slots.put(Str.SYM__dotdot, nativeRange);
            slots.put(Str.SYM_valueOf, nativeValueOf);
            slots.put(Str.SYM_to, nativeTo);
        }

        @Override
        public int getObjectID() {
            return OBJECT_ID;
        }

        /**
         * Registers this EllaScript object within the given execution context.
         *
         * @param ctx the execution context to register this object in.
         */
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
