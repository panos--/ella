package org.unbunt.sqlscript.utils;

public class StringUtils {
    public static String unescapeSQLString(String str, String delim) {
        return str.replace(delim + delim, delim);
    }

    public static String escapeSQLString(String str, String delim) {
        return str.replace(delim, delim + delim);
    }
}
