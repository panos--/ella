package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.support.BlockClosure;

public class Clos extends Obj {
    protected BlockClosure closure;

    protected static final Native nativeWhile = new Native() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj[] args) {
            // TODO: check args
            Obj result = null;
            while (true) {
                Obj condValue = engine.invoke((Clos) context, null);
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
        super();
        this.closure = closure;
        this.slots.put(Str.Sym.parent.str, Base.instance);
        this.slots.put(Str.Sym._while.str, nativeWhile);
    }

    public BlockClosure getClosure() {
        return closure;
    }
}
