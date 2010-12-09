/* ExpressionVisitor.java
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

/**
 * Represents the visitor component of the visitor pattern realized for statement objects.
 */
public interface ExpressionVisitor {
    void processExpression(Block blockExpression);

    void processExpression(IdentifierExpression identifierExpression);

    void processExpression(IntegerLiteralExpression integerLiteralExpression);

    void processExpression(FloatingPointLiteralExpression floatingPointLiteralExpression);

    void processExpression(BooleanLiteralExpression booleanLiteralExpression);

    void processExpression(StringLiteralExpression stringLiteralExpression);

    void processExpression(ObjectLiteralExpression objectLiteralExpression);

    void processExpression(ArrayLiteralExpression arrayLiteralExpression);

    void processExpression(SQLLiteralExpression sqlLiteralExpression);

    void processExpression(DeclareVariableExpression declareVariableExpression);

    void processExpression(AssignExpression assignExpression);

    void processExpression(DeclareAndAssignExpression declareAndAssignExpression);

    void processExpression(SlotSetExpression slotSetExpression);

    void processExpression(SlotExpression slotExpression);

    void processExpression(VariableExpression variableExpression);

    void processExpression(FunctionDefinitionExpression functionDefinitionExpression);

    void processExpression(FunctionCallExpression functionCallExpression);

    void processExpression(SlotCallExpression slotCallExpression);

    void processExpression(ReturnStatement returnStatement);

    void processExpression(NewExpression newExpression);

    void processExpression(ThisExpression thisExpression);

    void processExpression(SuperExpression superExpression);

    void processExpression(BlockClosureExpression blockClosureExpression);
}
