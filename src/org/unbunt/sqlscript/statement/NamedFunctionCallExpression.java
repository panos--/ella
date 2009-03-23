package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.support.Env;
import org.unbunt.sqlscript.support.ExpressionVisitor;
import org.unbunt.sqlscript.ScriptProcessor;

public class NamedFunctionCallExpression extends AbstractFunctionCallExpression {
    protected String function;

    public NamedFunctionCallExpression(String function) {
        this.function = function;
    }

    public String getFunction() {
        return function;
    }

    public void accept(ScriptProcessor processor, Env env) {
        processor.process(env, this);
    }

    public void accept(ExpressionVisitor visitor) {
        throw new UnsupportedOperationException();
    }
}
