/* ConnMgrImpl.java
   Copyright (C) 2009, 2010 Thomas Weiß <panos@unbunt.org>

This file is part of the Ella scripting language interpreter.

Ella is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2, or (at your option)
any later version.

Ella is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License
along with Ella; see the file COPYING.  If not, write to the
Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
02110-1301 USA.

Linking this library statically or dynamically with other modules is
making a combined work based on this library.  Thus, the terms and
conditions of the GNU General Public License cover the whole
combination.

As a special exception, the copyright holders of this library give you
permission to link this library with independent modules to produce an
executable, regardless of the license terms of these independent
modules, and to copy and distribute the resulting executable under
terms of your choice, provided that you also meet, for each linked
independent module, the terms and conditions of the license of that
module.  An independent module is a module which is not derived from
or based on this library.  If you modify this library, you may extend
this exception to your version of the library, but you are not
obligated to do so.  If you do not wish to do so, delete this
exception statement from your version. */

package org.unbunt.ella.lang.sql;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.unbunt.ella.engine.context.Context;
import org.unbunt.ella.engine.corelang.*;
import static org.unbunt.ella.engine.corelang.ObjUtils.ensureType;
import org.unbunt.ella.exception.ClosureTerminatedException;
import org.unbunt.ella.exception.DBConnectionFailedException;
import org.unbunt.ella.exception.EllaRuntimeException;
import org.unbunt.ella.lang.Base;
import org.unbunt.ella.lang.NullImpl;
import org.unbunt.ella.lang.Str;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

/**
 * Represents a default implementation of the EllaScript core object <code>ConnMgr</code>.
 */
public class ConnMgrImpl extends AbstractObj implements ConnMgr {
    public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    protected Set<Connection> connections = new HashSet<Connection>();

    /**
     * Forwards a slot call to another object
     */
    protected static class NativeCallProxy extends NativeCall {
        protected Obj slot;

        public NativeCallProxy(Obj slot) {
            this.slot = slot;
        }

        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            Obj activeConn = context.getSlot(engine.getContext(), Str.SYM_active);
            if (activeConn instanceof Null) {
                throw new EllaRuntimeException("Not conntected");
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
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            ConnMgrImpl thiz = ensureType(ConnMgrImpl.class, context);
            Obj conn = args[0];
            Obj prevConn = ObjUtils.getSlot(engine.getContext(), thiz, Str.SYM_active);
            ObjUtils.setSlot(engine.getContext(), thiz, Str.SYM_active, conn);
            return prevConn == null ? engine.getObjNull() : prevConn;
        }
    };

    protected static NativeCall nativeCreate = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            ConnMgrImpl mgr = ensureType(ConnMgrImpl.class, context);

            Str url;
            Str user = null;
            Str pass = null;
            Str driver = null;
            switch (args.length) {
                case 1:
                    url = ensureType(Str.class, args[0]);
                    break;
                case 2:
                    url = ensureType(Str.class, args[0]);
                    driver = ensureType(Str.class, args[1]);
                    break;
                case 3:
                    url = ensureType(Str.class, args[0]);
                    user = ensureType(Str.class, args[1]);
                    pass = ensureType(Str.class, args[2]);
                    break;
                case 4:
                    url = ensureType(Str.class, args[0]);
                    user = ensureType(Str.class, args[1]);
                    pass = ensureType(Str.class, args[2]);
                    driver = ensureType(Str.class, args[3]);
                    break;
                default:
                    throw new EllaRuntimeException("Illegal arguments");
            }

            DriverManagerDataSource ds;
            try {
                ds = DBUtils.createDataSource(url.value,
                                              user == null ? null : user.value,
                                              pass == null ? null : pass.value,
                                              driver == null ? null : driver.value);
            } catch (DBConnectionFailedException e) {
                throw new EllaRuntimeException("Connection failed: " + e.getMessage(), e);
            }

            Connection jdbcConn;
            try {
                jdbcConn = ds.getConnection();
            } catch (SQLException e) {
                throw new EllaRuntimeException("Connection failed: " + e.getMessage(), e);
            }

            Conn conn = new Conn(jdbcConn);

            // Activate connection if none active yet
            if (mgr.getSlot(engine.getContext(), Str.SYM_active) instanceof Null) {
                mgr.setSlot(engine.getContext(), Str.SYM_active, conn);
            }

            return conn;
        }
    };

    protected static NativeCall nativeCreateFromProps = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            ConnMgrImpl thiz = ensureType(ConnMgrImpl.class, context);

            // TODO: make propsFile relative to current script file
            Str propsFile;
            Str user = null;
            Str pass = null;
            Str driver = null;
            switch (args.length) {
                case 1:
                    propsFile = ensureType(Str.class, args[0]);
                    break;
                case 2:
                    propsFile = ensureType(Str.class, args[0]);
                    driver = ensureType(Str.class, args[1]);
                    break;
                case 3:
                    propsFile = ensureType(Str.class, args[0]);
                    user = ensureType(Str.class, args[1]);
                    pass = ensureType(Str.class, args[2]);
                    break;
                case 4:
                    propsFile = ensureType(Str.class, args[0]);
                    user = ensureType(Str.class, args[1]);
                    pass = ensureType(Str.class, args[2]);
                    driver = ensureType(Str.class, args[3]);
                    break;
                default:
                    throw new EllaRuntimeException("Illegal arguments");
            }

            DriverManagerDataSource ds;
            try {
                ds = DBUtils.createDataSourceFromProps(propsFile.value,
                                                       user == null ? null : user.value,
                                                       pass == null ? null : pass.value,
                                                       driver == null ? null : driver.value);
            } catch (DBConnectionFailedException e) {
                throw new EllaRuntimeException("Connection failed: " + e.getMessage(), e);
            }

            Connection jdbcConn;
            try {
                jdbcConn = ds.getConnection();
            } catch (SQLException e) {
                throw new EllaRuntimeException("Connection failed: " + e.getMessage(), e);
            }

            Conn conn = new Conn(jdbcConn);

            // Activate connection if none active yet
            if (thiz.getSlot(engine.getContext(), Str.SYM_active) instanceof Null) {
                thiz.setSlot(engine.getContext(), Str.SYM_active, conn);
            }

            thiz.connections.add(jdbcConn);

            return conn;
        }
    };

    /**
     * Creates a new connection manager.
     */
    public ConnMgrImpl() {
        slots.put(Str.SYM_active, new NullImpl());
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

    public Obj activate(Connection connection, StmtBatch batch) {
        return activate(new Conn(connection, batch));
    }

    /**
     * Activates the given connection.
     *
     * @param conn the connection to activate
     * @return the values previously associated with the active connection slot in the ConnMgr object
     */
    public Obj activate(Obj conn) {
        assert conn != null;
        return slots.put(Str.SYM_active, conn);
    }

    public Set<Connection> getConnections() {
        return connections;
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

    /**
     * Registers this EllaScript object within the given execution context.
     *
     * @param ctx the execution context to register this object in.
     */
    public static void registerInContext(Context ctx) {
        Base.registerInContext(ctx);
        ctx.registerProto(OBJECT_ID, Base.OBJECT_ID);
        ctx.registerObject(new ConnMgrImpl());
    }
}
