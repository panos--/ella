/* DBUtils.java
   Copyright (C) 2009, 2010 Thomas Weiß <panos@unbunt.org>

This file is part of the Ella scripting language interpreter.

Ella is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2, or (at your option)
any later version.

Ella is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License
along with Ella; see the file COPYING.  If not, write to the
Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
02110-1301 USA.

Linking this library statically or dynamically with other modules is
making a combined work based on this library.  Thus, the terms and
conditions of the GNU General Public License cover the whole
combination.

As a special exception, the copyright holders of this library give you
permission to link this library with independent modules to produce an
executable, regardless of the license terms of these independent
modules, and to copy and distribute the resulting executable under
terms of your choice, provided that you also meet, for each linked
independent module, the terms and conditions of the license of that
module.  An independent module is a module which is not derived from
or based on this library.  If you modify this library, you may extend
this exception to your version of the library, but you are not
obligated to do so.  If you do not wish to do so, delete this
exception statement from your version. */

package org.unbunt.ella.lang.sql;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;
import org.unbunt.ella.exception.DBConnectionFailedException;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Helper class providing utility methods for interaction with databases.
 */
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

        return createDataSourceFromProps(props, user, pass, classOrType);
    }

    public static DriverManagerDataSource createDataSourceFromProps(Properties props,
                                                                    String user, String pass,
                                                                    String classOrType)
            throws DBConnectionFailedException {
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

    public static Drivers[] getKnownDrivers() {
        return Drivers.values();
    }
}
