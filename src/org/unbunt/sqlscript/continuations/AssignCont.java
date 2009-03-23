package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.support.ContinuationVisitor;

public class AssignCont implements Continuation {
    protected String variable;

    public AssignCont(String variable) {
        this.variable = variable;
    }

    public String getVariable() {
        return variable;
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}
