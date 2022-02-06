package com.company;

import java.util.Date;

public class SavingsAccount extends Account{

    public SavingsAccount(Customer customer, double balance) {
        super(customer, balance);
    }

    public boolean deposit(int accountNumber, double amount){
        Transaction transaction = new Transaction(accountNumber, (byte) 0, amount, 0, "deposit");
        setBalance(getBalance()+amount);
        this.insertTransaction(transaction);
        return true;
    }

    public boolean withdraw(double amount, double fees, String description){
        Customer ac = this.getCustomer();

        boolean overdraft =(ac instanceof Senior || ac instanceof Senior);

        if (this.getBalance() >=(amount + fees) ||(overdraft &&( getBalance()-(amount + fees))>-500)){
            this.setBalance(getBalance()-(amount+fees));
            Transaction transaction = new Transaction(this.getCustomer().getCustomerNumber(), (byte) 1, amount, fees, description);
            this.insertTransaction(transaction);
            return true;
        }
        else return false;
    }

    public double addInterest(){
        if (getBalance()>0){
            double interest = getCustomer().getSavingInterest()*getBalance();
            setBalance(getBalance()+interest);
            return interest;
        }
        return 0;
    }
}
