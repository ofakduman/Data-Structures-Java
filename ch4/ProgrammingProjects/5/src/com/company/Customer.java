package com.company;

import java.util.ArrayList;

public class Customer {
    private String name;
    private double currentBalance;
    ArrayList<Transaction> transactions = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public ArrayList<Transaction> getTransaction() {
        return transactions;
    }

    public void setTransaction(ArrayList<Transaction> transaction) {
        this.transactions = transaction;
    }

    public Customer(String name, double currentBalance) {
        this.name = name;
        this.currentBalance = currentBalance;
    }

    public Customer(String name) {
        this.name = name;
        this.currentBalance = 0;
    }

    public boolean processTransaction(Transaction transaction){
        addTransaction(transaction);
        if (transaction.getType() == 0)
            if (deposit(transaction.getAmount())){
                addTransaction(transaction);
                return true;
            }

        else {
            if (withdrawal(transaction.getAmount())) {
                addTransaction(transaction);
                return true;
            }
        }
        return false;
    }

    private void addTransaction(Transaction transaction){
        transactions.add(transaction);
    }

    private boolean deposit(double amount){
        this.currentBalance+=amount;
        return true;
    }

    private boolean withdrawal(double amount){
        if (amount>this.currentBalance)
            return false;
        else
            currentBalance-=amount;
        return true;
    }
}
