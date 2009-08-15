package org.unbunt.ella.engine.corelang;

import org.unbunt.ella.compiler.support.Function;

/**
 * The core object representing EllaScript functions.
 */
public interface Func extends Obj, Call {
    /**
     * Returns the compiled function.
     *
     * @return the compiled function.
     */
    public Function getFunction();
}
