package com.velocity.insurance.service;

import java.util.List;

import com.velocity.insurance.entity.Transaction;

public interface TransactionService {

	 Transaction createTransaction(Transaction transaction);
	    Transaction getTransactionById(Long id);
	    List<Transaction> getAllTransactions();
	    Transaction updateTransaction(Long id, Transaction transaction);
	    void deleteTransaction(Long id);
}
