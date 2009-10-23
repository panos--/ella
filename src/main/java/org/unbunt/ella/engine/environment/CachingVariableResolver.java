package org.unbunt.ella.engine.environment;

import org.unbunt.ella.compiler.support.Variable;
import org.unbunt.ella.engine.corelang.Obj;

import java.util.HashMap;
import java.util.Map;

/**
 * Provides a caching mechanism for dynamic variable resolvers.
 */
public class CachingVariableResolver implements WritableVariableResolver {
    protected final DynamicVariableResolver realResolver;

    protected final Map<String, Obj> cache = new HashMap<String, Obj>();

    /**
     * Creates a new CachingVariableResolver using the given resolver as the base resolver.
     *
     * @param realResolver the base resolver.
     */
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
