package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.ScriptProcessor;
import org.unbunt.sqlscript.support.Env;

import java.util.List;

public class ConditionAnd extends CompositeCondition {
    public ConditionAnd() {
    }

    public ConditionAnd(List<Expression> expressions) {
        super(expressions);
    }

    public List<Expression> getExpressions() {
        assert expressions.size() > 0 : "expressions must have at least one element";
        return expressions;
    }

    public void accept(ScriptProcessor processor, Env env) {
        processor.process(env, this);
    }
}