package org.unbunt.sqlscript.support;

import java.util.*;

public class Scope {
    protected Scope parent;

    protected List<String> vars = new LinkedList<String>();

    public Scope() {
        this(null);
    }

    public Scope(Scope parent) {
        this.parent = parent;
    }

    public Variable addVariable(String name) {
        int index = -1;
        int i = -1;
        ListIterator<String> it = vars.listIterator(vars.size());
        while (it.hasPrevious()) {
            i++;
            String n = it.previous();
            if (n.equals(name)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.err.println("Warning: Variable " + name + " is already defined");
            return new Variable(index, name, true);
        }
        vars.add(name);
        return new Variable(0, name, false);
    }

    public Variable getVariable(String name) {
        int index = findVariable(name);
        if (index == -1) {
            System.err.println("Warning: Undefined variable: " + name);
            return addVariable(name);
        }
        return new Variable(index, name, true);
    }

    protected int findVariable(String name) {
        int index = -1;

        ListIterator<String> it = vars.listIterator(vars.size());
        while (it.hasPrevious()) {
            index++;
            String n = it.previous();
            if (n.equals(name)) {
                return index;
            }
        }

        if (parent == null) {
            return -1;
        }

        int pindex = parent.findVariable(name);

        return pindex != -1 ? ++index + pindex : -1;
    }
}
