package org.unbunt.ella.compiler.support;

import java.util.LinkedList;
import java.util.List;

/**
 * Represents a scope in a symbol table.
 * <p>
 * This class implements the lexical addressing scheme in that it calculates lexical addresses for every declared
 * variable.
 */
public class Scope {
    protected static final int UNDEF_BASE_ADDR = Math.abs(Integer.MIN_VALUE >> 1);

    protected Scope parent;

    protected List<String> vars = new LinkedList<String>();
    protected List<String> undefVars = new LinkedList<String>();
    protected int currAddr = -1;

    /**
     * Creates a new empty Scope with no associated parent scope.
     */
    public Scope() {
        this(null);
    }

    /**
     * Creates a new empty Scope with the given scope used as its parent scope.
     *
     * @param parent the parent scope.
     */
    public Scope(Scope parent) {
        this.parent = parent;
    }

    /**
     * Declares a variable with the given name in this scope and returns the corresponding Variable object.
     * <p>
     * If a variable with the same name is already declared in this scope a warning is issued and the already
     * declared variable is returned.
     *
     * @param name the variable name.
     * @return the variable object.
     */
    public Variable addVariable(String name) {
        int index = vars.indexOf(name);
        if (index != -1) {
            System.err.println("Warning: Variable " + name + " is already defined");
            return new Variable(index, name, true, false);
        }
        vars.add(name);
        return new Variable(++currAddr, name, false, false);
    }

    /**
     * Returns the variable of the given name.
     * <p>
     * The variable is looked up in this scope first and, if not found, in the
     * this scope's parent scope, if any.
     * <p>
     * If the variable could not be found and this scope has no parent scope, a new variable object is created which is
     * given a special address. This address results, in the lexical addressing scheme, in lookups for the variable
     * to be done up to the global environment, therefore giving dynamic environments the chance to resolve this
     * variable at runtime.
     *
     * @param name the name of the variable to look up.
     * @return the variable object.
     */
    public Variable getVariable(String name) {
        int addr = findVariable(name);
        return new Variable(addr, name, true, addr >= UNDEF_BASE_ADDR);
    }

    protected int findVariable(String name) {
        int addr = vars.indexOf(name);
        if (addr != -1) {
            return addr;
        }

        if (parent == null) {
            addr = undefVars.indexOf(name);
            if (addr == -1) {
                addr = UNDEF_BASE_ADDR + undefVars.size();
                undefVars.add(name);
            }
            else {
                addr = UNDEF_BASE_ADDR + addr;
            }
            return addr;
        }

        int paddr = parent.findVariable(name);

        if (paddr == -1) {
            return -1;
        }

        return paddr + 0x10000;
    }
}
