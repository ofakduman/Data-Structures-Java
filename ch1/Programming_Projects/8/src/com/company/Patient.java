package com.company;

import java.util.Arrays;

public class Patient extends Human{
    private Bill[] bills = new Bill[20];
    private int bill_counter = 0;
    private int bill_size = 20;
    boolean has_insurance;
    Insurance insurance;


    public Patient(String name, String surname, int birthYear, Bill[] bills, int bill_counter, int bill_size,
                   boolean has_insurance, Insurance insurance) {
        super(name, surname, birthYear);
        this.bills = bills;
        this.bill_counter = bill_counter;
        this.bill_size = bill_size;
        this.has_insurance = has_insurance;
        this.insurance = insurance;
    }

    public Bill[] getBills() {
        return bills;
    }

    public void setBills(Bill[] bills) {
        this.bills = bills;
    }

    public int getBill_counter() {
        return bill_counter;
    }

    public void setBill_counter(int bill_counter) {
        this.bill_counter = bill_counter;
    }

    public int getBill_size() {
        return bill_size;
    }

    public void setBill_size(int bill_size) {
        this.bill_size = bill_size;
    }

    public boolean isHas_insurance() {
        return has_insurance;
    }

    public void setHas_insurance(boolean has_insurance) {
        this.has_insurance = has_insurance;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public boolean add_bill(Bill bill){
        if (bill_counter == bill_size){
            increase_bill_size();
        }
        bills[bill_counter++] = bill;
        return true;
    }

    public void increase_bill_size(){
        Bill newBills[] = new Bill[bill_size*2];
        for(int i = 0; i<bill_counter; i++){
            newBills[i] = bills[i];
        }
        bills = newBills;
        this.bill_size = bill_size*2;
    }

    public double get_total_debt(){
        double total_price = 0;
        for (int i = 0; i < bill_counter; i++) {
            total_price += bills[i].getPrice();
        }
        if (this.has_insurance)//if insurance pay 90 percent of the bill then i.e total bill is 100 dollars after insurance total bill is 10 dollars
            total_price = total_price*(1-this.insurance.getPercent_payment_by_insurance());
        return total_price;
    }

    public double pay_total_debt(){
        double total_price = get_total_debt();
        for (int i = 0; i < bill_counter; i++)
            bills[i].setPrice(0);

        return total_price;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n" +"Patient{" +
                "bills=" + Arrays.toString(bills) +
                ", bill_counter=" + bill_counter +
                ", bill_size=" + bill_size +
                ", has_insurance=" + has_insurance +
                ", insurance=" + insurance +
                '}';
    }
}
