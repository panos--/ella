package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.support.ExpressionVisitor;

public class DeclareAndAssignExpression extends AbstractExpression {
    protected DeclareVariableExpression declareExpr;
    protected AssignExpression assignExpr;

    public DeclareAndAssignExpression(DeclareVariableExpression declareExpr, AssignExpression assignExpr) {
        this.declareExpr = declareExpr;
        this.assignExpr = assignExpr;
    }

    public DeclareVariableExpression getDeclareExpr() {
        return declareExpr;
    }

    public AssignExpression getAssignExpr() {
        return assignExpr;
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}
