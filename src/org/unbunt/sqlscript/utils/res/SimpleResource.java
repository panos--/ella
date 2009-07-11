package org.unbunt.sqlscript.utils.res;

import java.io.InputStream;
import java.io.IOException;
import java.io.File;

/**
 * User: tweiss
 * Date: 18.09.2008
 * Time: 06:23:04
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
public interface SimpleResource {
    public SimpleResource createRelative(String path) throws IOException;
    public InputStream getInputStream() throws IOException;
    public String getPath() throws IOException;
    public String getFilename();
    public File getFile() throws IOException;
}
