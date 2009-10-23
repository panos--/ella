package org.unbunt.ella.engine.corelang;

/**
 * The core object representing boolean values.
 */
public interface Bool extends Obj {
    /**
     * Returns <code>true</code> if this object represents the boolean <code>true</code> value.
     *
     * @return <code>true</code> if this object represents the boolean <code>true</code> value.
     */
    boolean isTrue();

    /**
     * Returns <code>false</code> if this object represents the boolean <code>false</code> value.
     *
     * @return <code>false</code> if this object represents the boolean <code>false</code> value.
     */
    boolean isFalse();

    /**
     * Returns the boolean value this object represents.
     *
     * @return the boolean value this object represents.
     */
    boolean getValue();
}
