package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.exception.CheckedArithmeticException;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public interface NNumeric extends Obj {
    /**
     * Represents an arbitrarily chosen scale to be used for operations on BigDecimal values producing
     * numbers with an infinite number of decimal places (e.g. 1/3).
     */
    public static int DECIMAL_FALLBACK_SCALE = 32;

    /**
     * The rounding mode used for situations descibed above.
     *
     * @see NNumeric#DECIMAL_FALLBACK_SCALE
     */
    public static RoundingMode DECIMAL_FALLBACK_ROUNDING_MODE = RoundingMode.HALF_UP;

    public static final int TYPE_NUM = 1;
    public static final int TYPE_BIGNUM = 2;
    public static final int TYPE_REAL = 3;
    public static final int TYPE_BIGREAL = 4;

    int getType();

    boolean isNum();

    boolean isBigNum();

    boolean isReal();

    boolean isBigReal();

    byte byteValue();

    short shortValue();

    int intValue();

    long longValue();

    float floatValue();

    double doubleValue();

    /**
     * @return BigInteger
     * @throws org.unbunt.sqlscript.exception.SQLScriptRuntimeException if this number's value cannot be represented
     *          as BigInteger
     */
    BigInteger bigIntegerValue();

    /**
     * @return BigDecimal
     * @throws org.unbunt.sqlscript.exception.SQLScriptRuntimeException if this number's value cannot be represented
     *          as BigDecimal
     */
    BigDecimal bigDecimalValue();

    Obj add(long arg);

    Obj add(double arg);

    Obj add(BigInteger arg);

    Obj add(BigDecimal arg);

    Obj subtractRev(long arg);

    Obj subtractRev(double arg);

    Obj subtractRev(BigInteger arg);

    Obj subtractRev(BigDecimal arg);

    Obj multiply(long arg);

    Obj multiply(double arg);

    Obj multiply(BigInteger arg);

    Obj multiply(BigDecimal arg);

    Obj divideRev(long arg) throws CheckedArithmeticException;

    Obj divideRev(double arg) throws CheckedArithmeticException;

    Obj divideRev(BigInteger arg) throws CheckedArithmeticException;

    Obj divideRev(BigDecimal arg) throws CheckedArithmeticException;

    int compareTo(NNumeric arg);
}
