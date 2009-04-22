package org.unbunt.sqlscript.support;

import java.util.*;

public class Scope {
    protected Scope parent;

    protected List<String> vars = new LinkedList<String>();
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
            return new Variable(index, name, true);
        }
        vars.add(name);
        return new Variable(++currAddr, name, false);
    }

    public Variable getVariable(String name) {
        int addr = findVariable(name);
        if (addr == -1) {
            addr = Integer.MIN_VALUE >> 1;
        }
        return new Variable(addr, name, true);
    }

    protected int findVariable(String name) {
        int addr = vars.indexOf(name);
        if (addr != -1) {
            return addr;
        }

        if (parent == null) {
            return -1;
        }

        int paddr = parent.findVariable(name);

        if (paddr == -1) {
            return -1;
        }

        return paddr + 0x10000;
    }
}
