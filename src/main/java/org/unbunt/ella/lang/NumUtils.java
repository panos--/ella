/* NumUtils.java
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

import org.unbunt.ella.engine.corelang.Obj;
import org.unbunt.ella.exception.*;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Helper class providing various support methods for working with numeric values in the context of the
 * EllaScript language.
 */
public class NumUtils {
    public static final BigInteger MAX_DOUBLE = toBigIntegerUnguarded(Double.MAX_VALUE);

    public static Obj divide(BigDecimal divisor, BigDecimal dividend) throws CheckedArithmeticException {
        try {
            return new NBigReal(divisor.divide(dividend));
        } catch (ArithmeticException e) {
            if (BigDecimal.ZERO.equals(dividend)) {
                throw new CheckedArithmeticException(e);
            }
            return new NBigReal(divisor.divide(dividend,
                                               NNumeric.DECIMAL_FALLBACK_SCALE,
                                               NNumeric.DECIMAL_FALLBACK_ROUNDING_MODE));
        }
    }

    public static Obj divide(BigInteger divisor, BigInteger dividend) throws CheckedArithmeticException {
        try {
            return new NBigNum(divisor.divide(dividend));
        } catch (ArithmeticException e) {
            throw new CheckedArithmeticException(e);
        }
    }

    public static Obj multiply(BigDecimal a, double b) {
        try {
            return new NBigReal(a.multiply(toBigDecimal(b)));
        } catch (DoubleNegativeInfinityException e) {
            return new NReal(b);
        } catch (DoublePositiveInfinityExcepetion doublePositiveInfinityExcepetion) {
            return new NReal(b);
        } catch (DoubleNaNException e) {
            return new NReal(b);
        }
    }

    public static Obj divide(BigDecimal a, double b) {
        try {
            return new NBigReal(a.divide(toBigDecimal(b)));
        } catch (DoubleNegativeInfinityException e) {
            return new NReal(b);
        } catch (DoublePositiveInfinityExcepetion doublePositiveInfinityExcepetion) {
            return new NReal(b);
        } catch (DoubleNaNException e) {
            return new NReal(b);
        }
    }

    private static BigInteger toBigIntegerUnguarded(double value) {
        try {
            return toBigInteger(value);
        } catch (UnrepresentableValueException e) {
            throw new RuntimeException(e);
        }
    }

    public static BigInteger toBigInteger(long value) {
        return BigInteger.valueOf(value);
    }

    public static BigInteger toBigInteger(double value)
            throws DoubleNaNException, DoublePositiveInfinityExcepetion, DoubleNegativeInfinityException {
        try {
            return BigDecimal.valueOf(value).toBigInteger();
        } catch (NumberFormatException e) {
            if (Double.isNaN(value)) {
                throw new DoubleNaNException(e);
            }
            else if (value == Double.POSITIVE_INFINITY) {
                throw new DoublePositiveInfinityExcepetion(e);
            }
            else if (value == Double.NEGATIVE_INFINITY) {
                throw new DoubleNegativeInfinityException(e);
            }
            throw new EllaRuntimeException("Internal error: " + e.getMessage(), e);
        }
    }

    public static BigInteger toBigInteger(BigDecimal value) {
        return value.toBigInteger();
    }

    public static BigDecimal toBigDecimal(long value) {
        return toBigDecimal(toBigInteger(value));
    }

    public static BigDecimal toBigDecimal(double value)
            throws DoubleNaNException, DoublePositiveInfinityExcepetion, DoubleNegativeInfinityException {
        try {
            return BigDecimal.valueOf(value);
        } catch (NumberFormatException e) {
            if (Double.isNaN(value)) {
                throw new DoubleNaNException(e);
            }
            else if (value == Double.POSITIVE_INFINITY) {
                throw new DoublePositiveInfinityExcepetion(e);
            }
            else if (value == Double.NEGATIVE_INFINITY) {
                throw new DoubleNegativeInfinityException(e);
            }
            throw new EllaRuntimeException("Internal error: " + e.getMessage(), e);
        }
    }

    public static BigDecimal toBigDecimal(BigInteger value) {
        return new BigDecimal(value);
    }
}
