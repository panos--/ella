package org.unbunt.ella.resource;

import static org.unbunt.ella.utils.PathUtil.concatPaths;
import static org.unbunt.ella.utils.PathUtil.isAbsPath;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FilesystemResource implements SimpleResource {
    protected String path;

    protected File file;

    public FilesystemResource(String path) {
        this.path = path;
        this.file = new File(path);
    }

    public FilesystemResource(File file) {
        this.path = file.getPath();
        this.file = file;
    }

    public FilesystemResource createRelative(String path) throws IOException {
        if (isAbsPath(path)) {
            return new FilesystemResource(path);
        }

        // FIXME: non-atomic check between exists() and isDirectory()
        if (!file.exists()) {
            throw new IOException("Cannot determine relative path: File does not exist: " + path);
        }

        String parentPath = file.isDirectory() ? file.getPath() : file.getParent();
        String newPath = parentPath == null ? path : concatPaths(parentPath, path);
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
