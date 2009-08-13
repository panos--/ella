package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.engine.corelang.Obj;
import org.unbunt.sqlscript.exception.*;

import java.math.BigDecimal;
import java.math.BigInteger;

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
            throw new SQLScriptRuntimeException("Internal error: " + e.getMessage(), e);
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
            throw new SQLScriptRuntimeException("Internal error: " + e.getMessage(), e);
        }
    }

    public static BigDecimal toBigDecimal(BigInteger value) {
        return new BigDecimal(value);
    }
}
