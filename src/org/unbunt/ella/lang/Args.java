package org.unbunt.ella.lang;

import org.unbunt.ella.exception.ClosureTerminatedException;
import org.unbunt.ella.exception.EllaRuntimeException;
import org.unbunt.ella.engine.corelang.*;
import static org.unbunt.ella.engine.corelang.ObjUtils.ensureType;
import org.unbunt.ella.engine.context.Context;

/**
 * Represents an EllaScript object wrapping an array of function arguments.
 */
public class Args extends AbstractObj {
    /**
     * The arguments this object wraps.
     */
    public final Obj[] args;

    /**
     * A value representing an empty set of arguments.
     */
    public static final Args emptyArgs = new Args(new Obj[0]);

    /**
     * Creates a new Args object wrapping the given array.
     * @param args the arguments to wrap.
     */
    public Args(Obj[] args) {
        this.args = args;
    }

    protected static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    @Override
    public int getObjectID() {
        return OBJECT_ID;
    }

    /**
     * Registers this EllaScript object within the given execution context.
     *
     * @param ctx the execution context to register this object in.
     */
    public static void registerInContext(Context ctx) {
        ArgsProto.registerInContext(ctx);
        ctx.registerProto(OBJECT_ID, ArgsProto.OBJECT_ID);
    }

    protected static class ArgsProto extends AbstractObj {
        protected static final NativeCall nativeGet = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Args thiz = ensureType(Args.class, context);
                NNumeric idxObj = ensureType(NNumeric.class, args[0]);
                int idx = idxObj.intValue(); // TODO: maybe throw exception if value doesn't fit in int
                try {
                    return thiz.args[idx];
                } catch (IndexOutOfBoundsException e) {
                    throw new EllaRuntimeException(e);
                }
            }
        };

        private ArgsProto() {
            slots.put(Str.SYM_get, nativeGet);
        }

        public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

        @Override
        public int getObjectID() {
            return OBJECT_ID;
        }

        public static void registerInContext(Context ctx) {
            Base.registerInContext(ctx);
            ctx.registerProto(OBJECT_ID, Base.OBJECT_ID);
            ctx.registerObject(new ArgsProto());
        }
    }
}
