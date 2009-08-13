package org.unbunt.ella.engine.continuations;

import org.unbunt.ella.compiler.statement.AssignExpression;
import org.unbunt.ella.engine.continuations.ContinuationVisitor;

public class AssignExprCont implements Continuation {
    protected AssignExpression assign;

    public AssignExprCont(AssignExpression assign) {
        this.assign = assign;
    }

    public AssignExpression getAssign() {
        return assign;
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}
