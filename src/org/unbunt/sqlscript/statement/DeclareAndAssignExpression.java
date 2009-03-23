package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.ScriptProcessor;
import org.unbunt.sqlscript.support.Env;
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

    public void accept(ScriptProcessor processor, Env env) {
        processor.process(env, this);
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}
