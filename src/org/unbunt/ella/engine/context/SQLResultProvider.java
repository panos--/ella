package org.unbunt.ella.engine.context;

import java.sql.ResultSet;

/**
 * Represents an observable for SQL results as in the well known observer pattern.
 *
 * @see org.unbunt.ella.engine.context.SQLResultListener
 */
public interface SQLResultProvider {
    /**
     * Tells this observable to notify registered observers about the given SQL result set.
     *
     * @param resultSet the SQL result set to notify observers about.
     */
    public void notifyResultSet(ResultSet resultSet);

    /**
     * Tells this observable to notify registered observers about the given SQL update count.
     *
     * @param updateCount the SQL update count to notify observers about.
     */
    public void notifyUpdateCount(int updateCount);

    /**
     * Registers an SQL result listener to be notified about incoming SQL results.
     * If this listener is already registered, the request is ignored.
     *
     * @param listener the listener to be registered.
     */
    public void addSQLResultListener(SQLResultListener listener);

    /**
     * Unregisters an SQL result listener so that it will no longer be notified about incoming SQL results.
     * If there is no such listener is registered, the request is ignored.
     *
     * @param listener the listener to be unregistered.
     */
    public void removeSQLResultListener(SQLResultListener listener);
}
