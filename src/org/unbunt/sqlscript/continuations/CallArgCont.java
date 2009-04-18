package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.statement.Expression;
import org.unbunt.sqlscript.statement.Statement;
import org.unbunt.sqlscript.support.Callable;
import org.unbunt.sqlscript.support.ContinuationVisitor;
import org.unbunt.sqlscript.support.Env;

import java.util.List;

public class CallArgCont implements Continuation {
    protected Callable callable;

    protected List<Expression> args;
    protected int argsSize;
    protected int currArg;

    protected Env funcEnv;
    protected Env savedEnv;

    public CallArgCont(Callable callable, List<Expression> args, Env savedEnv) {
        this.callable = callable;
        this.args = args;
        this.argsSize = args.size();
        this.currArg = 0;
        this.funcEnv = callable.getEnv().clone();
        this.savedEnv = savedEnv;
    }

    public CallArgCont(Callable callable, List<Expression> args, Env funcEnv, Env savedEnv) {
        this.callable = callable;
        this.args = args;
        this.argsSize = args.size();
        this.currArg = 0;
        this.funcEnv = funcEnv;
        this.savedEnv = savedEnv;
    }

    public Callable getCallable() {
        return callable;
    }

    public boolean hasNext() {
        return currArg < argsSize;
    }

    public Expression next() {
        return args.get(currArg++);
    }

    public Env getCallEnv() {
        return funcEnv;
    }

    public Env getSavedEnv() {
        return savedEnv;
    }

    public Statement getBody() {
        return callable.getBody();
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}
