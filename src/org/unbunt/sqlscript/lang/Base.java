package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;
import org.unbunt.sqlscript.exception.LoopBreakException;
import org.unbunt.sqlscript.exception.LoopContinueException;
import org.unbunt.sqlscript.support.Context;
import org.unbunt.sqlscript.support.ProtoRegistry;
import static org.unbunt.sqlscript.utils.ObjUtils.ensureType;

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

    protected static final NativeCall nativeAnd = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            Clos closure = ensureType(args[0]);
            engine.trigger(closure);
            return null;
        }
    };

    protected static final NativeCall nativeOr = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            return engine.getObjTrue();
        }
    };

    protected static final NativeCall nativeNot = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            return engine.getObjFalse();
        }
    };

    protected static final NativeCall nativeClone = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            Context ctx = engine.getContext();

            Obj clone = new PlainObj();
            clone.setSlot(ctx, SQLScriptEngine.STR_SLOT_PARENT, context);
            engine.invokeSlotIfPresent(clone, SQLScriptEngine.STR_SLOT_CLONE_INIT);

            return clone;
        }
    };

    public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    private Base() {
        slots.put(Str.SYM__id, PrimitiveCall.Type.ID.primitive);
        slots.put(Str.SYM__ni, PrimitiveCall.Type.NI.primitive);
        slots.put(Str.SYM__eq, nativeEquals);
        slots.put(Str.SYM__ne, nativeNotEquals);
        slots.put(Str.SYM__logic_and, nativeAnd);
        slots.put(Str.SYM__logic_or, nativeOr);
        slots.put(Str.SYM__logic_not, nativeNot);
        slots.put(Str.SYM_clone, nativeClone);
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

    public Obj getParent() {
        return null; // Base, by definition, has no parent
    }
}
