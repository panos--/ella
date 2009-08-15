package org.unbunt.ella.engine.continuations;

/**
 * Represents the visitor component of the visitor pattern realized for continuation objects.
 */
public interface ContinuationVisitor {
    void processContinuation(EndCont endCont);

    void processContinuation(BlockCont blockCont);

    void processContinuation(ObjLitCont objLitCont);

    void processContinuation(ObjLitSlotCont objLitSlotCont);

    void processContinuation(ObjLitSlotValueCont objLitSlotValueCont);

    void processContinuation(ArrLitCont arrLitCont);

    void processContinuation(AssignExprCont assignExprCont);

    void processContinuation(AssignCont assignCont);

    void processContinuation(SlotSetReceiverCont slotSetReceiverCont);

    void processContinuation(SlotSetSlotCont slotSetSlotCont);

    void processContinuation(SlotSetValueCont slotSetValueCont);

    void processContinuation(SlotGetReceiverCont slotGetReceiverCont);

    void processContinuation(SlotGetSlotCont slotGetSlotCont);

    void processContinuation(SlotCallReceiverCont slotCallReceiverCont);

    void processContinuation(SlotCallSlotCont slotCallSlotCont);

    void processContinuation(CallCont callCont);

    void processContinuation(CallArgCont callArgCont);

    void processContinuation(NativeCont nativeCont);

    void processContinuation(TriggeredNativeCont triggeredNativeCont);

    void processContinuation(PrimitiveCont primitiveCont);

    void processContinuation(TriggeredPrimitiveCont triggeredPrimitiveCont);

    void processContinuation(FunRetCont funRetCont);

    void processContinuation(ClosRetCont closRetCont);

    void processContinuation(ReturnCont returnCont);

//    void processContinuation(PrimitiveCont primitiveCont);

    void processContinuation(NewCont newCont);

    void processContinuation(NewResultCont newResultCont);

    void processContinuation(ArgsCont argsCont);

    void processContinuation(LoopCont loopCont);

    void processContinuation(LoopBreakCont loopBreakCont);

    void processContinuation(LoopContinueCont loopContinueCont);
}
