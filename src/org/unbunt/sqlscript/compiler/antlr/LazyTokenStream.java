package org.unbunt.ella.compiler.antlr;

import org.antlr.runtime.*;
import org.apache.commons.collections.list.CursorableLinkedList;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.unbunt.ella.compiler.antlr.ExtendedCursorableLinkedList;

import java.util.*;

/**
 * TODO: currently backed by a linked list - compare with an implementation backed by TreeList (commons collections)
 */
public class LazyTokenStream implements TokenStream {
    protected Log logger = LogFactory.getLog(getClass());
    protected boolean trace = logger.isTraceEnabled();

    protected TokenSource tokenSource = null;

    protected ExtendedCursorableLinkedList tokens = new ExtendedCursorableLinkedList();

    protected int read = 0;
    protected int pos = -1;
    protected ExtendedCursorableLinkedList.Cursor posCursor = tokens.cursor();
    protected ExtendedCursorableLinkedList.Cursor lookCursor;

    protected int channel = Token.DEFAULT_CHANNEL;
    protected Map<Integer, Integer> channelOverride = new HashMap<Integer, Integer>();
    protected Set<Integer> discardTypes = new HashSet<Integer>();
    protected boolean discardOffChannelTokens = false;

    protected StringBuilder collectBuffer = new StringBuilder();

    protected int ltCacheIdx = 0;
    protected Token[] ltCache = new Token[11];

    protected int lbCacheIdx = 0;
    protected Token[] lbCache = new Token[11];

    protected CharStream inputStream;

    protected List<ExtendedCursorableLinkedList.Cursor> markers = new ArrayList<ExtendedCursorableLinkedList.Cursor>();

    public LazyTokenStream() {
    }

    public LazyTokenStream(TokenSource tokenSource) {
        this();
        setTokenSource(tokenSource);
    }

    public LazyTokenStream(TokenSource tokenSource, int channel) {
        this(tokenSource);
        this.channel = channel;
    }

    /**
     * Get Token at current input pointer + i ahead where i=1 is next Token.
     * i<0 indicates tokens in the past.  So -1 is previous token and -2 is
     * two tokens ago. LT(0) is undefined.  For i>=n, return Token.EOFToken.
     * Return null for LT(0) and any index that results in an absolute address
     * that is negative.
     */
    public Token LT(int k) {
        if (k == 0) {
            throw new IllegalArgumentException("k must be non-zero");
        }
        if (k < 0) {
            Token token = LB(-k);
            return token;
        }

        if (k <= ltCacheIdx) {
            return ltCache[k];
        }

        lookCursor = tokens.cursor(posCursor);
        try {
            Token token = null;
            int i = k;
            while (i > 0) {

                skipOffChannelTokens(lookCursor);
                if (lookCursor.hasNext()) {
                    token = (Token) lookCursor.next();
                }
                else {
                    return Token.EOF_TOKEN;
                }
                i--;
            }

            if (k < ltCache.length) {
                ltCacheIdx = k;
                ltCache[k] = token;
            }
            return token;
        } finally {
            lookCursor.close();
        }
    }

    protected Token LB(int k) {
        if (k == 0) {
            throw new IllegalArgumentException("k must be non-zero");
        }

        if (k <= lbCacheIdx) {
            return lbCache[k];
        }

        int j = k;
        lookCursor = tokens.cursor(posCursor);
        try {
            while (j > 0) {
                if (!lookCursor.hasPrevious()) {
                    return null;
                }
                skipOffChannelTokensReverse(lookCursor);
                j--;
            }

            if (!lookCursor.hasPrevious()) {
                return null;
            }

            Token token = (Token) lookCursor.previous();
            if (k < lbCache.length) {
                lbCacheIdx = k;
                lbCache[k] = token;
            }
            return token;
        } finally {
            lookCursor.close();
        }
    }

    /**
     * Get int at current input pointer + i ahead where i=1 is next int.
     * Negative indexes are allowed.  LA(-1) is previous token (token
     * just matched).  LA(-i) where i is before first token should
     * yield -1, invalid char / EOF.
     */
    public int LA(int i) {
        Token token = LT(i);
        return token != null ? token.getType() : -1;
    }

    public void consume() {
        skipOffChannelTokens(posCursor);
        if (posCursor.hasNext()) {
            posCursor.next();
        }

        ltCacheIdx = 0;
        lbCacheIdx = 0;

        if (markers.isEmpty()) {
            discardLookBack();
        }
    }

