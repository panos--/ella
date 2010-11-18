package org.unbunt.ella.resource;

import java.io.InputStream;
import java.io.IOException;
import java.io.File;

/**
 * Generic interface for accessing different kind of resources (files, URLs) in a unified way.
 * The general structure is inspired by Spring's Resource interface.
 */
public interface SimpleResource {
    /**
     * Given that <i>path</i> is a relative pathname, this method creates a new <i>SimpleResource</i> for it with a path
     * relative to the one that is wrapped by this instance. Otherwise a resource just wrapping the absolute path
     * is created.
     * The resulting resource object will be of the same concrete type as this one.
     *
     * @param path the pathname to create a new resource object for, may be specified absolute or relative
     * @return a resource object wrapping the given path
     * @throws IOException if the resource cannot be created
     */
    public SimpleResource createRelative(String path) throws IOException;

    /**
     * Opens this resource and returns an <i>InputStream</i> for reading it's contents.
     *
     * @return an InputStream for reading this resource's contents
     * @throws IOException if the resource cannot be opened
     */
    public InputStream getInputStream() throws IOException;

    /**
     * Returns the pathname denoting this resource.
     *
     * @return the pathname denoting this resource
     * @throws IOException if an error occurrs
     */
    public String getPath() throws IOException;

    /**
     * Returns the last portion of the pathname denoting this resource.
     *
     * @return the last portion of the pathname denoting this resource
     */
    public String getFilename();

    /**
     * Returns a <i>File</i> object representing the pathname of this resource.
     * This method may fail if this resource cannot be represented as a file.
     *
     * @return a <i>File</i> object representing the pathname of this resource
     * @throws IOException if this resource cannot be represented as a file
     */
    public File getFile() throws IOException;
}
