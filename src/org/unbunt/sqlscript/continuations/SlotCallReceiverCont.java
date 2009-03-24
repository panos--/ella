package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.statement.Expression;
import org.unbunt.sqlscript.support.ContinuationVisitor;

import java.util.List;

public class SlotCallReceiverCont implements Continuation {
    protected Expression slotExpression;
    protected List<Expression> arguments;

    public SlotCallReceiverCont(Expression slotExpression, List<Expression> arguments) {
        this.slotExpression = slotExpression;
        this.arguments = arguments;
    }

    public Expression getSlotExpression() {
        return slotExpression;
    }

    public List<Expression> getArguments() {
        return arguments;
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}
