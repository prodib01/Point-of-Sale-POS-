package org.example.pos_system.service;

import org.example.pos_system.model.Transaction;
import org.example.pos_system.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction saveTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll(); // Corrected from TransactionRepository to transactionRepository
    }

    public Optional<Transaction> getTransactionById(Long id) {
        return transactionRepository.findById(id); // Corrected from TransactionRepository to transactionRepository
    }

    public Transaction updateTransaction(long id, Transaction transactionDetails) {
        Transaction transaction = transactionRepository.findById(id) // Corrected from TransactionRepository to transactionRepository
                .orElseThrow(() -> new RuntimeException("Transaction not found"));

        transaction.setTotalAmount(transactionDetails.getTotalAmount());
        transaction.setPaymentMethod(transactionDetails.getPaymentMethod());

        return transactionRepository.save(transaction);
    }

    public void deleteTransaction(Long id) {
        transactionRepository.deleteById(id);
    }
}
