package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.statement.Expression;
import org.unbunt.sqlscript.support.ContinuationVisitor;

import java.util.Collection;
import java.util.Iterator;

public class LogicAndCont implements Continuation {
    protected Iterator<Expression> iterator;

    public LogicAndCont(Collection<Expression> expressions) {
        iterator = expressions.iterator();
    }

    public boolean hasNext() {
        return iterator.hasNext();
    }

    public Expression next() {
        return iterator.next();
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}
