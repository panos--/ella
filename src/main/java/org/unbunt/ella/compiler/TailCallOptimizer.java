/* TailCallOptimizer.java
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

package org.unbunt.ella.compiler;

import org.unbunt.ella.compiler.statement.*;
import org.unbunt.ella.compiler.support.ObjectLiteral;
import org.unbunt.ella.compiler.stmtbase.Expression;
import org.unbunt.ella.compiler.stmtbase.Statement;

import java.util.List;

/**
 * Searches for tail-recursive function calls in EllaScript programs and marks them with information
 * usable by an interpreting engine to eleminate tail-calls.
 */
public class TailCallOptimizer {
    protected static final TailCallOptimizer instance = new TailCallOptimizer();

    protected ExpressionVisitor searcher;

    protected TailCallOptimizer() {
        searcher = new SearchingVisitor();
    }

    /**
     * Performs tail-recursion analysis on the given EllaScript program. During the analysis no modification of the
     * code takes place with the exception that tail-call sites are marked as such. This information may or may not
     * be used by an interpreter.
     *
     * @param block the program to analyze.
     */
    public static void process(Block block) {
        instance.runOn(block);
    }

    protected void runOn(Block block) {
        searcher.processExpression(block);
    }

    /**
     * Searches the expression tree for function definitions and invokes the optimizer on any one found.
     */
    protected static class SearchingVisitor implements ExpressionVisitor {
        public void processExpression(Block blockExpression) {
            for (Statement stmt : blockExpression.getStatements()) {
                stmt.accept(this);
            }
        }

        public void processExpression(IdentifierExpression identifierExpression) {
        }

        public void processExpression(IntegerLiteralExpression integerLiteralExpression) {
        }

        public void processExpression(FloatingPointLiteralExpression floatingPointLiteralExpression) {
        }

        public void processExpression(BooleanLiteralExpression booleanLiteralExpression) {
        }

        public void processExpression(StringLiteralExpression stringLiteralExpression) {
        }

        public void processExpression(SQLLiteralExpression sqlLiteralExpression) {
        }

        public void processExpression(ObjectLiteralExpression objectLiteralExpression) {
            for (ObjectLiteral.SlotEntry entry : objectLiteralExpression.getObjectLiteral().getSlots()) {
                entry.key.accept(this);
                entry.value.accept(this);
            }
        }

        public void processExpression(ArrayLiteralExpression arrayLiteralExpression) {
            for (Expression expression : arrayLiteralExpression.getComponents()) {
                expression.accept(this);
            }
        }

        public void processExpression(DeclareVariableExpression declareVariableExpression) {
        }

        public void processExpression(AssignExpression assignExpression) {
            assignExpression.getRvalue().accept(this);
        }

        public void processExpression(DeclareAndAssignExpression declareAndAssignExpression) {
            declareAndAssignExpression.getAssignExpr().getRvalue().accept(this);
        }

        public void processExpression(SlotSetExpression slotSetExpression) {
            slotSetExpression.getSlotExpression().accept(this);
            slotSetExpression.getValueExpression().accept(this);
        }

        public void processExpression(SlotExpression slotExpression) {
            slotExpression.getReceiver().accept(this);
            slotExpression.getSlot().accept(this);
        }

        public void processExpression(VariableExpression variableExpression) {
        }

        public void processExpression(FunctionDefinitionExpression functionDefinitionExpression) {
            OptimizingVisitor.runOn(functionDefinitionExpression);
        }

        public void processExpression(FunctionCallExpression functionCallExpression) {
            functionCallExpression.getExpression().accept(this);
            for (Expression expression : functionCallExpression.getArguments()) {
                expression.accept(this);
            }
        }

        public void processExpression(SlotCallExpression slotCallExpression) {
            slotCallExpression.getSlotExpression().accept(this);
            for (Expression expression : slotCallExpression.getArguments()) {
                expression.accept(this);
            }
        }

        public void processExpression(ReturnStatement returnStatement) {
            returnStatement.getExpression().accept(this);
        }

        public void processExpression(NewExpression newExpression) {
            newExpression.getExpression().accept(this);
            // TODO: adjust EllaWalker so that arguments property of newExpression cannot be null
            List<Expression> args = newExpression.getArguments();
            if (args == null) {
                return;
            }
            for (Expression expression : newExpression.getArguments()) {
                expression.accept(this);
            }
        }

