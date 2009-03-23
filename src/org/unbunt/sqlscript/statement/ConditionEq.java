package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.ScriptProcessor;
import org.unbunt.sqlscript.support.Env;
import org.unbunt.sqlscript.support.ExpressionVisitor;

public class ConditionEq extends AbstractCondition {
    protected Expression op1;
    protected Expression op2;

    public ConditionEq(Expression op1, Expression op2) {
        this.op1 = op1;
        this.op2 = op2;
    }

    public Expression getOp1() {
        return op1;
    }

    public void setOp1(Expression op1) {
        this.op1 = op1;
    }

    public Expression getOp2() {
        return op2;
    }

    public void setOp2(Expression op2) {
        this.op2 = op2;
    }

    public void accept(ScriptProcessor processor, Env env) {
        processor.process(env, this);
    }

    public void accept(ExpressionVisitor visitor) {
        throw new UnsupportedOperationException();
    }
}
