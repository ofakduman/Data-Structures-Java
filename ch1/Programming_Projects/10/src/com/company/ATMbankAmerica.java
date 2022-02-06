package com.company;

import java.util.Scanner;

public class ATMbankAmerica implements ATM{
    Account accounts[] = new Account[20];
    private int accountSize = 20;
    private static int accountCounter = 0;
    private static int current_account = -1;


    public void exit_account(){
        current_account = -1;
    }
    public void addAccount(Account account){
        if (accountSize == accountCounter)
            increaseAccountSize();

        accounts[accountCounter++] = account;
    }

    private void increaseAccountSize(){
        Account newAccounts[] = new Account[2*accountSize] ;
        for (int i = 0; i < accountCounter; i++) {
            newAccounts[i] = accounts[i];
        }
        accounts = newAccounts;
        accountSize *=2;
    }

    @Override
    public boolean verifyPIN(String pin) {
        for (int i = 0; i < accountCounter; i++) {
            if (accounts[i].getPin().equals(pin));
                this.current_account = i;
                return true;
        }
        return false;
    }

    @Override
    public String selectAccount() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter pin");
        String pin = myObj.nextLine();  // Read user input

        if(verifyPIN(pin))
            return accounts[current_account].toString();

        else
            System.out.println("User cant found dude");

        return "Error";
    }


    @Override
    public boolean withdraw(String account, double amount) {
        return accounts[current_account].withdraw(amount);
    }

    @Override
    public void display(String pin, double amount, boolean success) {
        if (current_account == -1) {
            success = false;
            System.out.println("Wrong Pin try again");
        }
        else if (!accounts[current_account].getPin().equals(pin)){
            System.out.println("Pin is not matched!");
        }
        else {
            success = true;
            pin = accounts[current_account].getPin();
        }

        System.out.print("Log in: ");
        if (success) {
            System.out.println("succesfully");
            System.out.println("Your balance is: " + accounts[current_account].getBalance() + "$");
        }
        else
            System.out.println("doesnt succesful");
    }

    @Override
    public void showBalance(String account) {
        if (current_account!=-1)
            System.out.println("balance: " + accounts[current_account].getBalance());
        else {
            System.out.println("Try to access your account!");
            selectAccount();//to select account
        }
    }
}
