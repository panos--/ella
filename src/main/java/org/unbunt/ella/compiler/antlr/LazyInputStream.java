/* LazyInputStream.java
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

package org.unbunt.ella.compiler.antlr;

import org.antlr.runtime.CharStream;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a <code>CharStream</code> implementation which reads characters from a given stream
 * lazily when they are requested instead of eagerly on instanciation. In addition any characters
 * no longer needed are discarded by this char stream.
 */
public class LazyInputStream implements CharStream {
    protected static Log logger = LogFactory.getLog(LazyInputStream.class);
    protected static boolean trace = logger.isTraceEnabled();

    // local version of org.antlr.runtime.CharStreamState
    protected static class CharStreamState {
        int pos;
        int lineNo;
        int charNoInLine;
    }

    protected Reader input;

    protected LazyInputBuffer buf = new LazyInputBuffer();

    protected String sourceName = null;

    protected int pos = 0;
    protected int read = 0;
    protected int offs = 0;

    protected int charNoInLine = 0;
    protected int lineNo = 0;

    protected List<CharStreamState> markers = null;
    protected int markDepth = 0;
    protected int lastMarker;

    protected List<Integer> bufferOffsets = new ArrayList<Integer>();
//    protected int bufferOffset = -1;

    /**
     * Creates a new <code>LazyInputStream</code> reading characters from the given <code>Reader</code>.
     *
     * @param input the character source.
     */
    public LazyInputStream(Reader input) {
        this.input = new BufferedReader(input);
    }

    /**
     * Creates a new <code>LazyInputStream</code> reading characters from the given input stream.
     *
     * @param input the character source.
     */
    public LazyInputStream(InputStream input) {
        this(new InputStreamReader(input));
    }

    /**
     * For infinite streams, you don't need this; primarily I'm providing
     * a useful interface for action code.  Just make sure actions don't
     * use this on streams that don't support it.
     */
    public String substring(int start, int stop) {
        if (trace) {
            logger.trace("substring: start=" + start + " stop=" + stop);
        }
        readTo(stop);
        return buf.substring(start, stop + 1);
    }

    /**
     * Get the ith character of lookahead.  This is the same usually as
     * LA(i).  This will be used for labels in the generated
     * lexer code.  I'd prefer to return a char here type-wise, but it's
     * probably better to be 32-bit clean and be consistent with LA.
     */
    public int LT(int i) {
        return LA(i);
    }

    /**
     * Get int at current input pointer + i ahead where i=1 is next int.
     * Negative indexes are allowed.  LA(-1) is previous token (token
     * just matched).  LA(-i) where i is before first token should
     * yield -1, invalid char / EOF.
     */
    public int LA(int i) {
        if (i == 0) {
            return 0;
        }

        int j = pos + i - 1;
        if (i < 0) {
            j++; // see ANTLRStringStream.LA(int)
            if (j < 0) {
                return CharStream.EOF;
            }
        }

        if (!readTo(j)) {
            return CharStream.EOF;
        }

        return buf.peek(j);
    }

    /**
     * Tell the stream to start buffering if it hasn't already.  Return
     * current input position, index(), or some other marker so that
     * when passed to rewind() you get back to the same spot.
     * rewind(mark()) should not affect the input cursor.  The Lexer
     * track line/col info as well as input index so its markers are
     * not pure input indexes.  Same for tree node streams.
     */
    public int mark() {
        if (markers == null) {
            markers = new ArrayList<CharStreamState>();
            markers.add(null); // depth 0 means no backtracking, leave blank
        }

        markDepth++;
        CharStreamState state;
        if (markDepth >= markers.size()) {
			state = new CharStreamState();
			markers.add(state);
		}
		else {
			state = markers.get(markDepth);
		}
        state.pos = pos;
		state.lineNo = lineNo;
		state.charNoInLine = charNoInLine;

        if (trace) {
            logger.trace("mark: depth now: " + markDepth);
        }

        buf.buffer();
        lastMarker = markDepth;
        return markDepth;
    }

