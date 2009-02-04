package org.unbunt.sqlscript.commands;

import org.unbunt.sqlscript.SQLScriptContext;
import org.unbunt.sqlscript.exception.CommandFailedException;
import org.unbunt.sqlscript.exception.IllegalCommandArgumentsException;
import org.unbunt.sqlscript.support.Parameters;
import org.unbunt.utils.VolatileObservable;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TransferCommand extends VolatileObservable implements Command {
    public void execute(SQLScriptContext ctx, Parameters params) throws CommandFailedException {
        String batchArg = params.getValue("batch");
        String fromAlias = params.getValue("src");
        String toAlias = params.getValue("dst");
        String srcCountAlias = params.getValue("src-count");
        String dstCountAlias = params.getValue("dst-count");
        boolean validateCount = params.getBool("validate-count");

        int batchSize = 1000;
        if (batchArg != null) {
            try {
                batchSize = Integer.valueOf(batchArg);
            } catch (NumberFormatException e) {
                throw new IllegalCommandArgumentsException("Illegal argument: batch: Not a number: " + batchArg);
            }
        }

        if (fromAlias == null) {
            throw new IllegalCommandArgumentsException("Missing required parameter: src");
        }

        if (toAlias == null) {
            throw new IllegalCommandArgumentsException("Missing required parameter: dst");
        }

        PreparedStatement srcStmt = ctx.getPreparedStatement(fromAlias);
        PreparedStatement dstStmt = ctx.getPreparedStatement(toAlias);

        if (srcStmt == null) {
            throw new IllegalCommandArgumentsException("Invalid argument: src: " +
                                                       "No such prepared statement: " + fromAlias);
        }

        if (dstStmt == null) {
            throw new IllegalCommandArgumentsException("Invalid argument: dst: " +
                                                       "No such prepared statement: " + toAlias);
        }

        PreparedStatement srcCountStmt = null;
        if (srcCountAlias != null) {
            srcCountStmt = ctx.getPreparedStatement(srcCountAlias);
            if (srcCountStmt == null) {
                throw new IllegalCommandArgumentsException("Invalid argument: src-count: " +
                                                           "No such prepared statement: " + srcCountAlias);
            }
        }

        PreparedStatement dstCountStmt = null;
        if (dstCountAlias != null) {
            dstCountStmt = ctx.getPreparedStatement(dstCountAlias);
            if (dstCountStmt == null) {
                throw new IllegalCommandArgumentsException("Invalid argument: dst-count: " +
                                                           "No such prepared statement: " + dstCountAlias);
            }
        }

        if (validateCount && srcCountStmt == null) {
            throw new IllegalCommandArgumentsException("Invalid arguments: validate-count specified but no src-count given");
        }

        if (validateCount && dstCountStmt == null) {
            throw new IllegalCommandArgumentsException("Invalid arguments: validate-count specified but no dst-count given");
        }

        ResultSet rs = null;
        try {
            long srcCount = -1;
            if (srcCountStmt != null) {
                rs = srcCountStmt.executeQuery();
                if (!rs.next()) {
                    throw new CommandFailedException("Source count statement returned no result");
                }
                srcCount = rs.getLong(1);
                rs.close();
                rs = null;
            }

            rs = srcStmt.executeQuery();
            int ncols = -1;
            int nrows = 0;
            int lastInsertCount = 0;
            while (rs.next()) {
                nrows++;
                if (ncols == -1) {
                    ncols = rs.getMetaData().getColumnCount();
                }

                dstStmt.clearParameters();
                for (int i = 1; i <= ncols; i++) {
                    dstStmt.setObject(i, rs.getObject(i));
                }

                dstStmt.addBatch();

                if (nrows % batchSize == 0 && nrows > 0) {
                    long bef = System.currentTimeMillis();
                    dstStmt.executeBatch();
                    notifyObservers("Transferred " + (nrows - lastInsertCount) + " rows, totaling " + nrows +
                                    (srcCount != -1 ? " of " + srcCount : "") + " in " +
                                    (System.currentTimeMillis() - bef) + "ms");
                    lastInsertCount = nrows;
                    dstStmt.clearBatch();
                }
            }

            dstStmt.executeBatch();
            dstStmt.clearBatch();

            if (!validateCount) {
                return;
            }

            long dstCount = -1;
            if (dstCountStmt != null) {
                rs = dstCountStmt.executeQuery();
                if (!rs.next()) {
                    throw new CommandFailedException("Source count statement returned no result");
                }
                dstCount = rs.getLong(1);
            }

            if (srcCount != dstCount) {
                throw new CommandFailedException("Source count does not match destination count " +
                                                 "(" + srcCount + " != " + dstCount + ")");
            }
        } catch (SQLException e) {
            throw new CommandFailedException("Transfer failed: " + e.getMessage(), e);
        } finally {
            try { if (rs != null) { rs.close(); } }
            catch (Exception ignored) {}
        }
    }
}
