package org.unbunt.sqlscript.lang.sql;

import org.unbunt.sqlscript.lang.*;
import org.unbunt.sqlscript.support.Context;
import org.unbunt.sqlscript.support.ProtoRegistry;
import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.utils.ObjUtils;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;
import org.unbunt.sqlscript.exception.SQLScriptRuntimeException;

public class ConnMgr extends PlainObj {
    public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    protected static class NativeCallProxy extends NativeCall {
        protected Obj slot;

        public NativeCallProxy(Obj slot) {
            this.slot = slot;
        }

        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            Obj activeConn = context.getSlot(engine.getContext(), Str.SYM_active);
            if (activeConn == null) {
                throw new SQLScriptRuntimeException("Not conntected");
            }

            Obj connSlot = ObjUtils.getSlot(engine.getContext(), activeConn, slot);
            if (connSlot == null) {
                connSlot = engine.getObjNull();
            }

            engine.trigger(connSlot, activeConn, args);

            return null;
        }
    }

    public ConnMgr() {
        // FIXME: Dummy
        slots.put(Str.SYM_active, new Conn());
    }

    @Override
    public Obj getSlot(Context ctx, Obj key) {
        Obj value = slots.get(key);
        if (value != null) {
            return value;
        }

        return new NativeCallProxy(key);
    }

    @Override
    public int getObjectID() {
        return OBJECT_ID;
    }

    public static void registerInContext(Context ctx) {
        Base.registerInContext(ctx);
        ctx.registerProto(OBJECT_ID, Base.OBJECT_ID);
        ctx.registerObject(new ConnMgr());
    }
}
