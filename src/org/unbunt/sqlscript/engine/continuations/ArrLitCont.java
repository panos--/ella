package org.unbunt.sqlscript.engine.continuations;

import org.unbunt.sqlscript.engine.natives.Obj;
import org.unbunt.sqlscript.compiler.stmtbase.Expression;
import org.unbunt.sqlscript.engine.continuations.ContinuationVisitor;

import java.util.ArrayList;
import java.util.List;

public class ArrLitCont implements Continuation {
    protected final Expression[] components;
    protected final List<Obj> componentValues;
    protected final int size;

    protected int curIdx = 0;

    public ArrLitCont(Expression[] components) {
        this.size = components.length;
        this.components = components;
        this.componentValues = new ArrayList<Obj>(size);
    }

    public void addComponentValue(Obj val) {
        if (curIdx - 1 != -1) {
            componentValues.add(val);
        }
    }

    public Expression getNextComponent() {
        if (curIdx == size) {
            return null;
        }
        return components[curIdx++];
    }

    public List<Obj> getComponentValues() {
        return componentValues;
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}