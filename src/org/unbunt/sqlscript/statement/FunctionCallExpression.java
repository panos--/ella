package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.ScriptProcessor;
import org.unbunt.sqlscript.support.Env;

public class FunctionCallExpression extends AbstractFunctionCallExpression {
    protected Expression expression;

    public FunctionCallExpression(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public void accept(ScriptProcessor processor, Env env) {
        processor.process(env, this);
    }
}
