package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.statement.PrimitiveExpression;

import java.util.HashMap;
import java.util.Map;

public abstract class BaseObj extends Obj {
    protected Map<Obj, PrimitiveExpression> primitives = new HashMap<Obj, PrimitiveExpression>();

    @Override
    public boolean hasPrimitiveInSlot(Obj key) {
        return primitives.containsKey(key);
    }

    @Override
    public PrimitiveExpression getPrimitiveForSlot(Obj key) {
        return primitives.get(key);
    }
}
