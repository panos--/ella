package org.unbunt.sqlscript.support;

import org.unbunt.sqlscript.lang.Obj;

import java.util.Map;
import java.util.HashMap;

public class CachingVariableResolver implements DynamicVariableResolver {
    protected final DynamicVariableResolver realResolver;

    protected final Map<String, Obj> cache = new HashMap<String, Obj>();

    public CachingVariableResolver(DynamicVariableResolver realResolver) {
        this.realResolver = realResolver;
    }

    public Obj resolve(Variable var) {
        Obj value = cache.get(var.name);
        if (value != null) {
            return value;
        }
        value = realResolver.resolve(var);
        if (value != null) {
            cache.put(var.name, value);
        }
        return value;
    }
}
