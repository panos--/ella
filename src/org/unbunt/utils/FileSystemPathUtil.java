package org.unbunt.utils;

import org.unbunt.utils.PathUtil;
import org.unbunt.utils.RepositoryPathUtil;

import java.io.File;

/**
 * Created by IntelliJ IDEA.
 * User: panos
 * Date: 01.01.2007
 * Time: 23:32:31
 * To change this template use File | Settings | File Templates.
 */
public class FileSystemPathUtil extends PathUtil {
    private static FileSystemPathUtil instance = null;

    public static final String SEPARATOR = File.separator;

    protected FileSystemPathUtil() {
    }

    public static FileSystemPathUtil getInstance() {
        if (instance == null)
            return instance = new FileSystemPathUtil();
        return instance;
    }

    public String getSeparator() {
        return SEPARATOR;
    }

    public String toRepositoryPath(String filesystemPath) {
        return filesystemPath.replace(SEPARATOR, RepositoryPathUtil.SEPARATOR);
    }

    public String toFileSystemPath(String filesystemPath) {
        return filesystemPath;
    }
}
