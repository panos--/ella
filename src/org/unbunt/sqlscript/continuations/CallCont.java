package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.lang.Obj;
import org.unbunt.sqlscript.statement.Expression;
import org.unbunt.sqlscript.support.ContinuationVisitor;

import java.util.List;

public class CallCont implements Continuation {
    public static byte FLAG_SUPER = 0x1;
    public static byte FLAG_TAIL  = 0x2;

    protected Obj context;
    protected Obj receiver;
    protected List<Expression> arguments;
    protected byte flags;

    public CallCont(Obj context, Obj receiver, List<Expression> arguments, byte flags) {
        this.context = context;
        this.receiver = receiver;
        this.arguments = arguments;
        this.flags = flags;
    }

    public CallCont(Obj context, Obj receiver, List<Expression> arguments) {
        this.context = context;
        this.receiver = receiver;
        this.arguments = arguments;
        this.flags = 0;
    }

    public CallCont(List<Expression> arguments, byte flags) {
        this.context = null;
        this.receiver = null;
        this.arguments = arguments;
        this.flags = flags;
    }

    public Obj getContext() {
        return context;
    }

    public Obj getReceiver() {
        return receiver;
    }

    public List<Expression> getArguments() {
        return arguments;
    }

    public boolean isSuperCall() {
        return (flags & FLAG_SUPER) != 0;
    }

    public boolean isTailCall() {
        return (flags & FLAG_TAIL) != 0;
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}
