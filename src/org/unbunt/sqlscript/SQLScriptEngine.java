package org.unbunt.sqlscript;

import org.unbunt.sqlscript.annotations.*;
import org.unbunt.sqlscript.commands.*;
import org.unbunt.sqlscript.continuations.*;
import org.unbunt.sqlscript.exception.*;
import org.unbunt.sqlscript.lang.Bool;
import org.unbunt.sqlscript.lang.Func;
import org.unbunt.sqlscript.lang.Obj;
import org.unbunt.sqlscript.lang.Str;
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

public class SQLScriptEngine extends VolatileObservable implements ScriptProcessor {
    protected Log logger = LogFactory.getLog(getClass());

    protected SQLScriptContext context;

    protected static Map<String, String> commands;

    protected static Map<String, String> annotations;

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
    protected Env env;
    protected Stack<Continuation> cont;

    public void process(Block block) throws SQLScriptRuntimeException {
        stmt = block;
        val = null;
        env = new Env();
        cont = new Stack<Continuation>();
        cont.push(new EndCont());

        process();
    }

    protected static boolean CONT = true;
    protected static boolean EVAL = false;

    protected void process() throws SQLScriptRuntimeException {
        boolean next = EVAL;

        while (true) {
            if (next == CONT && this.cont.isEmpty()) {
                System.out.println("Computation finished. Continuation stack empty.");
                return;
            }
            next = next == CONT ? cont() : eval();
        }
    }

