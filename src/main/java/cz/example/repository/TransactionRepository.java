package cz.example.repository;

import cz.example.model.Transaction;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class TransactionRepository implements PanacheRepository<Transaction> {

    public List<Transaction> findByOwnAccountNumber(String ownAccountNumber) {
        return list("ownAccountNumber", ownAccountNumber);
    }

}