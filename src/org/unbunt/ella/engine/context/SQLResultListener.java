package org.unbunt.ella.engine.context;

import java.sql.ResultSet;

public interface SQLResultListener {
    public void resultSet(ResultSet resultSet);
    public void updateCount(int updateCount);
}
