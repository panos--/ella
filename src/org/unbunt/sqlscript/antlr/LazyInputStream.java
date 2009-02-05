package org.unbunt.sqlscript.antlr;

import org.antlr.runtime.CharStream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LazyInputStream implements CharStream {
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

    protected int charNoInLine = 0;
    protected int lineNo = 0;

    protected List<CharStreamState> markers = null;
    protected int markDepth = 0;
    protected int lastMarker;

    public LazyInputStream(Reader input) {
        this.input = new BufferedReader(input);
    }

    public LazyInputStream(InputStream input) {
        this(new InputStreamReader(input));
    }

    /**
     * For infinite streams, you don't need this; primarily I'm providing
     * a useful interface for action code.  Just make sure actions don't
     * use this on streams that don't support it.
     */
    public String substring(int start, int stop) {
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

        return buf.charAt(j);
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
		CharStreamState state = markers.get(marker);
		seek(state.pos);
		lineNo = state.lineNo;
		charNoInLine = state.charNoInLine;
		release(marker);
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
        rewind(lastMarker);
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
		markDepth = marker - 1;
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
		if (index <= read) {
			pos = index;
			return;
		}

		while (read < index) {
			consume();
		}
    }

    public void consume() {
        if (pos > read) {
            return;
        }

        char c = buf.charAt(pos);

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
