package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.support.Env;
import org.unbunt.sqlscript.ScriptProcessor;

public class AssignExpression extends AbstractExpression {
//    protected Variable variable;
    protected String variable;
    protected Expression rvalue;

    public AssignExpression(String variable, Expression rvalue) {
        this.variable = variable;
        this.rvalue = rvalue;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
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
}
