package org.unbunt.ella.utils.res;

import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;
import java.io.File;

/**
 * User: tweiss
 * Date: 18.09.2008
 * Time: 06:40:11
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
public class SpringResource implements SimpleResource {
    protected Resource resource;

    public SpringResource(Resource resource) {
        this.resource = resource;
    }

    public SpringResource createRelative(String path) throws IOException {
        Resource newResource = resource.createRelative(path);
        return new SpringResource(newResource);
    }

    public String getFilename() {
        return resource.getFilename();
    }

    public InputStream getInputStream() throws IOException {
        return resource.getInputStream();
    }

    public String getPath() throws IOException {
        return resource.getURL().toString();
    }

    public File getFile() throws IOException {
        return resource.getFile();
    }
}
