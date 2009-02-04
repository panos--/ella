package org.unbunt.utils.res;

import org.unbunt.utils.FileSystemPathUtil;

import java.io.IOException;
import java.io.InputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * User: tweiss
 * Date: 18.09.2008
 * Time: 06:25:36
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
public class FilesystemResource implements SimpleResource {
    protected String path;

    protected File file;

    protected final static FileSystemPathUtil pathUtil = FileSystemPathUtil.getInstance();

    public FilesystemResource(String path) {
        this.path = path;
        this.file = new File(path);
    }

    public FilesystemResource(File file) {
        this.path = file.getPath();
        this.file = file;
    }

    public FilesystemResource createRelative(String path) throws IOException {
        if (pathUtil.isAbsPath(path)) {
            return new FilesystemResource(path);
        }

        // FIXME: non-atomic check between exists() and isDirectory()
        if (!file.exists()) {
            throw new IOException("Cannot determine relative path: File does not exist: " + path);
        }

        String newPath = pathUtil.concatPaths(file.isDirectory() ? file.getPath() : file.getParent(), path);

        return new FilesystemResource(newPath);
    }

    public String getFilename() {
        return file.getName();
    }

    public InputStream getInputStream() throws IOException {
        return new FileInputStream(file);
    }

    public String getPath() {
        return file.getPath();
    }

    public File getFile() throws IOException {
        return file;
    }
}
