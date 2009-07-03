package org.unbunt.sqlscript.support;

import org.unbunt.sqlscript.statement.*;

import java.util.List;

public class TailCallOptimizer {
    public static final TailCallOptimizer instance = new TailCallOptimizer();

    protected ExpressionVisitor searcher;

    public TailCallOptimizer() {
        searcher = new SearchingVisitor();
    }

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

        public void processExpression(BooleanLiteralExpression booleanLiteralExpression) {
        }

        public void processExpression(StringLiteralExpression stringLiteralExpression) {
        }

        public void processExpression(ObjectLiteralExpression objectLiteralExpression) {
            for (ObjectLiteral.SlotEntry entry : objectLiteralExpression.getObjectLiteral().getSlots()) {
                entry.key.accept(this);
                entry.value.accept(this);
            }
        }

        public void processExpression(NotExpression notExpression) {
            notExpression.getExpression().accept(this);
        }

        public void processExpression(ConditionAnd conditionAnd) {
            for (Expression expression : conditionAnd.getExpressions()) {
                expression.accept(this);
            }
        }

        public void processExpression(ConditionOr conditionOr) {
            for (Expression expression : conditionOr.getExpressions()) {
                expression.accept(this);
            }
        }

        public void processExpression(TernaryCondExpression ternaryCondExpression) {
            ternaryCondExpression.getCondition().accept(this);
            ternaryCondExpression.getTrueExpression().accept(this);
            ternaryCondExpression.getFalseExpression().accept(this);
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

        public void processExpression(IfStatement ifStatement) {
            ifStatement.getCondition().accept(this);
            ifStatement.getTrueStatement().accept(this);
            if (ifStatement.hasFalseStatement()) {
                ifStatement.getFalseStatement().accept(this);
            }
        }

        public void processExpression(TryStatement tryStatement) {
            tryStatement.getBody().accept(this);
            if (tryStatement.hasCatchClause()) {
                tryStatement.getCatchClause().accept(this);
            }
            if (tryStatement.hasFinallyClause()) {
                tryStatement.getFinallyClause().accept(this);
            }
        }

        public void processExpression(ThrowStatement throwStatement) {
            throwStatement.getExpression().accept(this);
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
            // TODO: adjust SQLScriptWalker so that arguments property of newExpression cannot be null
            List<Expression> args = newExpression.getArguments();
            if (args == null) {
                return;
            }
            for (Expression expression : newExpression.getArguments()) {
                expression.accept(this);
            }
        }

        public void processExpression(ExitStatement exitStatement) {
        }

        public void processExpression(InitParameter initParameter) {
        }

        public void processExpression(AnnotationCommand annotationCommand) {
        }

        public void processExpression(EvalCommand evalCommand) {
        }

        public void processExpression(SQLStatement sqlStatement) {
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

            public void processExpression(BooleanLiteralExpression booleanLiteralExpression) {
            }

            public void processExpression(StringLiteralExpression stringLiteralExpression) {
            }

            public void processExpression(ObjectLiteralExpression objectLiteralExpression) {
            }

            public void processExpression(NotExpression notExpression) {
            }

            public void processExpression(ConditionAnd conditionAnd) {
            }

            public void processExpression(ConditionOr conditionOr) {
            }

            public void processExpression(TernaryCondExpression ternaryCondExpression) {
                ternaryCondExpression.getTrueExpression().accept(this);
                ternaryCondExpression.getFalseExpression().accept(this);
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

            public void processExpression(IfStatement ifStatement) {
                ifStatement.getTrueStatement().accept(this);
                ifStatement.getFalseStatement().accept(this);
            }

            public void processExpression(TryStatement tryStatement) {
            }

            public void processExpression(ThrowStatement throwStatement) {
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

            public void processExpression(ExitStatement exitStatement) {
            }

            public void processExpression(InitParameter initParameter) {
            }

            public void processExpression(AnnotationCommand annotationCommand) {
            }

            public void processExpression(EvalCommand evalCommand) {
            }

            public void processExpression(SQLStatement sqlStatement) {
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

            public void processExpression(BooleanLiteralExpression booleanLiteralExpression) {
            }

            public void processExpression(StringLiteralExpression stringLiteralExpression) {
            }

            public void processExpression(ObjectLiteralExpression objectLiteralExpression) {
            }

            public void processExpression(NotExpression notExpression) {
            }

            public void processExpression(ConditionAnd conditionAnd) {
            }

            public void processExpression(ConditionOr conditionOr) {
            }

            public void processExpression(TernaryCondExpression ternaryCondExpression) {
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

            public void processExpression(IfStatement ifStatement) {
                ifStatement.getTrueStatement().accept(this);
                if (ifStatement.hasFalseStatement()) {
                    ifStatement.getFalseStatement().accept(this);
                }
            }

            public void processExpression(TryStatement tryStatement) {
            }

            public void processExpression(ThrowStatement throwStatement) {
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

            public void processExpression(ExitStatement exitStatement) {
            }

            public void processExpression(InitParameter initParameter) {
            }

            public void processExpression(AnnotationCommand annotationCommand) {
            }

            public void processExpression(EvalCommand evalCommand) {
            }

            public void processExpression(SQLStatement sqlStatement) {
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

            public void processExpression(BooleanLiteralExpression booleanLiteralExpression) {
            }

            public void processExpression(StringLiteralExpression stringLiteralExpression) {
            }

            public void processExpression(ObjectLiteralExpression objectLiteralExpression) {
            }

            public void processExpression(NotExpression notExpression) {
            }

            public void processExpression(ConditionAnd conditionAnd) {
            }

            public void processExpression(ConditionOr conditionOr) {
            }

            public void processExpression(TernaryCondExpression ternaryCondExpression) {
                ternaryCondExpression.getTrueExpression().accept(this);
                ternaryCondExpression.getFalseExpression().accept(this);
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

            public void processExpression(IfStatement ifStatement) {
            }

            public void processExpression(TryStatement tryStatement) {
            }

            public void processExpression(ThrowStatement throwStatement) {
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

            public void processExpression(ExitStatement exitStatement) {
            }

            public void processExpression(InitParameter initParameter) {
            }

            public void processExpression(AnnotationCommand annotationCommand) {
            }

            public void processExpression(EvalCommand evalCommand) {
            }

            public void processExpression(SQLStatement sqlStatement) {
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