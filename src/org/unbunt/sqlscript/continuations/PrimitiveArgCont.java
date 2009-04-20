package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.statement.Expression;
import org.unbunt.sqlscript.support.ContinuationVisitor;
import org.unbunt.sqlscript.lang.Native;
import org.unbunt.sqlscript.lang.Obj;
import org.unbunt.sqlscript.lang.Primitive;

import java.util.List;
import java.util.ArrayList;

public class PrimitiveArgCont implements Continuation {
    protected Primitive primitive;
    protected Obj context;

    protected List<Expression> args;
    protected List<Obj> argsValues;
    protected int argsSize;
    protected int currArg;

    public PrimitiveArgCont(Primitive primitive, Obj context, List<Expression> args) {
        this.primitive = primitive;
        this.context = context;
        this.args = args;
        this.argsValues = new ArrayList<Obj>(args.size());
        this.argsSize = args.size();
        this.currArg = 0;
    }

    public Primitive getPrimitive() {
        return primitive;
    }

    public Obj getContext() {
        return context;
    }

    public boolean hasNext() {
        return currArg < argsSize;
    }

    public Expression next() {
        return args.get(currArg++);
    }

    public void addArgsValue(Obj arg) {
        if (currArg > 0) {
            argsValues.add(arg);
        }
    }

    public List<Obj> getArgsValues() {
        return argsValues;
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}