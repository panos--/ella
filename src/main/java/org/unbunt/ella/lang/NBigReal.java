/* NBigReal.java
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
import org.unbunt.ella.engine.corelang.*;
import static org.unbunt.ella.engine.corelang.ObjUtils.ensureType;
import org.unbunt.ella.exception.*;
import static org.unbunt.ella.lang.NumUtils.toBigDecimal;
import static org.unbunt.ella.lang.NumUtils.toBigInteger;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Represents an EllaScript object wrapping a BigDecimal value.
 */
public class NBigReal extends AbstractObj implements NNumeric {
    protected static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    /**
     * The wrapped value.
     */
    public final BigDecimal value;

    /**
     * Creates a new NBigReal wrapping the given value.
     *
     * @param value the value to wrap.
     */
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
        throw new EllaRuntimeException("Unknown numeric type: " + arg.getType());
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

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        NBigReal nBigReal = (NBigReal) o;

        return value == null
               ? nBigReal.value == null
               : value.equals(nBigReal.value);
    }

    public int hashCode() {
        return value == null ? 0 : value.hashCode();
    }

    /**
     * Registers this EllaScript object within the given execution context.
     *
     * @param ctx the execution context to register this object in.
     */
    public static void registerInContext(Context ctx) {
        NBigRealProto.registerInContext(ctx);
        ctx.registerProto(OBJECT_ID, NBigRealProto.OBJECT_ID);
    }

    /**
     * Represents the implicit parent object for NBigReal objects.
     */
    public static final class NBigRealProto extends AbstractObj implements NativeObj {
        public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

        protected static final NativeCall NATIVE_CONSTRUCTOR = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                try {
                    NNumeric arg = (NNumeric)args[0];
                    return new NBigReal(arg.bigDecimalValue());
                } catch (ClassCastException e) {
                    return null;
                }
            }
        };

        protected static final NativeCall nativeAdd = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                NBigReal thiz = ensureType(NBigReal.class, context);
                NNumeric arg = ensureType(NNumeric.class, args[0]);
                if (arg.isBigReal()) {
                    return new NBigReal(thiz.value.add(((NBigReal)arg).value));
                }
                return arg.add(thiz.value);
            }
        };

        protected static final NativeCall nativeSubtract = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                NBigReal thiz = ensureType(NBigReal.class, context);
                NNumeric arg = ensureType(NNumeric.class, args[0]);
                if (arg.isBigNum()) {
                    return new NBigReal(thiz.value.subtract(((NBigReal) arg).value));
                }
                return arg.subtractRev(thiz.value);
            }
        };

        protected static final NativeCall nativeMultiply = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                NBigReal thiz = ensureType(NBigReal.class, context);
                NNumeric arg = ensureType(NNumeric.class, args[0]);
                if (arg.isBigReal()) {
                    return new NBigReal(thiz.value.multiply(((NBigReal) arg).value));
                }
                return arg.multiply(thiz.value);
            }
        };

        protected static final NativeCall nativeDivide = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                NBigReal thiz = ensureType(NBigReal.class, context);
                NNumeric arg = ensureType(NNumeric.class, args[0]);
                try {
                    if (arg.isBigReal()) {
                        return NumUtils.divide(thiz.value, ((NBigReal)arg).value);
                    }
                    return arg.divideRev(thiz.value);
                } catch (CheckedArithmeticException e) {
                    throw new EllaRuntimeException(e);
                }
            }
        };

        protected static final NativeCall nativeNegate = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                NBigReal thiz = ensureType(NBigReal.class, context);
                return new NBigReal(thiz.value.negate());
            }
        };

        protected static final NativeCall nativeValueOf = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                try {
                    return new NBigReal(new BigDecimal(args[0].toString()));
                } catch (NumberFormatException e) {
                    throw new EllaRuntimeException(e);
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

        /**
         * Registers this EllaScript object within the given execution context.
         *
         * @param ctx the execution context to register this object in.
         */
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