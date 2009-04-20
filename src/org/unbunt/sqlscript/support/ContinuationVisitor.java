package org.unbunt.sqlscript.support;

import org.unbunt.sqlscript.continuations.*;

public interface ContinuationVisitor {
    void processContinuation(EndCont endCont);

    void processContinuation(BlockCont blockCont);

    void processContinuation(ObjLitCont objLitCont);

    void processContinuation(ObjLitSlotCont objLitSlotCont);

    void processContinuation(ObjLitSlotValueCont objLitSlotValueCont);

    void processContinuation(LogicNotCont logicNotCont);

    void processContinuation(LogicAndCont logicAndCont);

    void processContinuation(LogicOrCont logicOrCont);

    void processContinuation(CondEqCont condEqCont);

    void processContinuation(CondEq2Cont condEq2Cont);

    void processContinuation(TernCont ternCont);

    void processContinuation(AssignExprCont assignExprCont);

    void processContinuation(AssignCont assignCont);

    void processContinuation(SlotSetReceiverCont slotSetReceiverCont);

    void processContinuation(SlotSetSlotCont slotSetSlotCont);

    void processContinuation(SlotSetValueCont slotSetValueCont);

    void processContinuation(SlotGetReceiverCont slotGetReceiverCont);

    void processContinuation(SlotGetSlotCont slotGetSlotCont);

    void processContinuation(IfCont ifCont);

    void processContinuation(TryCont tryCont);

    void processContinuation(ThrowCont throwCont);

    void processContinuation(CatchCont catchCont);

    void processContinuation(FinallyCont finallyCont);

    void processContinuation(SlotCallReceiverCont slotCallReceiverCont);

    void processContinuation(SlotCallSlotCont slotCallSlotCont);

    void processContinuation(CallCont callCont);

    void processContinuation(CallArgCont callArgCont);

    void processContinuation(CallArgAssignCont callArgAssignCont);

    void processContinuation(NativeArgCont nativeArgCont);

    void processContinuation(PrimitiveArgCont primitiveArgCont);

    void processContinuation(FunRetCont funRetCont);

    void processContinuation(ClosRetCont closRetCont);

    void processContinuation(ReturnCont returnCont);

//    void processContinuation(PrimitiveCont primitiveCont);

    void processContinuation(NewCont newCont);

    void processContinuation(NewResultCont newResultCont);

    void processContinuation(ExitCont exitCont);

    void processContinuation(InitParamCont initParamCont);

    void processContinuation(RestoreEnvCont restoreEnvCont);
}
