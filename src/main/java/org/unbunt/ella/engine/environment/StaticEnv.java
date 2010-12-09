/* StaticEnv.java
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

import java.util.ArrayList;

/**
 * Represents a standard environment following the lexical addressing scheme.
 */
public class StaticEnv extends AbstractEnv {
    protected ArrayList<Obj> values = new ArrayList<Obj>();
    protected ArrayList<Variable> vars = new ArrayList<Variable>();

    protected Obj context = null;
    protected Obj receiver = null;

    protected int closureHomeOffset = -1;
    protected Continuation closureHomeCont = null;

    /**
     * Creates a new static environment.
     *
     * @param parent the environment to use as parent environment.
     */
    public StaticEnv(Env parent) {
        super(parent);
    }

    public void setContext(Obj context) {
        this.context = context;
    }

    public Obj getContext() {
        return context;
    }

    public Obj getReceiver() {
        return receiver;
    }

    public void setReceiver(Obj receiver) {
        this.receiver = receiver;
    }

    public void extend(Variable var) {
        vars.add(var);
        values.add(null);
    }

    public Obj get(Variable var, int addr) {
        if (addr > 0xFFFF) {
            return parent.get(var, addr - 0x10000);
        }
        return values.get(addr);
    }

    public void set(Variable var, int addr, Obj value) {
        if (addr > 0xFFFF) {
            parent.set(var, addr - 0x10000, value);
        }
        else {
            values.set(addr, value);
        }
    }

    public void add(Variable var, Obj value) {
        vars.add(var);
        values.add(value);
    }

    public int getMaxAddress() {
        return values.size() - 1;
    }

    public void setClosureHome(int offset, Continuation cont) {
        this.closureHomeOffset = offset;
        this.closureHomeCont = cont;
    }

    // TODO: maybe subclass as FuncEnv, so we don't have to do the check all the time (since for function environments
    //       closureHomeOffset will always be set which it doesn't for any other environment
    public int getClosureHomeOffset() {
        return closureHomeOffset == -1 ? parent.getClosureHomeOffset() : closureHomeOffset;
    }

    public Continuation getClosureHomeCont() {
        return closureHomeCont == null ? parent.getClosureHomeCont() : closureHomeCont;
    }

    public Scope toScope() {
        Scope scope = parent == null ? new Scope() : new Scope(parent.toScope());
        for (Variable var : vars) {
            scope.addVariable(var.name);
        }
        return scope;
    }
}
