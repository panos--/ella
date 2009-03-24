package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.support.Env;
import org.unbunt.sqlscript.support.ExpressionVisitor;
import org.unbunt.sqlscript.support.Variable;
import org.unbunt.sqlscript.ScriptProcessor;

public class AssignExpression extends AbstractExpression {
    protected Variable variable;
    protected Expression rvalue;

    public AssignExpression(Variable variable, Expression rvalue) {
        this.variable = variable;
        this.rvalue = rvalue;
    }

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    public Expression getRvalue() {
        return rvalue;
    }

    public void setRvalue(Expression rvalue) {
        this.rvalue = rvalue;
    }

    public void accept(ScriptProcessor processor, Env env) {
        processor.process(env, this);
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}
