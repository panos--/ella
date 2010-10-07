package org.unbunt.ella.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.Date;

/**
     * TODO: Observer notification on batch execution
 */
public class StmtBatch {
    private static final Logger logger = LoggerFactory.getLogger(StmtBatch.class);

    protected Statement statement;
    protected int batchSize;
    protected int currentBatchSize = 0;

    public StmtBatch(Connection connection, int batchSize) throws SQLException {
        this(connection.createStatement(), batchSize);
    }

    public StmtBatch(Statement statement, int batchSize) {
        this.statement = statement;
        this.batchSize = batchSize;
    }

    public void add(String query) throws SQLException {
        logger.info("Batch: {}", query);

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
        if (logger.isInfoEnabled()) {
            logger.info("Executing batch with {} statements", currentBatchSize);
            Date t1 = new Date();
            statement.executeBatch();
            Date t2 = new Date();
            double dt = ((double) t2.getTime() - t1.getTime()) / 1000;
            dt = (double) Math.round(dt * 1000) / 1000;
            double dts = dt / currentBatchSize;
            dts = (double) Math.round(dts * 1000) / 1000;
            logger.info("Batch execution of {} statements took {} seconds ({} seconds per statement)",
                        new Object[] { currentBatchSize, dt, dts});
        }
        else {
            statement.executeBatch();
        }
    }
}
