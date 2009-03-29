package org.unbunt.sqlscript;

import org.unbunt.sqlscript.annotations.*;
import org.unbunt.sqlscript.commands.*;
import org.unbunt.sqlscript.continuations.*;
import org.unbunt.sqlscript.exception.*;
import org.unbunt.sqlscript.lang.*;
import org.unbunt.sqlscript.statement.*;
import org.unbunt.sqlscript.statement.Statement;
import org.unbunt.sqlscript.support.*;
import org.unbunt.sqlscript.utils.StringUtils;
import org.unbunt.utils.VolatileObservable;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.sql.DataSource;
import java.lang.reflect.Constructor;
import java.sql.*;
import java.util.*;

public class SQLScriptEngine
        extends VolatileObservable
        implements ExpressionVisitor {
    protected Log logger = LogFactory.getLog(getClass());

    protected SQLScriptContext context;
    protected boolean finished = false;

    protected final static Map<String, String> commands;

    protected final static Map<String, String> annotations;

    public static final String SLOT_PARENT = "parent";
    public static final Str STR_SLOT_PARENT = new Str(SLOT_PARENT);
    public static final String SLOT_INIT  = "init";
    public static final Str STR_SLOT_INIT = new Str(SLOT_INIT);

    static {
        commands = new HashMap<String, String>();
        commands.put("hello", "org.unbunt.sqlscript.commands.HelloWorldCommand");
        commands.put("test-tx-status", "org.unbunt.sqlscript.commands.TestTXStatusCommand");
        commands.put("echo", "org.unbunt.sqlscript.commands.EchoCommand");
        commands.put("require", "org.unbunt.sqlscript.commands.RequireCommand");
        commands.put("conn-alias", "org.unbunt.sqlscript.commands.AliasConnectionCommand");
        commands.put("set-conn", "org.unbunt.sqlscript.commands.SetConnectionCommand");
        commands.put("connect", "org.unbunt.sqlscript.commands.ConnectCommand");
        commands.put("transfer", "org.unbunt.sqlscript.commands.TransferCommand");
        commands.put("include", "org.unbunt.sqlscript.commands.IncludeCommand");
        commands.put("set", "org.unbunt.sqlscript.commands.SetCommand");
        commands.put("begin", "org.unbunt.sqlscript.commands.BeginCommand");
        commands.put("commit", "org.unbunt.sqlscript.commands.CommitCommand");

        annotations = new HashMap<String, String>();
        annotations.put("describe", "org.unbunt.sqlscript.annotations.DescriptionAnnotation");
        annotations.put("ignoreErrors", "org.unbunt.sqlscript.annotations.IgnoreErrorsAnnotation");
        annotations.put("prepare", "org.unbunt.sqlscript.annotations.PrepareAnnotation");
        annotations.put("quiet", "org.unbunt.sqlscript.annotations.QuietAnnotation");
    }

    public enum CommandType {
        STATEMENT, COMMAND
    }

    public enum CommandState {
        STARTING, PROGRESSED, FINISHED
    }

    protected abstract class State {
        public CommandType type;
        public CommandState state;
        public String progessMsg;
    }

    public class SQLStatementState extends State {
        public SQLStatement statement;
        public String queryString;

        public SQLStatementState(SQLStatement statement, String queryString) {
            this(statement, queryString, CommandState.STARTING);
        }

        public SQLStatementState(SQLStatement statement, String queryString, CommandState state) {
            this.type = CommandType.STATEMENT;
            this.state = state;
            this.statement = statement;
            this.queryString = queryString;
        }
    }

    public class EvalCommandState extends State {
        public EvalCommand command;

        public EvalCommandState(EvalCommand command) {
            this(command, CommandState.STARTING);
        }

        public EvalCommandState(EvalCommand command, CommandState state) {
            this.type = CommandType.COMMAND;
            this.state = state;
            this.command = command;
        }
    }

    public SQLScriptEngine(SQLScriptContext context) {
        this.context = context;
    }

    protected Statement stmt;
    protected Obj val;
    protected Env env = null;

    protected int MAX_CONT_STACK = 4096;
    protected int MAX_CONT_SIZE = 6;
//    protected Continuation[] cont = new Continuation[MAX_CONT_STACK];
    protected Object[][] cont = new Object[MAX_CONT_STACK][MAX_CONT_SIZE];
    protected int pc;

    public static final int CONT_END = 0;
    public static final int CONT_BLOCK = 1;
    public static final int CONT_FUN_RET = 2;
    public static final int CONT_OBJ_LIT = 3;
    public static final int CONT_OBJ_LIT_SLOT = 4;
    public static final int CONT_OBJ_LIT_SLOT_VALUE = 5;
    public static final int CONT_LOGIC_NOT = 6;
    public static final int CONT_LOGIC_AND = 7;
    public static final int CONT_LOGIC_OR = 8;
    public static final int CONT_TERN = 9;
    public static final int CONT_ASSIGN = 10;
    public static final int CONT_ASSIGN_EXPR = 11;
    public static final int CONT_SLOT_SET_RECEIVER = 12;
    public static final int CONT_SLOT_SET_SLOT = 13;
    public static final int CONT_SLOT_SET_VALUE = 14;
    public static final int CONT_SLOT_GET_RECEIVER = 15;
    public static final int CONT_SLOT_GET_SLOT = 16;
    public static final int CONT_IF = 17;
    public static final int CONT_TRY = 18;
    public static final int CONT_FINALLY = 19;
    public static final int CONT_THROW = 20;
    public static final int CONT_CATCH = 21;
    public static final int CONT_FUN = 22;
    public static final int CONT_FUN_ARG = 23;
    public static final int CONT_FUN_ARG_ASSIGN = 24;
    public static final int CONT_SLOT_CALL_RECEIVER = 25;
    public static final int CONT_SLOT_CALL_SLOT = 26;
    public static final int CONT_PRIM = 27;
    public static final int CONT_RETURN = 28;
    public static final int CONT_NEW = 29;
    public static final int CONT_NEW_RESULT = 30;
    public static final int CONT_EXIT = 31;
    public static final int CONT_INIT_PARAM = 32;

    public void process(Block block) throws SQLScriptRuntimeException {
        stmt = block;
        val = null;
        if (env == null) {
            env = new Env();
        }
        pc = 0;
        cont[pc][0] = CONT_END;

        try {
            process();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new SQLScriptRuntimeException("Continuation stack overflow");
        }
    }

    protected final static boolean CONT = true;
    protected final static boolean EVAL = false;

    protected boolean next;

    @SuppressWarnings({"PointlessBooleanExpression"})
    protected void process() throws SQLScriptRuntimeException {
        while (true) {
            if (next == CONT) {
                if (pc == 0) {
                    return;
                }
                cont();
            }
            else {
                eval();
            }
        }
    }

    protected void eval() {
        stmt.accept(this);
    }

    public void processExpression(Block blockExpression) {
//        BlockCont blockCont = blockExpression.isKeepEnv()
//                              ? new BlockCont(blockExpression)
//                              : new BlockCont(blockExpression, env.clone());
//        cont[++pc] = blockCont;
        createContBlock(cont[++pc], blockExpression);
        next = CONT;
    }

    public void processExpression(IdentifierExpression identifierExpression) {
        val = identifierExpression.getValue();
        next = CONT;
    }

    public void processExpression(IntegerLiteralExpression integerLiteralExpression) {
        val = integerLiteralExpression.getValue();
        next = CONT;
    }

    public void processExpression(BooleanLiteralExpression booleanLiteralExpression) {
        val = booleanLiteralExpression.getBool();
        next = CONT;
    }

    public void processExpression(StringLiteralExpression stringLiteralExpression) {
        StringLiteral stringLiteral = stringLiteralExpression.getStringLiteral();

        StringBuilder buf = new StringBuilder();
        String delim = stringLiteral.getDelim();
        for (Object part : stringLiteral.getParts()) {
            String str = part instanceof Variable
                         ? env.get(((Variable) part).getAddress()).toString()
                         : StringUtils.unescapeSQLString(part.toString(), delim);
            buf.append(str);
        }

        val = new Str(buf.toString());
        next = CONT;
    }

    public void processExpression(ObjectLiteralExpression objectLiteralExpression) {
//        cont[++pc] = new ObjLitCont(objectLiteralExpression.getObjectLiteral());
        createContObjLit(cont[++pc], objectLiteralExpression);
        next = CONT;
    }

    public void processExpression(NotExpression notExpression) {
        stmt = notExpression.getExpression();
        cont[++pc][0] = CONT_LOGIC_NOT;
        next = EVAL;
    }

    public void processExpression(ConditionAnd conditionAnd) {
        assert conditionAnd.getExpressions().size() > 1;
        createContLogicAnd(cont[++pc], conditionAnd);
        next = CONT;
    }

    public void processExpression(ConditionOr conditionOr) {
        assert conditionOr.getExpressions().size() > 1;
        createContLogicOr(cont[++pc], conditionOr);
        next = CONT;
    }

    public void processExpression(TernaryCondExpression ternaryCondExpression) {
        stmt = ternaryCondExpression.getCondition();
        createContTern(cont[++pc], ternaryCondExpression);
        next = EVAL;
    }

    public void processExpression(DeclareVariableExpression declareVariableExpression) {
        if (!declareVariableExpression.isNoop()) {
            env.extend();
        }
        next = CONT;
    }

    public void processExpression(AssignExpression assignExpression) {
//        cont[++pc] = new AssignCont(assignExpression.getVariable());
        createContAssign(cont[++pc], assignExpression);
        stmt = assignExpression.getRvalue();
        next = EVAL;
    }

    public void processExpression(DeclareAndAssignExpression declareAndAssignExpression) {
        stmt = declareAndAssignExpression.getDeclareExpr();
//        cont[++pc] = new AssignExprCont(declareAndAssignExpression.getAssignExpr());
        createContAssignExpr(cont[++pc], declareAndAssignExpression);
        next = EVAL;
    }

    public void processExpression(SlotSetExpression slotSetExpression) {
        SlotExpression slotExpression = slotSetExpression.getSlotExpression();
        stmt = slotExpression.getReceiver();
//        cont[++pc] = new SlotSetReceiverCont(slotExpression.getSlot(), slotSetExpression.getValueExpression());
        createContSlotSetReceiver(cont[++pc], slotSetExpression);
        next = EVAL;
    }

    public void processExpression(SlotExpression slotExpression) {
        stmt = slotExpression.getReceiver();
//        cont[++pc] = new SlotGetReceiverCont(slotExpression.getSlot());
        createContSlotGetReceiver(cont[++pc], slotExpression);
        next = EVAL;
    }

    public void processExpression(VariableExpression variableExpression) {
        val = env.get(variableExpression.getVariable().getAddress());
        next = CONT;
    }

    public void processExpression(IfStatement ifStatement) {
        stmt = ifStatement.getCondition();
//        Statement trueStmt = ifStatement.getTrueStatement();
//        Statement falseStmt = ifStatement.hasFalseStatement() ? ifStatement.getFalseStatement() : null;
//        cont[++pc] = new IfCont(trueStmt, falseStmt);
        createContIf(cont[++pc], ifStatement);
        next = EVAL;
    }

    public void processExpression(TryStatement tryStatement) {
        stmt = tryStatement.getBody();
        Env saveEnv = env.clone();
        if (tryStatement.hasFinallyClause()) {
//            cont[++pc] = new FinallyCont(tryStatement.getFinallyClause().getBody(), saveEnv);
            createContFinally(cont[++pc], tryStatement.getFinallyClause().getBody(), saveEnv);
        }
        if (tryStatement.hasCatchClause()) {
//            cont[++pc] = new TryCont(tryStatement.getCatchClause(), saveEnv);
            createContTry(cont[++pc], tryStatement.getCatchClause(), saveEnv);
        }
        next = EVAL;
    }

    public void processExpression(ThrowStatement throwStatement) {
        stmt = throwStatement.getExpression();
        createContThrow(cont[++pc]);
        next = EVAL;
    }

    public void processExpression(FunctionDefinitionExpression functionDefinitionExpression) {
        Function func = functionDefinitionExpression.getFunction();
        String funcName = func.getName();
        val = new Func(func);
        if (funcName != null) {
            if (functionDefinitionExpression.isDeclareVariable()) {
                env.extend();
            }
            env.set(functionDefinitionExpression.getVariable().getAddress(), val);
        }
        func.setEnv(env.clone());
        next = CONT;
    }

    public void processExpression(FunctionCallExpression functionCallExpression) {
        stmt = functionCallExpression.getExpression();
//        cont[++pc] = new FunCont(functionCallExpression.getArguments());
        createContFun(cont[++pc], functionCallExpression);
        next = EVAL;
    }

    public void processExpression(SlotCallExpression slotCallExpression) {
        SlotExpression slotExpression = slotCallExpression.getSlotExpression();
        stmt = slotExpression.getReceiver();
//        cont[++pc] = new SlotCallReceiverCont(slotExpression.getSlot(), slotCallExpression.getArguments());
        createContSlotCallReceiver(cont[++pc], slotCallExpression);
        next = EVAL;
    }

    public void processExpression(ReturnStatement returnStatement) {
        // tail-call optimization
        boolean pushCont = true;
        OUTER:
        for (int i = pc; i >= 0; i--) {
            Object[] cc = cont[i];
            switch ((Integer) cc[0]) {
                case CONT_FUN_RET:
                    pc = i + 1;
                    pushCont = false;
                    break OUTER;
                case CONT_TRY:
                case CONT_FINALLY:
                    break OUTER;
            }
        }

        if (pushCont) {
            createContReturn(cont[++pc]);
        }

        if (returnStatement.hasExpression()) {
            stmt = returnStatement.getExpression();
            next = EVAL;
        }
        else {
            val = null;
            next = CONT;
        }
    }

    public void processExpression(NewExpression newExpression) {
        stmt = newExpression.getExpression();
//        cont[++pc] = new NewCont(newExpression.getArguments());
        createContNew(cont[++pc], newExpression);
        next = EVAL;
    }

    public void processExpression(ExitStatement exitStatement) {
        cont[++pc][0] = CONT_EXIT;
        if (exitStatement.hasExpression()) {
            stmt = exitStatement.getExpression();
            next = EVAL;
        }
        else {
            val = null;
            next = CONT;
        }
    }

    public void processExpression(InitParameter initParameter) {
        stmt = initParameter.getExpression();
//        cont[++pc] = new InitParamCont(initParameter.getParameter());
        createContInitParam(cont[++pc], initParameter);
        next = EVAL;
    }

    public void processExpression(AnnotationCommand annotationCommand) {
        process(annotationCommand);
        next = CONT;
    }

    public void processExpression(EvalCommand evalCommand) {
        process(evalCommand);
        next = CONT;
    }

    public void processExpression(SQLStatement sqlStatement) {
        StringBuilder buf = new StringBuilder();
        for (Object part : sqlStatement.getParts()) {
            if (part instanceof Variable) {
                buf.append(env.get(((Variable) part).getAddress()).toString());
            }
            else if (part instanceof StringLiteral) {
                StringBuilder strBuf = new StringBuilder();
                StringLiteral str = (StringLiteral) part;
                for (Object strPart : str.getParts()) {
                    if (strPart instanceof Variable) {
                        String s = env.get(((Variable) strPart).getAddress()).toString();
                        strBuf.append(StringUtils.escapeSQLString(s, str.getDelim()));
                    }
                    else {
                        strBuf.append(part.toString());
                    }
                }
                buf.append(str.getDelim());
                buf.append(strBuf);
                buf.append(str.getDelim());
            }
            else {
                buf.append(part.toString());
            }
        }
        SQLStatement statement = new SQLStatement();
        statement.setAnnotations(sqlStatement.getAnnotations());
        statement.addPart(buf.toString());
        process(statement);
        next = CONT;
    }

    public void processExpression(PrimIdExpression primIdExpression) {
        Obj o1 = val;
        Obj o2 = primIdExpression.getArguments()[0];
        val = o1 == o2 ? Bool.TRUE : Bool.FALSE;
        next = CONT;
    }

    public void processExpression(PrimNiExpression primNiExpression) {
        Obj o1 = val;
        Obj o2 = primNiExpression.getArguments()[0];
        val = o1 != o2 ? Bool.TRUE : Bool.FALSE;
        next = CONT;
    }

    public void processExpression(PrimIntEqExpression primIntEqExpression) {
        IntInst int1 = (IntInst) val;
        IntInst int2 = (IntInst) primIntEqExpression.getArguments()[0];
        val = int1.getValue() == int2.getValue() ? Bool.TRUE : Bool.FALSE;
        next = CONT;
    }

    public void processExpression(PrimIntNeExpression primIntNeExpression) {
        IntInst int1 = (IntInst) val;
        IntInst int2 = (IntInst) primIntNeExpression.getArguments()[0];
        val = int1.getValue() != int2.getValue() ? Bool.TRUE : Bool.FALSE;
        next = CONT;
    }

    public void processExpression(PrimIntAddExpression primIntAddExpression) {
        IntInst int1 = (IntInst) val;
        IntInst int2 = (IntInst) primIntAddExpression.getArguments()[0];
        val = new IntInst(int1.getValue() + int2.getValue());
        next = CONT;
    }

    public void processExpression(PrimIntSubExpression primIntSubExpression) {
        IntInst int1 = (IntInst) val;
        IntInst int2 = (IntInst) primIntSubExpression.getArguments()[0];
        val = new IntInst(int1.getValue() - int2.getValue());
        next = CONT;
    }

    public void processExpression(PrimIntMulExpression primIntMulExpression) {
        IntInst int1 = (IntInst) val;
        IntInst int2 = (IntInst) primIntMulExpression.getArguments()[0];
        val = new IntInst(int1.getValue() * int2.getValue());
        next = CONT;
    }

    public void processExpression(PrimIntDivExpression primIntDivExpression) {
        IntInst int1 = (IntInst) val;
        IntInst int2 = (IntInst) primIntDivExpression.getArguments()[0];
        val = new IntInst(int1.getValue() / int2.getValue());
        next = CONT;
    }

    public void processExpression(PrimIntModExpression primIntModExpression) {
        IntInst int1 = (IntInst) val;
        IntInst int2 = (IntInst) primIntModExpression.getArguments()[0];
        val = new IntInst(int1.getValue() % int2.getValue());
        next = CONT;
    }

    public void processExpression(ThisExpression thisExpression) {
        val = env.getThis();
        next = CONT;
    }

    protected void cont() {
//        cont[pc].accept(this);
        int contType = (Integer) cont[pc][0];
        switch (contType) {
            case CONT_ASSIGN: processContAssign(); break;
            case CONT_ASSIGN_EXPR: processContAssignExpr(); break;
            case CONT_BLOCK: processContBlock(); break;
            case CONT_CATCH: processContCatch(); break;
            case CONT_END: processContEnd(); break;
            case CONT_EXIT: processContExit(); break;
            case CONT_FINALLY: processContFinally(); break;
            case CONT_FUN: processContFun(); break;
            case CONT_FUN_ARG: processContFunArg(); break;
            case CONT_FUN_ARG_ASSIGN: processContFunArgAssign(); break;
            case CONT_FUN_RET: processContFunRet(); break;
            case CONT_IF: processContIf(); break;
            case CONT_INIT_PARAM: processContInitParam(); break;
            case CONT_LOGIC_AND: processContLogicAnd(); break;
            case CONT_LOGIC_NOT: processContLogicNot(); break;
            case CONT_LOGIC_OR: processContLogicOr(); break;
            case CONT_NEW: processContNew(); break;
            case CONT_NEW_RESULT: processContNewResult(); break;
            case CONT_OBJ_LIT: processContObjLit(); break;
            case CONT_OBJ_LIT_SLOT: processContObjLitSlot(); break;
            case CONT_OBJ_LIT_SLOT_VALUE: processContObjLitSlotValue(); break;
            case CONT_PRIM: processContPrim(); break;
            case CONT_RETURN: processContReturn(); break;
            case CONT_SLOT_CALL_RECEIVER: processContSlotCallReceiver(); break;
            case CONT_SLOT_CALL_SLOT: processContSlotCallSlot(); break;
            case CONT_SLOT_GET_RECEIVER: processContSlotGetReceiver(); break;
            case CONT_SLOT_GET_SLOT: processContSlotGetSlot(); break;
            case CONT_SLOT_SET_RECEIVER: processContSlotSetReceiver(); break;
            case CONT_SLOT_SET_SLOT: processContSlotSetSlot(); break;
            case CONT_SLOT_SET_VALUE: processContSlotSetValue(); break;
            case CONT_TERN: processContTern(); break;
            case CONT_THROW: processContThrow(); break;
            case CONT_TRY: processContTry(); break;
            default:
                throw new SQLScriptRuntimeException("Internal error: Unhandled continuation: " + contType);
        }
    }

    public void processContEnd() {
        pc--;
        next = CONT;
    }

    protected void createContBlock(Object[] cont, Block blockExpression) {
        cont[0] = CONT_BLOCK;
        cont[1] = blockExpression.isKeepEnv() ? env.clone() : null;
        cont[2] = 0;
        cont[3] = blockExpression.getStatementsArray();
    }

    public void processContBlock() {
        Object[] cc = cont[pc];
        int curStmt = (Integer) cc[2];
        Statement[] stmts = (Statement[]) cc[3];

        if (curStmt == stmts.length) {
            Env savedEnv = (Env) cc[1];
            // aleady processed last statement of block, leaving
            if (savedEnv != null) {
                // not restoring environment is important for incremental running of script in interactive mode
                env = savedEnv;
            }
            pc--;
            next = CONT;
        }
        else {
            stmt = stmts[curStmt];
            curStmt++;
            cc[2] = curStmt;
            // tail-call optimization
            if (curStmt == stmts.length) {
                if (((Integer) cont[pc - 1][0]) == CONT_FUN_RET) {
                    pc--;
                }
            }
            next = EVAL;
        }
    }

//    public void processContinuation(BlockCont blockCont) {
//        if (!blockCont.hasNextStatement()) {
//            // aleady processed last statement of block, leaving
//            Env savedEnv = blockCont.getEnv();
//            if (savedEnv != null) {
//                // not restoring environment is important for incremental running of script in interactive mode
//                env = blockCont.getEnv();
//            }
//            pc--;
//            next = CONT;
//        }
//        else {
//            stmt = blockCont.nextStatement();
//            // tail-call optimization
//            if (!blockCont.hasNextStatement()) {
//                if (cont[pc - 1] instanceof FunRetCont) {
//                    pc--;
//                }
//            }
//            next = EVAL;
//        }
//    }

    protected void createContObjLit(Object[] cont, ObjectLiteralExpression objectLiteralExpression) {
        cont[0] = CONT_OBJ_LIT;
        cont[1] = new Obj();
        cont[2] = 0;
        cont[3] = objectLiteralExpression.getObjectLiteral().getSlots().toArray(new ObjectLiteral.SlotEntry[0]);
    }

    public void processContObjLit() {
        Object[] cc = cont[pc];
        Obj obj = (Obj) cc[1];
        int curSlot = (Integer) cc[2];
        ObjectLiteral.SlotEntry[] slots = (ObjectLiteral.SlotEntry[]) cont[3];
        if (curSlot == slots.length) {
            ObjectLiteral.SlotEntry slot = slots[curSlot];
            stmt = slot.key;
            createContObjLitSlot(cont[++pc], obj, slot.value);
            next = EVAL;
        }
        else {
            pc--;
            val = obj;
            next = CONT;
        }
    }

//    public void processContinuation(ObjLitCont objLitCont) {
//        if (objLitCont.hasNextSlot()) {
//            ObjectLiteral.SlotEntry slot = objLitCont.getNextSlot();
//            stmt = slot.key;
//            cont[++pc] = new ObjLitSlotCont(objLitCont.getObj(), slot.value);
//            next = EVAL;
//        }
//        else {
//            pc--;
//            val = objLitCont.getObj();
//            next = CONT;
//        }
//    }

    protected void createContObjLitSlot(Object[] cont, Obj obj, Expression value) {
        cont[0] = CONT_OBJ_LIT_SLOT;
        cont[1] = obj;
        cont[2] = value;
    }

    public void processContObjLitSlot() {
        Object[] cc = cont[pc];
        Obj obj = (Obj) cc[1];
        //noinspection UnnecessaryLocalVariable
        Expression valueExp = (Expression) cc[2];
        stmt = valueExp;
        createContObjLitSlotValue(cont[pc], obj, val);
        next = EVAL;
    }

//    public void processContinuation(ObjLitSlotCont objLitSlotCont) {
//        stmt = objLitSlotCont.getSlotValue();
//        cont[pc] = new ObjLitSlotValueCont(objLitSlotCont.getObj(), val);
//        next = EVAL;
//    }

    protected void createContObjLitSlotValue(Object[] cont, Obj obj, Obj slot) {
        cont[0] = CONT_OBJ_LIT_SLOT_VALUE;
        cont[1] = obj;
        cont[2] = slot;
    }

    public void processContObjLitSlotValue() {
        Object[] cc = cont[pc];
        Obj obj = (Obj) cc[1];
        Obj slot = (Obj) cc[2];
        obj.addSlot(slot, val);
        pc--;
        next = CONT;
    }

//    public void processContinuation(ObjLitSlotValueCont objLitSlotValueCont) {
//        pc--;
//        objLitSlotValueCont.getObj().addSlot(objLitSlotValueCont.getSlot(), val);
//        next = CONT;
//    }

    public void processContLogicNot() {
        val = toBool(val).equals(Bool.TRUE) ? Bool.FALSE : Bool.TRUE;
        pc--;
        next = CONT;
    }

//    public void processContinuation(LogicNotCont logicNotCont) {
//        val = toBool(val).equals(Bool.TRUE) ? Bool.FALSE : Bool.TRUE;
//        pc--;
//        next = CONT;
//    }

    protected void createContLogicAnd(Object[] cont, ConditionAnd conditionAnd) {
        cont[0] = CONT_LOGIC_AND;
        cont[1] = -1;
        cont[2] = conditionAnd.getExpressions().toArray(new Expression[0]);
    }

    public void processContLogicAnd() {
        Object[] cc = cont[pc];
        int curExp = (Integer) cc[1];
        Expression[] exps = (Expression[]) cc[2];
        boolean first = curExp == -1;
        Bool curVal = first ? null : toBool(val);
        if (!first && (curVal.equals(Bool.FALSE) || curExp == exps.length)) {
            val = curVal;
            pc--;
            next = CONT;
        }
        else {
            stmt = exps[++curExp];
            cc[1] = curExp;
            next = EVAL;
        }
    }

//    public void processContinuation(LogicAndCont logicAndCont) {
//        Bool curVal = toBool(val);
//        if (curVal.equals(Bool.FALSE) || !logicAndCont.hasNext()) {
//            val = curVal;
//            pc--;
//            next = CONT;
//        }
//        else {
//            stmt = logicAndCont.next();
//            next = EVAL;
//        }
//    }

    protected void createContLogicOr(Object[] cont, ConditionOr conditionOr) {
        cont[0] = CONT_LOGIC_OR;
        cont[1] = -1;
        cont[2] = conditionOr.getExpressions().toArray(new Expression[0]);
    }

    public void processContLogicOr() {
        Object[] cc = cont[pc];
        int curExp = (Integer) cc[1];
        Expression[] exps = (Expression[]) cc[2];
        boolean first = curExp == -1;
        Bool curVal = first ? null : toBool(val);
        if (!first && (curVal.equals(Bool.TRUE) || curExp == exps.length)) {
            val = curVal;
            pc--;
            next = CONT;
        }
        else {
            stmt = exps[++curExp];
            cc[2] = curExp;
            next = EVAL;
        }
    }

//    public void processContinuation(CondEqCont condEqCont) {
//        stmt = condEqCont.getExpression();
//        cont[pc] = new CondEq2Cont(val);
//        next = EVAL;
//    }

//    public void processContinuation(CondEq2Cont condEq2Cont) {
//        Obj val1 = condEq2Cont.getValue();
//        Obj val2 = val;
//
//        val = (val1 != null && val1.equals(val2)) || val1 == val2 ? Bool.TRUE : Bool.FALSE;
//
//        pc--;
//        next = CONT;
//    }

    protected void createContTern(Object[] cont, TernaryCondExpression ternaryCondExpression) {
        cont[0] = CONT_TERN;
        cont[1] = ternaryCondExpression.getTrueExpression();
        cont[2] = ternaryCondExpression.getFalseExpression();
    }

    public void processContTern() {
        Object[] cc = cont[pc];
        if (toBool(val).equals(Bool.TRUE)) {
            stmt = (Statement) cc[1];
        }
        else {
            stmt = (Statement) cc[2];
        }
        pc--;
        next = EVAL;
    }

//    public void processContinuation(TernCont ternCont) {
//        if (toBool(val).equals(Bool.TRUE)) {
//            stmt = ternCont.getTrueExpression();
//        }
//        else {
//            stmt = ternCont.getFalseExpression();
//        }
//        pc--;
//        next = EVAL;
//    }

    protected void createContAssignExpr(Object[] cont, DeclareAndAssignExpression declareAndAssignExpression) {
        cont[0] = CONT_ASSIGN_EXPR;
        cont[1] = declareAndAssignExpression.getAssignExpr();
    }

    public void processContAssignExpr() {
        Object[] cc = cont[pc];
        stmt = (Statement) cc[1];
        pc--;
        next = EVAL;
    }

//    public void processContinuation(AssignExprCont assignExprCont) {
//        stmt = assignExprCont.getAssign();
//        pc--;
//        next = EVAL;
//    }

    protected void createContAssign(Object[] cont, AssignExpression assignExpression) {
        cont[0] = CONT_ASSIGN;
        cont[1] = assignExpression.getVariable();
    }

    public void processContAssign() {
        Object[] cc = cont[pc];
        Variable var = (Variable) cc[1];
        env.set(var.getAddress(), val);
        pc--;
        next = CONT;
    }

//    public void processContinuation(AssignCont assignCont) {
//        env.set(assignCont.getVariable().getAddress(), val);
//        pc--;
//        next = CONT;
//    }

    protected void createContSlotSetReceiver(Object[] cont, SlotSetExpression slotSetExpression) {
        cont[0] = CONT_SLOT_SET_RECEIVER;
        cont[1] = slotSetExpression.getSlotExpression();
        cont[2] = slotSetExpression.getValueExpression();
    }

    public void processContSlotSetReceiver() {
        Object[] cc = cont[pc];
        //noinspection UnnecessaryLocalVariable
        Expression slotExpression = (Expression) cc[1];
        Expression valueExpression = (Expression) cc[2];
        stmt = slotExpression;
        Obj receiver = val;
//        cont[pc] = new SlotSetSlotCont(receiver, slotSetReceiverCont.getValueExpression());
        createContSlotSetSlot(cont[pc], receiver, valueExpression);
        next = EVAL;
    }

//    public void processContinuation(SlotSetReceiverCont slotSetReceiverCont) {
//        stmt = slotSetReceiverCont.getSlotExpression();
//        Obj receiver = val;
//        cont[pc] = new SlotSetSlotCont(receiver, slotSetReceiverCont.getValueExpression());
//        next = EVAL;
//    }

    protected void createContSlotSetSlot(Object[] cont, Obj receiver, Expression valueExpression) {
        cont[0] = CONT_SLOT_SET_SLOT;
        cont[1] = receiver;
        cont[2] = valueExpression;
    }

    public void processContSlotSetSlot() {
        Object[] cc = cont[pc];
        Obj receiver = (Obj) cc[1];
        Obj slot = val;
        //noinspection UnnecessaryLocalVariable
        Expression valueExp = (Expression) cc[2];

        stmt = valueExp;
//        cont[pc] = new SlotSetValueCont(receiver, slot);
        createContSlotSetValue(cont[pc], receiver, slot);
        next = EVAL;
    }

//    public void processContinuation(SlotSetSlotCont slotSetSlotCont) {
//        Obj receiver = slotSetSlotCont.getReceiver();
//        Obj slot = val;
//
//        stmt = slotSetSlotCont.getValueExpression();
//        cont[pc] = new SlotSetValueCont(receiver, slot);
//        next = EVAL;
//    }

    protected void createContSlotSetValue(Object[] cont, Obj receiver, Obj slot) {
        cont[0] = CONT_SLOT_SET_VALUE;
        cont[1] = receiver;
        cont[2] = slot;
    }

    public void processContSlotSetValue() {
        Object[] cc = cont[pc];
        pc--;

        Obj receiver = (Obj) cc[1];
        Obj slot = (Obj) cc[2];
        Obj value = val;

        receiver.setSlot(slot, value);
        next = CONT;
    }

//    public void processContinuation(SlotSetValueCont slotSetValueCont) {
//        pc--;
//
//        Obj receiver = slotSetValueCont.getReceiver();
//        Obj slot = slotSetValueCont.getSlot();
//        Obj value = val;
//
//        receiver.setSlot(slot, value);
//        next = CONT;
//    }

    protected void createContSlotGetReceiver(Object[] cont, SlotExpression slotExpression) {
        cont[0] = CONT_SLOT_GET_RECEIVER;
        cont[1] = slotExpression.getSlot();
    }

    public void processContSlotGetReceiver() {
        Object[] cc = cont[pc];
        //noinspection UnnecessaryLocalVariable
        Expression slotExp = (Expression) cc[1];

        stmt = slotExp;

        Obj receiver = val;

//        cont[pc] = new SlotGetSlotCont(receiver);
        createContSlotGetSlot(cont[pc], receiver);
        next = EVAL;
    }

//    public void processContinuation(SlotGetReceiverCont slotGetReceiverCont) {
//        Obj receiver = val;
//        stmt = slotGetReceiverCont.getSlotExpression();
//
//        cont[pc] = new SlotGetSlotCont(receiver);
//        next = EVAL;
//    }

    protected void createContSlotGetSlot(Object[] cont, Obj receiver) {
        cont[0] = CONT_SLOT_GET_SLOT;
        cont[1] = receiver;
    }

    public void processContSlotGetSlot() {
        Object[] cc = cont[pc];
        pc--;

        Obj receiver = (Obj) cc[1];
        Obj slot = val;
        Obj obj = receiver;
        while (true) {
            val = obj.getSlot(slot);
            if (val != null) {
                break;
            }
            Obj parent = obj.getSlot(STR_SLOT_PARENT);
            if (parent == null) {
                break;
            }
            obj = parent;
        }
        next = CONT;
    }

//    public void processContinuation(SlotGetSlotCont slotGetSlotCont) {
//        pc--;
//        Obj receiver = slotGetSlotCont.getReceiver();
//        Obj slot = val;
//        Obj obj = receiver;
//        while (true) {
//            val = obj.getSlot(slot);
//            if (val != null) {
//                break;
//            }
//            Obj parent = obj.getSlot(STR_SLOT_PARENT);
//            if (parent == null) {
//                break;
//            }
//            obj = parent;
//        }
//        next = CONT;
//    }

    protected void createContIf(Object[] cont, IfStatement ifStatement) {
        cont[0] = CONT_IF;
        cont[1] = ifStatement.getTrueStatement();
        cont[2] = ifStatement.hasFalseStatement() ? ifStatement.getFalseStatement() : null;
    }

    public void processContIf() {
        Object[] cc = cont[pc];
        pc--;

        if (toBool(val).equals(Bool.TRUE)) {
            stmt = (Statement) cc[1];
            next = EVAL;
        }
        else {
            Statement falseStatement = (Statement) cc[2];
            if (falseStatement != null) {
                stmt = falseStatement;
                next = EVAL;
            }
            else {
                next = CONT;
            }
        }
    }

//    public void processContinuation(IfCont ifCont) {
//        pc--;
//        if (toBool(val).equals(Bool.TRUE)) {
//            stmt = ifCont.getTrueStatement();
//            next = EVAL;
//        }
//        else if (ifCont.hasFalseStatement()) {
//            stmt = ifCont.getFalseStatement();
//            next = EVAL;
//        }
//        else {
//            next = CONT;
//        }
//    }

    protected void createContTry(Object[] cont, CatchStatement catchClause, Env savedEnv) {
        cont[0] = CONT_TRY;
        cont[1] = catchClause;
        cont[2] = savedEnv;
    }

    public void processContTry() {
        pc--;
        next = CONT;
    }

//    public void processContinuation(TryCont tryCont) {
//        pc--;
//        next = CONT;
//    }

    protected void createContThrow(Object[] cont) {
        cont[0] = CONT_THROW;
        cont[1] = false; // has saved value?
        cont[2] = null; // saved value
    }

    public void processContThrow() {
        Object[] throwCont = cont[pc];
        pc--;
        Object[] tryCont = null;
        for (int i = pc; i >= 0; i--) {
            Object[] cc = cont[i];
            switch ((Integer) cc[0]) {
                case CONT_TRY:
                    tryCont = cc;
                    pc = i;
                    break;
                case CONT_FINALLY:
                    //noinspection UnnecessaryLocalVariable
                    Object[] finallyCont = cc;
                    throwCont[1] = true;
                    throwCont[2] = val;
                    pc = i;
                    cont[++pc] = throwCont;
                    cont[++pc] = finallyCont;
                    next = CONT;
                    return;
            }
        }
        if (tryCont == null) {
            throw new SQLScriptRuntimeException("Unhandled execption: " +
                                                (val == null ? "null" : val.toString()));
        }
        CatchStatement catchStmt = (CatchStatement) tryCont[1];
        Env savedEnv = (Env) tryCont[2];
        env = savedEnv;
        boolean hasSavedValue = (Boolean) throwCont[1];
        Obj savedValue = (Obj) throwCont[2];
        env.extend();
        env.set(catchStmt.getVariable().getAddress(), hasSavedValue ? savedValue : val);
        stmt = catchStmt.getBody();
//        cont[++pc] = new CatchCont(savedEnv);
        createCatchCont(cont[++pc], savedEnv);
        next = EVAL;
    }

//    public void processContinuation(ThrowCont throwCont) {
//        pc--;
//        Object[] tryCont = null;
//        for (int i = pc; i >= 0; i--) {
//            Object[] cc = cont[i];
//            switch ((Integer) cc[0]) {
//                case CONT_TRY:
//                    tryCont = cc;
//                    pc = i;
//                    break;
//                case CONT_FINALLY:
//                    //noinspection UnnecessaryLocalVariable
//                    Object[] finallyCont = cc;
//                    throwCont.setSavedValue(val);
//                    pc = i;
//                    cont[++pc] = throwCont;
//                    cont[++pc] = finallyCont;
//                    next = CONT;
//                    return;
//            }
//        }
//        if (tryCont == null) {
//            throw new SQLScriptRuntimeException("Unhandled execption: " +
//                                                (val == null ? "null" : val.toString()));
//        }
//        CatchStatement catchStmt = tryCont.getCatchClause();
//        Env savedEnv = tryCont.getEnv();
//        env = savedEnv;
//        env.extend();
//        env.set(catchStmt.getVariable().getAddress(), throwCont.hasSavedValue() ? throwCont.getSavedValue() : val);
//        stmt = catchStmt.getBody();
//        cont[++pc] = new CatchCont(savedEnv);
//        next = EVAL;
//    }

    protected void createCatchCont(Object[] cont, Env savedEnv) {
        cont[0] = CONT_CATCH;
        cont[1] = savedEnv;
    }

    public void processContCatch() {
        Object[] cc = cont[pc];
        pc--;
        env = (Env) cc[1];
        next = CONT;
    }

//    public void processContinuation(CatchCont catchCont) {
//        pc--;
//        env = catchCont.getEnv();
//        next = CONT;
//    }

    protected void createContFinally(Object[] cont, Statement body, Env savedEnv) {
        cont[0] = CONT_FINALLY;
        cont[1] = body;
        cont[2] = savedEnv;
    }

    public void processContFinally() {
        Object[] cc = cont[pc];
        pc--;

        Statement body = (Statement) cc[1];
        Env savedEnv = (Env) cc[2];

        stmt = body;
        env = savedEnv;

        next = EVAL;
    }

//    public void processContinuation(FinallyCont finallyCont) {
//        pc--;
//        env = finallyCont.getEnv();
//        stmt = finallyCont.getBody();
//        next = EVAL;
//    }

    protected void createContSlotCallReceiver(Object[] cont, SlotCallExpression slotCallExpression) {
        cont[0] = CONT_SLOT_CALL_RECEIVER;
        cont[1] = slotCallExpression.getSlotExpression().getSlot();
        cont[2] = slotCallExpression.getArgumentsArray();
    }

    public void processContSlotCallReceiver() {
        Object[] cc = cont[pc];
        Expression slotExp = (Expression) cc[1];
        Expression[] args = (Expression[]) cc[2];

        Obj receiver = val;
        stmt = slotExp;
//        cont[pc] = new SlotCallSlotCont(receiver, slotCallReceiverCont.getArguments());
        createContSlotCallSlot(cont[pc], receiver, args);

        next = EVAL;
    }

    protected static Str slotSub = new Str("-").intern();

    protected void createContSlotCallSlot(Object[] cont, Obj receiver, Expression[] args) {
        cont[0] = CONT_SLOT_CALL_SLOT;
        cont[1] = receiver;
        cont[2] = args;
    }

    public void processContSlotCallSlot() {
        Object[] cc = cont[pc];
        Obj receiver = (Obj) cc[1];
        Expression[] args = (Expression[]) cc[2];
        Obj slot = val;

        Obj obj = receiver;
        while (true) {
            PrimitiveExpression prim = obj.getPrimitiveForSlot(slot);
            if (prim != null) {
//                cont[pc] = new PrimitiveCont(prim, receiver, slotCallSlotCont.getArguments());
                createContPrim(cont[pc], prim, receiver, args);
                next = CONT;
                return;
            }

            val = obj.getSlot(slot);
            if (val != null) {
                break;
            }

            Obj parent = obj.getSlot(STR_SLOT_PARENT);
            if (parent == null) {
                break;
            }

            obj = parent;
        }

//        cont[pc] = new FunCont(receiver, slotCallSlotCont.getArguments());
        createContFun(cont[pc], receiver, args);
        next = CONT;
    }

//    public void processContinuation(SlotCallSlotCont slotCallSlotCont) {
//        Obj receiver = slotCallSlotCont.getReceiver();
//        Obj slot = val;
//
//        Obj obj = receiver;
//        while (true) {
//            PrimitiveExpression prim = obj.getPrimitiveForSlot(slot);
//            if (prim != null) {
//                cont[pc] = new PrimitiveCont(prim, receiver, slotCallSlotCont.getArguments());
//                next = CONT;
//                return;
//            }
//
//            val = obj.getSlot(slot);
//            if (val != null) {
//                break;
//            }
//
//            Obj parent = obj.getSlot(STR_SLOT_PARENT);
//            if (parent == null) {
//                break;
//            }
//
//            obj = parent;
//        }
//
//        cont[pc] = new FunCont(receiver, slotCallSlotCont.getArguments());
//        next = CONT;
//    }

    protected void createContFun(Object[] cont, Obj receiver, Expression[] args) {
        cont[0] = CONT_FUN;
        cont[1] = args;
        cont[2] = receiver;
    }

    protected void createContFun(Object[] cont, FunctionCallExpression functionCallExpression) {
        cont[0] = CONT_FUN;
        cont[1] = functionCallExpression.getArgumentsArray();
        cont[2] = null; // context
    }

    public void processContFun() {
        if (val == null || !(val instanceof Func)) {
            throw new SQLScriptRuntimeException("Not a function");
        }

        Object[] cc = cont[pc];
        Expression[] args = (Expression[]) cc[1];
        Obj context = (Obj) cc[2];

        Function func = ((Func) val).getFunction();
        checkFunArgs(func, args);

        Env funcEnv = func.getEnv().clone();
        Env savedEnv = env.clone();
        funcEnv.setThis(context);
//        cont[pc] = new FunArgCont(func, args, funcEnv, savedEnv);
        createFunArgCont(cont[pc], func, args, funcEnv, savedEnv);
        next = CONT;
    }

//    public void processContinuation(FunCont funCont) {
//        if (val == null || !(val instanceof Func)) {
//            throw new SQLScriptRuntimeException("Not a function");
//        }
//        Function func = ((Func) val).getFunction();
//        List<Expression> args = funCont.getArguments();
//        checkFunArgs(func, args);
//        Env funcEnv = func.getEnv().clone();
//        Env savedEnv = env.clone();
//        Obj context = funCont.getContext();
//        funcEnv.setThis(context);
//        cont[pc] = new FunArgCont(func, args, funcEnv, savedEnv);
//        next = CONT;
//    }

    protected void createFunArgCont(Object[] cont, Function func, Expression[] args, Env funcEnv, Env savedEnv) {
        cont[0] = CONT_FUN_ARG;
        cont[1] = func;
        cont[2] = 0;
        cont[3] = args;
        cont[4] = funcEnv;
        cont[5] = savedEnv;
    }

    public void processContFunArg() {
        Object[] cc = cont[pc];
        int curArg = (Integer) cc[2];
        Expression[] args = (Expression[]) cc[3];
        Env funcEnv = (Env) cc[4];
        if (curArg < args.length) {
            stmt = args[curArg];
            curArg++;
            cc[2] = curArg;
//            cont[++pc] = new FunArgAssignCont(funArgCont.getFuncEnv());
            createContFunArgAssign(cont[++pc], funcEnv);
            next = EVAL;
        }
        else {
            Function func = (Function) cc[1];
            pc--;
            // tail-call optimization
            if (((Integer)cont[pc - 1][0]) != CONT_FUN_RET) {
                Env savedEnv = (Env) cc[5];
//                cont[++pc] = new FunRetCont(savedEnv);
                createContFunRet(cont[++pc], savedEnv);
            }
            env = funcEnv;
            stmt = func.getBody();
            next = EVAL;
        }
    }

//    public void processContinuation(FunArgCont funArgCont) {
//        if (funArgCont.hasNext()) {
//            stmt = funArgCont.next();
//            cont[++pc] = new FunArgAssignCont(funArgCont.getFuncEnv());
//            next = EVAL;
//        }
//        else {
//            pc--;
//            // tail-call optimization
//            if (!(cont[pc - 1] instanceof FunRetCont)) {
//                cont[++pc] = new FunRetCont(funArgCont.getSavedEnv());
//            }
//            env = funArgCont.getFuncEnv();
//            stmt = funArgCont.getBody();
//            next = EVAL;
//        }
//    }

    protected void createContFunArgAssign(Object[] cont, Env funcEnv) {
        cont[0] = CONT_FUN_ARG_ASSIGN;
        cont[1] = funcEnv;
    }

    public void processContFunArgAssign() {
        Object[] cc = cont[pc];
        Env funcEnv = (Env) cc[1];
        funcEnv.extend();
        funcEnv.set(0, val);
        pc--;
        next = CONT;
    }

//    public void processContinuation(FunArgAssignCont funArgAssignCont) {
//        Env funcEnv = funArgAssignCont.getEnv();
//        funcEnv.extend();
//        funcEnv.set(0, val);
//        pc--;
//        next = CONT;
//    }

    protected void createContFunRet(Object[] cont, Env savedEnv) {
        cont[0] = CONT_FUN_RET;
        cont[1] = savedEnv;
    }

    public void processContFunRet() {
        Object[] cc = cont[pc];
        env = (Env) cc[1];
        pc--;
        next = CONT;
    }

//    public void processContinuation(FunRetCont funRetCont) {
//        Object[] cc = cont[pc];
//        env = (Env) cc[1];
//        pc--;
//        next = CONT;
//    }

    protected void createContReturn(Object[] cont) {
        cont[0] = CONT_RETURN;
        cont[1] = false; // has saved value?
        cont[2] = null; // saved value
    }

    public void processContReturn() {
        Object[] cc = cont[pc];
        boolean hasSavedValue = (Boolean) cc[1];
        pc--;
        for (int i = pc; i >= 0; i--) {
            Object[] c = cont[i];
            switch ((Integer) c[0]) {
                case CONT_FUN_RET:
                    pc = i + 1;
                    if (hasSavedValue) {
                        val = (Obj) cc[2];
                    }
                    next = CONT;
                    return;
                case CONT_FINALLY:
                    Object[] finallyCont = c;
                    if (!hasSavedValue) {
                        cc[2] = val;
                    }
                    pc = i;
                    cont[++pc] = cc;
                    cont[++pc] = finallyCont;
                    next = CONT;
                    return;
            }
        }
        throw new SQLScriptRuntimeException("Found return statement outside of function block");
    }

//    public void processContinuation(ReturnCont returnCont) {
//        pc--;
//        for (int i = pc; i >= 0; i--) {
//            Continuation c = cont[i];
//            if (c instanceof FunRetCont) {
//                pc = i + 1;
//                if (returnCont.hasSavedValue()) {
//                    val = returnCont.getSavedValue();
//                }
//                next = CONT;
//                return;
//            }
//            else if (c instanceof FinallyCont) {
//                FinallyCont finallyCont = (FinallyCont) c;
//                if (!returnCont.hasSavedValue()) {
//                    returnCont.setSavedValue(val);
//                }
//                pc = i;
//                cont[++pc] = returnCont;
//                cont[++pc] = finallyCont;
//                next = CONT;
//                return;
//            }
//        }
//        throw new SQLScriptRuntimeException("Found return statement outside of function block");
//    }

    protected void createContPrim(Object[] cont, Expression primExp, Obj receiver, Expression[] args) {
        cont[0] = CONT_PRIM;
        cont[1] = primExp;
        cont[2] = receiver;
        cont[3] = -1;
        cont[4] = args;
        cont[5] = new Obj[args.length];
    }

    public void processContPrim() {
        Object[] cc = cont[pc];
        int curArg = (Integer) cc[3];
        Expression[] args = (Expression[]) cc[4];
        Obj[] results = (Obj[]) cc[5];

        if (curArg != -1) {
            results[curArg] = val;
        }
        curArg++;
        if (curArg < args.length) {
            stmt = args[curArg];
            cc[3] = curArg;
        }
        else {
            pc--;
            PrimitiveExpression p = (PrimitiveExpression) cc[1];
            p.setArguments(results);
            stmt = p;
            val = (Obj) cc[2];
        }
        next = EVAL;
    }

//    public void processContinuation(PrimitiveCont primitiveCont) {
//        primitiveCont.setArgumentValue(val);
//        if (primitiveCont.hasNextArgument()) {
//            stmt = primitiveCont.getNextArgument();
//        }
//        else {
//            pc--;
//            PrimitiveExpression p = primitiveCont.getPrimitiveExpression();
//            p.setArguments(primitiveCont.getEvaluatedArguments());
//            stmt = p;
//            val = primitiveCont.getArgument1();
//        }
//        next = EVAL;
//    }

    protected void createContNew(Object[] cont, NewExpression newExpression) {
        cont[0] = CONT_NEW;
        cont[1] = newExpression.getArguments().toArray(new Expression[0]);
    }

    public void processContNew() {
        Object[] cc = cont[pc];
        Expression[] args = (Expression[]) cc[1];

        Obj newObj = new Obj();
        newObj.setSlot(STR_SLOT_PARENT, val);
        val = STR_SLOT_INIT;
//        cont[pc]   = new NewResultCont(newObj);
        createContNewResult(cont[pc], newObj);
//        cont[++pc] = new FunCont(newObj, newCont.getArguments()); // make NewCont support args
        createContFun(cont[++pc], newObj, args);
//        cont[++pc] = new SlotGetSlotCont(newObj);
        createContSlotGetSlot(cont[++pc], newObj);
        next = CONT;
    }

//    public void processContinuation(NewCont newCont) {
//        Obj newObj = new Obj();
//        newObj.setSlot(STR_SLOT_PARENT, val);
//        val = STR_SLOT_INIT;
//        cont[pc]   = new NewResultCont(newObj);
//        cont[++pc] = new FunCont(newObj, newCont.getArguments()); // make NewCont support args
//        cont[++pc] = new SlotGetSlotCont(newObj);
//        next = CONT;
//    }

    protected void createContNewResult(Object[] cont, Obj newObj) {
        cont[0] = CONT_NEW_RESULT;
        cont[1] = newObj;
    }

    public void processContNewResult() {
        Object[] cc = cont[pc];
        pc--;
        val = (Obj) cc[1];
        next = CONT;
    }

//    public void processContinuation(NewResultCont newResultCont) {
//        pc--;
//        val = newResultCont.getNewObject();
//        next = CONT;
//    }

    public void processContExit() {
        System.out.println("Computation finished. Exit continuation reached.");
        pc = 0;
        finished = true;
        next = CONT;
    }

//    public void processContinuation(ExitCont exitCont) {
//        System.out.println("Computation finished. Exit continuation reached.");
//        pc = 0;
//        finished = true;
//        next = CONT;
//    }

    protected void createContInitParam(Object[] cont, InitParameter initParameter) {
        cont[0] = CONT_INIT_PARAM;
        cont[1] = initParameter.getParameter();
    }

    public void processContInitParam() {
        Object[] cc = cont[pc];
        Parameter param = (Parameter) cc[1];
        param.setValue(val);
        pc--;
        next = CONT;
    }

//    public void processContinuation(InitParamCont initParamCont) {
//        Parameter param = initParamCont.getParameter();
//        param.setValue(val);
//        pc--;
//        next = CONT;
//    }

    protected void process(EvalCommand command) throws SQLScriptRuntimeException {
        logger.debug("Executing CMD: " + command);

        SQLScriptOptions options = context.getOptions();

        boolean quiet = options.quiet;
        if (quiet && command.isAnnotationPresent(DescriptionAnnotation.class)) {
            quiet = false;
        }
        if (!quiet && command.isAnnotationPresent(QuietAnnotation.class)) {
            quiet = true;
        }

        final EvalCommandState state = new EvalCommandState(command);
        if (!quiet) {
            notifyObservers(state);
        }

        Command cmd = loadCommand(command.getName());

        if (cmd instanceof ConnectionRequired) {
            connect();
            Connection conn = context.getConnection();
            ((ConnectionRequired) cmd).setConnection(conn);
        }

        if (cmd instanceof StatementRequired) {
            SQLStatement stmt = context.getLastSQLStatement();
            if (stmt == null) {
                throw new StatementRequiredException();
            }
            ((StatementRequired) cmd).setStatement(stmt);
        }

        if (cmd instanceof ResultSetRequired) {
            ResultSet rs = context.getLastSQLResult();
            if (rs == null) {
                throw new ResultSetRequiredException();
            }
            ((ResultSetRequired) cmd).setResultSet(rs);
        }

        if (cmd instanceof UpdateCountRequired) {
            int updateCount = context.getLastUpdateCount();
            if (updateCount == -1) {
                throw new UpdateCountRequiredException();
            }
            ((UpdateCountRequired) cmd).setUpdateCount(updateCount);
        }

        if (cmd instanceof Observable) {
            ((Observable) cmd).addObserver(new Observer() {
                public void update(Observable o, Object arg) {
                    if (arg instanceof State) {
                        // update from sub-context - pass through as is
                        notifyObservers(arg);
                    }
                    else {
                        state.state = CommandState.PROGRESSED;
                        state.progessMsg = arg.toString();
                        notifyObservers(state);
                    }
                }
            });
        }

        ResultSet rs = context.getLastSQLResult();
        if (rs != null) {
            try {
                rs.beforeFirst();
            } catch (SQLException e) {
                logger.warn("Warning: Failed to reset ResultSet: " + e.getMessage());
            }
        }

        cmd.execute(context, command.getParams());

        if (!quiet) {
            state.state = CommandState.FINISHED;
            notifyObservers(state);
        }
    }

    protected void process(SQLStatement sqlStmt) throws SQLScriptRuntimeException {
        logger.debug("Executing SQL: " + sqlStmt);

        // first, close last statement, if exists
        java.sql.Statement lastStmt = context.getLastSQLStatementResource();
        if (lastStmt != null) {
            try {
                lastStmt.close();
            } catch (SQLException e) {
                throw new StatementFailedException(e);
            }
        }

        SQLScriptOptions options = context.getOptions();

        boolean quiet = options.quiet;
        if (quiet && sqlStmt.isAnnotationPresent(DescriptionAnnotation.class)) {
            quiet = false;
        }
        if (!quiet && sqlStmt.isAnnotationPresent(QuietAnnotation.class)) {
            quiet = true;
        }

        connect();

        String sql = sqlStmt.toString();
        SQLStatementState state = new SQLStatementState(sqlStmt, sql);
        if (!quiet) {
            notifyObservers(state);
        }

        boolean ignoreErrors = sqlStmt.isAnnotationPresent(IgnoreErrorsAnnotation.class);

        Connection conn = context.getConnection();
        Savepoint savepoint = null;
        try {
            boolean isAutoCommit = conn.getAutoCommit();
            if (!isAutoCommit && ignoreErrors && conn.getMetaData().supportsSavepoints()) {
                // required for postgresql
                savepoint = conn.setSavepoint();
            }

            if (sqlStmt.isAnnotationPresent(PrepareAnnotation.class)) {
                PreparedStatement stmt = conn.prepareStatement(
                        sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY
                );
                context.setPreparedStatement(sqlStmt.getAnnotation(PrepareAnnotation.class).getAlias(), stmt);
            }
            else {
                java.sql.Statement stmt = conn.createStatement(
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY
                );
                stmt.execute(sql, conn.getMetaData().supportsGetGeneratedKeys()
                                  ? java.sql.Statement.RETURN_GENERATED_KEYS
                                  : java.sql.Statement.NO_GENERATED_KEYS);
                context.setLastSQLStatement(sqlStmt);
                context.setLastSQLStatementResource(stmt);
                context.setLastSQLResult(stmt.getResultSet());
                context.setLastUpdateCount(stmt.getUpdateCount());
                printSQLResult();
            }
        } catch (SQLException e) {
            if (savepoint != null) {
                try { conn.rollback(savepoint); }
                catch (Exception ignored) {}
            }

            if (!ignoreErrors) {
                throw new StatementFailedException(e);
            }
            else {
                logger.debug("Ignoring error: " + e.getMessage(), e);
            }
        }

        if (!quiet) {
            state.state = CommandState.FINISHED;
            notifyObservers(state);
        }
    }

    @SuppressWarnings({"MalformedFormatString"})
    protected void printSQLResult() throws SQLException {
        ResultSet rs = context.getLastSQLResult();
        int updateCount = context.getLastUpdateCount();

        if (rs != null) {
            rs.beforeFirst();
            ResultSetMetaData meta = rs.getMetaData();
            int cols = meta.getColumnCount();
            int[] colWidths = new int[cols + 1];
            for (int i = 1; i <= cols; i++) {
                String label = meta.getColumnLabel(i);
                colWidths[i] = label.length();
            }
            while (rs.next()) {
                for (int i = 1; i <= cols; i++) {
                    int lastWidth = colWidths[i];
                    int currWidth;
                    int colType = meta.getColumnType(i);
                    switch (colType) {
                        case Types.DECIMAL:
                        case Types.DOUBLE:
                        case Types.FLOAT:
                        case Types.NUMERIC:
                        case Types.REAL:
                            currWidth = String.format("%g", rs.getObject(i)).length();
                            break;
                        case Types.BIGINT:
                        case Types.INTEGER:
                        case Types.ROWID:
                        case Types.SMALLINT:
                        case Types.TINYINT:
                            currWidth = String.format("%d", (Number)rs.getObject(i)).length();
                            break;
                        default:
                            currWidth = ("" + rs.getObject(i)).length();
                    }
                    colWidths[i] = Math.max(lastWidth, currWidth);
                }
            }

            rs.beforeFirst();

            System.out.print("|");
            for (int i = 1; i <= cols; i++) {
                int colWidth = colWidths[i];
                System.out.printf(" %-" + colWidth + "s |", meta.getColumnLabel(i));
            }
            System.out.println();
            while (rs.next()) {
                System.out.print("|");
                for (int i = 1; i <= cols; i++) {
                    int colWidth = colWidths[i];
                    int colType = meta.getColumnType(i);
                    switch (colType) {
                        case Types.DECIMAL:
                        case Types.DOUBLE:
                        case Types.FLOAT:
                        case Types.NUMERIC:
                        case Types.REAL:
                            System.out.printf(" %" + colWidth + "g |", rs.getObject(i));
                            break;
                        case Types.BIGINT:
                        case Types.INTEGER:
                        case Types.ROWID:
                        case Types.SMALLINT:
                        case Types.TINYINT:
                            System.out.printf(" %" + colWidth + "d |", rs.getObject(i));
                            break;
                        default:
                            System.out.printf(" %-" + colWidth + "s |", "" + rs.getObject(i));
                    }
                }
                System.out.println();
            }
        }
        else if (updateCount != -1) {
            System.out.println(updateCount + " rows affected.");
        }
    }

    protected void process(AnnotationCommand annCmd) {
        logger.debug("Executing annotation: " + annCmd);

        Annotation annotation = loadAnnotation(annCmd.getName(), annCmd.getParams());
        annCmd.getSubject().addAnnotation(annotation);
    }

    protected void checkFunArgs(Function function, List<Expression> args) {
//        if (!matchesFunArgs(function, args)) {
        if (function.getArgCount() != args.size()) {
            throw new SQLScriptRuntimeException("Arguments do not match function");
        }
    }

    protected void checkFunArgs(Function function, Expression[] args) {
//        if (!matchesFunArgs(function, args)) {
        if (function.getArgCount() != args.length) {
            throw new SQLScriptRuntimeException("Arguments do not match function");
        }
    }

    protected boolean matchesFunArgs(Function function, Map<String, Expression> args) {
        List<String> decArgs = function.getArguments();
        if (decArgs == null) {
            return args == null;
        }
        else if (args == null) {
            return false;
        }

        if (decArgs.size() != args.keySet().size()) {
            return false;
        }

        for (String decArg : decArgs) {
            if (!args.containsKey(decArg)) {
                return false;
            }
        }

        return true;
    }

    protected Bool toBool(Obj value) {
        return value != null && (!(value instanceof Bool) || value.equals(Bool.TRUE)) ? Bool.TRUE : Bool.FALSE;
    }

    protected void finish() throws SQLScriptRuntimeException {
        logger.debug("Finishing");

        if (!(context instanceof SQLScriptChildContext)) {
            Map<String, Connection> conns = context.getConnections();
            DBConnectionCloseFailedException ex = null;
            for (Connection connection : conns.values()) {
                if (connection == null) {
                    continue;
                }

                try {
                    connection.close();
                } catch (SQLException e) {
                    ex = new DBConnectionCloseFailedException("Closing connection failed: " + e.getMessage(), e);
                }
            }

            if (ex != null) {
                throw ex;
            }
        }
    }

    protected void connect() throws SQLScriptRuntimeException {
        if (context.getConnection() != null) {
            return;
        }

        DataSource ds = context.getDataSource();
        if (ds == null) {
            throw new NoDataSourceException();
        }

        try {
            Connection conn = ds.getConnection();
            context.setConnection(conn);
        } catch (SQLException e) {
            throw new DBConnectionFailedException(e);
        }
    }

    protected Command loadCommand(String command) throws SQLScriptRuntimeException {
        String className = commands.get(command);
        if (className == null) {
            throw new SQLScriptRuntimeException("No such command: " + command);
        }
        try {
            Class cls = Class.forName(className);
            Constructor ctor = cls.getConstructor();
            return (Command) ctor.newInstance();
        } catch (ClassNotFoundException e) {
            throw new SQLScriptRuntimeException("Failed to load command: " + command + ": " +
                                                "Class not found: " + className);
        } catch (ClassCastException e) {
            throw new SQLScriptRuntimeException("Failed to load command: " + command + ": " +
                                                "Class " + className + " " +
                                                "does not implement interface " + Command.class.getName());
        } catch (Exception e) {
            throw new SQLScriptRuntimeException("Failed to load command: " + command + ": " + e.getMessage(), e);
        }
    }

    protected Annotation loadAnnotation(String annotation, Parameters params) throws SQLScriptRuntimeException {
        String className = annotations.get(annotation);
        if (className == null) {
            throw new SQLScriptRuntimeException("No such annotation: " + annotation);
        }
        try {
            Class cls = Class.forName(className);
            Constructor ctor = cls.getConstructor();
            Annotation a = (Annotation) ctor.newInstance();
            a.initialize(params);
            return a;
        } catch (ClassNotFoundException e) {
            throw new SQLScriptRuntimeException("Failed to load annotation: " + annotation + ": " +
                                                "Class not found: " + className);
        } catch (ClassCastException e) {
            throw new SQLScriptRuntimeException("Failed to load annotation: " + annotation + ": " +
                                                "Class " + className + " " +
                                                "does not implement interface " + Annotation.class.getName());
        } catch (NoSuchMethodException e) {
            throw new SQLScriptRuntimeException("Failed to load annotation: " + annotation + ": " +
                                                "Class " + className + " " +
                                                "does not implement a default constructor");
        } catch (Exception e) {
            throw new SQLScriptRuntimeException("Failed to load annotation: " + annotation + ": " + e.getMessage(), e);
        }
    }

    public SQLScriptContext getContext() {
        return context;
    }

    public void setContext(SQLScriptContext context) {
        this.context = context;
    }

    public boolean isFinished() {
        return finished;
    }
}
