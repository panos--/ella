package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.support.NativeWrapper;
import org.unbunt.sqlscript.support.ProtoRegistry;
import org.unbunt.sqlscript.support.Context;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;
import org.unbunt.sqlscript.exception.LoopBreakException;
import org.unbunt.sqlscript.exception.LoopContinueException;

public class Int extends PlainObj {
    public final int value;

    public Int(int value) {
        this.value = value;
    }

    public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    public int getObjectID() {
        return OBJECT_ID;
    }

    public static void registerInContext(Context ctx) {
        IntProto.registerInContext(ctx);
        ctx.registerProto(OBJECT_ID, IntProto.OBJECT_ID);
    }

    public int getValue() {
        return value;
    }

    @Override
    public Object toJavaObject() {
        return value;
    }

    public String toString() {
        return "" + value;
    }

    public static class IntProto extends PlainObj implements NativeObj {
        public static final Call NATIVE_CONSTRUCTOR = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj[] args) throws ClosureTerminatedException {
                // TODO: what about just returning args[0] as is?
                return new Int(((Int)args[0]).getValue());
            }
        };

        public static final Call nativeTo = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                int start = ((Int) context).value;
                int stop  = ((Int) args[0]).value;
                int step  = start < stop ? 1 : -1;


                Obj code = args[1];
                int i = start;
                System.out.println("start loop with: " + i);

                try {
                    engine.invokeInLoop(code, engine.getObjNull(), NativeWrapper.wrap(i));
                } catch (LoopBreakException e) {
                    return null;
                } catch (LoopContinueException e) {
                    // nothing to do here just proceed to next iteration
                }

                while (i != stop) {
                    try {
                        i += step;
                        engine.invokeInLoop(code, engine.getObjNull(), NativeWrapper.wrap(i));
                    } catch (LoopBreakException e) {
                        return null;
                    } catch (LoopContinueException e) {
                        // nothing to do here just proceed to next iteration
                    }
                }
                System.out.println("stop loop with: " + i);

                return null;
            }
        };

        private IntProto() {
            slots.put(Str.SYM_add, PrimitiveCall.Type.INT_ADD.primitive);
            slots.put(Str.SYM_sub, PrimitiveCall.Type.INT_SUB.primitive);
            slots.put(Str.SYM_mul, PrimitiveCall.Type.INT_MUL.primitive);
            slots.put(Str.SYM_div, PrimitiveCall.Type.INT_DIV.primitive);
            slots.put(Str.SYM_mod, PrimitiveCall.Type.INT_MOD.primitive);
            slots.put(Str.SYM_eq, PrimitiveCall.Type.INT_EQ.primitive);
            slots.put(Str.SYM_ne, PrimitiveCall.Type.INT_NE.primitive);
            slots.put(Str.SYM_gt, PrimitiveCall.Type.INT_GT.primitive);
            slots.put(Str.SYM_ge, PrimitiveCall.Type.INT_GE.primitive);
            slots.put(Str.SYM_lt, PrimitiveCall.Type.INT_LT.primitive);
            slots.put(Str.SYM_le, PrimitiveCall.Type.INT_LE.primitive);
            slots.put(Str.SYM_id, PrimitiveCall.Type.INT_EQ.primitive);
            slots.put(Str.SYM_ni, PrimitiveCall.Type.INT_NE.primitive);
            slots.put(Str.SYM_to, nativeTo);
        }

        public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

        public int getObjectID() {
            return OBJECT_ID;
        }

        public static void registerInContext(Context ctx) {
            Base.registerInContext(ctx);
            ctx.registerProto(OBJECT_ID, Base.OBJECT_ID);
            if (!ctx.hasObject(OBJECT_ID)) {
                ctx.registerObject(new IntProto());
            }
        }

        public Call getNativeConstructor() {
            return NATIVE_CONSTRUCTOR;
        }
    }
}
