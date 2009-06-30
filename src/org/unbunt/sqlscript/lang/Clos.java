package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;
import org.unbunt.sqlscript.exception.LoopBreakException;
import org.unbunt.sqlscript.exception.LoopContinueException;
import org.unbunt.sqlscript.support.BlockClosure;

public class Clos extends PlainObj implements Call {
    public static final ClosProto PROTOTYPE = new ClosProto();

    protected BlockClosure closure;

    public Clos(BlockClosure closure) {
        this.closure = closure;
    }

    public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
        return engine.invoke(this, args);
    }

    public void trigger(SQLScriptEngine engine, Obj context, Obj... args) {
        engine.trigger(this, args);
    }

    @Override
    public Obj getImplicitParent() {
        return PROTOTYPE;
    }

    public BlockClosure getClosure() {
        return closure;
    }

    protected static class ClosProto extends PlainObj {
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

                    engine.invoke(PrimitiveCall.Type.LOOP.primitive, Null.instance);

                    try {
                        result = engine.invoke((Clos) args[0]);
                    } catch (LoopBreakException e) {
                        break;
                    } catch (LoopContinueException e) {
                        continue;
                    }
                }
                return result;
            }
        };

        protected ClosProto() {
            this.slots.put(Str.SYM_while, nativeWhile);
        }

        @Override
        public Obj getImplicitParent() {
            return Base.instance;
        }
    }
}