    protected int skipOffChannelTokens(CursorableLinkedList.Cursor cursor) {
        int i = 0;
        while (cursor.hasNext() || read(cursor)) {
            Token token = (Token) cursor.next();
            int tokenChannel = token.getChannel();
            if (tokenChannel == channel) {
                if (cursor.hasPrevious()) {
                    cursor.previous();
                }
                break;
            }
            i++;
        }

        return i;
    }

    protected int skipOffChannelTokensReverse(CursorableLinkedList.Cursor cursor) {
        int i = 0;
        while (cursor.hasPrevious()) {
            Token token = (Token) cursor.previous();
            if (token.getChannel() == channel) {
                if (cursor.hasNext()) {
                    cursor.next();
                }
                break;
            }
            i--;
        }

        return i;
    }

    public String collectOffChannelTokenText(int collectChannel) {
        ExtendedCursorableLinkedList.Cursor cursor = tokens.cursor(posCursor);
        collectBuffer.setLength(0);

        while (cursor.hasNext() || read(cursor)) {
            Token token = (Token) cursor.next();
            int tokenChannel = token.getChannel();
            if (tokenChannel == channel) {
                break;
            }
            else if (tokenChannel == collectChannel) {
                collectBuffer.append(token.getText());
            }
        }

        cursor.close();
        return collectBuffer.toString();
    }

    protected boolean read(CursorableLinkedList.Cursor cursor) {
        return readTo(cursor, 1);
    }

    protected boolean readTo(CursorableLinkedList.Cursor cursor, int i) {
        // FIXME: works for i == 1 only - fix or check if support for i > 1 is nessessary
        while (i > 0) {
            i--;
            if (cursor.hasNext()) {
                continue;
            }

            int bufOffs = -1;
            if (inputStream != null) {
                try {
                    bufOffs = ((LazyInputStream)inputStream).buffer();
                } catch (ClassCastException ignored) {
                }
            }

            Token token = tokenSource.nextToken();
            try {
                int tokOffs = ((CommonToken) token).getStartIndex();
                if (trace) {
                    logger.trace("read token: bufOffs=" + bufOffs + " tokOffs=" + tokOffs);
                }
            } catch (ClassCastException ignored) {
            }
            int tokenType = token.getType();
            if (tokenType == CharStream.EOF) {
                return false;
            }

            read++;

            Integer overrideChannel = channelOverride.get(tokenType);
            if (overrideChannel != null) {
                token.setChannel(overrideChannel);
            }

            if (discardTypes.contains(tokenType)
                || (discardOffChannelTokens && token.getChannel() != channel)) {
                continue;
            }

            token.setTokenIndex(read);
            tokens.add(token);
        }

        return true;
    }

    /**
     * Get a token at an absolute index i; 0..n-1.  This is really only
     * needed for profiling and debugging and token stream rewriting.
     * If you don't want to buffer up tokens, then this method makes no
     * sense for you.  Naturally you can't use the rewrite stream feature.
     * I believe DebugTokenStream can easily be altered to not use
     * this method, removing the dependency.
     */
    public Token get(int i) {
        throw new RuntimeException("Unsupported operation");
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
        markers.add(tokens.cursor(posCursor));
        int i = markers.size();
        if (trace) {
            logger.trace("mark = " + i);
        }
        return i;
    }

