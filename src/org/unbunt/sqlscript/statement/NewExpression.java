package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.ScriptProcessor;
import org.unbunt.sqlscript.support.Env;

import java.util.Map;

public class NewExpression extends AbstractExpression {
    protected Expression expression;
    protected Map<String, Expression> args = null;

    public NewExpression(Expression expression, Map<String, Expression> args) {
        this.expression = expression;
        this.args = args;
    }

    public NewExpression() {
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public Map<String, Expression> getArgs() {
        return args;
    }

    public void setArgs(Map<String, Expression> args) {
        this.args = args;
    }

    public void accept(ScriptProcessor processor, Env env) {
    }
}
