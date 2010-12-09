/* Block.java
   Copyright (C) 2009, 2010 Thomas Weiß <panos@unbunt.org>

This file is part of the Ella scripting language interpreter.

Ella is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2, or (at your option)
any later version.

Ella is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License
along with Ella; see the file COPYING.  If not, write to the
Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
02110-1301 USA.

Linking this library statically or dynamically with other modules is
making a combined work based on this library.  Thus, the terms and
conditions of the GNU General Public License cover the whole
combination.

As a special exception, the copyright holders of this library give you
permission to link this library with independent modules to produce an
executable, regardless of the license terms of these independent
modules, and to copy and distribute the resulting executable under
terms of your choice, provided that you also meet, for each linked
independent module, the terms and conditions of the license of that
module.  An independent module is a module which is not derived from
or based on this library.  If you modify this library, you may extend
this exception to your version of the library, but you are not
obligated to do so.  If you do not wish to do so, delete this
exception statement from your version. */

package org.unbunt.ella.compiler.statement;

import org.unbunt.ella.compiler.support.Scope;
import org.unbunt.ella.compiler.stmtbase.Expression;
import org.unbunt.ella.compiler.stmtbase.Statement;
import org.unbunt.ella.compiler.stmtbase.StatementContainer;

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
