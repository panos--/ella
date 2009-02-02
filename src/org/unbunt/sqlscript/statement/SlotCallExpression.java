package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.ScriptProcessor;
import org.unbunt.sqlscript.support.Env;

public class SlotCallExpression extends AbstractFunctionCallExpression {
    protected SlotExpression slotExpression;

    public SlotCallExpression(SlotExpression slotExpression) {
        this.slotExpression = slotExpression;
    }

    public SlotCallExpression() {
    }

    public SlotExpression getSlotExpression() {
        return slotExpression;
    }

    public void setSlotExpression(SlotExpression slotExpression) {
        this.slotExpression = slotExpression;
    }

    public void accept(ScriptProcessor processor, Env env) {
    }
}