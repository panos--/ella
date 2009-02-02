package org.unbunt.sqlscript.support;

public enum Drivers {
    oracle ("oracle.jdbc.OracleDriver"),
    postgresql ("org.postgresql.Driver"),
    mysql ("com.mysql.jdbc.Driver", "org.gjt.mm.mysql.Driver");

    protected String[] driverClasses;

    Drivers(String... driverClasses) {
        this.driverClasses = driverClasses;
    }

    public String[] getDriverClasses() {
        return driverClasses;
    }
}
