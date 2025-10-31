package cz.example.service;

import cz.example.mapper.TransactionMapper;
import cz.example.model.Transaction;
import cz.example.repository.TransactionRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import lombok.AllArgsConstructor;

import java.util.List;

@ApplicationScoped
@AllArgsConstructor(onConstructor_ = @Inject)
public class TransactionService {

    private final TransactionRepository transactionRepository;

    public List<Transaction> getTransactionsByOwnAccountNumber(String ownAccountNumber) {
        return transactionRepository.findByOwnAccountNumber(ownAccountNumber);
    }
}
