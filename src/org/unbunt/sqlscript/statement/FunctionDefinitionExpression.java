package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.ScriptProcessor;
import org.unbunt.sqlscript.support.Function;
import org.unbunt.sqlscript.support.Env;

public class FunctionDefinitionExpression extends AbstractExpression implements StatementContainer {
    protected Function function;

    public FunctionDefinitionExpression(Function function) {
        this.function = function;
    }

    public Function getFunction() {
        return function;
    }

    public void setFunction(Function function) {
        this.function = function;
    }

    public void addStatement(Statement statement) {
        function.setBody(statement);
    }

    public void addStatement(Expression expression) {
        function.setBody(expression);
    }

    public void accept(ScriptProcessor processor, Env env) {
        processor.process(env, this);
    }
}