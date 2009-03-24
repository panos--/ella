package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.lang.Obj;
import org.unbunt.sqlscript.statement.Expression;
import org.unbunt.sqlscript.support.ContinuationVisitor;

import java.util.List;

public class FunCont implements Continuation {
    protected Obj context = null;
    protected List<Expression> arguments;

    public FunCont(Obj context, List<Expression> arguments) {
        this.context = context;
        this.arguments = arguments;
    }

    public FunCont(List<Expression> arguments) {
        this.arguments = arguments;
    }

    public Obj getContext() {
        return context;
    }

    public List<Expression> getArguments() {
        return arguments;
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}
