package org.unbunt.ella.compiler.statement;

import org.unbunt.ella.compiler.statement.ExpressionVisitor;
import org.unbunt.ella.compiler.support.Variable;
import org.unbunt.ella.compiler.stmtbase.Expression;

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
