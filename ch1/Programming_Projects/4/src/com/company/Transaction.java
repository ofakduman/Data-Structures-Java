package com.company;

import java.util.Calendar;
import java.util.Date;

public class Transaction {
    private int customerNumber;
    private byte type;
    private double amount;
    private Date date;
    private double fees;
    private String description;

        public Transaction(int customerNumber, byte type, double amount, double fees, String description) {
        this.customerNumber = customerNumber;
        this.type = type;
        this.amount = amount;
        Calendar cal = Calendar.getInstance();
        this.date = cal.getTime();
        this.fees = fees;
        this.description = description;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String processTransaction(){
        return "customer number:" + this.customerNumber +
                "type: " + this.type+
                "amount: " + this.amount+
                "date: " + this.date+
                "fees: " + this.fees +
                "description +" + this.description;
    }
}
