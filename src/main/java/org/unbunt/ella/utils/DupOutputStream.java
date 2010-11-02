package org.unbunt.ella.utils;

import java.io.OutputStream;
import java.io.IOException;

/**
 * User: tweiss
 * Date: Nov 2, 2010
 * Time: 4:24:22 PM
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
public class DupOutputStream extends OutputStream {
    protected final OutputStream[] outs;

    public DupOutputStream(OutputStream[] outs) {
        this.outs = outs;
    }

    public void write(int b) throws IOException {
        for (OutputStream out : outs) {
            out.write(b);
        }
    }
}
