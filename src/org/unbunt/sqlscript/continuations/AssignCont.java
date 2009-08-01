package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.continuations.ContinuationVisitor;
import org.unbunt.sqlscript.support.Variable;

public class AssignCont implements Continuation {
    protected Variable variable;

    public AssignCont(Variable variable) {
        this.variable = variable;
    }

    public Variable getVariable() {
        return variable;
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}
