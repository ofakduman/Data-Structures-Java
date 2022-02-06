package com.company;

import java.util.Objects;

public abstract class Customer {
    private String name;
    private String address;
    private int age;
    private String telNumber;
    private int customerNumber;
    private static int lastCustomerNumber = 9999;

    private int getLastCustomerNumber(){ return lastCustomerNumber;}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public Customer(String name, String address, int age, String telNumber) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.telNumber = telNumber;
        this.customerNumber = getLastCustomerNumber();
        this.lastCustomerNumber++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return age == customer.getAge() && customerNumber == customer.getCustomerNumber() && Objects.equals(name, customer.getName()) &&
                Objects.equals(address, customer.getAddress()) && Objects.equals(telNumber, customer.getTelNumber());
    }

    @Override
    public String toString(){
        return "name: " + this.name +
                "address: " + this.address+
                "age: " + this.age+
                "telNumber: " + this.telNumber+
                "customer Number: " + this.customerNumber;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, address, age, telNumber, customerNumber);
    }

    abstract public double getSavingInterest();
    abstract public double getCheckingInterest();
    abstract public double getCheckCharge();
}
