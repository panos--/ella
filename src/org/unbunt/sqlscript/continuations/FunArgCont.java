package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.statement.Expression;
import org.unbunt.sqlscript.statement.Statement;
import org.unbunt.sqlscript.support.ContinuationVisitor;
import org.unbunt.sqlscript.support.Env;
import org.unbunt.sqlscript.support.Function;

import java.util.List;

public class FunArgCont implements Continuation {
    protected Function func;

    protected List<Expression> args;
    protected int argsSize;
    protected int currArg;

    protected Env funcEnv;
    protected Env savedEnv;

    public FunArgCont(Function func, List<Expression> args, Env savedEnv) {
        this.func = func;
        this.args = args;
        this.argsSize = args.size();
        this.currArg = 0;
        this.funcEnv = func.getEnv().clone();
        this.savedEnv = savedEnv;
    }

    public FunArgCont(Function func, List<Expression> args, Env funcEnv, Env savedEnv) {
        this.func = func;
        this.args = args;
        this.argsSize = args.size();
        this.currArg = 0;
        this.funcEnv = funcEnv;
        this.savedEnv = savedEnv;
    }

    public Function getFunc() {
        return func;
    }

    public boolean hasNext() {
        return currArg < argsSize;
    }

    public Expression next() {
        return args.get(currArg++);
    }

    public Env getFuncEnv() {
        return funcEnv;
    }

    public Env getSavedEnv() {
        return savedEnv;
    }

    public Statement getBody() {
        return func.getBody();
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}
