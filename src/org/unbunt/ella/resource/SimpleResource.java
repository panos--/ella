package org.unbunt.ella.resource;

import java.io.InputStream;
import java.io.IOException;
import java.io.File;

public interface SimpleResource {
    public SimpleResource createRelative(String path) throws IOException;
    public InputStream getInputStream() throws IOException;
    public String getPath() throws IOException;
    public String getFilename();
    public File getFile() throws IOException;
}
