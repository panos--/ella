package org.unbunt.sqlscript.statement;

import java.util.List;
import java.util.ArrayList;

public abstract class AbstractFunctionCallExpression implements Expression {
    public static byte CALL_FLAG_SUPER = 0x1;
    public static byte CALL_FLAG_TAIL  = 0x2;

    protected byte callFlags = 0;

    protected List<Expression> arguments = new ArrayList<Expression>();

    public List<Expression> getArguments() {
        return arguments;
    }

    public void setArguments(List<Expression> arguments) {
        this.arguments = arguments;
    }

    public void addArgument(Expression argument) {
        arguments.add(argument);
    }

    public void setTailCall(boolean tailCall) {
        if (tailCall) {
            callFlags |= CALL_FLAG_TAIL;
        }
        else {
            callFlags &= ~CALL_FLAG_TAIL;
        }
    }

    public byte getCallFlags() {
        return callFlags;
    }
}
