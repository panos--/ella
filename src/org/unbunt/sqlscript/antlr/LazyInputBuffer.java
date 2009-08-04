package org.unbunt.sqlscript.antlr;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LazyInputBuffer {
    protected static final Log logger = LogFactory.getLog(LazyInputBuffer.class);
    protected static final boolean trace = logger.isTraceEnabled();

    protected StringBuilder buf = new StringBuilder();
    protected int offset = 0;
    protected boolean buffer = false;

    public LazyInputBuffer() {
    }

    public void buffer() {
        buffer = true;
        if (trace) {
            logger.trace("Going to buffered mode");
        }
    }

    public void unbuffer() {
        buffer = false;
        /*
        int oldLen = buf.length();
        buf.delete(0, oldLen);
        int newLen = buf.length();
        offset += (oldLen - newLen);
        if (trace) {
            logger.trace("Going to unbuffered mode - discarding buffer - offset now " + offset);
        }
        */
    }

    public LazyInputBuffer append(char c) {
        /*
        if (buffer) {
            buf.append(c);
        }
        else {
            if (buf.length() > 0) {
                offset++;
                if (trace) {
                    logger.trace("Unbuffered append - incrementing offset to " + offset);
                }
            }
            buf.setLength(0);
            buf.append(c);
        }
        */
        buf.append(c);
        return this;
    }

    /*
    public char charAt(int index) {
        if (index - offset < 0) {
            new Object().hashCode();
        }
        return buf.charAt(index - offset);
    }
    */

    public char peek(int index) {
        if (index - offset < 0) {
            new Object().hashCode();
        }
        return buf.charAt(index - offset);
    }

    public char poll(int index) {
        int i = index - offset;
        assert buffer || i == 0;
        char c = buf.charAt(i);
        if (!buffer) {
            offset++;
            buf.delete(0, 1);
        }
        if (trace) {
            logger.trace("buffer length: " + buf.length());
        }
        return c;
    }

    public String substring(int start) {
        return buf.substring(start - offset);
    }

    public String substring(int start, int end) {
        if (start == 0) {
            new Object().hashCode();
        }
        return buf.substring(start - offset, end - offset);
    }

    public LazyInputBuffer delete(int end) {
        int oldLen = buf.length();
        try {
            buf.delete(0, end - offset);
        } catch (StringIndexOutOfBoundsException e) {
            throw e;
        }
        int newLen = buf.length();
        offset += (oldLen - newLen);
        return this;
    }
}
