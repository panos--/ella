package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.statement.AssignExpression;

public class AssignExprCont implements Continuation {
    protected AssignExpression assign;

    public AssignExprCont(AssignExpression assign) {
        this.assign = assign;
    }

    public AssignExpression getAssign() {
        return assign;
    }
}
