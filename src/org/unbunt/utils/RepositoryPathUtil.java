package org.unbunt.utils;

import org.unbunt.utils.PathUtil;
import org.unbunt.utils.FileSystemPathUtil;

/**
 * Created by IntelliJ IDEA.
 * User: panos
 * Date: 01.01.2007
 * Time: 23:31:19
 * To change this template use File | Settings | File Templates.
 */
public class RepositoryPathUtil extends PathUtil {
    private static RepositoryPathUtil instance = null;

    public static final String SEPARATOR = "/";

    protected RepositoryPathUtil() {
    }

    public static synchronized RepositoryPathUtil getInstance() {
        if (instance == null)
            return instance = new RepositoryPathUtil();
        return instance;
    }

    public String getSeparator() {
        return SEPARATOR;
    }

    public String toFileSystemPath(String repositoryPath) {
        return repositoryPath.replace(SEPARATOR, FileSystemPathUtil.SEPARATOR);
    }

    public String toRepositoryPath(String repositoryPath) {
        return repositoryPath;
    }
}
