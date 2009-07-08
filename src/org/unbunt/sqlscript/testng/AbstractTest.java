package org.unbunt.sqlscript.testng;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AbstractTest {
    public static final String FILE_PATH = "test/ng/";
    public static final String FILE_EXT = ".sql";

    protected static File file(String path) {
        return new File(FILE_PATH + path + FILE_EXT);
    }

    protected static String fileContent(String path) throws IOException {
        File file = file(path);
        StringBuilder result = new StringBuilder();
        FileReader reader = new FileReader(file);
        char[] buf = new char[8 * 1024];
        int read;
        while ((read = reader.read(buf)) >= 0) {
            result.append(buf, 0, read);
        }
        reader.close();
        return result.toString();
    }
}
