package org.unbunt.ella.engine.corelang;

import org.unbunt.ella.compiler.support.BlockClosure;

/**
 * The core object representing block closures.
 */
public interface Clos extends Obj, Call {
    /**
     * Returns the compiled block closure.
     *
     * @return the compiled block closure.
     */
    BlockClosure getClosure();
}
