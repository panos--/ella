/* MainEnv.java
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
 * Acts as a global environment. Default bindings may be placed here using the <code>add</code> method.
 */
public class MainEnv extends StaticEnv {
    /**
     * Creates a new MainEnv. This is set up so that variables looked up here and which could not be found
     * (meaning these variables must have been undefined) are looked up using the given resolver. Any variables that
     * could not be resolved by this resolver looked up in a <code>TopEnv</code> environment which in turn is set up
     * to return the given value for undefined variables.
     *
     * @param undefValue the value to return for undefined variables.
     * @param resolver the resolver to use when looking up undefined variables.
     */
    public MainEnv(Obj undefValue, DynamicVariableResolver resolver) {
        super(new DynamicEnv(new TopEnv(undefValue), resolver));
    }

    /**
     * Add a default binding. Associates the given value with a variable of the given name.
     *
     * @param var the variable's name.
     * @param value the value.
     */
    public void add(String var, Obj value) {
        add(new Variable(-1, var, true, false), value);
    }
}
