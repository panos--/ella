package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.lang.Obj;
import org.unbunt.sqlscript.statement.Expression;

import java.util.Map;

public class SlotCallSlotCont implements Continuation {
    protected Obj receiver;
    protected Map<String, Expression> arguments;

    public SlotCallSlotCont(Obj receiver, Map<String, Expression> arguments) {
        this.receiver = receiver;
        this.arguments = arguments;
    }

    public Obj getReceiver() {
        return receiver;
    }

    public Map<String, Expression> getArguments() {
        return arguments;
    }
}
