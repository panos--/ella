package org.unbunt.ella.utils;

public class StringUtils {
    public static String unescapeSQLString(String str, String delim) {
        return str.replace(delim + delim, delim);
    }

    public static String escapeSQLString(String str, String delim) {
        return delim.length() == 1 ? str.replace(delim, delim + delim) : str;
    }

    public static String join(Object... elems) {
        return join2(", ", ", ", elems);
    }

    public static String join(String joiner, Object... elems) {
        return join2(joiner, joiner, elems);
    }

    public static String join2(String joiner, String lastJoiner, Object... elems) {
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < elems.length; i++) {
            if (i > 0) {
                result.append(i == elems.length - 1 ? lastJoiner : joiner);
            }
            result.append(elems[i]);
        }

        return result.toString();
    }    
}
