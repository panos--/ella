/* ExtendedCursorableLinkedList.java
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

package org.unbunt.ella.compiler.antlr;

import org.apache.commons.collections.list.CursorableLinkedList;

import java.util.Collection;

public class ExtendedCursorableLinkedList extends CursorableLinkedList {
    /**
     * Constructor that creates.
     */
    public ExtendedCursorableLinkedList() {
    }

    /**
     * Constructor that copies the specified collection
     *
     * @param coll the collection to copy
     */
    public ExtendedCursorableLinkedList(Collection coll) {
        super(coll);
    }

    /**
     * Returns a {@link org.apache.commons.collections.list.CursorableLinkedList.Cursor} for iterating through the elements of this list.
     * <p/>
     * A <code>Cursor</code> is a <code>ListIterator</code> with an additional
     * <code>close()</code> method. Calling this method immediately discards the
     * references to the cursor. If it is not called, then the garbage collector
     * will still remove the reference as it is held via a <code>WeakReference</code>.
     * <p/>
     * The cursor enables iteration and list changes to occur in any order without
     * invalidating the iterator (from one thread). When elements are added to the
     * list, an event is fired to all active cursors enabling them to adjust to the
     * change in the list.
     * <p/>
     * When the "current" (i.e., last returned by {@link java.util.ListIterator#next}
     * or {@link java.util.ListIterator#previous}) element of the list is removed,
     * the cursor automatically adjusts to the change (invalidating the
     * last returned value such that it cannot be removed).
     * <p/>
     * The {@link #listIterator()} method returns the same as this method, and can
     * be cast to a <code>Cursor</code> if the <code>close</code> method is required.
     *
     * @return a new cursor iterator
     */
    @Override
    public Cursor cursor() {
        return cursor(0);
    }

    /**
     * Returns a {@link org.apache.commons.collections.list.CursorableLinkedList.Cursor} for iterating through the elements of this list
     * starting from a specified index.
     * <p/>
     * A <code>Cursor</code> is a <code>ListIterator</code> with an additional
     * <code>close()</code> method. Calling this method immediately discards the
     * references to the cursor. If it is not called, then the garbage collector
     * will still remove the reference as it is held via a <code>WeakReference</code>.
     * <p/>
     * The cursor enables iteration and list changes to occur in any order without
     * invalidating the iterator (from one thread). When elements are added to the
     * list, an event is fired to all active cursors enabling them to adjust to the
     * change in the list.
     * <p/>
     * When the "current" (i.e., last returned by {@link java.util.ListIterator#next}
     * or {@link java.util.ListIterator#previous}) element of the list is removed,
     * the cursor automatically adjusts to the change (invalidating the
     * last returned value such that it cannot be removed).
     * <p/>
     * The {@link #listIterator(int)} method returns the same as this method, and can
     * be cast to a <code>Cursor</code> if the <code>close</code> method is required.
     *
     * @param fromIndex the index to start from
     * @return a new cursor iterator
     * @throws IndexOutOfBoundsException if the index is out of range
     *                                   (index &lt; 0 || index &gt; size()).
     */
    @Override
    public Cursor cursor(int fromIndex) {
        Cursor cursor = new Cursor(this, fromIndex);
        registerCursor(cursor);
        return cursor;
    }

    public Cursor cursor(Cursor ref) {
        if (this != ref.getParent()) {
            throw new IllegalArgumentException();
        }
        Cursor cursor = new Cursor(ref);
        registerCursor(cursor);
        return cursor;
    }

    public static class Cursor extends CursorableLinkedList.Cursor {
        public Cursor(CursorableLinkedList parent, int index) {
            super(parent, index);
        }

        protected Cursor(Cursor ref) {
            super((CursorableLinkedList) ref.parent, 0);
            next = ref.next;
            nextIndex = ref.nextIndex;
        }

        public ExtendedCursorableLinkedList getParent() {
            return (ExtendedCursorableLinkedList) parent;
        }
    }
}
