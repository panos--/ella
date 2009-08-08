package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.statement.ExpressionVisitor;
import org.unbunt.sqlscript.compiler.Variable;

public class AssignExpression implements Expression {
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

    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}
