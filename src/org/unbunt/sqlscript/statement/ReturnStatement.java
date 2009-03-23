package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.ScriptProcessor;
import org.unbunt.sqlscript.support.Env;
import org.unbunt.sqlscript.support.ExpressionVisitor;

public class ReturnStatement extends AbstractStatement {
    protected Expression expression = null;

    public ReturnStatement() {
    }

    public boolean hasExpression() {
        return expression != null;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public void accept(ScriptProcessor processor, Env env) {
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}
