package org.unbunt.ella.utils.res;

import java.io.File;
import java.io.IOException;

/**
 * User: tweiss
 * Date: 08.07.2008
 * Time: 13:24:01
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
public interface SimpleResourceLoader {
    public SimpleResource getResource(String path) throws IOException;
    public File loadResource(String res) throws IOException;
}
