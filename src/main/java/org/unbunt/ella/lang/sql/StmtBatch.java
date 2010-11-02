package org.unbunt.ella.lang.sql;

import org.unbunt.ella.engine.context.Context;
import org.unbunt.ella.utils.StopWatch;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
     * TODO: Observer notification on batch execution
 */
public class StmtBatch {
    protected final Context context;
    protected final Statement statement;
    protected final int batchSize;
    protected int currentBatchSize = 0;

    public StmtBatch(Context context, Connection connection, int batchSize) throws SQLException {
        this(context, connection.createStatement(), batchSize);
    }

    public StmtBatch(Context context, Statement statement, int batchSize) {
        this.context = context;
        this.statement = statement;
        this.batchSize = batchSize;
    }

    public void add(String query) throws SQLException {
        context.info("Batch: %s", query);

        statement.addBatch(query);
        if (++currentBatchSize % batchSize == 0) {
            execute();
            currentBatchSize = 0;
        }
    }

    public void finish() throws SQLException {
        if (currentBatchSize == 0) {
            return;
        }

        execute();
    }

    public void close() throws SQLException {
        statement.close();
    }

    protected void execute() throws SQLException {
        if (context.isInfoEnabled()) {
            context.info("Executing batch with %d statements", currentBatchSize);
            StopWatch timer = new StopWatch(3);
            statement.executeBatch();
            double dt = timer.stop();
            double dts = dt / currentBatchSize;
            dts = (double) Math.round(dts * 1000) / 1000;
            context.info("Batch execution of %d statements took %.3f seconds (%.3f seconds per statement)",
                         currentBatchSize, dt, dts);
        }
        else {
            statement.executeBatch();
        }
    }
}
