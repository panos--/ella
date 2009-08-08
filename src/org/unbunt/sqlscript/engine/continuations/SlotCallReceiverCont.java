package org.unbunt.sqlscript.engine.continuations;

import org.unbunt.sqlscript.compiler.stmtbase.Expression;
import org.unbunt.sqlscript.compiler.statement.SlotCallExpression;
import org.unbunt.sqlscript.engine.continuations.ContinuationVisitor;

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
