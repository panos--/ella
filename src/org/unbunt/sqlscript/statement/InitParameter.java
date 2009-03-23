package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.support.Parameter;
import org.unbunt.sqlscript.support.Env;
import org.unbunt.sqlscript.support.ExpressionVisitor;
import org.unbunt.sqlscript.ScriptProcessor;

public class InitParameter extends AbstractStatement {
    protected Parameter parameter;
    protected Expression expression;

    public InitParameter(Parameter parameter, Expression expression) {
        this.parameter = parameter;
        this.expression = expression;
    }

    public Parameter getParameter() {
        return parameter;
    }

    public Expression getExpression() {
        return expression;
    }

    public void accept(ScriptProcessor processor, Env env) {
        processor.process(env, this);
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}
