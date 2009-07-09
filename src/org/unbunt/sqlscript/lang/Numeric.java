package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.exception.CheckedArithmeticException;

import java.math.BigInteger;
import java.math.BigDecimal;
import java.math.RoundingMode;

public interface Numeric {
    /**
     * Represents an arbitrarily chosen scale to be used for operations on BigDecimal values producing
     * numbers with an infinite number of decimal places (e.g. 1/3).
     */
    public static int DECIMAL_FALLBACK_SCALE = 32;

    /**
     * The rounding mode used for situations descibed above.
     *
     * @see Numeric#DECIMAL_FALLBACK_SCALE
     */
    public static RoundingMode DECIMAL_FALLBACK_ROUNDING_MODE = RoundingMode.HALF_UP;

    boolean isNum();

    boolean isBigNum();

    boolean isReal();

    boolean isBigReal();

    double doubleValue();

    BigInteger bigIntegerValue();

    BigDecimal bigDecimalValue();

    Obj add(double arg);

    Obj add(BigInteger arg);

    Obj addReal(double arg);

    Obj addReal(BigDecimal arg);

    Obj subtractRev(double arg);

    Obj subtractRev(BigInteger arg);

    Obj subtractRealRev(double arg);

    Obj subtractRealRev(BigDecimal arg);

    Obj multiply(double arg);

    Obj multiply(BigInteger arg);

    Obj multiplyReal(double arg);

    Obj multiplyReal(BigDecimal arg);

    Obj divideRev(double arg) throws CheckedArithmeticException;

    Obj divideRev(BigInteger arg) throws CheckedArithmeticException;

    Obj divideRealRev(double arg) throws CheckedArithmeticException;

    Obj divideRealRev(BigDecimal arg) throws CheckedArithmeticException;
}
