package org.unbunt.sqlscript.engine.environment;

import org.unbunt.sqlscript.engine.corelang.Obj;
import org.unbunt.sqlscript.engine.environment.Env;
import org.unbunt.sqlscript.engine.environment.DynamicVariableResolver;
import org.unbunt.sqlscript.engine.continuations.Continuation;
import org.unbunt.sqlscript.compiler.support.Variable;
import org.unbunt.sqlscript.compiler.support.Scope;

import java.util.Map;
import java.util.HashMap;

/**
 * TODO: Remove caching - there is the CachingVariableResolver for a reason...
 */
public class DynamicEnv extends AbstractEnv {
    protected DynamicVariableResolver resolver;
    protected WritableVariableResolver writableResolver;
    protected boolean writable;

    protected Map<String, Obj> vars = new HashMap<String, Obj>();
    protected int boundaryAddress;

    public DynamicEnv(Env parent, DynamicVariableResolver resolver) {
        super(parent);
        this.resolver = resolver;
        this.boundaryAddress = parent.getMaxAddress();
        if (resolver instanceof WritableVariableResolver) {
            writable = true;
            writableResolver = (WritableVariableResolver) resolver;
        }
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
        Obj value = resolver.resolve(var);
        return value != null ? value : parent.get(var, addr);
    }

    public void set(Variable var, int addr, Obj value) {
        boolean handle = true;
        if (!writable) {
            handle = false;
        }
        else if (!var.implicit && addr < 0x10000 && addr > boundaryAddress) {
            handle = false;
        }
        else if (resolver.resolve(var) == null) {
            handle = false;
        }

        if (handle) {
            writableResolver.update(var, value);
        }
        else {
            parent.set(var, addr, value);
        }
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
