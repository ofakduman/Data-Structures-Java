4. Write a banking program that simulates the operation of your local bank. You should declare the 
following collection of classes.
Class Account
Data fields: customer (type Customer), balance, accountNumber, transactions array 
(type Transaction[]). Allocate an initial Transaction array of a reasonable size (e.g., 
20) and provide a reallocate method that doubles the size of the Transaction array 
when it becomes full.
Methods: getBalance, getCustomer, toString, setCustomer
Class SavingsAccount extends Account
Methods: deposit, withdraw, addInterest
Class CheckingAccount extends Account
Methods: deposit, withdraw, addInterest
Koffman-c01.indd 48 10/30/2015 7:39:55 PM
 Chapter 1 Review 49
Class Customer
Data fields: name, address, age, telephoneNumber, customerNumber
Methods: Accessors and modifiers for data fields plus the additional abstract methods getSavingsInterest, getCheckInterest, and getCheckCharge.
Classes Senior, Adult, Student, all these classes extend Customer
Each has constant data fields SAVINGS_INTEREST, CHECK_INTEREST, CHECK_CHARGE, 
good! and OVERDRAFT_PENALTY that define these values for customers of that type, and 
each class implements the corresponding accessors.
Class Bank
Data field: accounts array (type Account[]). Allocate an array of a reasonable size 
(e.g., 100) and provide a reallocate method.
Methods: addAccount, makeDeposit, makeWithdrawal, getAccount
Class Transaction
Data fields: customerNumber, transactionType, amount, date, and fees (a string 
describing unusual fees)
Methods: processTran
You need to write all these classes and an application class that interacts with the user. In the application, you should first open several accounts and then enter several transactions.