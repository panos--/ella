package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.lang.Args;
import org.unbunt.sqlscript.lang.Obj;
import org.unbunt.sqlscript.statement.Expression;
import org.unbunt.sqlscript.support.ContinuationVisitor;

import java.util.List;

public class ArgsCont implements Continuation {
    protected List<Expression> args;
    protected Obj[] argsValues;
    protected int argsSize;
    protected int currArg;

    public ArgsCont(List<Expression> args) {
        this.args = args;
        this.argsValues = new Obj[args.size()];
        this.argsSize = args.size();
        this.currArg = 0;
    }

    public boolean hasNext() {
        return currArg < argsSize;
    }

    public Expression next() {
        return args.get(currArg);
    }

    public void addArgsValue(Obj arg) {
        argsValues[currArg++] = arg;
    }

    public Args getArgsValues() {
        return new Args(argsValues);
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}
