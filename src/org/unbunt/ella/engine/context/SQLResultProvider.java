package org.unbunt.ella.engine.context;

import java.sql.ResultSet;

public interface SQLResultProvider {
    public void notifyResultSet(ResultSet resultSet);
    public void notifyUpdateCount(int updateCount);
}
