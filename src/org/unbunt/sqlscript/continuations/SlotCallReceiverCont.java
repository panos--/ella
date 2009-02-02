package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.statement.Expression;

import java.util.Map;

public class SlotCallReceiverCont implements Continuation {
    protected Expression slotExpression;
    protected Map<String, Expression> arguments;

    public SlotCallReceiverCont(Expression slotExpression, Map<String, Expression> arguments) {
        this.slotExpression = slotExpression;
        this.arguments = arguments;
    }

    public Expression getSlotExpression() {
        return slotExpression;
    }

    public Map<String, Expression> getArguments() {
        return arguments;
    }
}
