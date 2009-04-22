package org.unbunt.sqlscript.support;

import java.util.LinkedList;
import java.util.List;

public class StringLiteral {
    protected String delim;
    protected List<Object> parts;

    public StringLiteral(String delim) {
        parts = new LinkedList<Object>();
        this.delim = delim;
    }

    public StringLiteral(String delim, List<Object> parts) {
        this.delim = delim;
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
        return delim;
    }

    public String toString() {
        StringBuilder buf = new StringBuilder();
        buf.append(delim);
        for (Object part : parts) {
            buf.append(part.toString());
        }
        buf.append(delim);
        return buf.toString();
    }
}
