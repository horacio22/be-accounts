-- Vložení účtu
INSERT INTO account (name, number, code) VALUES
('Jan Novák', '123456789', '0800'),
('Petr Svoboda', '987654321', '0300');

-- Vložení výpisu
INSERT INTO statement (number, period, description) VALUES
('STMT001', '2024-06', 'Výpis za červen 2024'),
('STMT002', '2024-07', 'Výpis za červenec 2024');

-- Vložení typu transakce
INSERT INTO transactionType (type, code) VALUES
('Příchozí platba', 101),
('Odchozí platba', 102);

-- Vložení transakce
-- Předpokládá se, že cizí klíče (counterPartyAccount, transactionType, statement) odpovídají existujícím ID v tabulkách
INSERT INTO [transaction] (
    amount, currency, id, bankref, transactionId, bookingDate, postingDate,
    creditDebitIndicator, ownAccountNumber, counterPartyAccount, detail1, detail2, detail3, detail4,
    productBankRef, transactionType, statement, constantSymbol, specificSymbol, variableSymbol
) VALUES
(1500.00, 'CZK', 'TRX001', 'BR001', 'TID001', '2024-06-10', '2024-06-11', 'CRDT', '123456789', 2, 'Detail A', 'Detail B', NULL, NULL, 'PB001', 1, 1, '0558', '123', '456'),
(2000.50, 'CZK', 'TRX002', 'BR002', 'TID002', '2024-07-05', '2024-07-06', 'DBIT', '987654321', 1, NULL, NULL, NULL, NULL, NULL, 2, 2, NULL, NULL, NULL);


