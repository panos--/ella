package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.support.Parameter;

public class InitParamCont implements Continuation {
    protected Parameter parameter;

    public InitParamCont(Parameter parameter) {
        this.parameter = parameter;
    }

    public Parameter getParameter() {
        return parameter;
    }
}
