package org.unbunt.sqlscript.engine.continuations;

import org.unbunt.sqlscript.engine.continuations.ContinuationVisitor;
import org.unbunt.sqlscript.compiler.support.Variable;

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
