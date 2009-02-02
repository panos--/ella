package org.unbunt.sqlscript.commands;

import org.unbunt.sqlscript.SQLScriptContext;
import org.unbunt.sqlscript.exception.CommandFailedException;
import org.unbunt.sqlscript.exception.IllegalCommandArgumentsException;
import org.unbunt.sqlscript.support.Parameters;

import java.sql.Connection;

public class AliasConnectionCommand implements Command, ConnectionRequired {
    protected Connection conn;

    public void execute(SQLScriptContext ctx, Parameters params) throws CommandFailedException {
        String alias = params.getValue("alias");
        if (alias == null) {
            throw new IllegalCommandArgumentsException("Missing required parameter: alias");
        }
        ctx.setConnection(alias, conn);
    }

    public void setConnection(Connection conn) {
        this.conn = conn;
    }
}
