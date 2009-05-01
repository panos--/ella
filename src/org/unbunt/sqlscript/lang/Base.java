package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;

import java.util.Map;

public class Base extends AbstractObj {
    public static final Base instance = new Base();

    protected static final Call nativeEach = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            if (context == null) {
                return Null.instance;
            }

            Obj call = args[0];
            for (Map.Entry<Obj, Obj> entry : context.getSlots().entrySet()) {
                engine.invoke(call, context, entry.getKey(), entry.getValue());
            }

            return context;
        }
    };

    protected static final Call nativeEachSlot = nativeEach;

    private Base() {
    }

    /**
     * Helper for deferred initialization.
     *
     * There is a circular dependancy between Base and Str classes, where Base requires Str to setup slots
     * and Str depends on Base as it's parent. Therefore the default ctor of Base does nothing. The actual
     * initialization is then triggerd by Str class as soon as it is ready.
     */
    protected static void initialize() {
        instance.slots.put(Str.Sym._id.str, PrimitiveCall.Type.ID.primitive);
        instance.slots.put(Str.Sym._ni.str, PrimitiveCall.Type.NI.primitive);
        instance.slots.put(Str.Sym.each.str, nativeEach);
        instance.slots.put(Str.Sym.eachSlot.str, nativeEachSlot);
    }

    public Obj getParent() {
        return null; // Base, by definition, has no parent
    }
}
