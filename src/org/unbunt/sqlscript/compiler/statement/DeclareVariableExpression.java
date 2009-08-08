package org.unbunt.sqlscript.compiler.statement;

import org.unbunt.sqlscript.compiler.statement.ExpressionVisitor;
import org.unbunt.sqlscript.compiler.support.Variable;
import org.unbunt.sqlscript.compiler.stmtbase.Expression;

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
