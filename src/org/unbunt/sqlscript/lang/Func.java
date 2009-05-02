package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.support.Function;
import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;

public class Func extends PlainObj implements Call {
    public static final FuncProto PROTOTYPE = new FuncProto();

    protected Function function;

    public Func(Function function) {
        this.function = function;
    }

    public Obj call(SQLScriptEngine engine, Obj context, Obj[] args) throws ClosureTerminatedException {
        return engine.invoke(this, context, args);
    }

    @Override
    public Obj getImplicitParent() {
        return PROTOTYPE;
    }

    public Function getFunction() {
        return function;
    }

    protected static class FuncProto extends PlainObj {
        public static NativeCall nativeCall = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Obj[] callArgs = new Obj[args.length - 1];
                System.arraycopy(args, 1, callArgs, 0, callArgs.length);
                return engine.invoke(context, args[0], callArgs);
            }
        };

        public FuncProto() {
            slots.put(Str.SYM_call, nativeCall);
        }

        @Override
        public Obj getImplicitParent() {
            return Base.instance;
        }
    }
}
