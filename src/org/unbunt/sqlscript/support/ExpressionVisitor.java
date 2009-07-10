package org.unbunt.sqlscript.support;

import org.unbunt.sqlscript.statement.*;

public interface ExpressionVisitor {
    void processExpression(Block blockExpression);

    void processExpression(IdentifierExpression identifierExpression);

    void processExpression(IntegerLiteralExpression integerLiteralExpression);

    void processExpression(FloatingPointLiteralExpression floatingPointLiteralExpression);

    void processExpression(BooleanLiteralExpression booleanLiteralExpression);

    void processExpression(StringLiteralExpression stringLiteralExpression);

    void processExpression(ObjectLiteralExpression objectLiteralExpression);

    void processExpression(SQLLiteralExpression sqlLiteralExpression);

    void processExpression(NotExpression notExpression);

    void processExpression(ConditionAnd conditionAnd);

    void processExpression(ConditionOr conditionOr);

    void processExpression(TernaryCondExpression ternaryCondExpression);

    void processExpression(DeclareVariableExpression declareVariableExpression);

    void processExpression(AssignExpression assignExpression);

    void processExpression(DeclareAndAssignExpression declareAndAssignExpression);

    void processExpression(SlotSetExpression slotSetExpression);

    void processExpression(SlotExpression slotExpression);

    void processExpression(VariableExpression variableExpression);

    void processExpression(IfStatement ifStatement);

    void processExpression(TryStatement tryStatement);

    void processExpression(ThrowStatement throwStatement);

    void processExpression(FunctionDefinitionExpression functionDefinitionExpression);

    void processExpression(FunctionCallExpression functionCallExpression);

    void processExpression(SlotCallExpression slotCallExpression);

    void processExpression(ReturnStatement returnStatement);

    void processExpression(NewExpression newExpression);

    void processExpression(ExitStatement exitStatement);

    void processExpression(InitParameter initParameter);

//    void processExpression(AnnotationCommand annotationCommand);

//    void processExpression(EvalCommand evalCommand);

//    void processExpression(SQLStatement sqlStatement);

    /*
    void processExpression(PrimIdExpression primIdExpression);

    void processExpression(PrimNiExpression primNiExpression);

    void processExpression(PrimIntEqExpression primIntEqExpression);

    void processExpression(PrimIntNeExpression primIntNeExpression);

    void processExpression(PrimIntAddExpression primIntAddExpression);

    void processExpression(PrimIntSubExpression primIntSubExpression);

    void processExpression(PrimIntMulExpression primIntMulExpression);

    void processExpression(PrimIntDivExpression primIntDivExpression);

    void processExpression(PrimIntModExpression primIntModExpression);
    */

    void processExpression(ThisExpression thisExpression);

    void processExpression(SuperExpression superExpression);

    void processExpression(BlockClosureExpression blockClosureExpression);
}