    protected boolean eval() {
        if (stmt instanceof Block) {
            cont.push(new BlockCont((Block) stmt, env.clone()));
            return CONT;
        }
        else if (stmt instanceof IdentifierExpression) {
            val = new Str(((IdentifierExpression) stmt).getIdentifier());
            return CONT;
        }
        else if (stmt instanceof BooleanLiteralExpression) {
            val = ((BooleanLiteralExpression) stmt).getBool();
            return CONT;
        }
        else if (stmt instanceof StringLiteralExpression) {
            StringLiteralExpression stringExpr = (StringLiteralExpression) stmt;
            StringLiteral stringLiteral = stringExpr.getStringLiteral();

            StringBuilder buf = new StringBuilder();
            String delim = stringLiteral.getDelim();
            for (Object part : stringLiteral.getParts()) {
                String str = part instanceof Variable
                             ? env.getVar(((Variable) part).getName()).getValue().toString()
                             : StringUtils.unescapeSQLString(part.toString(), delim);
                buf.append(str);
            }

            val = new Str(buf.toString());
            return CONT;
        }
        else if (stmt instanceof ObjectLiteralExpression) {
            ObjectLiteralExpression objExpr = (ObjectLiteralExpression) stmt;
            cont.push(new ObjLitCont(objExpr.getObjectLiteral()));
            return CONT;
        }
        else if (stmt instanceof NotExpression) {
            NotExpression notExpr = (NotExpression) stmt;
            stmt = notExpr.getExpression();
            cont.push(new LogicNotCont());
            return EVAL;
        }
        else if (stmt instanceof ConditionAnd) {
            ConditionAnd condAnd = (ConditionAnd) stmt;
            assert condAnd.getExpressions().size() > 1;
            LogicAndCont logicAndCont = new LogicAndCont(condAnd.getExpressions());
            stmt = logicAndCont.next();
            cont.push(logicAndCont);
            return EVAL;
        }
        else if (stmt instanceof ConditionOr) {
            ConditionOr condOr = (ConditionOr) stmt;
            assert condOr.getExpressions().size() > 1;
            LogicOrCont logicOrCont = new LogicOrCont(condOr.getExpressions());
            stmt = logicOrCont.next();
            cont.push(logicOrCont);
            return EVAL;
        }
        else if (stmt instanceof ConditionEq) {
            ConditionEq condEq = (ConditionEq) stmt;
            stmt = condEq.getOp1();
            cont.push(new CondEqCont(condEq.getOp2()));
            return EVAL;
        }
        else if (stmt instanceof TernaryCondExpression) {
            TernaryCondExpression tern = (TernaryCondExpression) stmt;
            stmt = tern.getCondition();
            cont.push(new TernCont(tern.getTrueExpression(), tern.getFalseExpression()));
            return EVAL;
        }
        else if (stmt instanceof DeclareVariableExpression) {
            env.addVar(((DeclareVariableExpression) stmt).getName());
            return CONT;
        }
        else if (stmt instanceof AssignExpression) {
            AssignExpression assignExpr = (AssignExpression) stmt;
            cont.push(new AssignCont(assignExpr.getVariable()));
            stmt = assignExpr.getRvalue();
            return EVAL;
        }
        else if (stmt instanceof DeclareAndAssignExpression) {
            DeclareAndAssignExpression exp = (DeclareAndAssignExpression) stmt;
            stmt = exp.getDeclareExpr();
            cont.push(new AssignExprCont(exp.getAssignExpr()));
            return EVAL;
        }
        else if (stmt instanceof SlotSetExpression) {
            SlotSetExpression exp = (SlotSetExpression) stmt;
            stmt = exp.getSlotExpression().getReceiver();
            cont.push(new SlotSetReceiverCont(exp.getSlotExpression().getSlot(), exp.getValueExpression()));
            return EVAL;
        }
        else if (stmt instanceof SlotExpression) {
            SlotExpression exp = (SlotExpression) stmt;
            stmt = exp.getReceiver();
            cont.push(new SlotGetReceiverCont(exp.getSlot()));
            return EVAL;
        }
        else if (stmt instanceof VariableExpression) {
            val = env.getVar(((VariableExpression) stmt).getName()).getValue();
            return CONT;
        }
        else if (stmt instanceof IfStatement) {
            IfStatement ifStmt = (IfStatement) stmt;
            stmt = ifStmt.getCondition();
            Statement trueStmt = ifStmt.getTrueStatement();
            Statement falseStmt = ifStmt.hasFalseStatement() ? ifStmt.getFalseStatement() : null;
            cont.push(new IfCont(trueStmt, falseStmt));
            return EVAL;
        }
        else if (stmt instanceof TryStatement) {
            TryStatement tryStmt = (TryStatement) stmt;
            stmt = tryStmt.getBody();
            Env saveEnv = env.clone();
            if (tryStmt.hasFinallyClause()) {
                cont.push(new FinallyCont(tryStmt.getFinallyClause().getBody(), saveEnv));
            }
            if (tryStmt.hasCatchClause()) {
                cont.push(new TryCont(tryStmt.getCatchClause(), saveEnv));
            }
            return EVAL;
        }
        else if (stmt instanceof ThrowStatement) {
            ThrowStatement throwStmt = (ThrowStatement) stmt;
            stmt = throwStmt.getExpression();
            cont.push(new ThrowCont());
            return EVAL;
        }
        else if (stmt instanceof FunctionDefinitionExpression) {
            FunctionDefinitionExpression funDef = (FunctionDefinitionExpression) stmt;
            Function func = funDef.getFunction();
            String funcName = func.getName();
            if (funcName != null) {
                env.addFunc(func);
            }
            func.setEnv(env.clone());
            val = new Func(func);
            return CONT;
        }
        else if (stmt instanceof NamedFunctionCallExpression) {
            NamedFunctionCallExpression funCall = (NamedFunctionCallExpression) stmt;
            Function func = env.getFunc(funCall.getFunction());
            Map<String, Expression> args = funCall.getArguments();
            checkFunArgs(func, args);
            cont.push(new FunArgCont(func, args, env.clone()));
            return CONT;
        }
        else if (stmt instanceof FunctionCallExpression) {
            FunctionCallExpression funCall = (FunctionCallExpression) stmt;
            stmt = funCall.getExpression();
            cont.push(new FunCont(funCall.getArguments()));
            return EVAL;
        }
        else if (stmt instanceof SlotCallExpression) {
            SlotCallExpression exp = (SlotCallExpression) stmt;
            stmt = exp.getSlotExpression().getReceiver();
            cont.push(new SlotCallReceiverCont(exp.getSlotExpression().getSlot(), exp.getArguments()));
            return EVAL;
        }
        else if (stmt instanceof ReturnStatement) {
            ReturnStatement returnStmt = (ReturnStatement) stmt;
            // tail-call optimization
            boolean pushCont = true;
            for (int i = cont.size() - 1; i >= 0; i--) {
                Continuation c = cont.elementAt(i);
                if (c instanceof FunRetCont) {
                    cont.setSize(i + 1);
                    pushCont = false;
                    break;
                }
                if (c instanceof TryCont || c instanceof FinallyCont) {
                    break;
                }
            }

            if (pushCont) {
                cont.push(new ReturnCont());
            }

            if (returnStmt.hasExpression()) {
                stmt = returnStmt.getExpression();
                return EVAL;
            }
            else {
                val = null;
                return CONT;
            }
        }
        else if (stmt instanceof NewExpression) {
            NewExpression exp = (NewExpression) stmt;
            stmt = exp.getExpression();
            this.cont.push(new NewCont(exp.getArgs()));
            return EVAL;
        }
        else if (stmt instanceof ExitStatement) {
            ExitStatement exitStmt = (ExitStatement) stmt;
            cont.push(new ExitCont());
            if (exitStmt.hasExpression()) {
                stmt = exitStmt.getExpression();
                return EVAL;
            }
            else {
                val = null;
                return CONT;
            }
        }
        else if (stmt instanceof InitParameter) {
            InitParameter initParam = (InitParameter) stmt;
            stmt = initParam.getExpression();
            cont.push(new InitParamCont(initParam.getParameter()));
            return EVAL;
        }
        else if (stmt instanceof AnnotationCommand) {
            process((AnnotationCommand) stmt);
            return CONT;
        }
        else if (stmt instanceof EvalCommand) {
            process((EvalCommand) stmt);
            return CONT;
        }
        else if (stmt instanceof SQLStatement) {
            SQLStatement sqlStmt = (SQLStatement) stmt;
            StringBuilder buf = new StringBuilder();
            for (Object part : sqlStmt.getParts()) {
                if (part instanceof Variable) {
                    buf.append(env.getVar(((Variable) part).getName()).getValue().toString());
                }
                else if (part instanceof StringLiteral) {
                    StringBuilder strBuf = new StringBuilder();
                    StringLiteral str = (StringLiteral) part;
                    for (Object strPart : str.getParts()) {
                        if (strPart instanceof Variable) {
                            String s = env.getVar(((Variable) strPart).getName()).getValue().toString();
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
            statement.setAnnotations(sqlStmt.getAnnotations());
            statement.addPart(buf.toString());
            process(statement);
            return CONT;
        }
        else {
            throw new SQLScriptRuntimeException("Unhandled statement: " + stmt.getClass().getSimpleName());
        }
    }

    protected boolean cont() {
        Continuation cont = this.cont.peek();
        if (cont instanceof EndCont) {
            System.out.println("Computation finished. End continuation reached.");
            this.cont.pop();
            return CONT;
        }
        else if (cont instanceof BlockCont) {
            BlockCont blockCont = (BlockCont) cont;
            Block block = blockCont.getBlock();
            int curStmt = blockCont.getCurStmt();
            if (curStmt >= block.getStatements().size()) {
                // aleady processed last statement of block, leaving
                this.env = blockCont.getEnv();
                this.cont.pop();
                return CONT;
            }
            else {
                this.stmt = block.getStatements().get(curStmt);
                blockCont.setCurStmt(++curStmt);
                // tail-call optimization
                if (curStmt >= block.getStatements().size()) {
                    // a little awkward way to look at last but one element on the cont stack
                    Continuation curCont = this.cont.pop();
                    if (!(this.cont.peek() instanceof FunRetCont)) {
                        this.cont.push(curCont);
                    }
                }
                return EVAL;
            }
        }
        else if (cont instanceof ObjLitCont) {
            ObjLitCont objLitCont = (ObjLitCont) cont;
            if (objLitCont.hasNextSlot()) {
                ObjectLiteral.SlotEntry slot = objLitCont.getNextSlot();
                this.stmt = slot.key;
                this.cont.push(new ObjLitSlotCont(objLitCont.getObj(), slot.value));
                return EVAL;
            }
            else {
                this.cont.pop();
                val = objLitCont.getObj();
                return CONT;
            }
        }
        else if (cont instanceof ObjLitSlotCont) {
            this.cont.pop();
            ObjLitSlotCont objLitSlotCont = (ObjLitSlotCont) cont;
            this.stmt = objLitSlotCont.getSlotValue();
            this.cont.push(new ObjLitSlotValueCont(objLitSlotCont.getObj(), val));
            return EVAL;
        }
        else if (cont instanceof ObjLitSlotValueCont) {
            this.cont.pop();
            ObjLitSlotValueCont objLitSlotValueCont = (ObjLitSlotValueCont) cont;
            objLitSlotValueCont.getObj().addSlot(objLitSlotValueCont.getSlot(), val);
            return CONT;
        }
        else if (cont instanceof LogicNotCont) {
            val = toBool(val).equals(Bool.TRUE) ? Bool.FALSE : Bool.TRUE;
            this.cont.pop();
            return CONT;
        }
        else if (cont instanceof LogicAndCont) {
            LogicAndCont logicAndCont = (LogicAndCont) cont;
            Bool curVal = toBool(val);
            if (curVal.equals(Bool.FALSE) || !logicAndCont.hasNext()) {
                val = curVal;
                this.cont.pop();
                return CONT;
            }
            else {
                this.stmt = logicAndCont.next();
                return EVAL;
            }
        }
        else if (cont instanceof LogicOrCont) {
            LogicOrCont logicOrCont = (LogicOrCont) cont;
            Bool curVal = toBool(val);
            if (curVal.equals(Bool.TRUE) || !logicOrCont.hasNext()) {
                val = curVal;
                this.cont.pop();
                return CONT;
            }
            else {
                this.stmt = logicOrCont.next();
                return EVAL;
            }
        }
        else if (cont instanceof CondEqCont) {
            CondEqCont condEqCont = (CondEqCont) cont;
            this.stmt = condEqCont.getExpression();
            this.cont.pop();
            this.cont.push(new CondEq2Cont(val));
            return EVAL;
        }
        else if (cont instanceof CondEq2Cont) {
            Obj val1 = ((CondEq2Cont) cont).getValue();
            Obj val2 = val;

            val = (val1 != null && val1.equals(val2)) || val1 == val2 ? Bool.TRUE : Bool.FALSE;

            this.cont.pop();
            return CONT;
        }
        else if (cont instanceof TernCont) {
            TernCont ternCont = (TernCont) cont;
            if (toBool(val).equals(Bool.TRUE)) {
                stmt = ternCont.getTrueExpression();
            }
            else {
                stmt = ternCont.getFalseExpression();
            }
            this.cont.pop();
            return EVAL;
        }
        else if (cont instanceof AssignExprCont) {
            AssignExprCont assignExprCont = (AssignExprCont) cont;
            this.stmt = assignExprCont.getAssign();
            this.cont.pop();
            return EVAL;
        }
        else if (cont instanceof AssignCont) {
            env.getVar(((AssignCont) cont).getVariable()).setValue(val);
            this.cont.pop();
            return CONT;
        }
        else if (cont instanceof SlotSetReceiverCont) {
            SlotSetReceiverCont c = (SlotSetReceiverCont) cont;
            this.cont.pop();

            stmt = c.getSlotExpression();
            Obj receiver = val;
            this.cont.push(new SlotSetSlotCont(receiver, c.getValueExpression()));
            return EVAL;
        }
        else if (cont instanceof SlotSetSlotCont) {
            SlotSetSlotCont c = (SlotSetSlotCont) cont;
            this.cont.pop();

            Obj receiver = c.getReceiver();
            Obj slot = val;

            stmt = c.getValueExpression();
            this.cont.push(new SlotSetValueCont(receiver, slot));
            return EVAL;
        }
        else if (cont instanceof SlotSetValueCont) {
            SlotSetValueCont c = (SlotSetValueCont) cont;
            this.cont.pop();

            Obj receiver = c.getReceiver();
            Obj slot = c.getSlot();
            Obj value = val;

            receiver.setSlot(slot, value);
            return CONT;
        }
        else if (cont instanceof SlotGetReceiverCont) {
            SlotGetReceiverCont c = (SlotGetReceiverCont) cont;
            this.cont.pop();

            Obj receiver = val;
            stmt = c.getSlotExpression();

            this.cont.push(new SlotGetSlotCont(receiver));
            return EVAL;
        }
        else if (cont instanceof SlotGetSlotCont) {
            SlotGetSlotCont c = (SlotGetSlotCont) cont;
            this.cont.pop();
            Obj receiver = c.getReceiver();
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
            return CONT;
        }
        else if (cont instanceof IfCont) {
            IfCont ifCont = (IfCont) cont;
            this.cont.pop();
            if (toBool(val).equals(Bool.TRUE)) {
                stmt = ifCont.getTrueStatement();
                return EVAL;
            }
            else if (ifCont.hasFalseStatement()) {
                stmt = ifCont.getFalseStatement();
                return EVAL;
            }
            else {
                return CONT;
            }
        }
        else if (cont instanceof TryCont) {
            this.cont.pop();
            return CONT;
        }
        else if (cont instanceof ThrowCont) {
            this.cont.pop();
            ThrowCont throwCont = (ThrowCont) cont;
            TryCont tryCont = null;
            for (int i = this.cont.size() - 1; i >= 0; i--) {
                Continuation c = this.cont.get(i);
                if (c instanceof TryCont) {
                    tryCont = (TryCont) c;
                    this.cont.setSize(i);
                }
                else if (c instanceof FinallyCont) {
                    FinallyCont finallyCont = (FinallyCont) c;
                    throwCont.setSavedValue(val);
                    this.cont.setSize(i);
                    this.cont.push(throwCont);
                    this.cont.push(finallyCont);
                    return CONT;
                }
            }
            if (tryCont == null) {
                throw new SQLScriptRuntimeException("Unhandled execption: " +
                                                    (val == null ? "null" : val.toString()));
            }
            CatchStatement catchStmt = tryCont.getCatchClause();
            Env savedEnv = tryCont.getEnv();
            this.env = savedEnv;
            Variable variable = this.env.addVar(catchStmt.getVariable());
            variable.setValue(throwCont.hasSavedValue() ? throwCont.getSavedValue() : val);
            this.stmt = catchStmt.getBody();
            this.cont.push(new CatchCont(savedEnv));
            return EVAL;
        }
        else if (cont instanceof CatchCont) {
            this.cont.pop();
            this.env = ((CatchCont) cont).getEnv();
            return CONT;
        }
        else if (cont instanceof FinallyCont) {
            this.cont.pop();
            FinallyCont finallyCont = (FinallyCont) cont;
            this.env = finallyCont.getEnv();
            this.stmt = finallyCont.getBody();
            return EVAL;
        }
        else if (cont instanceof SlotCallReceiverCont) {
            SlotCallReceiverCont c = (SlotCallReceiverCont) cont;
            this.cont.pop();

            Obj receiver = val;
            stmt = c.getSlotExpression();
            this.cont.push(new SlotCallSlotCont(receiver, c.getArguments()));

            return EVAL;
        }
        else if (cont instanceof SlotCallSlotCont) {
            SlotCallSlotCont c = (SlotCallSlotCont) cont;
            this.cont.pop();

            Obj receiver = c.getReceiver();
            Obj slot = val;
            val = receiver.getSlot(slot);

            this.cont.push(new FunCont(receiver, c.getArguments()));
            return CONT;
        }
        else if (cont instanceof FunCont) {
            if (val == null || !(val instanceof Func)) {
                throw new SQLScriptRuntimeException("Not a function");
            }
            FunCont c = (FunCont) cont;
            Function func = ((Func) val).getFunction();
            Map<String, Expression> args = c.getArgs();
            checkFunArgs(func, args);
            this.cont.pop();
            Env funcEnv = func.getEnv().clone();
            Env savedEnv = env.clone();
            Obj context = c.getContext();
            if (context != null) {
                funcEnv.addVar("this").setValue(context);
            }
            this.cont.push(new FunArgCont(func, args, funcEnv, savedEnv));
            return CONT;
        }
        else if (cont instanceof FunArgCont) {
            FunArgCont funArgCont = (FunArgCont) cont;
            if (funArgCont.hasNext()) {
                Map.Entry<String, Expression> arg = funArgCont.next();
                this.stmt = arg.getValue();
                this.cont.push(new FunArgAssignCont(arg.getKey(), funArgCont.getFuncEnv()));
                return EVAL;
            }
            else {
                this.cont.pop();
//                System.err.println("Function call - cont stack size: " + this.cont.size());
//                for (Continuation c : this.cont) {
//                    System.err.println("\t" + c.getClass().getSimpleName());
//                }
                // tail-call optimization
                if (!(this.cont.peek() instanceof FunRetCont)) {
                    this.cont.push(new FunRetCont(funArgCont.getSavedEnv()));
                }
                this.env = funArgCont.getFuncEnv();
                this.stmt = funArgCont.getBody();
                return EVAL;
            }
        }
        else if (cont instanceof FunArgAssignCont) {
            FunArgAssignCont funArgAssignCont = (FunArgAssignCont) cont;
            Env funcEnv = funArgAssignCont.getEnv();
            funcEnv.addVar(funArgAssignCont.getName()).setValue(val);
            this.cont.pop();
            return CONT;
        }
        else if (cont instanceof FunRetCont) {
            FunRetCont funRetCont = (FunRetCont) cont;
            this.env = funRetCont.getSavedEnv();
            this.cont.pop();
            return CONT;
        }
        else if (cont instanceof ReturnCont) {
            this.cont.pop();
            ReturnCont returnCont = (ReturnCont) cont;
            for (int i = this.cont.size() - 1; i >= 0; i--) {
                Continuation c = this.cont.elementAt(i);
                if (c instanceof FunRetCont) {
                    this.cont.setSize(i + 1);
                    if (returnCont.hasSavedValue()) {
                        val = returnCont.getSavedValue();
                    }
                    return CONT;
                }
                else if (c instanceof FinallyCont) {
                    FinallyCont finallyCont = (FinallyCont) c;
                    if (!returnCont.hasSavedValue()) {
                        returnCont.setSavedValue(val);
                    }
                    this.cont.setSize(i);
                    this.cont.push(returnCont);
                    this.cont.push(finallyCont);
                    return CONT;
                }
            }
            throw new SQLScriptRuntimeException("Found return statement outside of function block");
        }
        else if (cont instanceof NewCont) {
            NewCont c = (NewCont) cont;
            this.cont.pop();
            Obj newObj = new Obj();
            newObj.setSlot(STR_SLOT_PARENT, val);
            val = STR_SLOT_INIT;
            this.cont.push(new NewResultCont(newObj));
            this.cont.push(new FunCont(newObj, c.getArgs())); // make NewCont support args
            this.cont.push(new SlotGetSlotCont(newObj));
            return CONT;
        }
        else if (cont instanceof NewResultCont) {
            this.cont.pop();
            NewResultCont c = (NewResultCont) cont;
            val = c.getNewObject();
            return CONT;
        }
        else if (cont instanceof ExitCont) {
            System.out.println("Computation finished. Exit continuation reached.");
            this.cont.setSize(0);
            return CONT;
        }
        else if (cont instanceof InitParamCont) {
            InitParamCont initParamCont = (InitParamCont) cont;
            Variable variable = new Variable();
            variable.setValue(val);
            Parameter param = initParamCont.getParameter();
            param.setValue(variable);
            this.cont.pop();
            return CONT;
        }
        else {
            throw new SQLScriptRuntimeException("Unhandled continuation: " + cont.getClass().getSimpleName());
        }
    }

    public void process(Env env, Block block) throws SQLScriptRuntimeException {
        int envsave = env.save();
        for (Statement statement : block.getStatements()) {
            statement.accept(this, env);
        }
        env.restore(envsave);
    }

    public void process(Env env, EvalCommand command) throws SQLScriptRuntimeException {
        process(command);
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

    public void process(Env env, SQLStatement sqlStmt) throws SQLScriptRuntimeException {
        process(sqlStmt);
    }

    protected void process(SQLStatement sqlStmt) throws SQLScriptRuntimeException {
        logger.debug("Executing SQL: " + sqlStmt);

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
                            currWidth = String.format("%d", rs.getObject(i)).length();
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

    public void process(Env env, AnnotationCommand annCmd) {
        process(annCmd);
    }

    protected void process(AnnotationCommand annCmd) {
        logger.debug("Executing annotation: " + annCmd);

        Annotation annotation = loadAnnotation(annCmd.getName(), annCmd.getParams());
        annCmd.getSubject().addAnnotation(annotation);
    }

    /*
    public void process(Env env, Assign assign) {
        assign.getVariable().setValue(assign.getValue());
    }

    public void process(Env env, AssignVariable assign) {
        assign.getVariable().setValue(assign.getValue().getValue());
    }
    */

    public void process(Env env, CreateString createString) {
        StringLiteral stringLiteral = createString.getStringLiteral();
        Variable dest = createString.getDestVariable();

        dest.setValue(new Str(stringLiteral.toLiteralStringUnescaped()));
    }

    public void process(Env env, DeclareVariableExpression dec) {
        env.addVar(dec.getName());
    }

    public void process(Env env, VariableExpression varExpr) {
        varExpr.setVariable(env.getVar(varExpr.getName()));
    }

    public void process(Env env, AssignExpression assignExpr) {
        Expression rvalExpr = assignExpr.getRvalue();
        rvalExpr.accept(this, env);
        String varName = assignExpr.getVariable();
        Variable var = env.getVar(varName);
        var.setValue(rvalExpr.getValue());
        assignExpr.setValue(var.getValue());
    }

    public void process(Env env, DeclareAndAssignExpression expr) {
        expr.getDeclareExpr().accept(this, env);
        AssignExpression assign = expr.getAssignExpr();
        assign.accept(this, env);
        expr.setValue(assign.getValue());
    }

    public void process(Env env, FunctionDefinitionExpression funDef) {
        Function func = funDef.getFunction();
        String funcName = func.getName();
        if (funcName != null) {
            env.addFunc(func);
        }
        func.setEnv(env.clone());
        funDef.setValue(new Func(func));
    }

    // TODO: merge with process(Env env, FunctionCallExpression funCall) as far as possible
    public void process(Env env, NamedFunctionCallExpression funCall) {
        Function func = env.getFunc(funCall.getFunction());
        checkFunArgs(func, funCall.getArguments());
        Statement body = func.getBody();
        // TODO: replace clone() with something more efficient
        Env funcEnv = func.getEnv().clone();
        pushFunArgs(funcEnv, func.getArguments(), funCall.getArguments());
        body.accept(this, funcEnv);
        funCall.setValue(Bool.TRUE); // TODO: implement return value for functions
    }

    public void process(Env env, FunctionCallExpression funCall) {
        Expression expr = funCall.getExpression();
        expr.accept(this, env);
        Func func;
        try {
            func = (Func) expr.getValue();
        } catch (ClassCastException e) {
            throw new SQLScriptRuntimeException("Not a function");
        }

        Function function = func.getFunction();
        checkFunArgs(function, funCall.getArguments());
        Statement body = function.getBody();
        // TODO: replace clone() with something more efficient
        Env funcEnv = function.getEnv().clone();
        pushFunArgs(funcEnv, function.getArguments(), funCall.getArguments());
        body.accept(this, funcEnv);
        funCall.setValue(Bool.TRUE); // TODO: implement return value for functions
    }

    protected void checkFunArgs(Function function, Map<String, Expression> args) {
        if (!matchesFunArgs(function, args)) {
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

    protected void pushFunArgs(Env env, List<String> decArgs, Map<String, Expression> args) {
        if (decArgs == null) {
            return;
        }
        for (String decArg : decArgs) {
            Expression expr = args.get(decArg);
            expr.accept(this, env);
            env.addVar(decArg).setValue(expr.getValue());
        }
    }

    public void process(Env env, BooleanLiteralExpression boolExpr) {
        // nothing to do here
    }

    public void process(Env env, StringLiteralExpression stringExpr) {
        StringLiteral stringLiteral = stringExpr.getStringLiteral();

        StringBuilder buf = new StringBuilder();
        String delim = stringLiteral.getDelim();
        for (Object part : stringLiteral.getParts()) {
            String str = part instanceof Variable
                         ? env.getVar(((Variable) part).getName()).getValue().toString()
                         : StringUtils.unescapeSQLString(part.toString(), delim);
            buf.append(str);
        }

        stringExpr.setValue(new Str(buf.toString()));
    }

    public void process(Env env, NotExpression notExpr) {
        Expression expr = notExpr.getExpression();
        expr.accept(this, env);
        Obj exprVal = expr.getValue();
        Bool result = toBool(exprVal).isTrue() ? Bool.FALSE : Bool.TRUE;
        notExpr.setValue(result);
    }

    public void process(Env env, ConditionEq cond) {
        Expression op1 = cond.getOp1();
        Expression op2 = cond.getOp2();

        op1.accept(this, env);
        op2.accept(this, env);

        Obj val1 = op1.getValue();
        Obj val2 = op2.getValue();

        Bool result = (val1 != null && val1.equals(val2)) || val1 == val2 ? Bool.TRUE : Bool.FALSE;

        cond.setValue(result);
    }

    public void process(Env env, ConditionAnd cond) {
        for (Expression expression : cond.getExpressions()) {
            expression.accept(this, env);
            Bool result = toBool(expression.getValue());
            if (result.isTrue()) {
                continue;
            }
            cond.setValue(Bool.FALSE);
            return;
        }
        cond.setValue(Bool.TRUE);
    }

    public void process(Env env, ConditionOr cond) {
        for (Expression expression : cond.getExpressions()) {
            expression.accept(this, env);
            Bool result = toBool(expression.getValue());
            if (result.isFalse()) {
                continue;
            }
            cond.setValue(Bool.TRUE);
            return;
        }
        cond.setValue(Bool.FALSE);
    }

    public void process(Env env, IfStatement ifStmt) {
        Expression condition = ifStmt.getCondition();
        condition.accept(this, env);
        if (Bool.TRUE.equals(condition.getValue())) {
            ifStmt.getTrueStatement().accept(this, env);
        }
        else if (ifStmt.hasFalseStatement()) {
            ifStmt.getFalseStatement().accept(this, env);
        }
    }

    public void process(Env env, TernaryCondExpression tern) {
        Expression condition = tern.getCondition();
        condition.accept(this, env);
        Expression resultExpr;
        if (Bool.TRUE.equals(condition.getValue())) {
            resultExpr = tern.getTrueExpression();
        }
        else {
            resultExpr = tern.getFalseExpression();
        }
        resultExpr.accept(this, env);
        tern.setValue(resultExpr.getValue());
    }

    public void process(Env env, InitParameter init) {
        Parameter param = init.getParameter();
        Expression expr = init.getExpression();
        expr.accept(this, env);
        // XXX: TODO: Remove temp variable
        Variable value = new Variable();
        value.setValue(expr.getValue());
        param.setValue(value);
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

    /*
    // TODO: Quick-and-dirty prototype, implement real solution
    protected Map<String, Variable> variables = new HashMap<String, Variable>();

    public Variable assignVar(String name, String value) {
        Variable var = variables.get(name);
        if (var == null) {
            var = new Variable(name);
            variables.put(name, var);
        }

        var.setValue(value);
        return var;
    }

    public Variable getVarRef(String name) {
        Variable var = variables.get(name);
        if (var == null) {
            throw new SQLScriptRuntimeException("Undefined variable: " + name);
        }
        return var;
    }
    */

    public SQLScriptContext getContext() {
        return context;
    }

    public void setContext(SQLScriptContext context) {
        this.context = context;
    }
}
