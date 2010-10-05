package org.unbunt.ella.compiler.support;

/**
 * User: tweiss
 * Date: 05.10.2010
 * Time: 16:49:14
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
public interface StringLiteralComponent {
    public String toSource();
    public String toSource(StringVariableInterpolator interpolator);
    public String toString(StringVariableInterpolator interpolator);
}
