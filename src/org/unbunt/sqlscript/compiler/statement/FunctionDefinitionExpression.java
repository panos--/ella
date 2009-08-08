package org.unbunt.sqlscript.compiler.statement;

import org.unbunt.sqlscript.compiler.statement.ExpressionVisitor;
import org.unbunt.sqlscript.compiler.support.Function;
import org.unbunt.sqlscript.compiler.support.Variable;
import org.unbunt.sqlscript.compiler.stmtbase.Expression;
import org.unbunt.sqlscript.compiler.stmtbase.Statement;
import org.unbunt.sqlscript.compiler.stmtbase.StatementContainer;

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