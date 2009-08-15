package org.unbunt.ella.engine.corelang;

/**
 * Represents a native EllaScript object which declares a native constructor.
 */
public interface NativeObj extends Obj {
    /**
     * Returns the native constructor to use when creating new instances of this object in the class-based
     * object oriented instanciation scheme.
     *
     * @return the native constructor.
     */
    Call getNativeConstructor();
}
