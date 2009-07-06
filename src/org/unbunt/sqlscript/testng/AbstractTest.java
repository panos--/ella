package org.unbunt.sqlscript.testng;

import java.io.File;

public class AbstractTest {
    public static final String FILE_PATH = "test/ng/";
    public static final String FILE_EXT = ".sql";

    protected static File file(String path) {
        return new File(FILE_PATH + path + FILE_EXT);
    }
}
