/* Scope.java
   Copyright (C) 2009, 2010 Thomas Weiß <panos@unbunt.org>

This file is part of the Ella scripting language interpreter.

Ella is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2, or (at your option)
any later version.

Ella is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License
along with Ella; see the file COPYING.  If not, write to the
Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
02110-1301 USA.

Linking this library statically or dynamically with other modules is
making a combined work based on this library.  Thus, the terms and
conditions of the GNU General Public License cover the whole
combination.

As a special exception, the copyright holders of this library give you
permission to link this library with independent modules to produce an
executable, regardless of the license terms of these independent
modules, and to copy and distribute the resulting executable under
terms of your choice, provided that you also meet, for each linked
independent module, the terms and conditions of the license of that
module.  An independent module is a module which is not derived from
or based on this library.  If you modify this library, you may extend
this exception to your version of the library, but you are not
obligated to do so.  If you do not wish to do so, delete this
exception statement from your version. */

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
