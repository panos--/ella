package org.unbunt.ella.compiler.support;

/**
 * Represents an escape sequence (e.g. escaping an embedded delimiter) inside of a string literal.
 */
public class StringEscape implements StringLiteralComponent {
    protected final String text;

    public StringEscape(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String toSource() {
        return text;
    }

    public String toSource(StringVariableInterpolator interpolator) {
        return text;
    }

    public String toString(StringVariableInterpolator interpolator) {
        return "";
    }
}
