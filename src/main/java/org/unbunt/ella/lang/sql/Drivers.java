package org.unbunt.ella.lang.sql;

/**
 * Collection of drivers known to the system.
 */
public enum Drivers {
    oracle ("oracle.jdbc.OracleDriver"),
    postgresql ("org.postgresql.Driver"),
    mysql ("com.mysql.jdbc.Driver", "org.gjt.mm.mysql.Driver");

    protected String[] driverClasses;

    Drivers(String... driverClasses) {
        this.driverClasses = driverClasses;
    }

    /**
     * Returns the class names known for this driver.
     *
     * @return the class names.
     */
    public String[] getDriverClasses() {
        return driverClasses;
    }
}
