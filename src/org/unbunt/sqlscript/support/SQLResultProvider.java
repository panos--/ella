package org.unbunt.sqlscript.support;

import java.sql.ResultSet;

public interface SQLResultProvider {
    public void notifyResultSet(ResultSet resultSet);
    public void notifyUpdateCount(int updateCount);
}
