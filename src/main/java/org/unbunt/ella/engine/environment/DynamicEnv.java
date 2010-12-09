/* DynamicEnv.java
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
