package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.ScriptProcessor;
import org.unbunt.sqlscript.support.Scope;
import org.unbunt.sqlscript.support.Env;
import org.unbunt.sqlscript.support.ExpressionVisitor;

import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

public class Block extends AbstractStatement implements StatementContainer {
    protected List<Statement> statements = new ArrayList<Statement>(16);
    protected Statement[] statementsArray = new Statement[0];

    // indicates that after processing this block the environment should not be reset
    protected boolean keepEnv = false;

    public Block() {
    }

    public Block(Scope scope) {
        super(scope);
    }

    public void accept(ScriptProcessor processor, Env env) {
        processor.process(env, this);
    }

    public Statement[] getStatementsArray() {
        return statementsArray;
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
        statementsArray = statements.toArray(new Statement[statements.size()]);
    }

    public boolean isKeepEnv() {
        return keepEnv;
    }

    public void setKeepEnv(boolean keepEnv) {
        this.keepEnv = keepEnv;
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}
