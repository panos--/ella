package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.statement.ExpressionVisitor;
import org.unbunt.sqlscript.compiler.Variable;

public class VariableExpression implements Expression {
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
