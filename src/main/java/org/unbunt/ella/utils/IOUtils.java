package org.unbunt.ella.utils;

import java.nio.channels.WritableByteChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.ByteBuffer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * User: tweiss
 * Date: Oct 14, 2010
 * Time: 3:50:46 PM
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
public class IOUtils {
    public static void unbufferedStreamCopy(InputStream in, OutputStream out) throws IOException {
        byte[] buf = new byte[4096];
        int r;
        while ((r = in.read()) != -1) {
            buf[0] = (byte) r;
            int read = 1;
            int avail = in.available();
            if (avail > 0) {
                read += in.read(buf, 1, avail);
            }
            out.write(buf, 0, read);
            out.flush();
        }
    }
}
