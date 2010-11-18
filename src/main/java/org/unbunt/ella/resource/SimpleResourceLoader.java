package org.unbunt.ella.resource;

import java.io.File;
import java.io.IOException;

/**
 * Interface for loading resources, such as files, URLs, etc.
 * Inspired by Spring's ResourceLoader.
 */
public interface SimpleResourceLoader {
    /**
     * Returns a resource object wrapping the given path.
     *
     * @param path the pathname denoting the resource to load
     * @return a resource object wrapping the given path
     * @throws IOException if the resource cannot be loaded
     */
    public SimpleResource getResource(String path) throws IOException;

    /**
     * Returns a <i>File</i> object representing the resource specified by <i>path</i>.
     * This method may fail if the resource cannot be represented as a <i>File</i> object.
     *
     * @param path the pathname of the resource to return a <i>File</i> object for
     * @return a <i>File</i> object representing the resource specified by <i>path</i>
     * @throws IOException if an error occurrs
     */
    public File loadResource(String path) throws IOException;
}
