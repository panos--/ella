package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.compiler.support.BlockClosure;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;
import org.unbunt.sqlscript.exception.LoopBreakException;
import org.unbunt.sqlscript.exception.LoopContinueException;
import org.unbunt.sqlscript.engine.*;
import org.unbunt.sqlscript.engine.natives.*;
import static org.unbunt.sqlscript.engine.natives.ObjUtils.ensureType;
import org.unbunt.sqlscript.engine.context.Context;

public class Clos extends AbstractObj implements Call {
    protected BlockClosure closure;

    public Clos(BlockClosure closure) {
        this.closure = closure;
    }

    public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    public int getObjectID() {
        return OBJECT_ID;
    }

    public static void registerInContext(Context ctx) {
        ClosProto.registerInContext(ctx);
        ctx.registerProto(OBJECT_ID, ClosProto.OBJECT_ID);
    }

    public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
        return engine.invoke(this, args);
    }

    public Obj call(Engine engine, Obj context, Obj receiver, Obj... args) throws ClosureTerminatedException {
        return engine.invoke(this, args);
    }

    public void trigger(Engine engine, Obj context, Obj... args) {
        engine.trigger(this, args);
    }

    public BlockClosure getClosure() {
        return closure;
    }

    public static class ClosProto extends AbstractObj {
        protected static final NativeCall nativeWhileTrue = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) {
                Call cond = ensureType(Call.class, context);
                Obj _null = engine.getObjNull();
                Obj result = null;
                while (true) {
                    Obj condValue = cond.call(engine, null);
                    if (!engine.toBoolean(condValue)) {
                        break;
                    }

                    try {
                        result = engine.invokeInLoop(args[0], _null);
                    } catch (LoopBreakException e) {
                        break;
                    } catch (LoopContinueException e) {
                        continue;
                    }
                }
                return result;
            }
        };

        private ClosProto() {
            this.slots.put(Str.SYM_whileTrue, nativeWhileTrue);
        }

        public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

        public int getObjectID() {
            return OBJECT_ID;
        }

        public static void registerInContext(Context ctx) {
            Base.registerInContext(ctx);
            ctx.registerProto(OBJECT_ID, Base.OBJECT_ID);
            if (!ctx.hasObject(OBJECT_ID)) {
                ctx.registerObject(new ClosProto());
            }
        }
    }
}
