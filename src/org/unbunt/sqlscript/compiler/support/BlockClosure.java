package org.unbunt.sqlscript.compiler.support;

import org.unbunt.sqlscript.engine.continuations.Continuation;
import org.unbunt.sqlscript.compiler.stmtbase.Statement;

public class BlockClosure extends AbstractCallable {
    protected int homeOffset = -1;
    protected Continuation homeCont = null;

    public BlockClosure() {
    }

    public BlockClosure(Statement body) {
        super(body);
    }

    public int getHomeOffset() {
        return homeOffset;
    }

    public void setHomeOffset(int homeOffset) {
        this.homeOffset = homeOffset;
    }

    public Continuation getHomeCont() {
        return homeCont;
    }

    public void setHomeCont(Continuation homeCont) {
        this.homeCont = homeCont;
    }

    public String toString() {
        return "BLOCK";
    }
}