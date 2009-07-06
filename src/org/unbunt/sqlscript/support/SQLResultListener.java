package org.unbunt.sqlscript.support;

import java.sql.ResultSet;

public interface SQLResultListener {
    public void resultSet(ResultSet resultSet);
    public void updateCount(int updateCount);
}
