-- Accounts
INSERT INTO account (name, number, code) VALUES
('PPF BANKA A.S.', '0000009504010019', '6000'), -- id 1
('PPF BANKA A.S.', '0000009505020008', '6000'), -- id 2
('PPF BANKA A.S.', '0000009503010009', '6000'); -- id 3

-- Statements
INSERT INTO statement (number, period, description) VALUES
('195', '2022', 'Výpis za říjen 2022'), -- id 1
('196', '2022', 'Výpis za říjen 2022'); -- id 2

-- Transaction Types
INSERT INTO transactionType (type, code) VALUES
('DPO', 1012209), -- id 1
('DPO', 0);       -- id 2

-- Transactions
INSERT INTO [transaction] (
    amount, currency, id, bankref, transactionId, bookingDate, postingDate,
    creditDebitIndicator, ownAccountNumber, counterPartyAccount, detail1,
    productBankRef, specificSymbol, statement, transactionType, variableSymbol
) VALUES
(1500, 'CZK', '20221019:0000000219', 'PS221019SO314822', '4831716', '2022-10-19', '2022-10-19', 'CRDT', '2002222222', 1, 'Posílám peníze', 'PS221019SO314822', '12', 2, 1, '12'),
(1999, 'CZK', '20221019:0000000220', 'PS221019SO314822', '4831701', '2022-10-19', '2022-10-19', 'CRDT', '2002222222', 2, 'Trvalý příkaz 8', 'PS221019SO314822', '12', 2, 2, '12'),
(2000, 'CZK', '20221019:0000000221', 'PS221019SO314823', '4831700', '2022-10-19', '2022-10-19', 'CRDT', '2002222222', 3, 'Na dárky', 'PS221019SO314823', '61', 2, 1, '61'),
(100,  'CZK', '20221018:0000003607', 'PS221018SO314645', '4831425', '2022-10-18', '2022-10-18', 'CRDT', '2002222222', 1, 'Příspěvek', 'PS221018SO314645', '12', 1, 1, '12'),
(1594, 'CZK', '20221018:0000003608', 'PS221018SO314645', '4831381', '2022-10-18', '2022-10-18', 'DBIT', '2002222222', 2, 'Platba elektřiny', 'PS221018SO314645', '12', 1, 2, '12');