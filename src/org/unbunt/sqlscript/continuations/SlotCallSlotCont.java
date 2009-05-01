package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.lang.Obj;
import org.unbunt.sqlscript.statement.Expression;
import org.unbunt.sqlscript.statement.SlotCallExpression;
import org.unbunt.sqlscript.support.ContinuationVisitor;

import java.util.List;

public class SlotCallSlotCont implements Continuation {
    protected SlotCallExpression callExpression;
    protected Obj receiver;
    protected List<Expression> arguments;

    public SlotCallSlotCont(Obj receiver, SlotCallExpression callExpression) {
        this.receiver = receiver;
        this.callExpression = callExpression;
    }

    public Obj getReceiver() {
        return receiver;
    }

    public List<Expression> getArguments() {
        return callExpression.getArguments();
    }

    public boolean isCallSuper() {
        return callExpression.isCallSuper();
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}
