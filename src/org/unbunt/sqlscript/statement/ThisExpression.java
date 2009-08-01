package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.statement.ExpressionVisitor;

/**
 * User: tweiss
 * Date: 24.03.2009
 * Time: 09:09:59
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
public class ThisExpression implements Expression {
    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}
