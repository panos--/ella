package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.statement.PrimitiveExpression;
import org.unbunt.sqlscript.statement.Expression;
import org.unbunt.sqlscript.lang.Obj;
import org.unbunt.sqlscript.support.ContinuationVisitor;

import java.util.Map;
import java.util.Iterator;
import java.util.HashMap;

public class PrimitiveCont implements Continuation {
    protected PrimitiveExpression primitiveExpression;
    protected Obj argument1;
    protected Map<String, Expression> arguments;
    protected Map<String, Obj> evaluatedArguments;
    protected Iterator<Map.Entry<String, Expression>> argumentsIterator;

    protected String currentArgument = null;

    public PrimitiveCont(PrimitiveExpression primitiveExpression, Obj argument1, Map<String, Expression> arguments) {
        this.primitiveExpression = primitiveExpression;
        this.argument1 = argument1;
        this.arguments = arguments;
        argumentsIterator = arguments.entrySet().iterator();
        evaluatedArguments = new HashMap<String, Obj>();
    }

    public PrimitiveExpression getPrimitiveExpression() {
        return primitiveExpression;
    }

    public boolean hasNextArgument() {
        return argumentsIterator.hasNext();
    }

    public Expression getNextArgument() {
        Map.Entry<String, Expression> entry = argumentsIterator.next();
        currentArgument = entry.getKey();
        return entry.getValue();
    }

    public Obj getArgument1() {
        return argument1;
    }

    public Map<String, Obj> getEvaluatedArguments() {
        return evaluatedArguments;
    }

    public void setArgumentValue(Obj value) {
        if (currentArgument == null) {
            return;
        }
        evaluatedArguments.put(currentArgument, value);
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}
