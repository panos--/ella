package org.unbunt.sqlscript.support;

import org.unbunt.sqlscript.utils.StringUtils;

import java.util.List;
import java.util.LinkedList;

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

    public String toLiteralString() {
        StringBuilder buf = new StringBuilder();
        buf.append(delim);
        for (Object part : parts) {
            buf.append(part instanceof Variable ? ((Variable)part).getValue() : part.toString());
        }
        buf.append(delim);
        return buf.toString();
    }

    public String toLiteralStringEscaped() {
        StringBuilder buf = new StringBuilder();
        buf.append(delim);
        for (Object part : parts) {
            String str = part instanceof Variable
                         ? StringUtils.escapeSQLString(((Variable) part).getValue().toString(), delim)
                         : StringUtils.escapeSQLString(part.toString(), delim);
            buf.append(str);
        }
        buf.append(delim);
        return buf.toString();
    }

    public String toLiteralStringUnescaped() {
        StringBuilder buf = new StringBuilder();
        for (Object part : parts) {
            String str = part instanceof Variable
                         ? ((Variable) part).getValue().toString()
                         : part.toString();
            buf.append(str);
        }
        return buf.toString();
    }
}
