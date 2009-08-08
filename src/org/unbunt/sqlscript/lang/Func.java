package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.engine.natives.ProtoRegistry;
import org.unbunt.sqlscript.engine.*;
import org.unbunt.sqlscript.engine.natives.*;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;
import org.unbunt.sqlscript.compiler.support.Function;
import org.unbunt.sqlscript.engine.context.Context;

public class Func extends AbstractObj implements Call {
    protected Function function;

    public Func(Function function) {
        this.function = function;
    }

    public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    public int getObjectID() {
        return OBJECT_ID;
    }

    public static void registerInContext(Context ctx) {
        FuncProto.registerInContext(ctx);
        ctx.registerProto(OBJECT_ID, FuncProto.OBJECT_ID);
    }

    public Obj call(Engine engine, Obj context, Obj[] args) throws ClosureTerminatedException {
        return engine.invoke(this, context, null, args);
    }

    public Obj call(Engine engine, Obj context, Obj receiver, Obj... args) throws ClosureTerminatedException {
        return engine.invoke(this, context, receiver, args);
    }

    public void trigger(Engine engine, Obj context, Obj... args) {
        engine.trigger(this, context, args);
    }

    public Function getFunction() {
        return function;
    }

    public static class FuncProto extends AbstractObj {
        public static NativeCall nativeCall = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Obj[] callArgs = new Obj[args.length - 1];
                System.arraycopy(args, 1, callArgs, 0, callArgs.length);
                return engine.invoke(context, args[0], callArgs);
            }
        };

        private FuncProto() {
            slots.put(Str.SYM_call, nativeCall);
        }

        public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

        public int getObjectID() {
            return OBJECT_ID;
        }

        public static void registerInContext(Context ctx) {
            Base.registerInContext(ctx);
            ctx.registerProto(OBJECT_ID, Base.OBJECT_ID);
            if (!ctx.hasObject(OBJECT_ID)) {
                ctx.registerObject(new FuncProto());
            }
        }
    }
}
