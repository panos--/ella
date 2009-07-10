package org.unbunt.sqlscript.utils;

import org.unbunt.sqlscript.lang.*;
import org.unbunt.sqlscript.exception.*;
import static org.unbunt.sqlscript.utils.NumUtils.toBigDecimal;

import java.math.BigDecimal;
import java.math.BigInteger;

public class NNumUtils {
    public Obj add(long a, long b) {
        return new NNum(a + b);
    }

    public Obj add(double a, double b) {
        return new NReal(a + b);
    }

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
}
