package org.unbunt.sqlscript.commands;

import org.unbunt.sqlscript.SQLScriptContext;
import org.unbunt.sqlscript.exception.CommandFailedException;
import org.unbunt.sqlscript.support.Parameters;

import java.sql.Connection;
import java.sql.SQLException;

public class TestTXStatusCommand implements Command, ConnectionRequired {
    protected Connection conn = null;

    public void execute(SQLScriptContext ctx, Parameters params) throws CommandFailedException {
        try {
            boolean ac = conn.getAutoCommit();
            if (ac) {
                System.out.println("Auto-commit active - not inside transaction");
            }
            else {
                System.out.println("Auto-commit disabled - inside transaction");
            }
        } catch (SQLException e) {
            throw new CommandFailedException(e.getMessage(), e);
        }
    }

    public void setConnection(Connection conn) {
        this.conn = conn;
    }
}
