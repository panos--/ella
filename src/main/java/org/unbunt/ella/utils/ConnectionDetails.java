package org.unbunt.ella.utils;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.unbunt.ella.exception.DBConnectionFailedException;

/**
 * User: tweiss
 * Date: Nov 16, 2010
 * Time: 7:57:52 PM
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
public abstract class ConnectionDetails {
    protected String user;
    protected String pass;
    protected String driver;

    public abstract DriverManagerDataSource createDataSource()
            throws DataSourceInitializationException, DBConnectionFailedException;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }
}
