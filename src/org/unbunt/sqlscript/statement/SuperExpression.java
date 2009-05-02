package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.support.ExpressionVisitor;

/**
 * User: tweiss
 * Date: 24.03.2009
 * Time: 09:09:59
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
public class SuperExpression extends AbstractExpression {
    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}