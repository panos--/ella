package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.statement.ExpressionVisitor;
import org.unbunt.sqlscript.compiler.Variable;

public class DeclareVariableExpression implements Expression {
    protected Variable variable;

    public DeclareVariableExpression(Variable variable) {
        this.variable = variable;
    }

//    public boolean isNoop() {
//        return variable == null;
//    }

    public Variable getVariable() {
        return variable;
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}
