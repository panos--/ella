package org.unbunt.sqlscript.utils;

import org.unbunt.sqlscript.lang.*;
import org.unbunt.sqlscript.exception.CheckedArithmeticException;
import static org.unbunt.sqlscript.utils.NumUtils.toBigDecimal;

import java.math.BigInteger;
import java.math.BigDecimal;
import static java.lang.Double.isInfinite;

public class NumUtils {
    public static final BigInteger MAX_DOUBLE = toBigInteger(Double.MAX_VALUE);

    public static BigInteger toBigInteger(double value) {
        return BigDecimal.valueOf(value).toBigInteger();
    }

    public static BigDecimal toBigDecimal(double value) {
        return BigDecimal.valueOf(value);
    }

    public static BigDecimal toBigDecimal(BigInteger value) {
        return new BigDecimal(value);
    }

    public static boolean doublePossible(BigInteger result) {
        return result.abs().compareTo(MAX_DOUBLE) < 1;
    }

    public static Obj narrow(BigInteger value) {
        // downgrade to Num if possible
        if (doublePossible(value)) {
            return new Num(value.doubleValue());
        }
        return new BigNum(value);
    }

    public static Obj divide(double dividend, double divisor) throws CheckedArithmeticException {
        double result = dividend / divisor;
        if (isInfinite(result)) {
            if (divisor == 0) {
                throw new CheckedArithmeticException("Division by zero");
            }
            return new BigNum(toBigInteger(dividend).divide(toBigInteger(divisor)));
        }
        return new Num(result);
    }

    public static Obj divideReal(double dividend, double divisor) throws CheckedArithmeticException {
        double result = dividend / divisor;
        if (isInfinite(result)) {
            if (divisor == 0) {
                throw new CheckedArithmeticException("Division by zero");
            }
            try {
                return new BigReal(toBigDecimal(dividend).divide(toBigDecimal(divisor)));
            } catch (ArithmeticException e) {
                return new BigReal(toBigDecimal(dividend).divide(toBigDecimal(divisor),
                                                              Numeric.DECIMAL_FALLBACK_SCALE,
                                                              Numeric.DECIMAL_FALLBACK_ROUNDING_MODE));
            }
        }
        return new Real(dividend);
    }

    public static Obj divideReal(BigDecimal dividend, BigDecimal divisor) throws CheckedArithmeticException {
        try {
            return new BigReal(dividend.divide(divisor));
        } catch (ArithmeticException e) {
            if (BigDecimal.ZERO.equals(divisor)) {
                throw new CheckedArithmeticException("Division by zero");
            }
            BigDecimal result =
                    dividend.divide(divisor, Numeric.DECIMAL_FALLBACK_SCALE, Numeric.DECIMAL_FALLBACK_ROUNDING_MODE);
            return new BigReal(result);
        }
    }
}
