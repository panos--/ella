package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;
import org.unbunt.sqlscript.exception.LoopBreakException;
import org.unbunt.sqlscript.exception.LoopContinueException;
import org.unbunt.sqlscript.support.Context;
import org.unbunt.sqlscript.support.ProtoRegistry;

import java.util.Map;

public class Base extends AbstractObj {
    protected static final Call nativeEquals = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            return context.equals(args[0]) ? engine.getObjTrue() : engine.getObjFalse();
        }
    };

    protected static final Call nativeNotEquals = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            return context.equals(args[0]) ? engine.getObjFalse() : engine.getObjTrue();
        }
    };

    protected static final Call nativeEach = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            if (context == null) {
                return engine.getObjNull();
            }

            Obj call = args[0];

            engine.invoke(PrimitiveCall.Type.LOOP.primitive, engine.getObjNull());

            for (Map.Entry<Obj, Obj> entry : context.getSlots().entrySet()) {
                try {
                    engine.invoke(call, context, entry.getKey(), entry.getValue());
                } catch (LoopBreakException e) {
                    break;
                } catch (LoopContinueException e) {
                    continue;
                }
            }

            return context;
        }
    };

    protected static final Call nativeEachSlot = nativeEach;

    public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    private Base() {
        slots.put(Str.SYM_id, PrimitiveCall.Type.ID.primitive);
        slots.put(Str.SYM_ni, PrimitiveCall.Type.NI.primitive);
        slots.put(Str.SYM_eq, nativeEquals);
        slots.put(Str.SYM_ne, nativeNotEquals);
        slots.put(Str.SYM_each, nativeEach);
        slots.put(Str.SYM_eachSlot, nativeEachSlot);
    }

    public static void registerInContext(Context ctx) {
        if (!ctx.hasObject(OBJECT_ID)) {
            ctx.registerObject(new Base());
        }
    }

    @Override
    public int getObjectID() {
        return OBJECT_ID;
    }

    /**
     * Helper for deferred initialization.
     *
     * There is a circular dependancy between Base and Str classes, where Base requires Str to setup slots
     * and Str depends on Base as it's parent. Therefore the default ctor of Base does nothing. The actual
     * initialization is then triggerd by Str class as soon as it is ready.
     */
//    private static void initialize() {
//        instance.slots.put(Str.SYM_id, PrimitiveCall.Type.ID.primitive);
//        instance.slots.put(Str.SYM_ni, PrimitiveCall.Type.NI.primitive);
//        instance.slots.put(Str.SYM_eq, nativeEquals);
//        instance.slots.put(Str.SYM_ne, nativeNotEquals);
//        instance.slots.put(Str.SYM_each, nativeEach);
//        instance.slots.put(Str.SYM_eachSlot, nativeEachSlot);
//    }

    public Obj getParent() {
        return null; // Base, by definition, has no parent
    }
}
