package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.statement.Block;
import org.unbunt.sqlscript.statement.Statement;
import org.unbunt.sqlscript.support.Env;
import org.unbunt.sqlscript.support.ContinuationVisitor;

import java.util.List;
import java.util.Iterator;

public class BlockCont implements Continuation {
    protected Block block;
    protected Env env;

    protected List<Statement> statements;
    protected int stmtCount;
    protected int currStmt;

    public BlockCont(Block block) {
        this(block, null);
    }

    public BlockCont(Block block, Env env) {
        this.block = block;
        this.env = env;
        this.statements = block.getStatements();
        this.stmtCount = this.statements.size();
        this.currStmt = 0;
    }

    public boolean hasNextStatement() {
        return currStmt < stmtCount;
    }

    public Statement nextStatement() {
        return statements.get(currStmt++);
    }

    public Block getBlock() {
        return block;
    }

    public Env getEnv() {
        return env;
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}
