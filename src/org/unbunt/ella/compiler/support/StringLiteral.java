package org.unbunt.ella.compiler.support;

import java.util.List;

/**
 * Represents the compiled form of string literal of the EllaScript language.
 */
public class StringLiteral {
    protected String startDelim;
    protected String endDelim;
    protected List<Object> parts;

    public StringLiteral(String startDelim, String endDelim, List<Object> parts) {
        this.startDelim = startDelim;
        this.endDelim = endDelim;
        this.parts = parts;
    }

    public void add(String str) {
        parts.add(str);
    }

    public void add(Variable var) {
        parts.add(var);
    }

    public List<Object> getParts() {
        return parts;
    }

    public String getDelim() {
        return startDelim;
    }

    public String getStartDelim() {
        return startDelim;
    }

    public String getEndDelim() {
        return endDelim;
    }

    public String toString() {
        StringBuilder buf = new StringBuilder();
        buf.append(startDelim);
        for (Object part : parts) {
            buf.append(part.toString());
        }
        buf.append(startDelim);
        return buf.toString();
    }
}
