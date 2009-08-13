package org.unbunt.ella.utils;

import java.io.File;

public class PathUtil {
    protected static final String SEPARATOR = File.separator;

    public static boolean isAbsPath(String path) {
        return path.startsWith(SEPARATOR);
    }

    public static String concatPaths(String path1, String path2) {
        String sep = SEPARATOR;

        // nothing to do..
        if (path2 == null || path2.length() == 0 || path2.equals(sep))
            return path1;

        int sepl   = sep.length();
        while (path1.endsWith(sep))
            path1 = path1.substring(0, path1.length() - sepl);
        while (path2.startsWith(SEPARATOR))
            path2 = path2.substring(sepl);
        return path1 + sep + path2;
    }

}
