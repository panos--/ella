package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.ScriptProcessor;
import org.unbunt.sqlscript.support.Scope;
import org.unbunt.sqlscript.support.Env;

import java.util.List;
import java.util.LinkedList;

public class Block extends AbstractStatement implements StatementContainer {
    protected List<Statement> statements = new LinkedList<Statement>();

    public Block() {
    }

    public Block(Scope scope) {
        super(scope);
    }

    public void accept(ScriptProcessor processor, Env env) {
        processor.process(env, this);
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
}
