package org.unbunt.ella.lang;

import org.unbunt.ella.compiler.support.BlockClosure;
import org.unbunt.ella.exception.ClosureTerminatedException;
import org.unbunt.ella.exception.LoopBreakException;
import org.unbunt.ella.exception.LoopContinueException;
import org.unbunt.ella.engine.corelang.*;
import static org.unbunt.ella.engine.corelang.ObjUtils.ensureType;
import org.unbunt.ella.engine.context.Context;

/**
 * Represents a default implementation of the EllaScript core object <code>Clos</code>.
 */
public class ClosImpl extends AbstractObj implements Clos {
    protected BlockClosure closure;

    /**
     * Creates a new Clos wrapping the given closure.
     *
     * @param closure the closure to wrap.
     */
    public ClosImpl(BlockClosure closure) {
        this.closure = closure;
    }

    public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    public int getObjectID() {
        return OBJECT_ID;
    }

    /**
     * Registers this EllaScript object within the given execution context.
     *
     * @param ctx the execution context to register this object in.
     */
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

    /**
     * Represents the implicit parent object for Clos objects.
     */
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

        /**
         * Registers this EllaScript object within the given execution context.
         *
         * @param ctx the execution context to register this object in.
         */
        public static void registerInContext(Context ctx) {
            Base.registerInContext(ctx);
            ctx.registerProto(OBJECT_ID, Base.OBJECT_ID);
            if (!ctx.hasObject(OBJECT_ID)) {
                ctx.registerObject(new ClosProto());
            }
        }
    }
}
