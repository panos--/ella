package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.ScriptProcessor;
import org.unbunt.sqlscript.support.Env;
import org.unbunt.sqlscript.support.ExpressionVisitor;
import org.unbunt.sqlscript.support.Variable;

public class DeclareVariableExpression extends AbstractExpression {
    protected Variable variable;

    public DeclareVariableExpression(Variable variable) {
        this.variable = variable;
    }

    public boolean isNoop() {
        return variable == null;
    }

    public Variable getVariable() {
        return variable;
    }

    public void accept(ScriptProcessor processor, Env env) {
        processor.process(env, this);
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}
