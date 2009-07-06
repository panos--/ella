package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;
import org.unbunt.sqlscript.exception.SQLScriptRuntimeException;
import org.unbunt.sqlscript.support.Context;
import org.unbunt.sqlscript.support.ProtoRegistry;
import static org.unbunt.sqlscript.utils.ObjUtils.ensureType;

public class Args extends PlainObj {
    public final Obj[] args;

    public static final Args emptyArgs = new Args(new Obj[0]);

    public Args(Obj[] args) {
        this.args = args;
    }

    public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    @Override
    public int getObjectID() {
        return OBJECT_ID;
    }

    public static void registerInContext(Context ctx) {
        ArgsProto.registerInContext(ctx);
        ctx.registerProto(OBJECT_ID, ArgsProto.OBJECT_ID);
    }

    protected static class ArgsProto extends PlainObj {
        protected static final NativeCall nativeGet = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Args thiz = ensureType(context);
                Int idxObj = ensureType(args[0]);
                int idx = idxObj.value;
                try {
                    return thiz.args[idx];
                } catch (IndexOutOfBoundsException e) {
                    throw new SQLScriptRuntimeException(e);
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
