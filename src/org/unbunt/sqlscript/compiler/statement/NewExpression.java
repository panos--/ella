package org.unbunt.sqlscript.compiler.statement;

import org.unbunt.sqlscript.compiler.statement.ExpressionVisitor;
import org.unbunt.sqlscript.compiler.stmtbase.Expression;

import java.util.List;

public class NewExpression implements Expression {
    protected Expression expression;
    protected List<Expression> arguments;

    public NewExpression(Expression expression, List<Expression> arguments) {
        this.expression = expression;
        this.arguments = arguments;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public List<Expression> getArguments() {
        return arguments;
    }

    public void setArguments(List<Expression> arguments) {
        this.arguments = arguments;
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}
