/* NativeBatchCall.java
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

package org.unbunt.ella.lang.sql;

import org.unbunt.ella.engine.corelang.Engine;
import org.unbunt.ella.engine.corelang.Obj;
import org.unbunt.ella.engine.corelang.NativeCall;
import org.unbunt.ella.exception.ClosureTerminatedException;
import org.unbunt.ella.lang.NNumeric;
import static org.unbunt.ella.engine.corelang.ObjUtils.ensureType;

/**
 * Base class for the various statement batch calls.
 */
abstract class NativeBatchCall extends NativeCall {
    protected static final int DEFAULT_BATCH_SIZE = 1000;

    public final Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
        Obj closure;
        int batchSize;
        if (args.length > 1) {
            closure = args[1];
            NNumeric bs = ensureType(NNumeric.class, args[0]);
            batchSize = bs.intValue();
        }
        else {
            closure = args[0];
            batchSize = DEFAULT_BATCH_SIZE;
        }
        return batchCall(engine, context, closure, batchSize);
    }

    protected abstract Obj batchCall(Engine engine, Obj context, Obj closure, int batchSize);
}
