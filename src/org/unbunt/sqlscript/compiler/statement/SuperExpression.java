package org.unbunt.sqlscript.compiler.statement;

import org.unbunt.sqlscript.compiler.statement.ExpressionVisitor;
import org.unbunt.sqlscript.compiler.stmtbase.Expression;

/**
 * User: tweiss
 * Date: 24.03.2009
 * Time: 09:09:59
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
public class SuperExpression implements Expression {
    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}