    /**
     * Reset the stream so that next call to index would return marker.
     * The marker will usually be index() but it doesn't have to be.  It's
     * just a marker to indicate what state the stream was in.  This is
     * essentially calling release() and seek().  If there are markers
     * created after this marker argument, this routine must unroll them
     * like a stack.  Assume the state the stream was in when this marker
     * was created.
     */
    public void rewind(int marker) {
        if (trace) {
            logger.trace("rewind: marker=" + marker);
        }
        rewindOnly(marker);
        release(marker);
    }

    protected void rewindOnly(int marker) {
        if (trace) {
            logger.trace("rewindOnly: marker=" + marker);
        }
        CharStreamState state = markers.get(marker);
        seek(state.pos);
		lineNo = state.lineNo;
		charNoInLine = state.charNoInLine;
    }

    /**
     * Rewind to the input position of the last marker.
     * Used currently only after a cyclic DFA and just
     * before starting a sem/syn predicate to get the
     * input position back to the start of the decision.
     * Do not "pop" the marker off the state.  mark(i)
     * and rewind(i) should balance still. It is
     * like invoking rewind(last marker) but it should not "pop"
     * the marker off.  It's like seek(last marker's input position).
     */
    public void rewind() {
        if (trace) {
            logger.trace("rewind: last marker: " + lastMarker);
        }
        rewindOnly(lastMarker);
    }

    /**
     * You may want to commit to a backtrack but don't want to force the
     * stream to keep bookkeeping objects around for a marker that is
     * no longer necessary.  This will have the same behavior as
     * rewind() except it releases resources without the backward seek.
     * This must throw away resources for all markers back to the marker
     * argument.  So if you're nested 5 levels of mark(), and then release(2)
     * you have to release resources for depths 2..5.
     */
    public void release(int marker) {
        if (marker > markDepth) {
            throw new IllegalArgumentException("Invalid marker: " + marker + ": Current marker depth: " + markDepth);
        }
        CharStreamState state = markers.get(marker);
        markDepth = marker - 1;
        if (markDepth == 0) {
            if (bufferOffsets.isEmpty() || state.pos < bufferOffsets.get(0)) {
                if (trace) {
                    logger.trace("releasing look-back");
                }
                buf.delete(state.pos);
                if (bufferOffsets.isEmpty()) {
                    buf.unbuffer();
                }
            }
        }
        if (trace) {
            logger.trace("release: marker=" + marker + " markDepth now: " + markDepth);
        }
    }

    /**
     * Instructs this input stream to start buffering. Contrary to the stack like (LIFO) semantics achieved with the
     * <code>mark</code> and <code>release</code>/<code>rewind</code> methods the buffering is done using
     * queue like (FIFO) semantics.
     * <p>
     * For every call to this method there must be a matching call to the unbuffer method to release the buffered
     * characters.
     *
     * @return a handle marking this buffer's start. For ease of use with other components this handle is identical
     *         with the current offset in the stream.
     * @see #unbuffer(int)
     */
    public int buffer() {
        if (trace) {
            logger.trace("Start buffering");
        }
        int offs = index();
        if (bufferOffsets.isEmpty()) {
            buf.buffer();
        }
        bufferOffsets.add(offs);
        return offs;
    }

