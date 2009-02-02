package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.ScriptProcessor;
import org.unbunt.sqlscript.support.Env;

public class DeclareVariableExpression extends AbstractExpression {
    protected String name;

    public DeclareVariableExpression(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void accept(ScriptProcessor processor, Env env) {
        processor.process(env, this);
    }
}
