package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.ScriptProcessor;
import org.unbunt.sqlscript.support.Env;
import org.unbunt.sqlscript.support.ExpressionVisitor;

/**
 * User: tweiss
 * Date: 24.03.2009
 * Time: 09:09:59
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
public class ThisExpression extends AbstractExpression {
    public void accept(ScriptProcessor processor, Env env) {
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}
