package org.unbunt.ella.resource;

import java.io.File;
import java.io.IOException;

public interface SimpleResourceLoader {
    public SimpleResource getResource(String path) throws IOException;
    public File loadResource(String res) throws IOException;
}
