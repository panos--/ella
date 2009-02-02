package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.lang.Bool;

public abstract class AbstractCondition extends AbstractExpression implements Condition {
    public AbstractCondition() {
    }

    public boolean isTrue() {
        return value != null && Bool.TRUE.equals(value);
    }

}
