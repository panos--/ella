package org.unbunt.sqlscript.utils;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;
import org.unbunt.sqlscript.exception.DBConnectionFailedException;
import org.unbunt.sqlscript.support.Drivers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DBUtils {
    public static DriverManagerDataSource createDataSourceFromProps(String propsFile,
                                                                    String user, String pass,
                                                                    String classOrType)
            throws DBConnectionFailedException {
        Properties props = new Properties();
        try {
            props.load(new FileInputStream(propsFile));
        } catch (IOException e) {
            throw new DBConnectionFailedException("Failed to load connection properties: " + propsFile + ": " +
                                                  e.getMessage(), e);
        }

        // canonicalize user/username property
        if (props.getProperty("username") != null && props.getProperty("user") == null) {
            props.setProperty("user", props.getProperty("username"));
        }
        else if (props.getProperty("user") != null && props.getProperty("username") == null) {
            props.setProperty("username", props.getProperty("user"));
        }

        String url = props.getProperty("url");
        if (url == null) {
            throw new DBConnectionFailedException("Missing url property");
        }

        if (user == null) {
            user = props.getProperty("username");
        }
        if (pass == null) {
            pass = props.getProperty("password");
        }

        if (classOrType == null) {
            classOrType = props.getProperty("type");
        }
        if (classOrType == null) {
            classOrType = props.getProperty("driverClassName");
        }

        return createDataSourceInternal(props, url, user, pass, classOrType);
    }

    public static DriverManagerDataSource createDataSource(String url, String user, String pass, String classOrType)
            throws DBConnectionFailedException {
        assert url != null : "url must not be null";
        return createDataSourceInternal(new Properties(), url, user, pass, classOrType);
    }

    protected static DriverManagerDataSource createDataSourceInternal(Properties props,
                                                                      String url,
                                                                      String user, String pass,
                                                                      String classOrType)
            throws DBConnectionFailedException {
        DriverManagerDataSource ds = new SingleConnectionDataSource();

        String[] driverClasses = null;
        if (classOrType != null) {
            try {
                Drivers drivers = Drivers.valueOf(classOrType);
                driverClasses = drivers.getDriverClasses();
            } catch (IllegalArgumentException ignored) {
                driverClasses = new String[] { classOrType };
            }
        }

        if (driverClasses == null) {
            String driverClass = props.getProperty("driverClassName");
            if (driverClass != null) {
                driverClasses = new String[] { driverClass };
            }
            else {
                throw new DBConnectionFailedException("No driver specified");
            }
        }



        String actualDriverClass = null;
        for (String driverClass : driverClasses) {
            try {
                Class.forName(driverClass);
                actualDriverClass = driverClass;
                break;
            } catch (ClassNotFoundException e) {
                continue;
            }
        }

        if (actualDriverClass == null) {
            throw new DBConnectionFailedException("Failed to load JDBC driver: Unknown type or class not found");
        }

        ds.setDriverClassName(actualDriverClass);
        props.setProperty("driverClassName", actualDriverClass);

        if (url == null) {
            throw new DBConnectionFailedException("Missing URL");
        }
        ds.setUrl(url);

        if (user != null) {
            ds.setUsername(user);
        }
        if (pass != null) {
            ds.setPassword(pass);
        }

        ds.setConnectionProperties(props);

        return ds;
    }
}
