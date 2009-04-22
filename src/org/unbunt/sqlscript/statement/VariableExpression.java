package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.support.ExpressionVisitor;
import org.unbunt.sqlscript.support.Variable;

public class VariableExpression extends AbstractStatement implements Expression {
    protected Variable variable;

    public VariableExpression(Variable variable) {
        this.variable = variable;
    }

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}
