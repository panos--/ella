package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.support.Function;

public class Func extends PlainObj {
    protected Function function;

    public Func(Function function) {
        this.function = function;
    }

    @Override
    public Obj getImplicitParent() {
        return Base.instance;
    }

    public Function getFunction() {
        return function;
    }
}
