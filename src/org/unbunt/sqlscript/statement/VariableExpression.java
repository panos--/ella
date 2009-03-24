package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.ScriptProcessor;
import org.unbunt.sqlscript.lang.Obj;
import org.unbunt.sqlscript.support.Variable;
import org.unbunt.sqlscript.support.Env;
import org.unbunt.sqlscript.support.ExpressionVisitor;

public class VariableExpression extends AbstractStatement implements Expression {
    protected Variable variable;

    public VariableExpression(Variable variable) {
        this.variable = variable;
    }

    public Obj getValue() {
        return variable.getValue();
    }

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    public void accept(ScriptProcessor processor, Env env) {
        processor.process(env, this);
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}
