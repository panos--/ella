package org.unbunt.ella.resource;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.Resource;

import java.io.File;
import java.io.IOException;

import org.unbunt.ella.resource.SimpleResourceLoader;

/**
 * User: tweiss
 * Date: 10.07.2008
 * Time: 13:56:00
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
public class SpringResourceLoader implements SimpleResourceLoader, ResourceLoaderAware {
    protected ResourceLoader resourceLoader;

    public SpringResourceLoader() {
    }

    public SpringResource getResource(String path) {
        Resource resource = resourceLoader.getResource(path);
        return new SpringResource(resource);
    }

    public File loadResource(String res) throws IOException {
        return getResource(res).getFile();
    }

    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }

    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }
}
