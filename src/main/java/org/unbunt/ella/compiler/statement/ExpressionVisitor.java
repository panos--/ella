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