        public void processExpression(ThisExpression thisExpression) {
        }

        public void processExpression(SuperExpression superExpression) {
        }

        public void processExpression(BlockClosureExpression blockClosureExpression) {
            blockClosureExpression.getBlockClosure().getBody().accept(this);
        }
    }

    /**
     * Takes a function definition expression, detects tail calls in it and marks them as such.
     * The interpreter then uses this information to decide whether to perform tail call optimization
     * on a function call or not.
     */
    protected static class OptimizingVisitor {
        protected static final OptimizingVisitor instance = new OptimizingVisitor();

        private ExpressionVisitor lastVisitor;
        private ExpressionVisitor returnVisitor;

        public OptimizingVisitor() {
            lastVisitor = new LastVisitor();
            returnVisitor = new ReturnVisitor();
        }

        public static void runOn(FunctionDefinitionExpression functionDefinitionExpression) {
            Statement functionBody = functionDefinitionExpression.getFunction().getBody();
            functionBody.accept(instance.lastVisitor);
            functionBody.accept(instance.returnVisitor);
        }

        /**
         * Detects calls and return statements which are the last statements in a function.
         * Marks found tail calls as such.
         * Also removes unnessary return statements replacing them whith the expression to return, if any.
         */
        protected static class LastVisitor implements ExpressionVisitor {
            public void processExpression(Block blockExpression) {
                blockExpression.setOptimizeForTailCall(true);

                List<Statement> stmts = blockExpression.getStatements();

                Statement lastStatement = null;
                int lastIdx = stmts.size() - 1;
                while (lastIdx >= 0) {
                    lastStatement = stmts.get(lastIdx);

                    if (!(lastStatement instanceof ReturnStatement)) {
                        break;
                    }

                    ReturnStatement returnStatement = (ReturnStatement) lastStatement;
                    if (returnStatement.hasExpression()) {
                        lastStatement = returnStatement.getExpression();
                        stmts.set(lastIdx, lastStatement);
                        break;
                    }

                    stmts.remove(lastIdx);

                    lastIdx--;
                }

                if (lastStatement != null) {
                    lastStatement.accept(this);
                }
            }

            public void processExpression(IdentifierExpression identifierExpression) {
            }

            public void processExpression(IntegerLiteralExpression integerLiteralExpression) {
            }

            public void processExpression(FloatingPointLiteralExpression floatingPointLiteralExpression) {
            }

            public void processExpression(BooleanLiteralExpression booleanLiteralExpression) {
            }

            public void processExpression(StringLiteralExpression stringLiteralExpression) {
            }

            public void processExpression(SQLLiteralExpression sqlLiteralExpression) {
            }

            public void processExpression(ObjectLiteralExpression objectLiteralExpression) {
            }

            public void processExpression(ArrayLiteralExpression arrayLiteralExpression) {
            }

            public void processExpression(DeclareVariableExpression declareVariableExpression) {
            }

            public void processExpression(AssignExpression assignExpression) {
            }

            public void processExpression(DeclareAndAssignExpression declareAndAssignExpression) {
            }

            public void processExpression(SlotSetExpression slotSetExpression) {
            }

            public void processExpression(SlotExpression slotExpression) {
            }

            public void processExpression(VariableExpression variableExpression) {
            }
            public void processExpression(FunctionDefinitionExpression functionDefinitionExpression) {
                // NOTE: Don't traverse down into nested function definitions - the searcher is responsible for that
            }

            public void processExpression(FunctionCallExpression functionCallExpression) {
                functionCallExpression.setTailCall(true);
            }

            public void processExpression(SlotCallExpression slotCallExpression) {
                slotCallExpression.setTailCall(true);
            }

            public void processExpression(ReturnStatement returnStatement) {
                if (returnStatement.hasExpression()) {
                    returnStatement.getExpression().accept(this);
                }
            }

            public void processExpression(NewExpression newExpression) {
            }

            public void processExpression(ThisExpression thisExpression) {
            }

            public void processExpression(SuperExpression superExpression) {
            }

            public void processExpression(BlockClosureExpression blockClosureExpression) {
            }
        }

