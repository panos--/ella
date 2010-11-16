package org.unbunt.ella.utils;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.unbunt.ella.exception.DBConnectionFailedException;
import org.unbunt.ella.lang.sql.DBUtils;

import java.util.Properties;

/**
 * User: tweiss
 * Date: Nov 16, 2010
 * Time: 8:00:16 PM
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
public class ConnectionProperties extends ConnectionDetails {
    protected final Properties properties;

    public ConnectionProperties(Properties properties) {
        this.properties = properties;
    }

    public DriverManagerDataSource createDataSource()
            throws DataSourceInitializationException, DBConnectionFailedException {
        return DBUtils.createDataSourceFromProps(properties, user, pass, driver);
    }

    public Properties getProperties() {
        return properties;
    }
}
