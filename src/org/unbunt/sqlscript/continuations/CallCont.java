package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.lang.Obj;
import org.unbunt.sqlscript.statement.Expression;
import org.unbunt.sqlscript.support.ContinuationVisitor;

import java.util.List;

public class CallCont implements Continuation {
    protected Obj context = null;
    protected List<Expression> arguments;
    protected boolean superCall;

    public CallCont(Obj context, List<Expression> arguments, boolean superCall) {
        this.context = context;
        this.arguments = arguments;
        this.superCall = superCall;
    }

    public CallCont(Obj context, List<Expression> arguments) {
        this.context = context;
        this.arguments = arguments;
        this.superCall = false;
    }

    public CallCont(List<Expression> arguments) {
        this.arguments = arguments;
    }

    public Obj getContext() {
        return context;
    }

    public List<Expression> getArguments() {
        return arguments;
    }

    public boolean isSuperCall() {
        return superCall;
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}
