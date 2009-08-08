package org.unbunt.sqlscript.compiler.support;

import org.unbunt.sqlscript.compiler.support.Variable;

import java.util.*;

public class Scope {
    protected static final int UNDEF_BASE_ADDR = Math.abs(Integer.MIN_VALUE >> 1);

    protected Scope parent;

    protected List<String> vars = new LinkedList<String>();
    protected List<String> undefVars = new LinkedList<String>();
    protected int currAddr = -1;

    public Scope() {
        this(null);
    }

    public Scope(Scope parent) {
        this.parent = parent;
    }

    public Variable addVariable(String name) {
        int index = vars.indexOf(name);
        if (index != -1) {
            System.err.println("Warning: Variable " + name + " is already defined");
            return new Variable(index, name, true, false);
        }
        vars.add(name);
        return new Variable(++currAddr, name, false, false);
    }

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
