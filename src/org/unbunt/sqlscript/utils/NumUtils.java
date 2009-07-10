package org.unbunt.sqlscript.utils;

import org.unbunt.sqlscript.lang.*;
import org.unbunt.sqlscript.exception.*;
import static org.unbunt.sqlscript.utils.NumUtils.toBigDecimal;

import java.math.BigInteger;
import java.math.BigDecimal;
import static java.lang.Double.isInfinite;

public class NumUtils {
    public static final BigInteger MAX_DOUBLE = toBigIntegerUnguarded(Double.MAX_VALUE);

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

    public static boolean doublePossible(BigInteger result) {
        return result.abs().compareTo(MAX_DOUBLE) < 1;
    }

}
