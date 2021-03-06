package org.minecraftoss.catacomb.transaction;

import org.minecraftoss.catacomb.currency.Currency;
import org.minecraftoss.catacomb.account.Account;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public interface Transaction {

    static Transaction of(Account accountFrom, Account accountTo, Currency currency, BigDecimal amount, Set<TransactionContext> contexts) {
        return new TransactionImpl(accountFrom, accountTo, currency, amount, new HashSet<>(contexts));
    }

    Account getAccountFrom();

    Account getAccountTo();

    Currency getCurrency();

    BigDecimal getAmount();

    Set<TransactionContext> getContexts();
}
