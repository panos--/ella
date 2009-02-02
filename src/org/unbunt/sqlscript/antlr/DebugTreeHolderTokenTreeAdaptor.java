package org.unbunt.sqlscript.antlr;

import org.antlr.runtime.Token;
import org.antlr.runtime.debug.DebugEventListener;
import org.antlr.runtime.debug.DebugTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;

public class DebugTreeHolderTokenTreeAdaptor extends DebugTreeAdaptor {
    public DebugTreeHolderTokenTreeAdaptor(DebugEventListener dbg, TreeAdaptor adaptor) {
        super(dbg, adaptor);
    }

    public Object create(Token payload) {
        if (payload instanceof TreeHolderToken) {
            return ((TreeHolderToken)payload).getTree();
        }

        return super.create(payload);
    }
}