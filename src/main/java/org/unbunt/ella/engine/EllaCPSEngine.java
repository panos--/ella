/* EllaCPSEngine.java
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

package org.unbunt.ella.engine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.unbunt.ella.compiler.statement.*;
import org.unbunt.ella.compiler.stmtbase.Expression;
import org.unbunt.ella.compiler.stmtbase.Statement;
import org.unbunt.ella.compiler.support.*;
import org.unbunt.ella.engine.context.Context;
import org.unbunt.ella.engine.context.SQLResultListener;
import org.unbunt.ella.engine.continuations.*;
import org.unbunt.ella.engine.corelang.*;
import org.unbunt.ella.engine.environment.Env;
import org.unbunt.ella.engine.environment.StaticEnv;
import org.unbunt.ella.engine.environment.EnvVariableInterpolator;
import org.unbunt.ella.engine.environment.EscapingVariableInterpolator;
import org.unbunt.ella.exception.*;
import org.unbunt.ella.lang.*;
import org.unbunt.ella.utils.StringUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * Represents an interpreter for EllaScript programs modeled after the continuation-passing-style.
 */
public class EllaCPSEngine implements EllaEngine, ExpressionVisitor, ContinuationVisitor, Engine {
    protected final static Log logger = LogFactory.getLog(EllaCPSEngine.class);
    protected final boolean trace = logger.isTraceEnabled();

    protected Context context;
    protected volatile boolean stop = false;
    protected boolean exited = false;

    protected static final Obj SLOT_PARENT = Consts.SLOT_PARENT;
    protected static final Obj SLOT_INIT = Consts.SLOT_INIT;

    protected static final int PRIM_ID            = Primitive.CODE_ID;
    protected static final int PRIM_NI            = Primitive.CODE_NI;
    protected static final int PRIM_LOOP          = Primitive.CODE_LOOP;
    protected static final int PRIM_LOOP_BREAK    = Primitive.CODE_LOOP_BREAK;
    protected static final int PRIM_LOOP_CONTINUE = Primitive.CODE_LOOP_CONTINUE;
    protected static final int PRIM_EXIT          = Primitive.CODE_EXIT;

    protected EllaCPSEngine(Context context) {
        this.context = context;
        this.env = context.getEnv();
        this.envVariableInterpolator = new EnvVariableInterpolator(env);
        this.escapingVariableInterpolator = new EscapingVariableInterpolator(envVariableInterpolator);
    }

    /**
     * Creates a new engine with the given execution context.
     *
     * @param context the execution context to use.
     * @return the newly created engine.
     */
    public static EllaEngine create(Context context) {
        return new EllaCPSEngine(context);
    }

    protected Statement stmt;
    protected Obj val;
    protected Env env;

    protected final EnvVariableInterpolator envVariableInterpolator;
    protected final EscapingVariableInterpolator escapingVariableInterpolator;

    protected final static boolean CONT = true;
    protected final static boolean EVAL = false;

    protected boolean next;

    // TODO: dynamically increase cont stack size to allow non-tail-recursion to occur up until the heap runs out
    protected int MAX_CONT_STACK = 4096;
    protected Continuation[] cont = new Continuation[MAX_CONT_STACK];
    protected int pc;

    public Object eval(Block block) throws EllaException, EllaStoppedException {
        stop = false;
        exited = false;

        next = EVAL;
        stmt = block;
        val = null;
        pc = 0;
        cont[pc] = new EndCont();

        try {
            process();
        } catch (ArrayIndexOutOfBoundsException e) {
            if (pc >= MAX_CONT_STACK) {
                // TODO: throw an exception explicitly indicating this engine being in an unusable state
                throw new EllaRuntimeException("Continuation stack overflow", e);
            }
            else {
                throw e;
            }
        } catch (EllaInterruptedException e) {
            throw new EllaStoppedException(e);
        } catch (EllaRuntimeException e) {
            throw new EllaException(e);
        } finally {
            if (pc > 0) {
                // Environment may not have been reset correctly if there are still continuations lying on the stack,
                // so do this now or else a later reinvocation of this engine instance may fail with absurd errors.
                cleanup();
            }
        }

        return val == null ? null : val.toJavaObject();
    }

