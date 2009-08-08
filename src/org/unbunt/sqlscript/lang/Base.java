package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.engine.SQLScriptEngine;
import org.unbunt.sqlscript.engine.Context;
import org.unbunt.sqlscript.engine.Obj;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;
import org.unbunt.sqlscript.exception.LoopBreakException;
import org.unbunt.sqlscript.exception.LoopContinueException;
import org.unbunt.sqlscript.support.ProtoRegistry;
import static org.unbunt.sqlscript.utils.Consts.SLOT_CLONE_INIT;
import static org.unbunt.sqlscript.utils.Consts.SLOT_PARENT;
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

    protected static final NativeCall nativeHasSlot = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            return context != null && context.getSlot(engine.getContext(), args[0]) != null
                    ? engine.getObjTrue()
                    : engine.getObjFalse();
        }
    };

    protected static final NativeCall nativeRemoveSlot = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            if (context == null) {
                return engine.getObjNull();
            }
            Obj removedSlot = context.removeSlot(engine.getContext(), args[0]);
            return removedSlot == null ? engine.getObjNull() : removedSlot;
        }
    };

    protected static final NativeCall nativeAnd = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            Clos closure = ensureType(Clos.class, args[0]);
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
            clone.setSlot(ctx, SLOT_PARENT, context);
            engine.invokeSlotIfPresent(clone, SLOT_CLONE_INIT);

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
        slots.put(Str.SYM_not, nativeNot);
        slots.put(Str.SYM_clone, nativeClone);
        slots.put(Str.SYM_each, nativeEach);
        slots.put(Str.SYM_eachSlot, nativeEachSlot);
        slots.put(Str.SYM_hasSlot, nativeHasSlot);
        slots.put(Str.SYM_removeSlot, nativeRemoveSlot);
    }

    public static void registerInContext(Context ctx) {
        if (!ctx.hasObject(OBJECT_ID)) {
            ctx.registerObject(new Base());

            // to avoid circular dependency between PlainObj and Base we trigger registration of
            // Base as proto (implicit parent) of PlainObj here, not in PlainObj itself
            ctx.registerProto(PlainObj.OBJECT_ID, OBJECT_ID);
        }
    }

    @Override
    public int getObjectID() {
        return OBJECT_ID;
    }
}
