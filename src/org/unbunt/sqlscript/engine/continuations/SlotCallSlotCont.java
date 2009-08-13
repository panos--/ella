package org.unbunt.sqlscript.engine.continuations;

import org.unbunt.sqlscript.engine.corelang.Obj;
import org.unbunt.sqlscript.compiler.stmtbase.Expression;
import org.unbunt.sqlscript.compiler.statement.SlotCallExpression;
import org.unbunt.sqlscript.engine.continuations.ContinuationVisitor;

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

    public byte getCallFlags() {
        return callExpression.getCallFlags();
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}
