/* Call.java
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

package org.unbunt.ella.engine.corelang;

import org.unbunt.ella.exception.ClosureTerminatedException;

/**
 * Represents activatable EllaScript objects.
 */
public interface Call extends Obj {
    /**
     * Invokes this object.
     *
     * @param engine the executing engine.
     * @param context the activation context the object is to be invoked with. May be <code>null</code>.
     * @param args the arguments passed as part of the invocation.
     * @return a value to be used as the result of the evaluation. May be <code>null</code>, to indicate the value
     *         of last evaluation should be preserved.
     * @throws ClosureTerminatedException indicates the invocation has to end abruptly because of a return operation
     *                                    triggered from inside a block closure.
     */
    Obj call(Engine engine, Obj context, Obj... args);

    /**
     * Invokes this object.
     *
     * @param engine the executing engine.
     * @param context the activation context the object is to be invoked with. May be <code>null</code>.
     * @param receiver the object where this object was looked up in. Available within the function via the
     *                 <code>super</code> keyword. May be <code>null</code>.
     * @param args the arguments passed as part of the invocation.
     * @return a value to be used as the result of the evaluation. May be <code>null</code>, to indicate the value
     *         of last evaluation should be preserved.
     * @throws ClosureTerminatedException indicates the invocation has to end abruptly because of a return operation
     *                                    triggered from inside a block closure.
     */
    Obj call(Engine engine, Obj context, Obj receiver, Obj... args);

    /**
     * Triggers activation of this object.
     * The activation is started when control returns to the evaluating engine.
     *
     * @param engine the executing engine.
     * @param context the activation context the object is to be invoked with. May be <code>null</code>.
     * @param args the arguments passed as part of the invocation.
     */
    void trigger(Engine engine, Obj context, Obj... args);
}
