package org.minecraftoss.catacomb.transaction.result;

public enum BuiltinTransactionResultState implements TransactionResultState<BuiltinTransactionResultState> {
    ACCEPTED,
    DECLINED,
    FAILED;

    @Override
    public BuiltinTransactionResultState getParent() {
        return this;
    }
}
