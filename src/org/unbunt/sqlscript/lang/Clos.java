package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;
import org.unbunt.sqlscript.support.BlockClosure;

public class Clos extends PlainObj implements Call {
    protected BlockClosure closure;

    protected static final NativeCall nativeWhile = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) {
            // TODO: check args
            Obj result = null;
            while (true) {
                Obj condValue = ((Call) context).call(engine, null);
                Bool condResult = engine.toBool(condValue);
                if (Bool.FALSE.equals(condResult)) {
                    break;
                }
                result = engine.invoke((Clos) args[0], null);
            }
            return result;
        }
    };

    public Clos(BlockClosure closure) {
        this.closure = closure;
        this.slots.put(Str.Sym._while.str, nativeWhile);
    }

    public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
        return engine.invoke(this, context, args);
    }

    @Override
    public Obj getImplicitParent() {
        return Base.instance;
    }

    public BlockClosure getClosure() {
        return closure;
    }
}
