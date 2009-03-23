package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.support.Env;
import org.unbunt.sqlscript.support.ExpressionVisitor;
import org.unbunt.sqlscript.ScriptProcessor;

public class NotExpression extends AbstractExpression {
    protected Expression expression;

    public NotExpression(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public void accept(ScriptProcessor processor, Env env) {
        processor.process(env, this);
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}
