package org.unbunt.sqlscript.support;

import org.unbunt.sqlscript.exception.SQLScriptRuntimeException;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class Env implements Cloneable {
    protected LinkedList<Variable> variables = new LinkedList<Variable>();
    protected LinkedList<Function> functions = new LinkedList<Function>();

    protected List<Integer[]> saves = null;

    public Env() {
    }

    public Variable addVar(String name) {
        Variable var = new Variable(name);
        variables.add(var);
        return var;
    }

    public Variable getVar(String name) {
        for (int i = variables.size() - 1; i >= 0; i--) {
            Variable var = variables.get(i);
            if (name.equals(var.getName())) {
                return var;
            }
        }

        //throw new SQLScriptRuntimeException("Undefined variable: " + name);
        System.err.println("Warning: Undefined variable: " + name);
        return addVar(name);
    }

    public Function addFunc(Function func) {
        functions.add(func);
        return func;
    }

    public Function getFunc(String name) {
        for (int i = functions.size() - 1; i >= 0; i--) {
            Function func = functions.get(i);
            if (name.equals(func.getName())) {
                return func;
            }
        }

        throw new SQLScriptRuntimeException("Undefined function: " + name);
    }

    public int save() {
        if (saves == null) {
            saves = new ArrayList<Integer[]>();
        }

        int id = saves.size();
        saves.add(new Integer[] { variables.size(), functions.size() });

        return id;
    }

    public void restore(int id) {
        if (saves == null || id >= saves.size()) {
            throw new SQLScriptRuntimeException("Invalid env restore: " + id);
        }

        Integer[] save = saves.get(id);

        int varsize = save[0];
        while (variables.size() > varsize) {
            variables.removeLast();
        }

        int funcsize = save[1];
        while (functions.size() > funcsize) {
            functions.removeLast();
        }
    }

    @Override
    @SuppressWarnings({"unchecked", "CloneDoesntDeclareCloneNotSupportedException"})
    public Env clone() {
        Env copy;
        try {
            copy = (Env) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new SQLScriptRuntimeException(e.getMessage(), e);
        }
        copy.variables = (LinkedList<Variable>) variables.clone();
        copy.functions = (LinkedList<Function>) functions.clone();
        return copy;
    }
}
