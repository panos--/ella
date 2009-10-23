package org.unbunt.ella.engine.environment;

import org.unbunt.ella.compiler.support.Scope;
import org.unbunt.ella.compiler.support.Variable;
import org.unbunt.ella.engine.continuations.Continuation;
import org.unbunt.ella.engine.corelang.Obj;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents a dynamic environment which tries to resolve relevant variables by their name instead of their lexical
 * address. Relevant variables are variables that have been declared <i>before</i> the dynamic environment was
 * installed.
 */
public class DynamicEnv extends AbstractEnv {
    protected DynamicVariableResolver resolver;
    protected WritableVariableResolver writableResolver;
    protected boolean writable;

    protected Map<String, Obj> vars = new HashMap<String, Obj>();
    protected int boundaryAddress;

    /**
     * Creates a new dynamic environment which uses the given resolver to resolve relevant variables.
     *
     * @param parent the parent environment of the new environment.
     * @param resolver the resolver to use.
     */
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
