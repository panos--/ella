/* BlockClosure.java
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

import org.unbunt.ella.engine.continuations.Continuation;
import org.unbunt.ella.compiler.stmtbase.Statement;

/**
 * Represents the compiled form of block closures of the EllaScript language.
 */
public class BlockClosure extends AbstractCallable {
    protected int homeOffset = -1;
    protected Continuation homeCont = null;

    public BlockClosure() {
    }

    public BlockClosure(Statement body) {
        super(body);
    }

    /**
     * Returns the continuation stack offset of the function that declared this block closure.
     * TODO: Refactor. This is not the correct place for this information.
     *
     * @return the offset of the home function.
     */
    public int getHomeOffset() {
        return homeOffset;
    }

    /**
     * Sets the continuation stack offset of the function that declared this block closure.
     * TODO: Refactor. This is not the correct place for this information.
     *
     * @param homeOffset the offset of the home function.
     */
    public void setHomeOffset(int homeOffset) {
        this.homeOffset = homeOffset;
    }

    /**
     * Returns the continuation to expect at this block closures home offset.
     * TODO: Refactor. This is not the correct place for this information.
     *
     * @return the continuation.
     * @see #getHomeOffset()
     */
    public Continuation getHomeCont() {
        return homeCont;
    }

    /**
     * Sets the continuation to expect at this block closures home offset.
     * TODO: Refactor. This is not the correct place for this information.
     *
     * @param homeCont the continuation.
     * @see #getHomeOffset()
     */
    public void setHomeCont(Continuation homeCont) {
        this.homeCont = homeCont;
    }

    public String toString() {
        return "BLOCK";
    }
}