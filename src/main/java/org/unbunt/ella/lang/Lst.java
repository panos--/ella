package org.unbunt.ella.lang;

import org.unbunt.ella.engine.context.Context;
import org.unbunt.ella.engine.corelang.*;
import static org.unbunt.ella.engine.corelang.ObjUtils.ensureType;
import org.unbunt.ella.exception.ClosureTerminatedException;
import org.unbunt.ella.exception.EllaRuntimeException;
import org.unbunt.ella.exception.LoopBreakException;
import org.unbunt.ella.exception.LoopContinueException;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an EllaScript object wrapping a List object.
 */
public class Lst extends AbstractObj {
    public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    protected final List<Obj> value;

    /**
     * Creates a new empty Lst.
     */
    public Lst() {
        this(10);
    }

    /**
     * Creates a new empty Lst with the given capacity
     * @param capacity the capacity.
     */
    public Lst(int capacity) {
        value = new ArrayList<Obj>(capacity);
    }

    /**
     * Creates a new Lst wrapping the given list.
     *
     * @param wrappedList the list to wrap.
     */
    public Lst(List<Obj> wrappedList) {
        this.value = wrappedList;
    }

    @SuppressWarnings({"CastToConcreteClass"})
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lst lst = (Lst) o;

        return value.equals(lst.value);

    }

    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public Object toJavaObject() {
        List<Object> result = new ArrayList<Object>(value.size());
        for (Obj obj : value) {
            result.add(obj.toJavaObject());
        }
        return result;
    }

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
        LstProto.registerInContext(ctx);
        ctx.registerProto(OBJECT_ID, LstProto.OBJECT_ID);
    }

    /**
     * Represents the implicit parent object for Lst objects.
     */
    public static class LstProto extends AbstractObj implements NativeObj {
        public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

        protected static final NativeCall NATIVE_CONSTRUCTOR = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                return new Lst();
            }
        };

        protected static final NativeCall nativeClone = NATIVE_CONSTRUCTOR;

        protected static final NativeCall nativeGet = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Lst thiz = ensureType(Lst.class, context);
                NNumeric idx = ensureType(NNumeric.class, args[0]);
                try {
                    return thiz.value.get(idx.intValue());
                } catch (IndexOutOfBoundsException e) {
                    throw new EllaRuntimeException(e);
                }
            }
        };

        protected static final NativeCall nativeSet = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Lst thiz = ensureType(Lst.class, context);
                NNumeric num = ensureType(NNumeric.class, args[0]);
                int idx = num.intValue();
                Obj value = args[1];
                try {
                    try {
                        thiz.value.set(idx, value);
                    } catch (IndexOutOfBoundsException e) {
                        if (idx == thiz.value.size()) {
                            thiz.value.add(value);
                        }
                        else {
                            throw new EllaRuntimeException(e);
                        }
                    }
                } catch (UnsupportedOperationException e) {
                    throw new EllaRuntimeException(e);
                } catch (ClassCastException e) {
                    throw new EllaRuntimeException(e);
                } catch (NullPointerException e) {
                    // NOTE: should not happen as script objects are never null
                    throw new EllaRuntimeException(e);
                } catch (IllegalArgumentException e) {
                    throw new EllaRuntimeException(e);
                } catch (IndexOutOfBoundsException e) {
                    throw new EllaRuntimeException(e);
                }
                return value;
            }
        };

        protected static final NativeCall nativeAdd = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Lst thiz = ensureType(Lst.class, context);
                Obj value = args[0];

                try {
                    thiz.value.add(value);
                } catch (UnsupportedOperationException e) {
                    throw new EllaRuntimeException(e);
                } catch (ClassCastException e) {
                    throw new EllaRuntimeException(e);
                } catch (NullPointerException e) {
                    // NOTE: should not happen as script objects are never null
                    throw new EllaRuntimeException(e);
                } catch (IllegalArgumentException e) {
                    throw new EllaRuntimeException(e);
                }

                return thiz;
            }
        };

        protected static final NativeCall nativeAddAll = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) {
                Lst thiz = ensureType(Lst.class, context);
                Lst values = ensureType(Lst.class, args[0]);

                try {
                    thiz.value.addAll(values.value);
                } catch (UnsupportedOperationException e) {
                    throw new EllaRuntimeException(e);
                } catch (ClassCastException e) {
                    throw new EllaRuntimeException(e);
                } catch (NullPointerException e) {
                    // NOTE: should not happen as script objects are never null
                    throw new EllaRuntimeException(e);
                } catch (IllegalArgumentException e) {
                    throw new EllaRuntimeException(e);
                }

                return thiz;
            }
        };

        protected static final NativeCall nativeRemove = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Lst thiz = ensureType(Lst.class, context);
                NNumeric idx = ensureType(NNumeric.class, args[0]);

                try {
                    return thiz.value.remove(idx.intValue());
                } catch (UnsupportedOperationException e) {
                    throw new EllaRuntimeException(e);
                } catch (IndexOutOfBoundsException e) {
                    throw new EllaRuntimeException(e);
                }
            }
        };

        protected static final NativeCall nativeEach = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Lst thiz = ensureType(Lst.class, context);
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

        protected static final NativeCall nativeSize = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Lst thiz = ensureType(Lst.class, context);
                return new NNum(thiz.value.size());
            }
        };

        /**
         * TODO: Write unit test
         */
        protected static final NativeCall nativeJoin = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) {
                Lst thiz = ensureType(Lst.class, context);
                String joiner = args[0].toString();
                StringBuilder buf = new StringBuilder();
                for (Obj obj : thiz.value) {
                    if (buf.length() > 0) {
                        buf.append(joiner);
                    }
                    buf.append(obj.toString());
                }
                return new Str(buf.toString());
            }
        };

        /**
         * TODO: Write unit test
         */
        protected static final NativeCall nativeMap = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) {
                Lst thiz = ensureType(Lst.class, context);
                Obj call = args[0];
                for (int i = 0; i < thiz.value.size(); i++) {
                    try {
                        thiz.value.set(i, engine.invokeInLoop(call, thiz, thiz.value.get(i)));
                    } catch (LoopBreakException e) {
                        break;
                    } catch (LoopContinueException e) {
                        continue;
                    }
                }
                return thiz;
            }
        };

        protected static final NativeCall nativeFilter = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) {
                Lst thiz = ensureType(Lst.class, context);
                Obj trueObj = engine.getObjTrue();
                Obj call = args[0];
                Lst result = new Lst(thiz.value.size());
                for (Obj obj : thiz.value) {
                    try {
                        if (trueObj.equals(engine.invokeInLoop(call, thiz, obj))) {
                            result.value.add(obj);
                        }
                    } catch (LoopBreakException e) {
                        break;
                    } catch (LoopContinueException e) {
                        continue;
                    }
                }
                return result;
            }
        };

        private LstProto() {
            slots.put(Str.SYM_clone, nativeClone);
            slots.put(Str.SYM_get, nativeGet);
            slots.put(Str.SYM_set, nativeSet);
            slots.put(Str.SYM_add, nativeAdd);
            slots.put(Str.SYM_addAll, nativeAddAll);
            slots.put(Str.SYM_remove, nativeRemove);
            slots.put(Str.SYM_size, nativeSize);
            slots.put(Str.SYM_each, nativeEach);
            slots.put(Str.SYM_join, nativeJoin);
            slots.put(Str.SYM_map, nativeMap);
            slots.put(Str.SYM_filter, nativeFilter);
        }

        public Call getNativeConstructor() {
            return NATIVE_CONSTRUCTOR;
        }

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
            Base.registerInContext(ctx);
            ctx.registerProto(OBJECT_ID, Base.OBJECT_ID);
            ctx.registerObject(new LstProto());
        }
    }
}
