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
        implements ExpressionVisitor, ContinuationVisitor {
    @SuppressWarnings({"UnusedDeclaration"})
    private static final boolean STEP = false;

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
    protected Continuation[] cont = new Continuation[MAX_CONT_STACK];
    protected int pc;

    public void process(Block block) throws SQLScriptRuntimeException {
        stmt = block;
        val = null;
        if (env == null) {
            env = new Env();
        }
        pc = 0;
        cont[pc] = new EndCont();

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

    @SuppressWarnings({"PointlessBooleanExpression"})
    protected boolean step() throws SQLScriptRuntimeException {
        if (next == CONT) {
            if (pc == 0) {
                return false;
            }
            cont();
        }
        else {
            eval();
        }

        return true;
    }

    protected void eval() {
        stmt.accept(this);
    }

    public void processExpression(Block blockExpression) {
        BlockCont blockCont = blockExpression.isKeepEnv()
                              ? new BlockCont(blockExpression)
                              : new BlockCont(blockExpression, new Env(env));
        cont[++pc] = blockCont;
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
        cont[++pc] = new ObjLitCont(objectLiteralExpression.getObjectLiteral());
        next = CONT;
    }

    public void processExpression(NotExpression notExpression) {
        stmt = notExpression.getExpression();
        cont[++pc] = new LogicNotCont();
        next = EVAL;
    }

    public void processExpression(ConditionAnd conditionAnd) {
        assert conditionAnd.getExpressions().size() > 1;
        LogicAndCont logicAndCont = new LogicAndCont(conditionAnd.getExpressions());
        stmt = logicAndCont.next();
        cont[++pc] = logicAndCont;
        next = EVAL;
    }

    public void processExpression(ConditionOr conditionOr) {
        assert conditionOr.getExpressions().size() > 1;
        LogicOrCont logicOrCont = new LogicOrCont(conditionOr.getExpressions());
        stmt = logicOrCont.next();
        cont[++pc] = logicOrCont;
        next = EVAL;
    }

    public void processExpression(TernaryCondExpression ternaryCondExpression) {
        stmt = ternaryCondExpression.getCondition();
        cont[++pc] = new TernCont(ternaryCondExpression.getTrueExpression(), ternaryCondExpression.getFalseExpression());
        next = EVAL;
    }

    public void processExpression(DeclareVariableExpression declareVariableExpression) {
        if (!declareVariableExpression.isNoop()) {
            env.extend();
        }
        next = CONT;
    }

    public void processExpression(AssignExpression assignExpression) {
        cont[++pc] = new AssignCont(assignExpression.getVariable());
        stmt = assignExpression.getRvalue();
        next = EVAL;
    }

    public void processExpression(DeclareAndAssignExpression declareAndAssignExpression) {
        stmt = declareAndAssignExpression.getDeclareExpr();
        cont[++pc] = new AssignExprCont(declareAndAssignExpression.getAssignExpr());
        next = EVAL;
    }

    public void processExpression(SlotSetExpression slotSetExpression) {
        SlotExpression slotExpression = slotSetExpression.getSlotExpression();
        stmt = slotExpression.getReceiver();
        cont[++pc] = new SlotSetReceiverCont(slotExpression.getSlot(), slotSetExpression.getValueExpression());
        next = EVAL;
    }

    public void processExpression(SlotExpression slotExpression) {
        stmt = slotExpression.getReceiver();
        cont[++pc] = new SlotGetReceiverCont(slotExpression.getSlot());
        next = EVAL;
    }

    public void processExpression(VariableExpression variableExpression) {
        val = env.get(variableExpression.getVariable().getAddress());
        next = CONT;
    }

    public void processExpression(IfStatement ifStatement) {
        stmt = ifStatement.getCondition();
        Statement trueStmt = ifStatement.getTrueStatement();
        Statement falseStmt = ifStatement.hasFalseStatement() ? ifStatement.getFalseStatement() : null;
        cont[++pc] = new IfCont(trueStmt, falseStmt);
        next = EVAL;
    }

    public void processExpression(TryStatement tryStatement) {
        stmt = tryStatement.getBody();
        Env savedEnv = env;
        if (tryStatement.hasFinallyClause()) {
            cont[++pc] = new FinallyCont(tryStatement.getFinallyClause().getBody(), savedEnv);
        }
        if (tryStatement.hasCatchClause()) {
            cont[++pc] = new TryCont(tryStatement.getCatchClause(), savedEnv);
        }
        next = EVAL;
    }

    public void processExpression(ThrowStatement throwStatement) {
        stmt = throwStatement.getExpression();
        cont[++pc] = new ThrowCont();
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
        func.setEnv(env);
        next = CONT;
    }

    public void processExpression(BlockClosureExpression blockClosureExpression) {
        BlockClosure clos = blockClosureExpression.getBlockClosure();

        for (int i = pc; i >= 0; i--) {
            Continuation c = cont[i];
            if (c instanceof FunRetCont) {
                clos.setHomeOffset(i);
                clos.setHomeCont(c);
                break;
            }
        }

        val = new Clos(clos);
        clos.setEnv(env);

        next = CONT;
    }

    public void processExpression(FunctionCallExpression functionCallExpression) {
        stmt = functionCallExpression.getExpression();
        cont[++pc] = new CallCont(functionCallExpression.getArguments());
        next = EVAL;
    }

    public void processExpression(SlotCallExpression slotCallExpression) {
        SlotExpression slotExpression = slotCallExpression.getSlotExpression();
        stmt = slotExpression.getReceiver();
        cont[++pc] = new SlotCallReceiverCont(slotExpression.getSlot(), slotCallExpression.getArguments());
        next = EVAL;
    }

    public void processExpression(ReturnStatement returnStatement) {
        // tail-call optimization
        boolean pushCont = true;
        for (int i = pc; i >= 0; i--) {
            Continuation c = cont[i];
            if (c instanceof ClosRetCont) {
                break;
            }
            if (c instanceof FunRetCont) {
                pc = i + 1;
                pushCont = false;
                break;
            }
            if (c instanceof TryCont || c instanceof FinallyCont) {
                break;
            }
        }

        if (pushCont) {
            cont[++pc] = new ReturnCont();
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
        cont[++pc] = new NewCont(newExpression.getArguments());
        next = EVAL;
    }

    public void processExpression(ExitStatement exitStatement) {
        cont[++pc] = new ExitCont();
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
        cont[++pc] = new InitParamCont(initParameter.getParameter());
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
        cont[pc].accept(this);
    }

    public void processContinuation(EndCont endCont) {
        pc--;
        next = CONT;
    }

    public void processContinuation(BlockCont blockCont) {
        if (!blockCont.hasNextStatement()) {
            // aleady processed last statement of block, leaving
            Env savedEnv = blockCont.getEnv();
            if (savedEnv != null) {
                // not restoring environment is important for incremental running of script in interactive mode
                env = blockCont.getEnv();
            }
            pc--;
            next = CONT;
        }
        else {
            stmt = blockCont.nextStatement();
            // tail-call optimization
            if (!blockCont.hasNextStatement()) {
                if (cont[pc - 1] instanceof FunRetCont) {
                    pc--;
                }
            }
            next = EVAL;
        }
    }

    public void processContinuation(ObjLitCont objLitCont) {
        if (objLitCont.hasNextSlot()) {
            ObjectLiteral.SlotEntry slot = objLitCont.getNextSlot();
            stmt = slot.key;
            cont[++pc] = new ObjLitSlotCont(objLitCont.getObj(), slot.value);
            next = EVAL;
        }
        else {
            pc--;
            val = objLitCont.getObj();
            next = CONT;
        }
    }

    public void processContinuation(ObjLitSlotCont objLitSlotCont) {
        stmt = objLitSlotCont.getSlotValue();
        cont[pc] = new ObjLitSlotValueCont(objLitSlotCont.getObj(), val);
        next = EVAL;
    }

    public void processContinuation(ObjLitSlotValueCont objLitSlotValueCont) {
        pc--;
        objLitSlotValueCont.getObj().addSlot(objLitSlotValueCont.getSlot(), val);
        next = CONT;
    }

    public void processContinuation(LogicNotCont logicNotCont) {
        val = toBool(val).equals(Bool.TRUE) ? Bool.FALSE : Bool.TRUE;
        pc--;
        next = CONT;
    }

    public void processContinuation(LogicAndCont logicAndCont) {
        Bool curVal = toBool(val);
        if (curVal.equals(Bool.FALSE) || !logicAndCont.hasNext()) {
            val = curVal;
            pc--;
            next = CONT;
        }
        else {
            stmt = logicAndCont.next();
            next = EVAL;
        }
    }

    public void processContinuation(LogicOrCont logicOrCont) {
        Bool curVal = toBool(val);
        if (curVal.equals(Bool.TRUE) || !logicOrCont.hasNext()) {
            val = curVal;
            pc--;
            next = CONT;
        }
        else {
            stmt = logicOrCont.next();
            next = EVAL;
        }
    }

    public void processContinuation(CondEqCont condEqCont) {
        stmt = condEqCont.getExpression();
        cont[pc] = new CondEq2Cont(val);
        next = EVAL;
    }

    public void processContinuation(CondEq2Cont condEq2Cont) {
        Obj val1 = condEq2Cont.getValue();
        Obj val2 = val;

        val = (val1 != null && val1.equals(val2)) || val1 == val2 ? Bool.TRUE : Bool.FALSE;

        pc--;
        next = CONT;
    }

    public void processContinuation(TernCont ternCont) {
        if (toBool(val).equals(Bool.TRUE)) {
            stmt = ternCont.getTrueExpression();
        }
        else {
            stmt = ternCont.getFalseExpression();
        }
        pc--;
        next = EVAL;
    }

    public void processContinuation(AssignExprCont assignExprCont) {
        stmt = assignExprCont.getAssign();
        pc--;
        next = EVAL;
    }

    public void processContinuation(AssignCont assignCont) {
        env.set(assignCont.getVariable().getAddress(), val);
        pc--;
        next = CONT;
    }

    public void processContinuation(SlotSetReceiverCont slotSetReceiverCont) {
        stmt = slotSetReceiverCont.getSlotExpression();
        Obj receiver = val;
        cont[pc] = new SlotSetSlotCont(receiver, slotSetReceiverCont.getValueExpression());
        next = EVAL;
    }

    public void processContinuation(SlotSetSlotCont slotSetSlotCont) {
        Obj receiver = slotSetSlotCont.getReceiver();
        Obj slot = val;

        stmt = slotSetSlotCont.getValueExpression();
        cont[pc] = new SlotSetValueCont(receiver, slot);
        next = EVAL;
    }

    public void processContinuation(SlotSetValueCont slotSetValueCont) {
        pc--;

        Obj receiver = slotSetValueCont.getReceiver();
        Obj slot = slotSetValueCont.getSlot();
        Obj value = val;

        receiver.setSlot(slot, value);
        next = CONT;
    }

    public void processContinuation(SlotGetReceiverCont slotGetReceiverCont) {
        Obj receiver = val;
        stmt = slotGetReceiverCont.getSlotExpression();

        cont[pc] = new SlotGetSlotCont(receiver);
        next = EVAL;
    }

    public void processContinuation(SlotGetSlotCont slotGetSlotCont) {
        pc--;
        Obj receiver = slotGetSlotCont.getReceiver();
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

    public void processContinuation(IfCont ifCont) {
        pc--;
        if (toBool(val).equals(Bool.TRUE)) {
            stmt = ifCont.getTrueStatement();
            next = EVAL;
        }
        else if (ifCont.hasFalseStatement()) {
            stmt = ifCont.getFalseStatement();
            next = EVAL;
        }
        else {
            next = CONT;
        }
    }

    public void processContinuation(TryCont tryCont) {
        pc--;
        next = CONT;
    }

    public void processContinuation(ThrowCont throwCont) {
        pc--;
        TryCont tryCont = null;
        for (int i = pc; i >= 0; i--) {
            Continuation c = cont[i];
            if (c instanceof TryCont) {
                tryCont = (TryCont) c;
                pc = i;
            }
            else if (c instanceof FinallyCont) {
                FinallyCont finallyCont = (FinallyCont) c;
                throwCont.setSavedValue(val);
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
        CatchStatement catchStmt = tryCont.getCatchClause();
        Env savedEnv = tryCont.getEnv();
        env = new Env(savedEnv);
        env.extend();
        env.set(catchStmt.getVariable().getAddress(), throwCont.hasSavedValue() ? throwCont.getSavedValue() : val);
        stmt = catchStmt.getBody();
        cont[++pc] = new CatchCont(savedEnv);
        next = EVAL;
    }

    public void processContinuation(CatchCont catchCont) {
        pc--;
        env = catchCont.getEnv();
        next = CONT;
    }

    public void processContinuation(FinallyCont finallyCont) {
        pc--;
        env = finallyCont.getEnv();
        stmt = finallyCont.getBody();
        next = EVAL;
    }

    public void processContinuation(SlotCallReceiverCont slotCallReceiverCont) {
        Obj receiver = val;
        stmt = slotCallReceiverCont.getSlotExpression();
        cont[pc] = new SlotCallSlotCont(receiver, slotCallReceiverCont.getArguments());

        next = EVAL;
    }

    public void processContinuation(SlotCallSlotCont slotCallSlotCont) {
        Obj receiver = slotCallSlotCont.getReceiver();
        Obj slot = val;

        Obj obj = receiver;
        while (true) {
            PrimitiveExpression prim = obj.getPrimitiveForSlot(slot);
            if (prim != null) {
                cont[pc] = new PrimitiveCont(prim, receiver, slotCallSlotCont.getArguments());
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

        cont[pc] = new CallCont(receiver, slotCallSlotCont.getArguments());
        next = CONT;
    }

    public void processContinuation(CallCont callCont) {
        // TODO: merge if-branches as far as possible
        if (val instanceof Func) {
            Function func = ((Func) val).getFunction();
            List<Expression> args = callCont.getArguments();
            checkFunArgs(func, args);
            Env savedEnv = env;
            Env funcEnv = new Env(func.getEnv());
            funcEnv.setThis(callCont.getContext());
            cont[pc] = new CallArgCont(func, args, funcEnv, savedEnv);
            next = CONT;
        }
        else if (val instanceof Clos) {
            Clos closObj = (Clos) val;
            BlockClosure clos = closObj.getClosure();
            List<Expression> args = callCont.getArguments();
            checkFunArgs(clos, args);
            Env savedEnv = env;
            Env closEnv = new Env(clos.getEnv());
            closEnv.setThis(callCont.getContext());
            cont[pc] = new CallArgCont(clos, args, closEnv, savedEnv);
            next = CONT;
        }
        else if (val instanceof Native) {
            Native nat = (Native) val;
            cont[pc] = new NativeArgCont(nat, callCont.getContext(), callCont.getArguments());
            next = CONT;
        }
        else {
            throw new SQLScriptRuntimeException("Invalid call: Neither block nor function");
        }
    }

    public void processContinuation(CallArgCont callArgCont) {
        if (callArgCont.hasNext()) {
            stmt = callArgCont.next();
            cont[++pc] = new CallArgAssignCont(callArgCont.getCallEnv());
            next = EVAL;
            return;
        }

        Callable callable = callArgCont.getCallable();
        if (callable instanceof Function) {
            pc--;
            // tail-call optimization
            if (!(cont[pc - 1] instanceof FunRetCont)) {
                cont[++pc] = new FunRetCont(callArgCont.getSavedEnv());
            }
            env = callArgCont.getCallEnv();
            stmt = callArgCont.getBody();
            next = EVAL;
        }
        else if (callable instanceof BlockClosure) {
            BlockClosure clos = (BlockClosure) callable;
            cont[pc] = new ClosRetCont(clos, callArgCont.getSavedEnv());
            env = callArgCont.getCallEnv();
            stmt = callArgCont.getBody();
            next = EVAL;
        }
        else {
            throw new SQLScriptRuntimeException("Internal error: Unhandled callable");
        }
    }

    public void processContinuation(CallArgAssignCont callArgAssignCont) {
        Env callEnv = callArgAssignCont.getEnv();
        callEnv.extend();
        callEnv.set(0, val);
        pc--;
        next = CONT;
    }

    public void processContinuation(NativeArgCont nativeArgCont) {
        nativeArgCont.addArgsValue(val);
        if (nativeArgCont.hasNext()) {
            stmt = nativeArgCont.next();
            next = EVAL;
            return;
        }

        pc--;
        Obj context = nativeArgCont.getContext();
        List<Obj> args = nativeArgCont.getArgsValues();
        try {
            nativeArgCont.getNative().call(this, context, args.toArray(new Obj[args.size()]));
        } catch (ClosureTerminatedException ignored) {
        }

        next = CONT;
    }

    public void processContinuation(FunRetCont funRetCont) {
        env = funRetCont.getSavedEnv();
        pc--;
        next = CONT;
    }

    public void processContinuation(ClosRetCont closRetCont) {
        env = closRetCont.getSavedEnv();
        pc--;
        next = CONT;
    }

    public void processContinuation(ReturnCont returnCont) {
        pc--;
        for (int i = pc; i >= 0; i--) {
            Continuation c = cont[i];
            if (c instanceof ClosRetCont) {
                BlockClosure closure = ((ClosRetCont) c).getClosure();
                int homeOffset = closure.getHomeOffset();
                Continuation homeCont = closure.getHomeCont();
                if (homeOffset >= i || cont[homeOffset] != homeCont) {
                    throw new SQLScriptRuntimeException("Non-local return");
                }
                pc = homeOffset;
                if (returnCont.hasSavedValue()) {
                    val = returnCont.getSavedValue();
                }
                next = CONT;
                return;
            }
            else if (c instanceof FunRetCont) {
                pc = i + 1;
                if (returnCont.hasSavedValue()) {
                    val = returnCont.getSavedValue();
                }
                next = CONT;
                return;
            }
            else if (c instanceof FinallyCont) {
                FinallyCont finallyCont = (FinallyCont) c;
                if (!returnCont.hasSavedValue()) {
                    returnCont.setSavedValue(val);
                }
                pc = i;
                cont[++pc] = returnCont;
                cont[++pc] = finallyCont;
                next = CONT;
                return;
            }
        }
        throw new SQLScriptRuntimeException("Found return statement outside of function block");
    }

    public void processContinuation(PrimitiveCont primitiveCont) {
        primitiveCont.setArgumentValue(val);
        if (primitiveCont.hasNextArgument()) {
            stmt = primitiveCont.getNextArgument();
        }
        else {
            pc--;
            PrimitiveExpression p = primitiveCont.getPrimitiveExpression();
            p.setArguments(primitiveCont.getEvaluatedArguments());
            stmt = p;
            val = primitiveCont.getArgument1();
        }
        next = EVAL;
    }

    public void processContinuation(NewCont newCont) {
        Obj newObj = new Obj();
        newObj.setSlot(STR_SLOT_PARENT, val);
        val = STR_SLOT_INIT;
        cont[pc]   = new NewResultCont(newObj);
        cont[++pc] = new CallCont(newObj, newCont.getArguments()); // make NewCont support args
        cont[++pc] = new SlotGetSlotCont(newObj);
        next = CONT;
    }

    public void processContinuation(NewResultCont newResultCont) {
        pc--;
        val = newResultCont.getNewObject();
        next = CONT;
    }

    public void processContinuation(ExitCont exitCont) {
        System.out.println("Computation finished. Exit continuation reached.");
        pc = 0;
        finished = true;
        next = CONT;
    }

    public void processContinuation(InitParamCont initParamCont) {
        Parameter param = initParamCont.getParameter();
        param.setValue(val);
        pc--;
        next = CONT;
    }

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

    protected void checkFunArgs(Callable callable, List args) {
//        if (!matchesFunArgs(function, args)) {
        if (callable.getArgCount() != args.size()) {
            throw new SQLScriptRuntimeException("Arguments do not match function");
        }
    }

    /*
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
    */

    public Bool toBool(Obj value) {
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

    // native interface

    public Obj invoke(Clos clos, Obj context, Obj... args) throws ClosureTerminatedException {
        BlockClosure closure = clos.getClosure();
        List<Obj> argsList = Arrays.asList(args);
        checkFunArgs(closure, argsList);
        Env savedEnv = env;
        env = new Env(closure.getEnv());
        env.setThis(context);
        stmt = closure.getBody();
        int callFrame = pc;
        cont[++pc] = new ClosRetCont(closure, savedEnv);
        next = EVAL;
        while (step() && pc > callFrame) {
        }
        if (pc < callFrame) {
            throw new ClosureTerminatedException();
        }
        return val;
    }
}