    /**
     * Return the current input symbol index 0..n where n indicates the
     * last symbol has been read.  The index is the symbol about to be
     * read not the most recently read symbol.
     */
    public int index() {
        int i = read;
        if (trace) {
            logger.trace("index = " + i);
        }
        return i;
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
        int index = marker - 1;
        setPosCursor(tokens.cursor(markers.get(index)));
        releaseMarkerInternal(index);
        if (trace) {
            logger.trace("rewind(" + marker + ")");
        }
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
            logger.trace("rewind()");
        }
        setPosCursor(tokens.cursor(markers.get(markers.size() - 1)));
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
        if (trace) {
            logger.trace("release(" + marker + ")");
        }
        releaseMarkerInternal(marker - 1);
    }

    protected void releaseMarkerInternal(int markerIndex) {
        for (int i = markers.size() - 1; i >= markerIndex; i--) {
            ExtendedCursorableLinkedList.Cursor m = markers.remove(i);
            m.close();
        }

        if (markerIndex > 0) {
            return;
        }

        discardLookBack();
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
        int actualIndex = index - discarded;

        if (trace) {
            logger.trace("seek(" + index + "): " +
                         "discarded=" + discarded + " -> " +
                         "seeking to " + actualIndex + " (ntokens=" + tokens.size() + ")");
        }

        if (actualIndex < 0) {
            throw new UnsupportedOperationException("Cannot seek backwards");
        }
        setPosCursor(tokens.cursor(actualIndex));
    }

    /**
     * Only makes sense for streams that buffer everything up probably, but
     * might be useful to display the entire stream or for testing.  This
     * value includes a single EOF.
     */
    public int size() {
        throw new UnsupportedOperationException();
    }

    /**
     * Where are you getting symbols from?  Normally, implementations will
     * pass the buck all the way to the lexer who can ask its input stream
     * for the file name or whatever.
     */
    public String getSourceName() {
        return null;
    }

    protected void setPosCursor(ExtendedCursorableLinkedList.Cursor cursor) {
        posCursor.close();
        posCursor = cursor;
        ltCacheIdx = 0;
    }

    /**
     * Where is this stream pulling tokens from?  This is not the name, but
     * the object that provides Token objects.
     */
    public TokenSource getTokenSource() {
        return tokenSource;
    }

    public void setTokenSource(TokenSource tokenSource) {
        if (trace) {
            logger.trace("setTokenSource: " + tokenSource);
        }
        this.tokenSource = tokenSource;
        pos = -1;
        read = 0;
        discarded = 0;
        channel = Token.DEFAULT_CHANNEL;
        tokens.clear();
        setPosCursor(tokens.cursor());
        updateInputStreamFromTokenSource();
    }

    protected void updateInputStreamFromTokenSource() {
        if (tokenSource instanceof Lexer) {
            inputStream = ((Lexer)tokenSource).getCharStream();
        }
    }

    public TokenSource replaceTokenSource(TokenSource tokenSource) {
        if (trace) {
            logger.trace("replaceTokenSource: " + tokenSource);
        }
        TokenSource oldTokenSource = this.tokenSource;
        this.tokenSource = tokenSource;
        discardLookAhead();
        updateInputStreamFromTokenSource();
        return oldTokenSource;
    }

    public void discardLookAhead() {
        if (trace) {
            logger.trace("discarding look-ahead");
        }

        ExtendedCursorableLinkedList.Cursor cursor = tokens.cursor(posCursor);

        int i = 0;
        while (cursor.hasNext()) {
            // Try to seek input stream back to the starting position of the first look-ahead token.
            // Can be done only if the token's starting offset in the stream is known. For now we rely
            // on CommonToken to provide this information and just skip the seek if the token type
            // is not CommonToken.
            try {
                CommonToken token = (CommonToken) cursor.next();
                if (i == 0) {
                    if (inputStream != null) {
                        inputStream.seek(token.getStartIndex());
                    }
                }
                ((LazyInputStream) inputStream).unbuffer(token.getStartIndex());
            } catch (ClassCastException ignored) {
            }
            cursor.remove();
            i++;
            read--;
        }

        cursor.close();

        ltCacheIdx = 0;

        if (trace) {
            logger.trace("discarded " + i + " tokens look-ahead - ntokens now: " + tokens.size());
        }
    }

    protected int discarded = 0;

    protected void discardLookBack() {
        // removed last marker - trash all previously buffered tokens
        ExtendedCursorableLinkedList.Cursor cursor = tokens.cursor(posCursor);

        // leave one token for look-back (LT(-1))
        if (cursor.hasPrevious()) {
            cursor.previous();
        }

        int n = 0;
        while (cursor.hasPrevious()) {
            try {
                CommonToken prevToken = (CommonToken) cursor.previous();
                if (inputStream != null) {
                    ((LazyInputStream) inputStream).unbuffer(prevToken.getStartIndex());
                }
            } catch (ClassCastException ignored) {
            }
            cursor.remove();
            n++;
        }

        cursor.close();

        discarded += n;
    }

    public void setTokenTypeChannel(int ttype, int channel) {
        channelOverride.put(ttype, channel);
	}

    public void discardTokenType(int tokenType) {
        discardTypes.add(tokenType);
    }

    public boolean isDiscardOffChannelTokens() {
        return discardOffChannelTokens;
    }

    public void setDiscardOffChannelTokens(boolean discardOffChannelTokens) {
        this.discardOffChannelTokens = discardOffChannelTokens;
    }

    /**
     * Return the text of all tokens from start to stop, inclusive.
     * If the stream does not buffer all the tokens then it can just
     * return "" or null;  Users should not access $ruleLabel.text in
     * an action of course in that case.
     */
    public String toString(int start, int stop) {
        throw new UnsupportedOperationException();
    }

    /**
     * Because the user is not required to use a token with an index stored
     * in it, we must provide a means for two token objects themselves to
     * indicate the start/end location.  Most often this will just delegate
     * to the other toString(int,int).  This is also parallel with
     * the TreeNodeStream.toString(Object,Object).
     */
    public String toString(Token start, Token stop) {
        throw new UnsupportedOperationException();
    }
}
