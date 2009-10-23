package org.unbunt.ella.compiler.support;

import org.unbunt.ella.compiler.stmtbase.Expression;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents the compiled form of object literals of the EllaScript language.
 */
public class ObjectLiteral {
    public static class SlotEntry {
        public Expression key;
        public Expression value;

        SlotEntry(Expression key, Expression value) {
            this.key = key;
            this.value = value;
        }
    }

    protected List<SlotEntry> slots = new ArrayList<SlotEntry>();

    public List<SlotEntry> getSlots() {
        return slots;
    }

    public void setSlots(List<SlotEntry> slots) {
        this.slots = slots;
    }

    public void putSlot(Expression key, Expression value) {
        slots.add(new SlotEntry(key, value));
    }
}
