package org.unbunt.sqlscript.antlr;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

public class TreeHolderToken extends CommonToken {
    protected CommonTree tree;

    public TreeHolderToken(Token oldToken, CommonTree tree) {
        super(oldToken);
        this.tree = tree;
    }

    public CommonTree getTree() {
        return tree;
    }
}
