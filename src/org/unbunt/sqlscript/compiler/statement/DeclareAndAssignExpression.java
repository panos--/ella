package org.unbunt.sqlscript.compiler.statement;

import org.unbunt.sqlscript.compiler.statement.ExpressionVisitor;
import org.unbunt.sqlscript.compiler.stmtbase.Expression;

public class DeclareAndAssignExpression implements Expression {
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
