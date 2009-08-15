package org.unbunt.ella.resource;

import java.io.File;
import java.io.IOException;

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