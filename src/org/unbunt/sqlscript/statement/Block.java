package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.support.ExpressionVisitor;
import org.unbunt.sqlscript.support.Scope;

import java.util.ArrayList;
import java.util.List;

public class Block extends AbstractStatement implements StatementContainer {
    protected List<Statement> statements = new ArrayList<Statement>(16);

    protected boolean scoped = true;

    // indicates that after processing this block the environment should not be reset
    protected boolean keepEnv = false;

    protected boolean optimizeForTailCall = false;

    public Block(Scope scope) {
        super(scope);
    }

    public Block(Scope scope, boolean scoped) {
        this(scope);
        this.scoped = scoped;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    public void addStatement(Expression expression) {
        addStatement((Statement) expression);
    }

    public void addStatement(Statement statement) {
        statement.setScope(getScope());
        statements.add(statement);
    }

    public boolean isScoped() {
        return scoped;
    }

    public void setScoped(boolean scoped) {
        this.scoped = scoped;
    }

    public boolean isKeepEnv() {
        return keepEnv;
    }

    public void setKeepEnv(boolean keepEnv) {
        this.keepEnv = keepEnv;
    }

    public boolean isOptimizeForTailCall() {
        return optimizeForTailCall;
    }

    public void setOptimizeForTailCall(boolean optimizeForTailCall) {
        this.optimizeForTailCall = optimizeForTailCall;
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}
