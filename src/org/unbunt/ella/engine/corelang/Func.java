package org.unbunt.ella.engine.corelang;

import org.unbunt.ella.compiler.support.Function;

public interface Func extends Obj, Call {
    public Function getFunction();
}
