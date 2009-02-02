package org.unbunt.sqlscript.commands;

import java.sql.Connection;

public interface ConnectionRequired {
    public void setConnection(Connection conn);
}
