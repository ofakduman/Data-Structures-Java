package com.company;

import org.jetbrains.annotations.NotNull;

public class Bank {
    Account [] accounts = new Account[100];
    private static int accountCount = 0;
    private static int size = 100;

    public int getAccountCount() {return accountCount;}
    public void addAccount(Account account)
    {
        if (accounts.length == accountCount) {
            // Creating a new array double the size
            // of array declared above
            Account newAccounts[] = new Account[2 * accountCount];
            // Iterating over new array using for loop
            for (int i = 0; i < accountCount; i++) {
                newAccounts[i] = accounts[i];
            }
            // Assigning new array to original array
            // created above
            accounts = newAccounts;
        }
        accounts[accountCount++] = account;
    }

    public void printAccounts(){
        for (int i= 0; i<accountCount; i++){
            System.out.println(accounts[i].toString());
        }
    }

    public Account getAccount(int accountNumber){
        for (int i =0; i<accountCount; i++){
            if(accounts[i].getAccountNumber() == accountNumber)
                return accounts[i];
        }
        return null;
    }

    public boolean makeDeposit(Account account, double amount){
        if(account!=null) {
            System.out.println("girdi1");
            return account.deposit(account.getAccountNumber(), amount);
        }
        return false;
    }

    public boolean makeWithdrawal(Account account, double amount){
        if(account!=null)
            return account.withdraw(amount,0.5, "withdraw");
        return false;
    }

}

