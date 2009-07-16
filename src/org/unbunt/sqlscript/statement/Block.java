package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.support.ExpressionVisitor;
import org.unbunt.sqlscript.support.Scope;

import java.util.ArrayList;
import java.util.List;

public class Block implements StatementContainer {
    protected List<Statement> statements = new ArrayList<Statement>(16);

    protected final Scope scope;

    protected boolean scoped;

    protected boolean optimizeForTailCall = false;

    public Block(Scope scope) {
        this(scope, false);
    }

    public Block(Scope scope, boolean scoped) {
        this.scope = scope;
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
        statements.add(statement);
    }

    public Scope getScope() {
        return scope;
    }

    public boolean isScoped() {
        return scoped;
    }

    public void setScoped(boolean scoped) {
        this.scoped = scoped;
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
