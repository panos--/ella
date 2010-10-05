package org.unbunt.ella.compiler.support;

/**
 * User: tweiss
 * Date: 05.10.2010
 * Time: 16:51:00
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
public class StringText implements StringLiteralComponent {
    protected final String text;

    public StringText(String text) {
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
        return text;
    }
}
