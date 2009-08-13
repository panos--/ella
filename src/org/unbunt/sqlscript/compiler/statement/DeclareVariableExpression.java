package org.unbunt.ella.compiler.statement;

import org.unbunt.ella.compiler.statement.ExpressionVisitor;
import org.unbunt.ella.compiler.support.Variable;
import org.unbunt.ella.compiler.stmtbase.Expression;

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
