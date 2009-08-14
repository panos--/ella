package org.unbunt.ella.lang;

import org.unbunt.ella.engine.context.Context;
import org.unbunt.ella.engine.corelang.Engine;
import org.unbunt.ella.engine.corelang.*;
import static org.unbunt.ella.engine.corelang.ObjUtils.ensureType;
import org.unbunt.ella.exception.CheckedClassCastException;
import org.unbunt.ella.exception.ClosureTerminatedException;
import org.unbunt.ella.exception.EllaRuntimeException;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class JMethod extends NativeCall {
    public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    public final Method[] methods;

    /**
     * Specifies if this method wrapped by this object was explicitly selected.
     * If this is the case, conversions causing potential information loss
     * (e.g. long to int) are activated for calls to this method.
     */
    protected final boolean selected;

    public JMethod(Method[] methods) {
        this(methods, false);
    }

    private JMethod(Method[] methods, boolean selected) {
        this.methods = methods;
        this.selected = selected;
    }

    public Obj call(Engine engine, Obj context, Obj[] args) throws ClosureTerminatedException {
        Object jcontext = context.toJavaObject();
        Object[] jargs = NativeWrapper.unwrap(args);

        try {
            Method method;
            if (methods.length == 1) {
                method = methods[0];
                if (selected) {
                    jargs = ReflectionUtils.adaptTypes(method, jargs);
                }
            }
            else {
                method = ReflectionUtils.findMatchingMethod(methods, ReflectionUtils.getArgTypes(jargs, args), jargs);
            }
            if (method == null) {
                throw new EllaRuntimeException("No such method");
            }
            return ReflectionUtils.invokeMethod(engine.getContext(), method, jcontext, jargs);
        } catch (IllegalArgumentException e) {
            throw new EllaRuntimeException("No such method: " + e.getMessage(), e);
        } catch (RuntimeException e) {
            throw new EllaRuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new EllaRuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new EllaRuntimeException(e);
        } catch (CheckedClassCastException e) {
            throw new EllaRuntimeException("Argument conversion failed: " + e.getMessage(), e);
        }
    }

    @Override
    public Object toJavaObject() {
        return methods;
    }

    @Override
    public int getObjectID() {
        return OBJECT_ID;
    }

    public static void registerInContext(Context ctx) {
        JMethodProto.registerInContext(ctx);
        ctx.registerProto(OBJECT_ID, JMethodProto.OBJECT_ID);
    }

    protected static class JMethodProto extends AbstractObj {
        public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

        protected static final NativeCall nativeSelect = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                JMethod thiz = ensureType(JMethod.class, context);
                String[] typeNames = new String[args.length];
                for (int i = 0; i < args.length; i++) {
                    Obj arg = args[i];
                    if (arg instanceof Null) {
                        typeNames[i] = null;
                    }
                    else {
                        typeNames[i] = arg.toString();
                    }
                }
                Method[] selectedMethods = ReflectionUtils.selectMethods(thiz.methods, typeNames);
                if (selectedMethods.length == 0) {
                    throw new EllaRuntimeException("No such method");
                }
                return new JMethod(selectedMethods, true);
            }
        };

        protected static final NativeCall nativeCall = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                JMethod thiz = ensureType(JMethod.class, context);
                Obj[] methodArgs = Arrays.copyOfRange(args, 1, args.length);
                return thiz.call(engine, args[0], methodArgs);
            }
        };

        private JMethodProto() {
            slots.put(Str.SYM_select, nativeSelect);
            slots.put(Str.SYM_call, nativeCall);
        }

        @Override
        public int getObjectID() {
            return OBJECT_ID;
        }

        public static void registerInContext(Context ctx) {
            Base.registerInContext(ctx);
            ctx.registerProto(OBJECT_ID, Base.OBJECT_ID);
            ctx.registerObject(new JMethodProto());
        }
    }
}
