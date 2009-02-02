package org.unbunt.sqlscript.commands;

import org.unbunt.sqlscript.SQLScriptContext;
import org.unbunt.sqlscript.exception.CommandFailedException;
import org.unbunt.sqlscript.support.Parameters;
import org.unbunt.sqlscript.support.Drivers;
import static org.unbunt.utils.StringUtils.isNullOrEmpty;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

public class ConnectCommand implements Command {
    public void execute(SQLScriptContext ctx, Parameters params) throws CommandFailedException {
        String alias = params.getValue("alias");
        String properties = params.getValue("props");
        String driver = params.getValue("driver");
        String type = params.getValue("type");
        String url = params.getValue("url");
        String user = params.getValue("user");
        String pass = params.getValue("pass");

        DriverManagerDataSource ds = new SingleConnectionDataSource();

        Properties props = null;
        if (!isNullOrEmpty(properties)) {
            props = new Properties();
            try {
                props.load(new FileInputStream(properties));
            } catch (IOException e) {
                throw new CommandFailedException("Failed to load properties: " + e.getMessage(), e);
            }

            if (props.getProperty("username") != null && props.getProperty("user") == null) {
                props.setProperty("user", props.getProperty("username"));
            }
        }

        String driverClassName = null;
        if (!isNullOrEmpty(driver)) {
            try {
                Class.forName(driver);
                driverClassName = driver;
            } catch (Exception e) {
                throw new CommandFailedException("Could not load database driver: " + driver + ": " +
                                                 e.getMessage(), e);
            }
        }
        else if (!isNullOrEmpty(type)) {
            String[] typeDrivers = null;
            try {
                typeDrivers = Drivers.valueOf(type).getDriverClasses();
            } catch (IllegalArgumentException ignored) {
            }
            if (typeDrivers == null || typeDrivers.length == 0) {
                throw new CommandFailedException("Unknown driver type: " + type + " - " +
                                                 "Use 'driver' option to specify a driver class");
            }

            boolean loaded = false;
            for (String typeDriver : typeDrivers) {
                try {
                    Class.forName(typeDriver);
                    driverClassName = typeDriver;
                    loaded = true;
                    break;
                } catch (Exception ignored) {
                }
            }

            if (!loaded) {
                throw new CommandFailedException("Could not load driver for database type: " + type + " - " +
                                                 "Try using 'driver' option");
            }
        }
        else {
            String dcnProp = props.getProperty("driverClassName");
            if (dcnProp != null) {
                driverClassName = dcnProp;
            }
        }

        if (driverClassName != null) {
            ds.setDriverClassName(driverClassName);
        }

        if (!isNullOrEmpty(url)) {
            ds.setUrl(url);
        }
        else if (props.getProperty("url") != null) {
            ds.setUrl(props.getProperty("url"));
        }

        if (!isNullOrEmpty(user)) {
            ds.setUsername(user);
        }
        else if (props.getProperty("user") != null) {
            ds.setUsername(user);
        }

        if (pass != null) { // NOTE: not using isNullOrEmpty to allow empty string as password
            ds.setPassword(pass);
        }
        else if (props.getProperty("password") != null) {
            ds.setPassword(props.getProperty("password"));
        }

        if (props != null) {
            ds.setConnectionProperties(props);
        }

        ctx.setDataSource(ds);
        ctx.setConnection(null);
        if (alias != null) {
            ctx.setDataSource(alias, ds);
            ctx.setConnection(alias, null);
        }
    }
}
