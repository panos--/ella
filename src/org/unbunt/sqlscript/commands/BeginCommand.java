package org.unbunt.sqlscript.commands;

import org.unbunt.sqlscript.SQLScriptContext;
import org.unbunt.sqlscript.exception.CommandFailedException;
import org.unbunt.sqlscript.support.Parameters;

import java.sql.Connection;
import java.sql.SQLException;

public class BeginCommand implements Command, ConnectionRequired {
    protected Connection conn;

    public void execute(SQLScriptContext ctx, Parameters params) throws CommandFailedException {
        try {
            conn.setAutoCommit(false);
        } catch (SQLException e) {
            throw new CommandFailedException("Starting transaction failed: " + e.getMessage(), e);
        }
    }

    public void setConnection(Connection conn) {
        this.conn = conn;
    }
}
