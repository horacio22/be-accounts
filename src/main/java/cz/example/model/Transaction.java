package cz.example.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "[transaction]")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long trxId;

    @Column(nullable = false, precision = 19, scale = 2)
    private BigDecimal amount;

    @Column(nullable = false, length = 3)
    private String currency;

    @Column(nullable = false, length = 20)
    private String id;

    @Column(nullable = false, length = 20)
    private String bankref;

    @Column(nullable = false, length = 20)
    private String transactionId;

    @Column
    private LocalDate bookingDate;

    @Column(nullable = false)
    private LocalDate postingDate;

    @Column(length = 4)
    private String creditDebitIndicator;

    @Column(length = 20)
    private String ownAccountNumber;

    @ManyToOne
    @JoinColumn(name = "counterPartyAccount", nullable = false)
    private Account counterPartyAccount;

    @Column(length = 50)
    private String detail1;

    @Column(length = 50)
    private String detail2;

    @Column(length = 50)
    private String detail3;

    @Column(length = 50)
    private String detail4;

    @Column(length = 50)
    private String productBankRef;

    @ManyToOne
    @JoinColumn(name = "transactionType", nullable = false)
    private TransactionType transactionType;

    @ManyToOne
    @JoinColumn(name = "statement", nullable = false)
    private Statement statement;

    @Column(length = 10)
    private String constantSymbol;

    @Column(length = 10)
    private String specificSymbol;

    @Column(length = 10)
    private String variableSymbol;
}