    /**
     * Releases the specified buffer. If there are no markers registered within this stream and there is no buffer
     * starting at a smaller offset in the stream the characters buffered for the specified handle are released up
     * to the next buffer or the current offset in the stream, whichever comes first.
     *
     * @param buffer the handle specifying the buffer to release.
     */
    public void unbuffer(int buffer) {
        if (bufferOffsets.isEmpty()) {
            return;
        }

        // FIXME: This suffers from poor performance (complexity of O(n) where O(1) is desirable)
        for (int i = 0; i < bufferOffsets.size(); i++) {
            int offs = bufferOffsets.get(i);
            if (offs != buffer) {
                continue;
            }

            bufferOffsets.remove(i);
            if (i != 0) {
                break;
            }
            int discardOffs;
            if (!bufferOffsets.isEmpty()) {
                int nextBufOffs = bufferOffsets.get(0);
                if (nextBufOffs == offs) {
                    break;
                }
                discardOffs = nextBufOffs - 1;
            }
            else {
                discardOffs = index() - 1;
            }

            if (markDepth == 0 || discardOffs < markers.get(1).pos) {
                if (trace) {
                    logger.trace("Unbuffer: Deleting to pos " + offs);
                }
                buf.delete(discardOffs);
            }
            else {
                if (trace) {
                    logger.trace("Unbuffer: Not deleting - some marker present");
                }
            }

            break;
        }

        if (bufferOffsets.isEmpty()) {
            if (trace) {
                logger.trace("Stop buffering");
            }
            if (markDepth == 0) {
                buf.unbuffer();
            }
        }
    }

    /**
     * Set the input cursor to the position indicated by index.  This is
     * normally used to seek ahead in the input stream.  No buffering is
     * required to do this unless you know your stream will use seek to
     * move backwards such as when backtracking.
     * <p/>
     * This is different from rewind in its multi-directional
     * requirement and in that its argument is strictly an input cursor (index).
     * <p/>
     * For char streams, seeking forward must update the stream state such
     * as line number.  For seeking backwards, you will be presumably
     * backtracking using the mark/rewind mechanism that restores state and
     * so this method does not need to update state when seeking backwards.
     * <p/>
     * Currently, this method is only used for efficient backtracking using
     * memoization, but in the future it may be used for incremental parsing.
     * <p/>
     * The index is 0..n-1.  A seek to position i means that LA(1) will
     * return the ith symbol.  So, seeking to 0 means LA(1) will return the
     * first element in the stream.
     */
    public void seek(int index) {
        if (trace) {
            logger.trace("seek: index=" + index + " (seek " + (index <= read ? "backward" : "forward") + ")");
        }
        if (index == pos) {
            return;
        }
        if (index <= read) {
			pos = index;
			return;
		}

		while (read < index) {
			consume();
		}
    }

    /**
     * Consumes the next character.
     */
    public void consume() {
        if (pos >= read && !readTo(pos)) {
            return;
        }

        char c = buf.poll(pos);

        if (c == '\n') {
            charNoInLine = 0;
            lineNo++;
        }
        else {
            charNoInLine++;
        }

        if (pos == read) {
            tryRead();
        }

        pos++;
    }

    protected boolean readTo(int offset) {
        while (offset >= read) {
            if (!tryRead()) {
                return false;
            }
        }
        return true;
    }

    protected boolean tryRead() {
        int c;
        try {
            c = input.read();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        if (c == -1) {
            return false;
        }
        buf.append((char) c);
        read++;
        return true;
    }

    /**
     * Return the current input symbol index 0..n where n indicates the
     * last symbol has been read.  The index is the symbol about to be
     * read not the most recently read symbol.
     */
    public int index() {
        if (trace) {
            logger.trace("index: current index: " + pos);
        }
        return pos;
    }

    /**
     * Only makes sense for streams that buffer everything up probably, but
     * might be useful to display the entire stream or for testing.  This
     * value includes a single EOF.
     */
    public int size() {
        throw new RuntimeException("Unsupported operation");
    }

    /**
     * ANTLR tracks the line information automatically
     */
    public int getLine() {
        return lineNo;
    }

    /**
     * Because this stream can rewind, we need to be able to reset the line
     */
    public void setLine(int line) {
        lineNo = line;
    }

    /**
     * The index of the character relative to the beginning of the line 0..n-1
     */
    public int getCharPositionInLine() {
        return charNoInLine;
    }

    public void setCharPositionInLine(int pos) {
        charNoInLine = pos;
    }

    /**
     * Where are you getting symbols from?  Normally, implementations will
     * pass the buck all the way to the lexer who can ask its input stream
     * for the file name or whatever.
     */
    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

}
