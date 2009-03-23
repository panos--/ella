package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.support.Parameter;
import org.unbunt.sqlscript.support.ContinuationVisitor;

public class InitParamCont implements Continuation {
    protected Parameter parameter;

    public InitParamCont(Parameter parameter) {
        this.parameter = parameter;
    }

    public Parameter getParameter() {
        return parameter;
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}
