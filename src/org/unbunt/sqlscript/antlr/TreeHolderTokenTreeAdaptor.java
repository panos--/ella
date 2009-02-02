package org.unbunt.sqlscript.antlr;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTreeAdaptor;

public class TreeHolderTokenTreeAdaptor extends CommonTreeAdaptor {
    public Object create(Token payload) {
        if (payload instanceof TreeHolderToken) {
            return ((TreeHolderToken)payload).getTree();
        }

        return super.create(payload);
    }
}
