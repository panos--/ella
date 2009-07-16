package org.unbunt.sqlscript.lang.sql;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;
import org.unbunt.sqlscript.exception.DBConnectionFailedException;
import org.unbunt.sqlscript.exception.SQLScriptRuntimeException;
import org.unbunt.sqlscript.lang.*;
import org.unbunt.sqlscript.support.Context;
import org.unbunt.sqlscript.support.ProtoRegistry;
import org.unbunt.sqlscript.utils.DBUtils;
import org.unbunt.sqlscript.utils.ObjUtils;
import static org.unbunt.sqlscript.utils.ObjUtils.ensureType;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnMgr extends PlainObj {
    public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    /**
     * Forwards a slot call to another object
     */
    protected static class NativeCallProxy extends NativeCall {
        protected Obj slot;

        public NativeCallProxy(Obj slot) {
            this.slot = slot;
        }

        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            Obj activeConn = context.getSlot(engine.getContext(), Str.SYM_active);
            if (activeConn instanceof Null) {
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

    protected static NativeCall nativeActivate = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            ConnMgr thiz = ObjUtils.ensureType(context);
            Obj conn = args[0];
            Obj prevConn = ObjUtils.getSlot(engine.getContext(), thiz, Str.SYM_active);
            ObjUtils.setSlot(engine.getContext(), thiz, Str.SYM_active, conn);
            return prevConn == null ? engine.getObjNull() : prevConn;
        }
    };

    protected static NativeCall nativeCreate = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            ConnMgr mgr = ensureType(context);

            Str url;
            Str user = null;
            Str pass = null;
            Str driver = null;
            switch (args.length) {
                case 1:
                    url = ensureType(args[0]);
                    break;
                case 2:
                    url = ensureType(args[0]);
                    driver = ensureType(args[1]);
                    break;
                case 3:
                    url = ensureType(args[0]);
                    user = ensureType(args[1]);
                    pass = ensureType(args[2]);
                    break;
                case 4:
                    url = ensureType(args[0]);
                    user = ensureType(args[1]);
                    pass = ensureType(args[2]);
                    driver = ensureType(args[3]);
                    break;
                default:
                    throw new SQLScriptRuntimeException("Illegal arguments");
            }

            DriverManagerDataSource ds;
            try {
                ds = DBUtils.createDataSource(url.value,
                                              user == null ? null : user.value,
                                              pass == null ? null : pass.value,
                                              driver == null ? null : driver.value);
            } catch (DBConnectionFailedException e) {
                throw new SQLScriptRuntimeException("Connection failed: " + e.getMessage(), e);
            }

            Connection jdbcConn;
            try {
                jdbcConn = ds.getConnection();
            } catch (SQLException e) {
                throw new SQLScriptRuntimeException("Connection failed: " + e.getMessage(), e);
            }

            Conn conn = new Conn(jdbcConn);

            // Activate connection if none active yet
            if (mgr.getSlot(engine.getContext(), Str.SYM_active) == null) {
                mgr.setSlot(engine.getContext(), Str.SYM_active, conn);
            }

            return conn;
        }
    };

    protected static NativeCall nativeCreateFromProps = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            ConnMgr mgr = ensureType(context);

            // TODO: make propsFile relative to current script file
            Str propsFile;
            Str user = null;
            Str pass = null;
            Str driver = null;
            switch (args.length) {
                case 1:
                    propsFile = ensureType(args[0]);
                    break;
                case 2:
                    propsFile = ensureType(args[0]);
                    driver = ensureType(args[1]);
                    break;
                case 3:
                    propsFile = ensureType(args[0]);
                    user = ensureType(args[1]);
                    pass = ensureType(args[2]);
                    break;
                case 4:
                    propsFile = ensureType(args[0]);
                    user = ensureType(args[1]);
                    pass = ensureType(args[2]);
                    driver = ensureType(args[3]);
                    break;
                default:
                    throw new SQLScriptRuntimeException("Illegal arguments");
            }

            DriverManagerDataSource ds;
            try {
                ds = DBUtils.createDataSourceFromProps(propsFile.value,
                                                       user == null ? null : user.value,
                                                       pass == null ? null : pass.value,
                                                       driver == null ? null : driver.value);
            } catch (DBConnectionFailedException e) {
                throw new SQLScriptRuntimeException("Connection failed: " + e.getMessage(), e);
            }

            Connection jdbcConn;
            try {
                jdbcConn = ds.getConnection();
            } catch (SQLException e) {
                throw new SQLScriptRuntimeException("Connection failed: " + e.getMessage(), e);
            }

            Conn conn = new Conn(jdbcConn);

            // Activate connection if none active yet
            if (mgr.getSlot(engine.getContext(), Str.SYM_active) instanceof Null) {
                mgr.setSlot(engine.getContext(), Str.SYM_active, conn);
            }

            return conn;
        }
    };

    public ConnMgr(Context ctx) {
        slots.put(Str.SYM_active, ctx.getObjNull());
        slots.put(Str.SYM_activate, nativeActivate);
        slots.put(Str.SYM_create, nativeCreate);
        slots.put(Str.SYM_createFromProps, nativeCreateFromProps);
    }

    /**
     * Activates the given connection creating a wrapping Conn instance.
     *
     * @param connection the connection to activate
     * @return the values previously associated with the active connection slot in the ConnMgr object
     */
    public Obj activate(Connection connection) {
        return activate(new Conn(connection));
    }

    /**
     * Activates the given connection.
     *
     * @param conn the connection to activate
     * @return the values previously associated with the active connection slot in the ConnMgr object
     */
    public Obj activate(Obj conn) {
        return slots.put(Str.SYM_active, conn);
    }

    /**
     * Overrides the method from superclass to return a proxy for all slots not found directly in this object's
     * slots property. The proxy forwards all calls to the active connection object.
     * NOTE: Currently only method calls can be forwarded - forwarding property accesses does not work.
     *
     * @param ctx the current execution context
     * @param key the slot to retrieve
     * @return the slot's value or a proxy to the active connection
     */
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
        ctx.registerObject(new ConnMgr(ctx));
    }
}
