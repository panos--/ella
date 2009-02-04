package org.unbunt.sqlscript.support;

import org.unbunt.sqlscript.statement.Expression;

import java.util.ArrayList;
import java.util.List;

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
