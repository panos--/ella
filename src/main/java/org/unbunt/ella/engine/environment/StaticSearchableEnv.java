/* StaticSearchableEnv.java
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

import org.unbunt.ella.compiler.support.Variable;
import org.unbunt.ella.engine.corelang.Obj;

/**
 * Represents a static environment with additional support for locating variables by name.
 */
public class StaticSearchableEnv extends StaticEnv implements SearchableEnv {
    /**
     * Tells this env to stop normal variable lookups (return null instead) so that this environment
     * can be searched manually via the methods of the SearchEnv interface.
     */
    protected boolean stopHere = false;

    public StaticSearchableEnv(Env parent) {
        super(parent);
    }

    @Override
    public Obj get(Variable var, int addr) {
        if (stopHere) {
            return null;
        }
        return super.get(var, addr);
    }

    @Override
    public Obj get(Variable var) {
        if (stopHere) {
            return null;
        }
        return super.get(var);
    }

    public Obj findLocal(String name) {
        int nvars = vars.size();
        for (int i = 0; i < nvars; i++) {
            if (name.equals(vars.get(i).name)) {
                return values.get(i);
            }
        }
        return null;
    }

    public void putLocal(String name, Obj value) {
        int nvars = vars.size();
        for (int i = 0; i < nvars; i++) {
            if (name.equals(vars.get(i).name)) {
                values.set(i, value);
            }
        }
    }

    /**
     * Returns <code>true</code> if normal variable lookups stop when reaching this environment (return null instead)
     * so that this environment can be searched manually via the methods of the SearchEnv interface.
     *
     * @return <code>true</code> as indicated. 
     */
    public boolean isStopHere() {
        return stopHere;
    }

    public void setStopHere(boolean stopHere) {
        this.stopHere = stopHere;
    }
}
