package org.unbunt.sqlscript;

import org.unbunt.sqlscript.statement.*;
import org.unbunt.sqlscript.support.Env;

public interface ScriptProcessor {
    public void process(Env env, Block block);
//    public void process(Assign assign);
//    public void process(AssignVariable assign);
    public void process(Env env, SQLStatement stmt);
    public void process(Env env, EvalCommand eval);
    public void process(Env env, AnnotationCommand annot);
    public void process(Env env, CreateString createString);
//    public void process(ConditionPrimary cond);
    public void process(Env env, VariableExpression varExpr);
    public void process(Env env, FunctionDefinitionExpression funDef);
    public void process(Env env, NamedFunctionCallExpression funCall);
    public void process(Env env, FunctionCallExpression funCall);
    public void process(Env env, AssignExpression assignExpr);
    public void process(Env env, StringLiteralExpression stringExpr);
    public void process(Env env, NotExpression notExpr);
    public void process(Env env, ConditionEq cond);
    public void process(Env env, ConditionAnd cond);
    public void process(Env env, ConditionOr cond);
    public void process(Env env, IfStatement ifStmt);
    public void process(Env env, TernaryCondExpression tern);
    public void process(Env env, DeclareVariableExpression dec);
    public void process(Env env, DeclareAndAssignExpression expr);
    public void process(Env env, BooleanLiteralExpression boolExpr);
    public void process(Env env, InitParameter init);
}
