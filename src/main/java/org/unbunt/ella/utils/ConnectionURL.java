package org.unbunt.ella.utils;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.unbunt.ella.exception.DBConnectionFailedException;
import org.unbunt.ella.lang.sql.DBUtils;

/**
 * User: tweiss
 * Date: Nov 16, 2010
 * Time: 8:00:36 PM
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
public class ConnectionURL extends ConnectionDetails {
    protected final String url;

    public ConnectionURL(String url) {
        this.url = url;
    }

    public DriverManagerDataSource createDataSource()
            throws DataSourceInitializationException, DBConnectionFailedException {
        return DBUtils.createDataSource(url, user, pass, driver);
    }

    public String getUrl() {
        return url;
    }
}
