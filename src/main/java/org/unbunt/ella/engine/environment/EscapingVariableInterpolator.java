package org.unbunt.ella.engine.environment;

import org.unbunt.ella.compiler.support.StringVariableInterpolator;
import org.unbunt.ella.compiler.support.Variable;
import org.unbunt.ella.compiler.support.SQLStringType;

/**
 * User: tweiss
 * Date: 05.10.2010
 * Time: 17:12:34
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
public class EscapingVariableInterpolator implements StringVariableInterpolator {
    protected final StringVariableInterpolator baseInterpolator;

    protected SQLStringType stringType = SQLStringType.sql92;
    protected String delim = "\'";

    public EscapingVariableInterpolator(StringVariableInterpolator baseInterpolator) {
        this.baseInterpolator = baseInterpolator;
    }

    public String interpolate(Variable variable) {
        return stringType.escape(baseInterpolator.interpolate(variable), delim);
    }

    public SQLStringType getStringType() {
        return stringType;
    }

    public void setStringType(SQLStringType stringType) {
        this.stringType = stringType;
    }

    public String getDelim() {
        return delim;
    }

    public void setDelim(String delim) {
        this.delim = delim;
    }
}
