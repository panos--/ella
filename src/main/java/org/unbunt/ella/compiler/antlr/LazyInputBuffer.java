package org.unbunt.ella.compiler.antlr;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Represents a queue-like character buffer.
 * <p>
 * Any offsets expected by this class' methods are relative to the start of the stream this buffer builds a queue for.
 * Therefore users of this class need not keep track of the portions of the input that has already been discarded.
 */
public class LazyInputBuffer {
    protected static final Log logger = LogFactory.getLog(LazyInputBuffer.class);
    protected static final boolean trace = logger.isTraceEnabled();

    protected StringBuilder buf = new StringBuilder();
    protected int offset = 0;
    protected boolean buffer = false;

    /**
     * Creates a new <code>LazyInputBuffer</code>.
     * <p>
     * This buffer starts operation in non-buffering mode so that any call to the <code>poll</code> method
     * actually removes the polled character from the buffer.
     */
    public LazyInputBuffer() {
    }

    /**
     * Instructs this buffer to actually start buffering.
     */
    public void buffer() {
        buffer = true;
        if (trace) {
            logger.trace("Going to buffered mode");
        }
    }

    /**
     * Instructs this buffer to stop buffering.
     */
    public void unbuffer() {
        buffer = false;
    }

    /**
     * Appends the given character to the buffer.
     *
     * @param c the character to append.
     * @return this buffer
     */
    public LazyInputBuffer append(char c) {
        buf.append(c);
        return this;
    }

    /**
     * Returns the character at the given offset in the buffer.
     *
     * @param index the offset of the character to return.
     * @return the character at the given offset.
     */
    public char peek(int index) {
        return buf.charAt(index - offset);
    }

    /**
     * Returns the character at the given offset in the buffer. Additionally, if this buffer is in non-buffering mode
     * the character is deleted from the buffer.
     *
     * @param index the offset of the character to return.
     * @return the character at the given offset.
     */
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

    /**
     * Returns the contents of this buffer starting from the given offset up to the end of the buffer.
     *
     * @param start the starting offset.
     * @return the contents of the buffer in the given range.
     */
    public String substring(int start) {
        return buf.substring(start - offset);
    }

    /**
     * Returns the contents of this buffer between the given offsets
     *
     * @param start the starting offset (inclusive).
     * @param end the end offset (exclusive).
     * @return the contents of the buffer in the given range.
     */
    public String substring(int start, int end) {
        return buf.substring(start - offset, end - offset);
    }

    /**
     * Instructs this buffer to discard all buffered characters (if any) up to the given offset.
     *
     * @param end the offset up to which the buffered characters should be discarded.
     * @return this buffer.
     */
    public LazyInputBuffer delete(int end) {
        int oldLen = buf.length();
        buf.delete(0, end - offset);
        int newLen = buf.length();
        offset += (oldLen - newLen);
        return this;
    }
}
