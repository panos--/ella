package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.support.ExpressionVisitor;
import org.unbunt.sqlscript.support.Scope;

public class IfStatement extends AbstractStatement implements StatementContainer {
    protected Expression condition = null;
    protected Statement trueStatement = null;
    protected Statement falseStatement = null;

    public IfStatement() {
    }

    public IfStatement(Scope scope) {
        super(scope);
    }

    public IfStatement(Expression condition, Statement trueStatement, Statement falseStatement) {
        this.condition = condition;
        this.trueStatement = trueStatement;
        this.falseStatement = falseStatement;
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public Statement getTrueStatement() {
        return trueStatement;
    }

    public void setTrueStatement(Statement trueStatement) {
        this.trueStatement = trueStatement;
    }

    public Statement getFalseStatement() {
        return falseStatement;
    }

    public void setFalseStatement(Statement falseStatement) {
        this.falseStatement = falseStatement;
    }

    public boolean hasFalseStatement() {
        return falseStatement != null;
    }

    public void addStatement(Expression expression) {
        condition = expression;
    }

    public void addStatement(Statement statement) {
        if (trueStatement == null) {
            trueStatement = statement;
        }
        else {
            falseStatement = statement;
        }
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}
