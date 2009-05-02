package org.unbunt.sqlscript.support;

import org.unbunt.sqlscript.lang.Obj;

import java.util.Map;
import java.util.HashMap;

/**
 * TODO: negative cache
 */
public class DynamicEnv extends AbstractEnv {
    protected DynamicVariableResolver resolver;
    protected Map<String, Obj> vars = new HashMap<String, Obj>();
    protected int boundaryAddress;

    public DynamicEnv(Env parent, DynamicVariableResolver resolver) {
        super(parent);
        this.resolver = resolver;
        this.boundaryAddress = parent.getMaxAddress();
    }

    public void setContext(Obj context) {
        parent.setContext(context);
    }

    public Obj getContext() {
        return parent.getContext();
    }

    public void setReceiver(Obj receiver) {
        parent.setReceiver(receiver);
    }

    public Obj getReceiver() {
        return parent.getReceiver();
    }

    public void extend() {
        parent.extend();
    }

    public Obj get(Variable var, int addr) {
        if (!var.implicit && addr < 0x10000 && addr > boundaryAddress) {
            return parent.get(var, addr);
        }
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

    public int getMaxAddress() {
        return parent.getMaxAddress();
    }
}