    public void stop() {
        stop = true;
    }

    protected void cleanup() {
        for (int i = 1; i <= pc; i++) {
            Continuation c = cont[i];
            if (c instanceof BlockCont) {
                BlockCont bc = (BlockCont) c;
                if (bc.getSavedEnv() != null) {
                    env = bc.getSavedEnv();
                    break;
                }
            }
            else if (c instanceof ClosRetCont) {
                ClosRetCont crc = (ClosRetCont) c;
                env = crc.getSavedEnv();
                break;
            }
            else if (c instanceof FunRetCont) {
                FunRetCont frc = (FunRetCont) c;
                env = frc.getSavedEnv();
                break;
            }
        }
    }

    @SuppressWarnings({"PointlessBooleanExpression"})
    protected void process() throws EllaRuntimeException {
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
    protected boolean step() throws EllaRuntimeException {
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
        if (stop) {
            throw new EllaInterruptedException();
        }
        stmt.accept(this);
    }

    public void processExpression(Block blockExpression) {
        if (blockExpression.isScoped()) {
            Env savedEnv = env;
            env = new StaticEnv(env);
            cont[++pc] = new BlockCont(blockExpression, savedEnv);
        }
        else {
            cont[++pc] = new BlockCont(blockExpression);
        }
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

    public void processExpression(FloatingPointLiteralExpression floatingPointLiteralExpression) {
        val = floatingPointLiteralExpression.getValue();
        next = CONT;
    }

    public void processExpression(BooleanLiteralExpression booleanLiteralExpression) {
        val = booleanLiteralExpression.getValue() ? getObjTrue() : getObjFalse();
        next = CONT;
    }

    public void processExpression(StringLiteralExpression stringLiteralExpression) {
        StringLiteral stringLiteral = stringLiteralExpression.getStringLiteral();

        StringBuilder buf = new StringBuilder();
        String delim = stringLiteral.getDelim();
        for (Object part : stringLiteral.getParts()) {
            String str = part instanceof Variable
                         ? env.get((Variable) part).toString()
                         : StringUtils.unescapeSQLString(part.toString(), delim);
            buf.append(str);
        }

        envVariableInterpolator.setEnv(env);
        val = new Str(stringLiteral.toString(envVariableInterpolator));
        next = CONT;
    }

    public void processExpression(SQLLiteralExpression sqlLiteralExpression) {
        if (trace) {
            logger.trace("Got SQL-Literal: " + sqlLiteralExpression);
        }

        SQLParseMode parseMode = sqlLiteralExpression.getParseMode();
        SQLStringType stringType = parseMode.getStringType();
        envVariableInterpolator.setEnv(env);
        escapingVariableInterpolator.setStringType(stringType);

        StringBuilder buf = new StringBuilder();
        for (Object part : sqlLiteralExpression.getParts()) {
            if (part instanceof StringLiteral) {
                StringLiteral string = (StringLiteral) part;
                escapingVariableInterpolator.setDelim(string.getStartDelim());
                buf.append(string.toSource(escapingVariableInterpolator));
            }
            else if (part instanceof Variable) {
                // TODO: For non-string values (Str) we should possibly evaluate the object's toString() slot
                buf.append(env.get((Variable)part).toString());
            }
            else {
                buf.append(part.toString());
            }
        }

        val = new RawSQLObj(buf.toString(), parseMode);
        next = CONT;
    }

    public void processExpression(ObjectLiteralExpression objectLiteralExpression) {
        cont[++pc] = new ObjLitCont(objectLiteralExpression.getObjectLiteral());
        next = CONT;
    }

    public void processExpression(ArrayLiteralExpression arrayLiteralExpression) {
        cont[++pc] = new ArrLitCont(arrayLiteralExpression.getComponents());
        next = CONT;
    }

    public void processExpression(DeclareVariableExpression declareVariableExpression) {
        env.add(declareVariableExpression.getVariable(), getObjNull());
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
        val = env.get(variableExpression.getVariable());
        next = CONT;
    }

    public void processExpression(FunctionDefinitionExpression functionDefinitionExpression) {
        Function func = functionDefinitionExpression.getFunction();
        String funcName = func.getName();
        val = new FuncImpl(func);
        if (funcName != null) {
            if (functionDefinitionExpression.isDeclareVariable()) {
                env.add(functionDefinitionExpression.getVariable(), val);
            }
            else {
                env.set(functionDefinitionExpression.getVariable(), val);
            }
        }
        // FIXME: Should env be assiociated with newly created Func-Object instead? What if the definition is called
        // FIXME: multiple times while references to a previous definition are still floating around?
        func.setEnv(env);
        next = CONT;
    }

    public void processExpression(BlockClosureExpression blockClosureExpression) {
        BlockClosure clos = blockClosureExpression.getBlockClosure();

        // FIXME: is this nessassary? Env is already saved at last...
        clos.setHomeOffset(env.getClosureHomeOffset());
        clos.setHomeCont(env.getClosureHomeCont());

        val = new ClosImpl(clos);
        clos.setEnv(env);

        next = CONT;
    }

    public void processExpression(FunctionCallExpression functionCallExpression) {
        stmt = functionCallExpression.getExpression();
        cont[++pc] = new CallCont(functionCallExpression.getArguments(), functionCallExpression.getCallFlags());
        next = EVAL;
    }

    public void processExpression(SlotCallExpression slotCallExpression) {
        SlotExpression slotExpression = slotCallExpression.getSlotExpression();
        stmt = slotExpression.getReceiver();
        cont[++pc] = new SlotCallReceiverCont(slotCallExpression);
        next = EVAL;
    }

    public void processExpression(ReturnStatement returnStatement) {
        // tail-call optimization
        if (returnStatement.isOptimizeForTailCall()) {
            // XXX: use env.getClosureHomeOffset() ???
            for (int i = pc; i >= 0; i--) {
                Continuation c = cont[i];
                if (c instanceof FunRetCont) {
                    pc = i;
                }
            }

            // assumes optimziation is performed only on return statements having function calls as expression
            // which implies there must be an expression - therefore not calling hasExpression() in this case
            stmt = returnStatement.getExpression();
            next = EVAL;
        }
        else {
            cont[++pc] = new ReturnCont();

            if (returnStatement.hasExpression()) {
                stmt = returnStatement.getExpression();
                next = EVAL;
            }
            else {
                // NOTE: change in semantics
                // return statement without expression make the associated function return the value of the
                // last evaluated expression
                // TODO: is this feasible? what about functions containing only a return statement without an expression?
                // TODO: should possibly make function initialize current value with null...
                //val = Null.instance;
                next = CONT;
            }
        }
    }

    public void processExpression(ThisExpression thisExpression) {
        val = env.getContext();
        next = CONT;
    }

    public void processExpression(SuperExpression superExpression) {
        Obj ctx = env.getReceiver();
        if (ctx == null) {
            ctx = env.getContext();
        }

        if (ctx == null) {
            val = getObjNull();
        }
        else {
            Obj parentCtx = ObjUtils.getParent(context, ctx);
            if (parentCtx == null) {
                parentCtx = getObjNull();
            }
            val = parentCtx;
        }
        next = CONT;
    }

    public void processExpression(NewExpression newExpression) {
        stmt = newExpression.getExpression();
        cont[++pc] = new NewCont(newExpression.getArguments());
        next = EVAL;
    }

    protected void cont() {
        if (stop) {
            throw new EllaInterruptedException();
        }
        cont[pc].accept(this);
    }

    public void processContinuation(EndCont endCont) {
        pc--;
        next = CONT;
    }

    public void processContinuation(BlockCont blockCont) {
        if (!blockCont.hasNextStatement()) {
            // aleady processed last statement of block, leaving
            if (blockCont.isScoped()) {
                env = blockCont.getSavedEnv();
            }
            pc--;
            next = CONT;
        }
        else {
            stmt = blockCont.nextStatement();
            // tail-call optimization
            if (!blockCont.hasNextStatement() && blockCont.isOptimizeForTailCall()) {
                pc--;
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
        objLitSlotValueCont.getObj().setSlot(context, objLitSlotValueCont.getSlot(), val);
        next = CONT;
    }

    public void processContinuation(ArrLitCont arrLitCont) {
        // Unconditionally add current value to the array. The first value will be a the value of the last expression
        // previously evaluated and is therefore not the value of a component of the to be created array. ArrLitCont
        // knows about this and takes care of this.
        arrLitCont.addComponentValue(val);

        Expression componentExpr = arrLitCont.getNextComponent();
        if (componentExpr == null) {
            val = new Lst(arrLitCont.getComponentValues());
            pc--;
            next = CONT;
        }
        else {
            stmt = componentExpr;
            next = EVAL;
        }
    }

    public void processContinuation(AssignExprCont assignExprCont) {
        stmt = assignExprCont.getAssign();
        pc--;
        next = EVAL;
    }

    public void processContinuation(AssignCont assignCont) {
        env.set(assignCont.getVariable(), val);
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

        receiver.setSlot(context, slot, value);
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
            val = obj.getSlot(context, slot);
            if (val != null) {
                break;
            }
            Obj parent = ObjUtils.getParent(context, obj);
            if (parent == null) {
                break;
            }
            obj = parent;
        }
        if (val == null) {
            val = getObjNull();
        }
        next = CONT;
    }

    public void processContinuation(SlotCallReceiverCont slotCallReceiverCont) {
        Obj receiver = val;
        stmt = slotCallReceiverCont.getSlotExpression();
        cont[pc] = new SlotCallSlotCont(receiver, slotCallReceiverCont.getCallExpression());

        next = EVAL;
    }

    public void processContinuation(SlotCallSlotCont slotCallSlotCont) {
        Obj ctx = slotCallSlotCont.getReceiver();
        Obj slot = val;

        Obj receiver = ctx;
        while (true) {
            val = receiver.getSlot(context, slot);
            if (val != null) {
                break;
            }

            Obj parent = ObjUtils.getParent(context, receiver);
            if (parent == null) {
                break;
            }

            receiver = parent;
        }

        if (val == null) {
            val = getObjNull();
        }

        cont[pc] = new CallCont(ctx, receiver, slotCallSlotCont.getArguments(), slotCallSlotCont.getCallFlags());
        next = CONT;
    }

    public void processContinuation(CallCont callCont) {
        // TODO: merge if-branches as far as possible
        // TODO: replace if-else by switch by introducing class ids (if possible enum-based)
        if (val instanceof Primitive) {
            cont[pc] = new PrimitiveCont((Primitive) val, callCont.getContext());
        }
        else if (val instanceof Native) {
            cont[pc] = new NativeCont((Native) val, callCont.getContext());
        }
        else if (val instanceof Func) {
            Function func = ((Func) val).getFunction();
            List<Expression> args = callCont.getArguments();
            checkFunArgs(func, args);
            // FIXME: should environment be saved _after_ evaluating arguments???
            Env savedEnv = env;
            Env funcEnv = new StaticEnv(func.getEnv());
            funcEnv.setContext(callCont.isSuperCall() ? env.getContext() : callCont.getContext());
            funcEnv.setReceiver(callCont.getReceiver());
            cont[pc] = new CallArgCont(func, funcEnv, savedEnv, callCont.isTailCall());
        }
        else if (val instanceof Clos) {
            Clos closObj = (Clos) val;
            BlockClosure clos = closObj.getClosure();
            List<Expression> args = callCont.getArguments();
            checkFunArgs(clos, args);
            Env savedEnv = env;
            Env lexEnv = clos.getEnv();
            Env closEnv = new StaticEnv(lexEnv);
            closEnv.setContext(lexEnv.getContext());
            closEnv.setReceiver(lexEnv.getReceiver());
            cont[pc] = new CallArgCont(clos, closEnv, savedEnv);
        }
        else {
            throw new EllaRuntimeException("Invalid call: Neither block nor function");
        }

        next = evalArgs(callCont.getArguments());
    }

    protected boolean evalArgs(List<Expression> args) {
        if (args.isEmpty()) {
            val = Args.emptyArgs;
            return CONT;
        }

        stmt = args.get(0);
        cont[++pc] = new ArgsCont(args);
        return EVAL;
    }

    public void processContinuation(ArgsCont argsCont) {
        argsCont.addArgsValue(val);
        if (argsCont.hasNext()) {
            stmt = argsCont.next();
            next = EVAL;
        }
        else {
            pc--;
            val = argsCont.getArgsValues();
            next = CONT;
        }
    }

    public void processContinuation(CallArgCont callArgCont) {
        stmt = callArgCont.getBody();
        env = callArgCont.getCallEnv();

        Callable callable = callArgCont.getCallable();

        // NOTE: matching length of both containers is ensured by previous call to checkFunArgs()
        List<Variable> argVars = callable.getArguments();
        Obj[] args = ((Args) val).args;
        int nargs = args.length;
        for (int i = 0; i < nargs; i++) {
            Variable variable = argVars.get(i);
            env.add(variable, args[i]);
        }

        if (callable instanceof Function) {
            // tail-call optimization
            if (callArgCont.isTailCall()) {
                pc--;
            }
            else {
                cont[pc] = new FunRetCont(callArgCont.getSavedEnv());
            }
            env.setClosureHome(pc, cont[pc]);
        }
        else if (callable instanceof BlockClosure) {
            BlockClosure clos = (BlockClosure) callable;
            cont[pc] = new ClosRetCont(clos, callArgCont.getSavedEnv());
        }
        else {
            throw new EllaRuntimeException("Internal error: Unhandled callable");
        }

        next = EVAL;
    }

    public void processContinuation(NativeCont nativeCont) {
        // NOTE: The next flag has to be set _before_ invoking the call to allow the invoked method to modify it
        //       without getting overridden.
        next = CONT;
        pc--;

        Obj context = nativeCont.getContext();
        Obj[] args = ((Args) val).args;
        try {
            Obj result = nativeCont.getNative().call(this, context, args);
            // Native functions are allowed to return null to indicate preservation of the current value to be desired
            if (result != null) {
                val = result;
            }
        } catch (ClosureTerminatedException ignored) {
        } catch (ControlFlowException e) {
            throw e;
        } catch (EllaRuntimeException e) {
            throw e;
        } catch (RuntimeException e) {
            throw new EllaNativeRuntimeException(e);
        }
    }

    public void processContinuation(TriggeredNativeCont triggeredNativeCont) {
        pc--;
        Native nat = triggeredNativeCont.getNative();
        Obj context = triggeredNativeCont.getContext();
        Obj[] args = triggeredNativeCont.getArgs();
        // XXX: Should ClosureTerminatedException be handled here?
        try {
            Obj result = nat.call(this, context, args);
            if (result != null) {
                val = result;
            }
        } catch (ControlFlowException e) {
            throw e;
        } catch (EllaRuntimeException e) {
            throw e;
        } catch (RuntimeException e) {
            throw new EllaNativeRuntimeException(e);
        }
        next = CONT;
    }

    public void processContinuation(PrimitiveCont primitiveCont) {
        pc--;
        Obj[] args = ((Args) val).args;
        processPrimitive(primitiveCont.getPrimitive(), primitiveCont.getContext(), args);
        next = CONT;
    }

    public void processContinuation(TriggeredPrimitiveCont triggeredPrimitiveCont) {
        pc--;
        Primitive prim = triggeredPrimitiveCont.getPrimitive();
        Obj context = triggeredPrimitiveCont.getContext();
        Obj[] args = triggeredPrimitiveCont.getArgs();
        processPrimitive(prim, context, args);
        next = CONT;
    }

    protected void processPrimitive(Primitive primitive, Obj context, Obj... args) {
        switch (primitive.getCode()) {
            case PRIM_ID: {
                Obj o2 = args[0];
                val = context == o2 ? getObjTrue() : getObjFalse();
                break;
            }
            case PRIM_NI: {
                Obj o2 = args[0];
                val = context != o2 ? getObjTrue() : getObjFalse();
                break;
            }
            case PRIM_LOOP:
                cont[++pc] = new LoopCont();
                break;
            case PRIM_LOOP_BREAK:
                cont[++pc] = new LoopBreakCont();
                break;
            case PRIM_LOOP_CONTINUE:
                cont[++pc] = new LoopContinueCont();
                break;
            case PRIM_EXIT:
                if (args.length > 0) {
                    val = args[0];
                }
                pc = 0;
                exited = true;
                break;
            default:
                throw new EllaRuntimeException("Unhandled primitive: " + primitive);
        }
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
                if (homeOffset < 0 || homeOffset >= i || cont[homeOffset] != homeCont) {
                    // NOTE: This exact message is checked for in some unit tests (due to the lack of a proper
                    //       exception handling scheme)
                    throw new EllaNonLocalReturnException("Non-local return");
                }
                pc = homeOffset;
                if (returnCont.hasSavedValue()) {
                    val = returnCont.getSavedValue();
                }
                next = CONT;
                return;
            }
            else if (c instanceof FunRetCont) {
                pc = i;
                if (returnCont.hasSavedValue()) {
                    val = returnCont.getSavedValue();
                }
                next = CONT;
                return;
            }
        }
        throw new EllaRuntimeException("Found return statement outside of function block");
    }

    public void processContinuation(NewCont newCont) {
        if (val instanceof NativeObj) {
            NativeObj context = (NativeObj) val;
            Call nativeConstructor = context.getNativeConstructor();
            cont[pc] = new CallCont(context, context, newCont.getArguments());
            val = nativeConstructor;
        }
        else {
            Obj parent = val;
            Obj newObj = new PlainObj();
            newObj.setSlot(context, SLOT_PARENT, parent);

            Obj initSlot = parent.getSlot(context, SLOT_INIT);
            while (initSlot == null) {
                Obj nextParent = ObjUtils.getParent(context, parent);
                if (nextParent == null) {
                    break;
                }
                initSlot = nextParent.getSlot(context, SLOT_INIT);
                parent = nextParent;
            }

            if (initSlot == null) {
                pc--;
                val = newObj;
            }
            else {
                val = initSlot;
                cont[pc] = new NewResultCont(newObj);
                cont[++pc] = new CallCont(newObj, parent, newCont.getArguments());
            }
        }
        next = CONT;
    }

    public void processContinuation(NewResultCont newResultCont) {
        pc--;
        val = newResultCont.getNewObject();
        next = CONT;
    }

    public void processContinuation(LoopCont loopCont) {
        // LoopCont is used as marker only -> just remove it
        pc--;
    }

    public void processContinuation(LoopBreakCont loopBreakCont) {
        for (int i = pc - 1; i >= 0; i--) {
            Continuation c = cont[i];
            if (c instanceof ClosRetCont) {
                ClosRetCont closRetCont = (ClosRetCont) c;
                env = closRetCont.getSavedEnv();
            }
            else if (c instanceof LoopCont) {
                pc = i - 1;
                next = CONT;
                throw new LoopBreakException();
            }
        }
        throw new EllaRuntimeException("Found break statement outside of loop");
    }

    public void processContinuation(LoopContinueCont loopContinueCont) {
        for (int i = pc - 1; i >= 0; i--) {
            Continuation c = cont[i];
            if (c instanceof ClosRetCont) {
                ClosRetCont closRetCont = (ClosRetCont) c;
                env = closRetCont.getSavedEnv();
            }
            else if (c instanceof LoopCont) {
                pc = i;
                next = CONT;
                throw new LoopContinueException();
            }
        }
        throw new EllaRuntimeException("Found continue statement outside of loop");
    }

    protected void checkFunArgs(Callable callable, List args) {
        if (callable.getArgCount() != args.size()) {
            throw new EllaRuntimeException("Arguments do not match function");
        }
    }

    public boolean toBoolean(Obj value) {
        return value != null
               && context.getObjTrue().equals(value)
               || (!(value instanceof Bool) && !(value instanceof Null));
    }

    public void finish() {
        logger.debug("Finishing");

        Set<Connection> connections = getObjConnMgr().getConnections();
        for (Connection connection : connections) {
            try {
                if (connection.isClosed()) {
                    continue;
                }
                connection.close();
            } catch (SQLException e) {
                logger.warn("Closing connection failed:", e);
            }
        }
    }

    public boolean isExited() {
        return exited;
    }

    // native interface

    // TODO: adjust trigger-scheme to support trigger of multiple calls in turn
    public void trigger(Obj obj, Obj context, Obj... args) {
        Call call;
        try {
            call = (Call) obj;
        } catch (ClassCastException e) {
            throw new EllaRuntimeException(e);
        }

        call.trigger(this, context, args);
    }

    public void trigger(Primitive prim, Obj context, Obj... args) {
        cont[++pc] = new TriggeredPrimitiveCont(prim, context, args);
        next = CONT;
    }

    public void trigger(Native nat, Obj context, Obj... args) {
        cont[++pc] = new TriggeredNativeCont(nat, context, args);
        next = CONT;
    }

    public void trigger(Clos clos, Obj... args) {
        BlockClosure closure = clos.getClosure();
        List<Obj> argsList = Arrays.asList(args);
        checkFunArgs(closure, argsList);
        Env savedEnv = env;
        Env lexEnv = closure.getEnv();
        env = new StaticEnv(lexEnv);
        env.setContext(lexEnv.getContext());

        List<Variable> argVars = clos.getClosure().getArguments();
        int nargs = args.length;
        for (int i = 0; i < nargs; i++) {
            Variable variable =  argVars.get(i);
            env.add(variable, args[i]);
        }

        stmt = closure.getBody();
        cont[++pc] = new ClosRetCont(closure, savedEnv);
        next = EVAL;
    }

    public void trigger(Func func, Obj context, Obj receiver, Obj... args) {
        Function function = func.getFunction();
        List<Obj> argsList = Arrays.asList(args);
        checkFunArgs(function, argsList);
        Env savedEnv = env;
        env = new StaticEnv(function.getEnv());
        env.setContext(context);
        env.setReceiver(receiver);

        List<Variable> argVars = func.getFunction().getArguments();
        int nargs = args.length;
        for (int i = 0; i < nargs; i++) {
            Variable variable =  argVars.get(i);
            env.add(variable, args[i]);
        }

        stmt = function.getBody();
        cont[++pc] = new FunRetCont(savedEnv);
        next = EVAL;
    }

    public Obj invokeOnReceiver(Obj call, Obj context, Obj receiver, Obj... args) {
        Call c = ObjUtils.ensureType(Call.class, call);
        return c.call(this, context, receiver, args);
    }

    public Obj invoke(Obj call, Obj context, Obj... args) throws ClosureTerminatedException {
        Call c = ObjUtils.ensureType(Call.class, call);
        return c.call(this, context, args);
    }

    public Obj invoke(Primitive prim, Obj context, Obj... args) {
        processPrimitive(prim, context, args);
        return val;
    }

    public Obj invoke(Native nat, Obj context, Obj... args) {
        Obj result = nat.call(this, context, args);
        if (result == null) {
            return val; // XXX: better return getObjNull()?
        }
        return result;
    }

    public Obj invoke(Clos clos, Obj... args) throws ClosureTerminatedException {
        int callFrame = pc;

        trigger(clos, args);

        while (step() && pc > callFrame) {
        }

        if (pc < callFrame) {
            throw new ClosureTerminatedException();
        }

        return val;
    }

    public Obj invoke(Func func, Obj context, Obj receiver, Obj... args) throws ClosureTerminatedException {
        int callFrame = pc;

        trigger(func, context, receiver, args);

        while (step() && pc > callFrame) {
        }

        if (pc < callFrame) {
            throw new ClosureTerminatedException();
        }

        return val;
    }

    public Obj invokeSlot(Obj obj, Obj slot, Obj... args) throws ClosureTerminatedException {
        Obj receiver = obj;
        Obj slotValue;
        while ((slotValue = receiver.getSlot(context, slot)) == null) {
            receiver = ObjUtils.getParent(context, obj);
            if (receiver == null) {
                break;
            }
        }

        if (slotValue == null) {
            slotValue = getObjNull();
        }

        return invokeOnReceiver(slotValue, obj, receiver, args);
    }

    /**
     * Tries to invoke the value associated with the given slot on the given object.
     *
     * @param obj receiver if the slot invocation
     * @param slot slot whose value is to be invoked
     * @param args arguments passed to the invoked method
     * @return the result of the invocation or null if the given slot was not set
     */
    public Obj invokeSlotIfPresent(Obj obj, Obj slot, Obj... args) {
        Obj receiver = obj;
        Obj slotValue;
        while ((slotValue = receiver.getSlot(context, slot)) == null) {
            receiver = ObjUtils.getParent(context, receiver);
            if (receiver == null) {
                break;
            }
        }

        if (slotValue == null) {
            return null;
        }

        return invokeOnReceiver(slotValue, obj, receiver, args);
    }

    public Obj invokeBlock(Block block) throws ClosureTerminatedException {
        int callFrame = pc;

        stmt = block;
        next = EVAL;

        while (step() && pc > callFrame) {
        }

        if (pc < callFrame) {
            throw new ClosureTerminatedException();
        }

        return val;
    }

    protected static final Continuation LOOP_CONT = new LoopCont();

    public Obj invokeInLoop(Obj obj, Obj context, Obj... args)
            throws ClosureTerminatedException, LoopBreakException, LoopContinueException {
        cont[++pc] = LOOP_CONT;
        Obj result = invoke(obj, context, args);
        pc--;
        return result;
    }

    public Obj getVal() {
        return val;
    }

    public void setVal(Obj val) {
        this.val = val;
    }

    public EngineState getState() {
        return new EngineState(env, pc);
    }

    public void setState(EngineState state) {
        env = state.env;
        pc = state.pc;
    }

    public Env getEnv() {
        return env;
    }

    public void setEnv(Env env) {
        this.env = env;
    }

    public Context getContext() {
        return context;
    }

    public void notifyResultSet(ResultSet resultSet) {
        context.notifyResultSet(resultSet);
    }

    public void notifyUpdateCount(int updateCount) {
        context.notifyUpdateCount(updateCount);
    }

    public void addSQLResultListener(SQLResultListener listener) {
        context.addSQLResultListener(listener);
    }

    public void removeSQLResultListener(SQLResultListener listener) {
        context.removeSQLResultListener(listener);
    }

    public Sys getObjSys() {
        return context.getObjSys();
    }

    public ConnMgr getObjConnMgr() {
        return context.getObjConnMgr();
    }

    public Null getObjNull() {
        return context.getObjNull();
    }

    public Bool getObjTrue() {
        return context.getObjTrue();
    }

    public Bool getObjFalse() {
        return context.getObjFalse();
    }
}
