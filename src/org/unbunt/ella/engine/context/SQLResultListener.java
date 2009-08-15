package org.unbunt.ella.engine.context;

import java.sql.ResultSet;

/**
 * Represents an observer listening for SQL results.
 *
 * @see org.unbunt.ella.engine.context.SQLResultProvider
 */
public interface SQLResultListener {
    /**
     * Notifies this observer about the given SQL result set.
     *
     * @param resultSet the SQL result set.
     */
    public void resultSet(ResultSet resultSet);

    /**
     * Notifies this observer about the given SQL update count.
     *
     * @param updateCount the SQL update count.
     */
    public void updateCount(int updateCount);
}