        /**
         * Detects function calls in return statements appearing in the middle of some block
         * and marks them as tail calls.
         */
        protected static class ReturnVisitor implements ExpressionVisitor {
            protected static final ReturnArgVisitor returnArgVisitor = new ReturnArgVisitor();

            public void processExpression(Block blockExpression) {
                for (Statement statement : blockExpression.getStatements()) {
                    statement.accept(this);
                }
            }

            public void processExpression(IdentifierExpression identifierExpression) {
            }

            public void processExpression(IntegerLiteralExpression integerLiteralExpression) {
            }

            public void processExpression(FloatingPointLiteralExpression floatingPointLiteralExpression) {
            }

            public void processExpression(BooleanLiteralExpression booleanLiteralExpression) {
            }

            public void processExpression(StringLiteralExpression stringLiteralExpression) {
            }

            public void processExpression(SQLLiteralExpression sqlLiteralExpression) {
            }

            public void processExpression(ObjectLiteralExpression objectLiteralExpression) {
            }

            public void processExpression(ArrayLiteralExpression arrayLiteralExpression) {
            }

            public void processExpression(DeclareVariableExpression declareVariableExpression) {
            }

            public void processExpression(AssignExpression assignExpression) {
            }

            public void processExpression(DeclareAndAssignExpression declareAndAssignExpression) {
            }

            public void processExpression(SlotSetExpression slotSetExpression) {
            }

            public void processExpression(SlotExpression slotExpression) {
            }

            public void processExpression(VariableExpression variableExpression) {
            }

            public void processExpression(FunctionDefinitionExpression functionDefinitionExpression) {
            }

            public void processExpression(FunctionCallExpression functionCallExpression) {
            }

            public void processExpression(SlotCallExpression slotCallExpression) {
            }

            public void processExpression(ReturnStatement returnStatement) {
                if (!returnStatement.hasExpression()) {
                    return;
                }

                Expression expression = returnStatement.getExpression();
                expression.accept(returnArgVisitor);

                returnStatement.setOptimizeForTailCall(true);
            }

            public void processExpression(NewExpression newExpression) {
            }

            public void processExpression(ThisExpression thisExpression) {
            }

            public void processExpression(SuperExpression superExpression) {
            }

            public void processExpression(BlockClosureExpression blockClosureExpression) {
            }
        }

        /**
         * Traverses arguments to return expressions and marks appropriate function calls as tail-calls.
         */
        protected static class ReturnArgVisitor implements ExpressionVisitor {
            public void processExpression(Block blockExpression) {
            }

            public void processExpression(IdentifierExpression identifierExpression) {
            }

            public void processExpression(IntegerLiteralExpression integerLiteralExpression) {
            }

            public void processExpression(FloatingPointLiteralExpression floatingPointLiteralExpression) {
            }

            public void processExpression(BooleanLiteralExpression booleanLiteralExpression) {
            }

            public void processExpression(StringLiteralExpression stringLiteralExpression) {
            }

            public void processExpression(SQLLiteralExpression sqlLiteralExpression) {
            }

            public void processExpression(ObjectLiteralExpression objectLiteralExpression) {
            }

            public void processExpression(ArrayLiteralExpression arrayLiteralExpression) {
            }

            public void processExpression(DeclareVariableExpression declareVariableExpression) {
            }

            public void processExpression(AssignExpression assignExpression) {
            }

            public void processExpression(DeclareAndAssignExpression declareAndAssignExpression) {
            }

            public void processExpression(SlotSetExpression slotSetExpression) {
            }

            public void processExpression(SlotExpression slotExpression) {
            }

            public void processExpression(VariableExpression variableExpression) {
            }

            public void processExpression(FunctionDefinitionExpression functionDefinitionExpression) {
            }

            public void processExpression(FunctionCallExpression functionCallExpression) {
                functionCallExpression.setTailCall(true);
            }

            public void processExpression(SlotCallExpression slotCallExpression) {
                slotCallExpression.setTailCall(true);
            }

            public void processExpression(ReturnStatement returnStatement) {
            }

            public void processExpression(NewExpression newExpression) {
            }

            public void processExpression(ThisExpression thisExpression) {
            }

            public void processExpression(SuperExpression superExpression) {
            }

            public void processExpression(BlockClosureExpression blockClosureExpression) {
            }
        }
    }
}
