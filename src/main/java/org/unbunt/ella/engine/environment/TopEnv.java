/* TopEnv.java
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

package org.unbunt.ella.engine.environment;

import org.unbunt.ella.compiler.support.Scope;
import org.unbunt.ella.compiler.support.Variable;
import org.unbunt.ella.engine.continuations.Continuation;
import org.unbunt.ella.engine.corelang.Obj;
import org.unbunt.ella.exception.EllaRuntimeException;

import java.util.ArrayList;

/**
 * Acts as top-level environment for storing undefined variables.
 * Any variable reference not resolved by the compiler will be passed to this environment,
 * except if caught ealier by a dynamic environment.
 */
public class TopEnv implements Env {
    protected ArrayList<Obj> vars = new ArrayList<Obj>();

    protected Obj undefValue;

    protected TopEnv(Obj undefValue) {
        this.undefValue = undefValue;
    }

    public Obj get(Variable var) {
        return get(var, var.address);
    }

    /**
     * Returns the value associated with the given variable. Uses the given lexical address during lookup
     * of the variable.
     * <p>
     * If the given variable was not defined previously, a warning will be issued and the variable will be initialized
     * with a default value.
     *
     * @param var the variable.
     * @param addr the variable's lexical address.
     * @return the variable's associated value.
     */
    public Obj get(Variable var, int addr) {
        addr &= 0xFFFF;
        resizeFor(addr);
        Obj value = vars.get(addr);
        if (value == null) {
            warn(var);
            value = undefValue;
            vars.set(addr, value);
        }
        return value;
    }

    public void set(Variable var, Obj value) {
        set(var, var.address, value);
    }

    public void set(Variable var, int addr, Obj value) {
        addr &= 0xFFFF;
        resizeFor(addr);
        if (vars.get(addr) == null) {
            warn(var);
        }
        vars.set(addr, value);
    }

    protected void resizeFor(int addr) {
        vars.ensureCapacity(addr + 1);
        int size = vars.size();
        while (size++ <= addr) {
            vars.add(null);
        }
    }

    public void add(Variable var, Obj value) {
        throw new RuntimeException("TopEnv.add() not implemented");
    }

    protected void warn(Variable var) {
        System.err.println("Undefined variable: " + var.name);
    }

    public void extend(Variable var) {
        throw new RuntimeException("TopEnv.extend() should not be called");
    }

    public int getMaxAddress() {
        return -1;
    }

    public Obj getContext() {
        throw new RuntimeException("TopEnv.getContext() should not be called");
    }

    public void setContext(Obj context) {
        throw new RuntimeException("TopEnv.setContext() should not be called");
    }

    public Obj getReceiver() {
        throw new RuntimeException("TopEnv.getReceiver() should not be called");
    }

    public void setReceiver(Obj context) {
        throw new RuntimeException("TopEnv.setReceiver() should not be called");
    }

    public void setClosureHome(int offset, Continuation cont) {
        throw new EllaRuntimeException("TopEnv.setClosureHome() should not be called");
    }

    public int getClosureHomeOffset() {
        return -1;
    }

    public Continuation getClosureHomeCont() {
        return null;
    }

    public Scope toScope() {
        return null;
    }
}
