package org.unbunt.sqlscript.antlr;

public class LazyInputBuffer {
    protected StringBuilder buf = new StringBuilder();
    protected int offset = 0;

    public LazyInputBuffer() {
    }

    /*
    public LazyInputBuffer append(String str) {
        buf.append(str);
        return this;
    }
    */

    /*
    public LazyInputBuffer append(StringBuffer sb) {
        buf.append(sb);
        return this;
    }
    */

    /*
    public LazyInputBuffer append(CharSequence s) {
        buf.append(s);
        return this;
    }
    */

    /*
    public LazyInputBuffer append(CharSequence s, int start, int end) {
        buf.append(s, start, end);
        return this;
    }
    */

    /*
    public LazyInputBuffer append(char[] str) {
        buf.append(str);
        return this;
    }
    */

    /*
    public LazyInputBuffer append(char[] str, int offset, int len) {
        buf.append(str, offset, len);
        return this;
    }
    */

    public LazyInputBuffer append(char c) {
        buf.append(c);
        return this;
    }

    /*
    public int length() {
        return buf.length();
    }

    public void setLength(int newLength) {
        buf.setLength(newLength);
    }
    */

    public char charAt(int index) {
        if (index - offset < 0) {
            new Object().hashCode();
        }
        return buf.charAt(index - offset);
    }

    public String substring(int start) {
        return buf.substring(start - offset);
    }

    public String substring(int start, int end) {
        return buf.substring(start - offset, end - offset);
    }

    public LazyInputBuffer delete(int end) {
        int oldLen = buf.length();
        buf.delete(0, end - offset);
        int newLen = buf.length();
        offset += (oldLen - newLen);
        return this;
    }
}
