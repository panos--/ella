package org.unbunt.sqlscript.support;

import org.unbunt.sqlscript.lang.Obj;
import org.unbunt.sqlscript.continuations.Continuation;

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

    public void extend(Variable var) {
        parent.extend(var);
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
        value = resolver.resolve(var);
        return value != null ? value : parent.get(var, addr);
    }

    public void set(Variable var, int addr, Obj value) {
        parent.set(var, addr, value);
    }

    public void add(Variable var, Obj value) {
        parent.add(var, value);
    }

    public int getMaxAddress() {
        return parent.getMaxAddress();
    }

    public void setClosureHome(int offset, Continuation cont) {
        parent.setClosureHome(offset, cont);
    }

    public int getClosureHomeOffset() {
        return parent.getClosureHomeOffset();
    }

    public Continuation getClosureHomeCont() {
        return parent.getClosureHomeCont();
    }

    public Scope toScope() {
        // XXX: Check if any special actions are required besides just returning parent scope
        // XXX: (esp. in context of include files)
        return parent.toScope();
    }
}
