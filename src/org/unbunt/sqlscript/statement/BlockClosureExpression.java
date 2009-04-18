package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.support.BlockClosure;
import org.unbunt.sqlscript.support.ExpressionVisitor;

public class BlockClosureExpression extends AbstractExpression implements StatementContainer {
    protected BlockClosure blockClosure;

    public BlockClosureExpression(BlockClosure blockClosure) {
        this.blockClosure = blockClosure;
    }

    public BlockClosure getBlockClosure() {
        return blockClosure;
    }

    public void setBlockClosure(BlockClosure blockClosure) {
        this.blockClosure = blockClosure;
    }

    public void addStatement(Statement statement) {
        blockClosure.setBody(statement);
    }

    public void addStatement(Expression expression) {
        blockClosure.setBody(expression);
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}