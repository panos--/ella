/* SimpleResource.java
   Copyright (C) 2009, 2010 Thomas Weiß <panos@unbunt.org>

This file is part of the Ella scripting language interpreter.

Ella is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2, or (at your option)
any later version.

Ella is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License
along with Ella; see the file COPYING.  If not, write to the
Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
02110-1301 USA.

Linking this library statically or dynamically with other modules is
making a combined work based on this library.  Thus, the terms and
conditions of the GNU General Public License cover the whole
combination.

As a special exception, the copyright holders of this library give you
permission to link this library with independent modules to produce an
executable, regardless of the license terms of these independent
modules, and to copy and distribute the resulting executable under
terms of your choice, provided that you also meet, for each linked
independent module, the terms and conditions of the license of that
module.  An independent module is a module which is not derived from
or based on this library.  If you modify this library, you may extend
this exception to your version of the library, but you are not
obligated to do so.  If you do not wish to do so, delete this
exception statement from your version. */

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
