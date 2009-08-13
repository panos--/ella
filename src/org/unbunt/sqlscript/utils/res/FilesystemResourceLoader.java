package org.unbunt.ella.utils.res;

import org.unbunt.ella.utils.res.SimpleResourceLoader;

import java.io.File;
import java.io.IOException;

/**
 * User: tweiss
 * Date: 08.07.2008
 * Time: 13:25:41
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
public class FilesystemResourceLoader implements SimpleResourceLoader {
    public FilesystemResourceLoader() {
    }

    public FilesystemResource getResource(String path) {
        return new FilesystemResource(path);
    }

    public File loadResource(String res) throws IOException {
        return getResource(res).getFile();
    }

    public StdinResource getStdinResource() {
        return new StdinResource();
    }
}