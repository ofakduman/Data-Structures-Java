package com.company;

public class Account {
    private String name;
    private String surname;
    private String pin;
    private double balance = 0;
    private int customerNo;
    private static int given_last_customer_no = 99999;


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(String name, String surname, String pin, double balance) {
        this.name = name;
        this.surname = surname;
        this.pin = pin;
        this.balance = balance;
        this.customerNo = given_last_customer_no;
        given_last_customer_no++;
    }

    public boolean withdraw(double amount){
        if (balance-amount>=0)
            balance = balance-amount;
        return true;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pin='" + pin + '\'' +
                ", balance=" + balance +
                ", customerNo=" + customerNo +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}
