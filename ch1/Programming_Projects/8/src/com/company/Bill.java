package com.company;

import java.util.Objects;

public class Bill {
    double price;
    String description;
    int bill_number;
    private static int bill_counter = 0;

    public Bill(double price, String description) {
        this.price = price;
        this.description = description;
        this.bill_number = bill_counter++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bill)) return false;
        Bill bill = (Bill) o;
        return getBill_number() == bill.getBill_number();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBill_number());
    }

    public void increase_bill_counter(){
        bill_counter++;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getBill_number() {
        return bill_number;
    }

    public void setBill_number(int bill_number) {
        this.bill_number = bill_number;
    }

    public static int getBill_counter() {
        return bill_counter;
    }

    public static void setBill_counter(int bill_counter) {
        Bill.bill_counter = bill_counter;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "price=" + price + "$ \n"+
                ", description='" + description + '\'' +
                ", bill_number=" + bill_number +
                '}';
    }
}
