package com.company;

import java.util.Arrays;

public abstract class Account {
    private Customer customer;
    private double balance;
    private int accountNumber;
    private static int lastAccountNumber = 9999;
    private Transaction transactions[] = new Transaction[20];
    private int transActionCount = 0;

    public Customer getCustomer() {
        return customer;
    }

    public Account(Customer customer, double balance) {
        this.customer = customer;
        this.balance = balance;
        this.accountNumber = lastAccountNumber;
        lastAccountNumber++;
    }

    public void insertTransaction(Transaction transaction)
    {
        if (transactions.length == transActionCount) {
            // Creating a new array double the size
            // of array declared above
            Transaction newTrans[] = new Transaction[2 * transActionCount];
            // Iterating over new array using for loop
            for (int i = 0; i < transActionCount; i++) {
                newTrans[i] = transactions[i];
            }
            // Assigning new array to original array
            // created above
            transactions = newTrans;
        }
        transactions[transActionCount++] = transaction;
    }




    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public static int getLastAccountNumber() {
        return lastAccountNumber;
    }

    public static void setLastAccountNumber(int lastAccountNumber) {
        Account.lastAccountNumber = lastAccountNumber;
    }

    @Override
    public String toString() {
        return "Account{" +
                "customer=" + customer.toString() +
                ", balance=" + balance +
                ", accountNumber=" + accountNumber +
                '}';
    }

    public abstract boolean deposit(int accountNumber, double amount);

    public abstract boolean withdraw(double amount, double fees, String description);
}
