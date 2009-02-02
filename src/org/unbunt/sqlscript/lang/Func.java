package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.support.Function;

public class Func extends Obj {
    protected Function function;

    public Func(Function function) {
        this.function = function;
    }

    public Function getFunction() {
        return function;
    }
}
