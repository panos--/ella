package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.support.Function;
import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;

public class Func extends PlainObj implements Call {
    protected Function function;

    public Func(Function function) {
        this.function = function;
    }

    public Obj call(SQLScriptEngine engine, Obj context, Obj[] args) throws ClosureTerminatedException {
        return engine.invoke(this, context, args);
    }

    @Override
    public Obj getImplicitParent() {
        return Base.instance;
    }

    public Function getFunction() {
        return function;
    }
}
