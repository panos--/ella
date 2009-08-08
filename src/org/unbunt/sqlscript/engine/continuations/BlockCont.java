package org.unbunt.sqlscript.engine.continuations;

import org.unbunt.sqlscript.engine.environment.Env;
import org.unbunt.sqlscript.compiler.statement.Block;
import org.unbunt.sqlscript.compiler.stmtbase.Statement;

import java.util.List;

public class BlockCont implements Continuation {
    protected Block block;
    protected Env savedEnv;

    protected List<Statement> statements;
    protected int stmtCount;
    protected int currStmt;

    public BlockCont(Block block) {
        this.block = block;
        this.savedEnv = null;
        this.statements = block.getStatements();
        this.stmtCount = this.statements.size();
        this.currStmt = 0;
    }

    public BlockCont(Block block, Env savedEnv) {
        this.block = block;
        this.savedEnv = savedEnv;
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

    public Env getSavedEnv() {
        return savedEnv;
    }

    public boolean isScoped() {
        return block.isScoped();
    }

    public boolean isOptimizeForTailCall() {
        return block.isOptimizeForTailCall();
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}
