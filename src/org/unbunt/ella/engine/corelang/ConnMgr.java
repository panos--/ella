package org.unbunt.ella.engine.corelang;

import java.sql.Connection;
import java.util.Set;

public interface ConnMgr extends Obj {
    Obj activate(Connection connection);

    Obj activate(Obj conn);

    Set<Connection> getConnections();
}
