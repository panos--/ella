package org.unbunt.sqlscript.utils.res;

import java.io.IOException;
import java.io.InputStream;
import java.io.File;

/**
 * User: tweiss
 * Date: 18.09.2008
 * Time: 06:37:44
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
public class StdinResource implements SimpleResource {
    protected StdinResource() {
    }

    public FilesystemResource createRelative(String path) throws IOException {
        return new FilesystemResource(path);
    }

    public String getFilename() {
        return "-";
    }

    public InputStream getInputStream() throws IOException {
        return System.in;
    }

    public String getPath() {
        return "-";
    }

    public File getFile() throws IOException {
        throw new IOException("Stdin not available as file.");
    }
}
