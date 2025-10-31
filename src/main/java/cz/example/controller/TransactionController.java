package cz.example.controller;

import cz.example.mapper.TransactionMapper;
import cz.example.model.Transaction;
import cz.example.service.TransactionService;
import io.apicurio.api.AccountsResource;
import io.apicurio.api.beans.TransactionResponse;
import jakarta.inject.Inject;
import jakarta.ws.rs.Path;
import lombok.AllArgsConstructor;

import java.util.List;

@Path("/accounts")
@AllArgsConstructor(onConstructor_ = @Inject)
public class TransactionController implements AccountsResource {

    private final TransactionService transactionService;
    private final TransactionMapper transactionMapper;

    @Override
    public List<TransactionResponse> getTransactionsForAccount(String ownAccountNumber) {
        List<Transaction> transactionList = transactionService.getTransactionsByOwnAccountNumber(ownAccountNumber);
        return transactionMapper.toTransactionResponseList(transactionList);
    }
}
