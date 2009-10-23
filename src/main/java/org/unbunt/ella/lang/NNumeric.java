package org.unbunt.ella.lang;

import org.unbunt.ella.exception.CheckedArithmeticException;
import org.unbunt.ella.exception.NumberNotComparableException;
import org.unbunt.ella.engine.corelang.Obj;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/**
 * Represents a numeric EllaScript value.
 */
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

    /**
     * The type identifier for Num objects.
     */
    public static final int TYPE_NUM = 1;

    /**
     * The type identifier for BigNum objects.
     */
    public static final int TYPE_BIGNUM = 2;

    /**
     * The type identifier for Real objects.
     */
    public static final int TYPE_REAL = 3;

    /**
     * The type identifier for BigReal objects.
     */
    public static final int TYPE_BIGREAL = 4;

    /**
     * Returns this object's type identifier.
     *
     * @return the type identifier.
     */
    int getType();

    /**
     * Returns <code>true</code> if this object is a Num object.
     *
     * @return <code>true</code> if this object is a Num object.
     */
    boolean isNum();

    /**
     * Returns <code>true</code> if this object is a BigNum object.
     *
     * @return <code>true</code> if this object is a BigNum object.
     */
    boolean isBigNum();

    /**
     * Returns <code>true</code> if this object is a Real object.
     *
     * @return <code>true</code> if this object is a Real object.
     */
    boolean isReal();

    /**
     * Returns <code>true</code> if this object is a BigReal object.
     *
     * @return <code>true</code> if this object is a BigReal object.
     */
    boolean isBigReal();

    /**
     * Converts this object's wrapped numeric value into a <code>byte</code> value.
     *
     * @return the converted value.
     */
    byte byteValue();

    /**
     * Converts this object's wrapped numeric value into a <code>short</code> value.
     *
     * @return the converted value.
     */
    short shortValue();

    /**
     * Converts this object's wrapped numeric value into a <code>int</code> value.
     *
     * @return the converted value.
     */
    int intValue();

    /**
     * Converts this object's wrapped numeric value into a <code>long</code> value.
     *
     * @return the converted value.
     */
    long longValue();

    /**
     * Converts this object's wrapped numeric value into a <code>float</code> value.
     *
     * @return the converted value.
     */
    float floatValue();

    /**
     * Converts this object's wrapped numeric value into a <code>double</code> value.
     *
     * @return the converted value.
     */
    double doubleValue();

    /**
     * Converts this object's wrapped numeric value into a <code>BigInteger</code> value.
     *
     * @return the converted value.
     * @throws org.unbunt.ella.exception.EllaRuntimeException if this number's value cannot be represented
     *          as BigInteger
     */
    BigInteger bigIntegerValue();

    /**
     * Converts this object's wrapped numeric value into a <code>BigDecimal</code> value.
     *
     * @return the converted value.
     * @throws org.unbunt.ella.exception.EllaRuntimeException if this number's value cannot be represented
     *          as BigInteger
     */
    BigDecimal bigDecimalValue();

    /**
     * Adds the given value to this object's value. Returns an EllaScript object of an appropriate type.
     *
     * @param arg the value to add.
     * @return the result of the addition.
     */
    Obj add(long arg);

    /**
     * Adds the given value to this object's value. Returns an EllaScript object of an appropriate type.
     *
     * @param arg the value to add.
     * @return the result of the addition.
     */
    Obj add(double arg);

    /**
     * Adds the given value to this object's value. Returns an EllaScript object of an appropriate type.
     *
     * @param arg the value to add.
     * @return the result of the addition.
     */
    Obj add(BigInteger arg);

    /**
     * Adds the given value to this object's value. Returns an EllaScript object of an appropriate type.
     *
     * @param arg the value to add.
     * @return the result of the addition.
     */
    Obj add(BigDecimal arg);

    /**
     * Subtracts this object's value from the given value. Returns an EllaScript object of an appropriate type.
     *
     * @param arg the value.
     * @return the result of the subtraction.
     */
    Obj subtractRev(long arg);

    /**
     * Subtracts this object's value from the given value. Returns an EllaScript object of an appropriate type.
     *
     * @param arg the value.
     * @return the result of the subtraction.
     */
    Obj subtractRev(double arg);

    /**
     * Subtracts this object's value from the given value. Returns an EllaScript object of an appropriate type.
     *
     * @param arg the value.
     * @return the result of the subtraction.
     */
    Obj subtractRev(BigInteger arg);

    /**
     * Subtracts this object's value from the given value. Returns an EllaScript object of an appropriate type.
     *
     * @param arg the value.
     * @return the result of the subtraction.
     */
    Obj subtractRev(BigDecimal arg);

    /**
     * Multiplies this object's value with the given value. Returns an EllaScript object of an appropriate type.
     *
     * @param arg the value.
     * @return the result of the multiplication.
     */
    Obj multiply(long arg);

    /**
     * Multiplies this object's value with the given value. Returns an EllaScript object of an appropriate type.
     *
     * @param arg the value.
     * @return the result of the multiplication.
     */
    Obj multiply(double arg);

    /**
     * Multiplies this object's value with the given value. Returns an EllaScript object of an appropriate type.
     *
     * @param arg the value.
     * @return the result of the multiplication.
     */
    Obj multiply(BigInteger arg);

    /**
     * Multiplies this object's value with the given value. Returns an EllaScript object of an appropriate type.
     *
     * @param arg the value.
     * @return the result of the multiplication.
     */
    Obj multiply(BigDecimal arg);

    /**
     * Divides the given value by this object's value. Returns an EllaScript object of an appropriate type.
     *
     * @param arg the value.
     * @return the result of the division.
     * @throws CheckedArithmeticException if the division could not be carried out.
     */
    Obj divideRev(long arg) throws CheckedArithmeticException;

    /**
     * Divides the given value by this object's value. Returns an EllaScript object of an appropriate type.
     *
     * @param arg the value.
     * @return the result of the division.
     * @throws CheckedArithmeticException if the division could not be carried out.
     */
    Obj divideRev(double arg) throws CheckedArithmeticException;

    /**
     * Divides the given value by this object's value. Returns an EllaScript object of an appropriate type.
     *
     * @param arg the value.
     * @return the result of the division.
     * @throws CheckedArithmeticException if the division could not be carried out.
     */
    Obj divideRev(BigInteger arg) throws CheckedArithmeticException;

    /**
     * Divides the given value by this object's value. Returns an EllaScript object of an appropriate type.
     *
     * @param arg the value.
     * @return the result of the division.
     * @throws CheckedArithmeticException if the division could not be carried out.
     */
    Obj divideRev(BigDecimal arg) throws CheckedArithmeticException;

    /**
     * Compares this object's numeric value with the given object's numeric value.
     *
     * @param arg the object to compare this object with.
     * @return <code>-1</code>, <code>0</code> or <code>1</code> if this object's value is smaller, equal or greater to
     *         the given value, respectively.
     * @throws NumberNotComparableException if the involved values are not comparable (as is the case if at least one
     *         of the values represents <code>Double.NaN</code>).
     */
    int compareTo(NNumeric arg) throws NumberNotComparableException;
}
