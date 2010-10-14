package org.unbunt.ellatest;

import org.unbunt.ella.resource.FilesystemResource;

import java.io.IOException;

/**
 * User: tweiss
 * Date: Oct 7, 2010
 * Time: 4:56:38 PM
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
public class AdhocTest {
    public static void main(String[] args) throws IOException {
        Integer i = null;
        if (i instanceof Integer) {

        }

        FilesystemResource fsr = new FilesystemResource("foo");
        FilesystemResource foo = fsr.createRelative("bar");
    }
}
