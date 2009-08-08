package org.unbunt.sqlscript.compiler;

import java.util.List;

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
