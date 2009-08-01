package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.statement.ExpressionVisitor;
import org.unbunt.sqlscript.support.Function;
import org.unbunt.sqlscript.support.Variable;

public class FunctionDefinitionExpression implements Expression, StatementContainer {
    protected Function function;
    protected Variable variable;
    protected boolean declareVariable;

    public FunctionDefinitionExpression(Function function) {
        this.function = function;
    }

    public Function getFunction() {
        return function;
    }

    public void setFunction(Function function) {
        this.function = function;
    }

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    public boolean isDeclareVariable() {
        return declareVariable;
    }

    public void setDeclareVariable(boolean declareVariable) {
        this.declareVariable = declareVariable;
    }

    public void addStatement(Statement statement) {
        function.setBody(statement);
    }

    public void addStatement(Expression expression) {
        function.setBody(expression);
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}