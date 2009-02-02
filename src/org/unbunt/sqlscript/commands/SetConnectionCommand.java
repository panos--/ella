package org.unbunt.sqlscript.commands;

import org.unbunt.sqlscript.SQLScriptContext;
import org.unbunt.sqlscript.exception.CommandFailedException;
import org.unbunt.sqlscript.exception.IllegalCommandArgumentsException;
import org.unbunt.sqlscript.support.Parameters;

import javax.sql.DataSource;
import java.sql.Connection;

public class SetConnectionCommand implements Command {
    public void execute(SQLScriptContext ctx, Parameters params) throws CommandFailedException {
        String alias = params.getValue("alias");
        if (alias == null) {
            throw new IllegalCommandArgumentsException("Missing required parameter: alias");
        }

        Connection conn = ctx.getConnection(alias);
        if (conn != null) {
            ctx.setConnection(conn);
            return;
        }

        DataSource ds = ctx.getDataSource(alias);
        if (ds == null) {
            throw new CommandFailedException("No such connection: " + alias);
        }

        ctx.setDataSource(ds);
        ctx.setConnection(null);
    }
}
