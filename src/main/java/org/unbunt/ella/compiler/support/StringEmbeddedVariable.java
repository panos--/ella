package org.unbunt.ella.compiler.support;

/**
 * User: tweiss
 * Date: 05.10.2010
 * Time: 16:58:33
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
public class StringEmbeddedVariable implements StringLiteralComponent {
    protected final Variable variable;

    public StringEmbeddedVariable(Variable variable) {
        this.variable = variable;
    }

    public Variable getVariable() {
        return variable;
    }

    public String toSource() {
        return "@{" + variable.name + "}";
    }

    public String toSource(StringVariableInterpolator interpolator) {
        return interpolator.interpolate(variable);
    }

    public String toString(StringVariableInterpolator interpolator) {
        return interpolator.interpolate(variable);
    }
}
