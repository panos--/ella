package org.unbunt.ella.engine.corelang;

import org.unbunt.ella.lang.sql.StmtBatch;

import java.sql.Connection;
import java.util.Set;

/**
 * The core object representing the connection manager.
 */
public interface ConnMgr extends Obj {
    /**
     * Activates the given connection.
     *
     * @param connection the connection to activate.
     * @return the previously active connection.
     */
    Obj activate(Connection connection);

    /**
     * Activates the given connection in batch mode.
     *
     * @param connection the connection to activate.
     * @param batch the batch processor.
     * @return the previously active connection.
     */
    Obj activate(Connection connection, StmtBatch batch);

    /**
     * Activates the given connection.
     *
     * @param conn the connection to activate.
     * @return the previously active connection.
     */
    Obj activate(Obj conn);

    /**
     * Returns the connections known to this connection manager.
     *
     * @return the connections known to this connection manager.
     */
    Set<Connection> getConnections();
}
