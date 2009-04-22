package org.unbunt.sqlscript.support;

import org.unbunt.sqlscript.lang.Obj;

import java.util.Map;
import java.util.HashMap;

public class DynamicEnv extends AbstractEnv {
    protected DynamicVariableResolver resolver;
    protected Map<String, Obj> vars = new HashMap<String, Obj>();

    public DynamicEnv(Env parent, DynamicVariableResolver resolver) {
        super(parent);
        this.resolver = resolver;
    }

    public void setThis(Obj thisRef) {
        parent.setThis(thisRef);
    }

    public Obj getThis() {
        return parent.getThis();
    }

    public void extend() {
        parent.extend();
    }

    public Obj get(Variable var, int addr) {
        String name = var.name;
        Obj value = vars.get(name);
        if (value != null) {
            return value;
        }
        value = resolver.resolve(name);
        return value != null ? value : parent.get(var, addr);
    }

    public void set(Variable var, int addr, Obj value) {
        parent.set(var, addr, value);
    }

    public void add(Obj value) {
        parent.add(value);
    }
}
