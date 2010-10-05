package org.unbunt.ella.compiler.support;

import java.util.List;
import java.util.ArrayList;

/**
 * Represents the compiled form of string literal of the EllaScript language.
 */
public class StringLiteral {
    protected String startDelim;
    protected String endDelim;
    protected List<StringLiteralComponent> parts;

    public StringLiteral() {
        this(null, null);
    }

    public StringLiteral(String startDelim, String endDelim) {
        this(startDelim, endDelim, new ArrayList<StringLiteralComponent>());
    }

    public StringLiteral(String startDelim, String endDelim, List<StringLiteralComponent> parts) {
        this.startDelim = startDelim;
        this.endDelim = endDelim;
        this.parts = parts;
    }

    public void add(StringLiteralComponent component) {
        parts.add(component);
    }

    public void add(String str) {
        parts.add(new StringText(str));
    }

    public void add(Variable var) {
        parts.add(new StringEmbeddedVariable(var));
    }

    public List<StringLiteralComponent> getParts() {
        return parts;
    }

    public String getDelim() {
        return startDelim;
    }

    public String getStartDelim() {
        return startDelim;
    }

    public void setStartDelim(String startDelim) {
        this.startDelim = startDelim;
    }

    public String getEndDelim() {
        return endDelim;
    }

    public void setEndDelim(String endDelim) {
        this.endDelim = endDelim;
    }

    public String toSource() {
        StringBuilder buf = new StringBuilder();
        buf.append(startDelim);
        for (StringLiteralComponent part : parts) {
            buf.append(part.toSource());
        }
        buf.append(endDelim);
        return buf.toString();
    }

    public String toSource(StringVariableInterpolator interpolator) {
        StringBuilder buf = new StringBuilder();
        buf.append(startDelim);
        for (StringLiteralComponent part : parts) {
            buf.append(part.toSource(interpolator));
        }
        buf.append(endDelim);
        return buf.toString();
    }

    public String toString(StringVariableInterpolator interpolator) {
        StringBuilder buf = new StringBuilder();
        for (StringLiteralComponent part : parts) {
            buf.append(part.toString(interpolator));
        }
        return buf.toString();
    }
}
