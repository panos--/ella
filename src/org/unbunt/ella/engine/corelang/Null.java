package org.unbunt.ella.engine.corelang;

/**
 * The core object representing the <code>null</code> value.
 */
public interface Null extends Obj {
    /**
     * Returns the type hint associated with this object.
     * @return the type hint.
     */
    Class<?> getTypeHint();
}
