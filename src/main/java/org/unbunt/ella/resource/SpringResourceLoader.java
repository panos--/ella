package org.unbunt.ella.resource;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.File;
import java.io.IOException;

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
