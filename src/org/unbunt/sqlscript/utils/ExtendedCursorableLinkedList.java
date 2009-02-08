package org.unbunt.sqlscript.utils;

import org.apache.commons.collections.list.CursorableLinkedList;
import org.apache.commons.collections.list.AbstractLinkedList;

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
