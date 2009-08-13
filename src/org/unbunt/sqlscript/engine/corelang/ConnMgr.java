package org.unbunt.sqlscript.engine.corelang;

import java.sql.Connection;

public interface ConnMgr extends Obj {
    Obj activate(Connection connection);

    Obj activate(Obj conn);
}
