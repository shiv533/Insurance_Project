package com.velocity.insurance.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.entity.Transaction;
import com.velocity.insurance.repository.TransactionRepository;
import com.velocity.insurance.service.TransactionService;
@Service
public class TransactionServiceImpl implements TransactionService{

	 @Autowired
	    private TransactionRepository transactionRepository;

	    @Override
	    public Transaction createTransaction(Transaction transaction) {
	        return transactionRepository.save(transaction);
	    }

	    @Override
	    public Transaction getTransactionById(Long id) {
	        return transactionRepository.findById(id).orElseThrow(() -> new RuntimeException("Transaction not found"));
	    }

	    @Override
	    public List<Transaction> getAllTransactions() {
	        return transactionRepository.findAll();
	    }

	    @Override
	    public Transaction updateTransaction(Long id, Transaction transaction) {
	        Transaction existingTransaction = getTransactionById(id);
	        existingTransaction.setTransactionType(transaction.getTransactionType());
	        existingTransaction.setAmount(transaction.getAmount());
	        existingTransaction.setStatus(transaction.getStatus());
	        existingTransaction.setTransactionDate(transaction.getTransactionDate());
	        return transactionRepository.save(existingTransaction);
	    }

	    @Override
	    public void deleteTransaction(Long id) {
	        transactionRepository.deleteById(id);
	    }

}
