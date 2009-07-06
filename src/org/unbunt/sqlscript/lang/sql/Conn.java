package org.unbunt.sqlscript.lang.sql;

import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;
import org.unbunt.sqlscript.exception.SQLScriptRuntimeException;
import org.unbunt.sqlscript.lang.*;
import org.unbunt.sqlscript.support.Context;
import org.unbunt.sqlscript.support.ProtoRegistry;
import org.unbunt.sqlscript.utils.ObjUtils;
import static org.unbunt.sqlscript.utils.ObjUtils.ensureType;

import java.sql.Connection;
import java.sql.SQLException;

public class Conn extends PlainObj {
    public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    protected Connection connection;

    public Conn(Connection connection) {
        this.connection = connection;
    }

    @Override
    public int getObjectID() {
        return OBJECT_ID;
    }

    public static void registerInContext(Context ctx) {
        ConnProto.registerInContext(ctx);
        ctx.registerProto(OBJECT_ID, ConnProto.OBJECT_ID);
    }

    @Override
    public Object toJavaObject() {
        return connection;
    }

    public static class ConnProto extends PlainObj {

        protected static final NativeCall nativeExecStmt = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                System.out.println("Would execute sql statement: " + args[0]);
                Conn thiz = ensureType(context);
                RawSQL rawStmt = ensureType(args[0]);
                Stmt stmt = new Stmt(rawStmt, thiz.connection, true);
                return engine.invokeSlot(stmt, Str.SYM_do);
            }
        };

        protected static final NativeCall nativeCreateStmt = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                System.out.println("Creating sql statement: " + args[0]);
                Conn thiz = ensureType(context);
                RawSQL stmt = ensureType(args[0]);
                return new Stmt(stmt, thiz.connection, true);
            }
        };

        protected static final NativeCall nativeDo = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                ConnMgr mgr = engine.getObjConnMgr();
                Conn thiz = ensureType(context);

                // active this conn
                Obj prevConn = engine.invokeSlot(mgr, Str.SYM_activate, thiz);

                // invoke given block
                engine.invoke(args[0], thiz);

                // restore previous conn
                engine.invokeSlot(mgr, Str.SYM_activate, prevConn);

                // don't return value to preserve last value of invoked block
                return null;
            }
        };

        protected static final NativeCall nativeClose = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Conn thiz = ensureType(context);
                try {
                    thiz.connection.close();
                } catch (SQLException e) {
                    throw new SQLScriptRuntimeException(e.getMessage(), e);
                }
                return engine.getObjNull();
            }
        };

        private ConnProto() {
            slots.put(Str.SYM_execStmt, nativeExecStmt);
            slots.put(Str.SYM_createStmt, nativeCreateStmt);
            slots.put(Str.SYM_do, nativeDo);
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
