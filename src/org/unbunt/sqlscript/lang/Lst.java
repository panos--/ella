package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.support.ProtoRegistry;
import org.unbunt.sqlscript.support.Context;
import org.unbunt.sqlscript.support.NativeWrapper;
import org.unbunt.sqlscript.SQLScriptEngine;
import static org.unbunt.sqlscript.utils.ObjUtils.ensureType;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;
import org.unbunt.sqlscript.exception.SQLScriptRuntimeException;
import org.unbunt.sqlscript.exception.LoopContinueException;
import org.unbunt.sqlscript.exception.LoopBreakException;

import java.util.List;
import java.util.ArrayList;

public class Lst extends PlainObj {
    public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    protected final List<Obj> value;

    public Lst() {
        this(10);
    }

    public Lst(int capacity) {
        value = new ArrayList<Obj>(capacity);
    }

    public Lst(List<Obj> wrappedList) {
        this.value = wrappedList;
    }

    @Override
    public Object toJavaObject() {
        return value;
    }

    @Override
    public int getObjectID() {
        return OBJECT_ID;
    }

    public static void registerInContext(Context ctx) {
        LstProto.registerInContext(ctx);
        ctx.registerProto(OBJECT_ID, LstProto.OBJECT_ID);
    }

    protected static class LstProto extends PlainObj {
        public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

        protected static final NativeCall nativeGet = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Lst thiz = ensureType(context);
                NNumeric idx = ensureType(args[0]);
                try {
                    return thiz.value.get(idx.intValue());
                } catch (IndexOutOfBoundsException e) {
                    throw new SQLScriptRuntimeException(e);
                }
            }
        };

        protected static final NativeCall nativeSet = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Lst thiz = ensureType(context);
                NNumeric num = ensureType(args[0]);
                int idx = num.intValue();
                Obj value = args[1];
                try {
                    thiz.value.set(idx, value);
                } catch (IndexOutOfBoundsException e) {
                    if (idx == thiz.value.size()) {
                        thiz.value.add(value);
                    }
                    else {
                        throw new SQLScriptRuntimeException(e);
                    }
                }
                return thiz;
            }
        };

        protected static final NativeCall nativeAdd = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Lst thiz = ensureType(context);
                Obj value = args[0];
                thiz.value.add(value);
                return thiz;
            }
        };

        protected static final NativeCall nativeEach = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Lst thiz = ensureType(context);
                Obj closure = args[0];
                Obj _null = engine.getObjNull();

                int closureArgs = 2;
                try {
                    closureArgs = ((Clos) closure).getClosure().getArgCount();
                } catch (ClassCastException ignored) {
                    // may also be another callable - we provide all arguments for them
                }

                if (closureArgs == 1) {
                    for (Obj obj : thiz.value) {
                        try {
                            engine.invokeInLoop(closure, _null, obj);
                        } catch (LoopContinueException e) {
                            continue;
                        } catch (LoopBreakException e) {
                            break;
                        }
                    }
                }
                else {
                    int size = thiz.value.size();
                    List<Obj> list = thiz.value;
                    for (int i = 0; i < size; i++) {
                        try {
                            engine.invokeInLoop(closure, _null, NativeWrapper.wrap(i), list.get(i));
                        } catch (LoopContinueException e) {
                            continue;
                        } catch (LoopBreakException e) {
                            break;
                        }
                    }
                }

                return null;
            }
        };

        private LstProto() {
            slots.put(Str.SYM_get, nativeGet);
            slots.put(Str.SYM_set, nativeSet);
            slots.put(Str.SYM_add, nativeAdd);
            slots.put(Str.SYM_each, nativeEach);
        }

        @Override
        public int getObjectID() {
            return OBJECT_ID;
        }

        public static void registerInContext(Context ctx) {
            Base.registerInContext(ctx);
            ctx.registerProto(OBJECT_ID, Base.OBJECT_ID);
            ctx.registerObject(new LstProto());
        }
    }
}
