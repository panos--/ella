package org.unbunt.sqlscript.lang.sql;

import org.unbunt.sqlscript.lang.*;
import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.support.ProtoRegistry;
import org.unbunt.sqlscript.support.Context;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;

public class ConnMgr extends PlainObj {
    protected static final NativeCall nativeExecStmt = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            System.out.println("Would execute sql statement: " + args[0]);
            return null;
        }
    };

    protected static final NativeCall nativeCreateStmt = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            System.out.println("Would create sql statement: " + args[0]);
            return null;
        }
    };

    public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    @Override
    public int getObjectID() {
        return OBJECT_ID;
    }

    public static void registerInContext(Context ctx) {
        Base.registerInContext(ctx);
        ctx.registerProto(OBJECT_ID, Base.OBJECT_ID);
        ctx.registerObject(new ConnMgr());
    }

    public ConnMgr() {
        slots.put(Str.SYM_execStmt, nativeExecStmt);
        slots.put(Str.SYM_createStmt, nativeCreateStmt);
    }
}
