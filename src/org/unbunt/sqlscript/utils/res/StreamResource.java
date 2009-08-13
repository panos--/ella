package org.unbunt.ella.utils.res;

import java.io.InputStream;
import java.io.IOException;
import java.io.File;

public class StreamResource implements SimpleResource {
    protected InputStream stream;

    public StreamResource(InputStream stream) {
        this.stream = stream;
    }

    public SimpleResource createRelative(String path) throws IOException {
        return new FilesystemResource(path);
    }

    public InputStream getInputStream() throws IOException {
        return stream;
    }

    public String getPath() throws IOException {
        return null;
    }

    public String getFilename() {
        return null;
    }

    public File getFile() throws IOException {
        throw new IOException("Stdin not available as file.");
    }
}
