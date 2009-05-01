package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.statement.Expression;
import org.unbunt.sqlscript.statement.SlotCallExpression;
import org.unbunt.sqlscript.support.ContinuationVisitor;

import java.util.List;

public class SlotCallReceiverCont implements Continuation {
    protected SlotCallExpression callExpression;

//    protected Expression slotExpression;
//    protected List<Expression> arguments;

//    public SlotCallReceiverCont(Expression slotExpression, List<Expression> arguments) {
//        this.slotExpression = slotExpression;
//        this.arguments = arguments;
//    }

    public SlotCallReceiverCont(SlotCallExpression callExpression) {
        this.callExpression = callExpression;
    }

//    public Expression getSlotExpression() {
//        return slotExpression;
//    }
//
//    public List<Expression> getArguments() {
//        return arguments;
//    }

    public SlotCallExpression getCallExpression() {
        return callExpression;
    }

    public Expression getSlotExpression() {
        return callExpression.getSlotExpression().getSlot();
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}
