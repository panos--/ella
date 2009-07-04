package org.unbunt.sqlscript.lang.sql;

import org.unbunt.sqlscript.lang.*;
import org.unbunt.sqlscript.support.ProtoRegistry;
import org.unbunt.sqlscript.support.Context;
import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.utils.ObjUtils;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;

import java.sql.Connection;

public class Conn extends PlainObj {
    public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    protected Connection connection = null;

    public Conn() {
    }

    @Override
    public int getObjectID() {
        return OBJECT_ID;
    }

    public static void registerInContext(Context ctx) {
        ConnProto.registerInContext(ctx);
        ctx.registerProto(OBJECT_ID, ConnProto.OBJECT_ID);
    }

    public static class ConnProto extends PlainObj {

        protected static final NativeCall nativeExecStmt = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                System.out.println("Would execute sql statement: " + args[0]);
                return null;
            }
        };

        protected static final NativeCall nativeCreateStmt = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                System.out.println("Creating sql statement: " + args[0]);
                Conn conn = ObjUtils.ensureType(context);
                RawSQL stmt = ObjUtils.ensureType(args[0]);
                return new Stmt(stmt, conn.connection, true);
            }
        };

        private ConnProto() {
            slots.put(Str.SYM_execStmt, nativeExecStmt);
            slots.put(Str.SYM_createStmt, nativeCreateStmt);
        }

        public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

        @Override
        public int getObjectID() {
            return OBJECT_ID;
        }

        public static void registerInContext(Context ctx) {
            Base.registerInContext(ctx);
            ctx.registerProto(OBJECT_ID, Base.OBJECT_ID);
            ctx.registerObject(new ConnProto());
        }
    }
}
