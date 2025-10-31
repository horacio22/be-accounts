package cz.example.mapper;

import cz.example.model.Transaction;
import io.apicurio.api.beans.TransactionResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "cdi")
public interface TransactionMapper {

    @Mapping(target = "amount.currency", source = "currency")
    @Mapping(target = "amount.value", source = "amount") //TODO discuss Long vs BigDecimal 19,2
    @Mapping(target = "counterPartyAccount.accountName", source = "counterPartyAccount.name")
    @Mapping(target = "counterPartyAccount.accountNumber", source = "counterPartyAccount.number")
    @Mapping(target = "counterPartyAccount.bankCode", source = "counterPartyAccount.code")
    @Mapping(target = "details.detail1", source = "detail1")
    @Mapping(target = "details.detail2", source = "detail2")
    @Mapping(target = "details.detail3", source = "detail3")
    @Mapping(target = "details.detail4", source = "detail4")
    @Mapping(target = "statementNumber", source = "statement.number")
    @Mapping(target = "statementPeriod", source = "statement.period")
    @Mapping(target = "transactionType", source = "transactionType.type")
    @Mapping(target = "transactionTypeCode", source = "transactionType.code")
    @Mapping(target = "bookingDate", expression = "java(transaction.getBookingDate() != null ? transaction.getBookingDate().toString() : null)")
    @Mapping(target = "postingDate", expression = "java(transaction.getPostingDate() != null ? transaction.getPostingDate().toString() : null)")
    TransactionResponse toResponse(Transaction transaction);

    List<TransactionResponse> toTransactionResponseList(List<Transaction> transactions);
}
