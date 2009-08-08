package org.unbunt.sqlscript.engine;

import org.unbunt.sqlscript.engine.Obj;
import org.unbunt.sqlscript.engine.DynamicVariableResolver;
import org.unbunt.sqlscript.compiler.Variable;

import java.util.Map;
import java.util.HashMap;

public class CachingVariableResolver implements WritableVariableResolver {
    protected final DynamicVariableResolver realResolver;

    protected final Map<String, Obj> cache = new HashMap<String, Obj>();

    public CachingVariableResolver(DynamicVariableResolver realResolver) {
        this.realResolver = realResolver;
    }

    public Obj resolve(Variable var) {
        String name = var.name;
        Obj value = cache.get(name);
        if (value != null) {
            return value;
        }
        value = realResolver.resolve(var);
        if (value != null) {
            cache.put(name, value);
        }
        return value;
    }

    public void update(Variable var, Obj value) {
        cache.put(var.name, value);
    }
}
