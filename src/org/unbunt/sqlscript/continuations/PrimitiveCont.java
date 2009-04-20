package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.lang.Obj;
import org.unbunt.sqlscript.statement.Expression;
import org.unbunt.sqlscript.statement.PrimitiveExpression;
import org.unbunt.sqlscript.support.ContinuationVisitor;

import java.util.List;

public class PrimitiveCont implements Continuation {
    protected PrimitiveExpression primitiveExpression;
    protected Obj argument1;
    protected List<Expression> arguments;
    protected int argsSize;
    protected int currArg;
    protected boolean firstArg = true;

    protected Obj[] evaluatedArguments;

    public PrimitiveCont(PrimitiveExpression primitiveExpression, Obj argument1, List<Expression> arguments) {
        this.primitiveExpression = primitiveExpression;
        this.argument1 = argument1;
        this.arguments = arguments;
        this.argsSize = arguments.size();
        this.currArg = 0;
        this.evaluatedArguments = new Obj[argsSize];
    }

    public PrimitiveExpression getPrimitiveExpression() {
        return primitiveExpression;
    }

    public boolean hasNextArgument() {
        return currArg < argsSize;
    }

    /**
     * NOTE: Does not alter the arguments iterator. That one is moved ahead on a call to setArgumentValue() only.
     * @return Expression the expressed value of the current argument
     */
    public Expression getNextArgument() {
        return arguments.get(currArg);
    }

    public Obj getArgument1() {
        return argument1;
    }

    public Obj[] getEvaluatedArguments() {
        return evaluatedArguments;
    }

    /**
     * FIXME: Has to be called once before the first call to getNextArgument(). The value given with this first call
     *        will be ignored...
     * @param value the current argument's value
     */
    public void setArgumentValue(Obj value) {
        if (firstArg) {
            firstArg = false;
            return;
        }
        evaluatedArguments[currArg++] = value;
    }

    public void accept(ContinuationVisitor visitor) {
//        visitor.processContinuation(this);
    }
}
