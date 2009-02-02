package org.unbunt.sqlscript.commands;

import org.unbunt.sqlscript.SQLScriptContext;
import org.unbunt.sqlscript.exception.CommandFailedException;
import org.unbunt.sqlscript.exception.DataAccessFailedException;
import org.unbunt.sqlscript.exception.InternalErrorException;
import org.unbunt.sqlscript.exception.ResultValidationException;
import org.unbunt.sqlscript.support.Parameters;
import org.unbunt.sqlscript.statement.SQLStatement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RequireCommand implements Command, StatementRequired {
    protected SQLStatement statement = null;
    protected Connection conn = null;

    public void execute(SQLScriptContext ctx, Parameters params) throws CommandFailedException {
        boolean empty = params.getBool("empty");
        boolean notEmpty = params.getBool("not-empty");

        if (empty && notEmpty) {
            throw new CommandFailedException("Ambiguous parameters: empty vs. not-empty");
        }

        boolean isEmpty;
        ResultSet rs = ctx.getLastSQLResult();
        if (rs != null) {
            try {
                isEmpty = !rs.next();
            } catch (SQLException e) {
                throw new DataAccessFailedException(e);
            }
        }
        else if (ctx.getLastUpdateCount() != -1) {
            isEmpty = ctx.getLastUpdateCount() == 0;
        }
        else {
            throw new InternalErrorException("Last statement has no result");
        }

        if (empty && !isEmpty) {
            String msg = params.getValue("msg");
            if (msg == null) {
                msg = "Result validation failed: Required empty result - got non-empty result";
            }
            throw new ResultValidationException(statement, msg);
        }
        else if (notEmpty && isEmpty) {
            String msg = params.getValue("msg");
            if (msg == null) {
                msg = "Result validation failed: Required non-empty result - got empty result";
            }
            throw new ResultValidationException(statement, msg);
        }
    }

    public void setStatement(SQLStatement statement) {
        this.statement = statement;
    }

    public void setConnection(Connection conn) {
        this.conn = conn;
    }
}
