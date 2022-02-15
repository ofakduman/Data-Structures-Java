package com.company;

/**
 * @author Omer F. Akduman
 * 13.02.2022
 */

public class Main {

    /**
     * 5. Write a client program that uses the Stack abstract data type to simulate a session with a bank teller.
     * Unlike most banks, this one has decided that the last customer to arrive will always be the first to
     * be served. Create classes that represent information about a bank customer and a transaction.
     * For each customer, you need to store a name, current balance, and a reference to the transaction. For
     * each transaction, you need to store the transaction type (deposit or withdrawal) and the amount of
     * the transaction. After every five customers are processed, display the size of the stack and the name
     * of the customer who will be served next.
     */

    public static void main(String[] args) {
	    Customer c0 = new Customer("Kamil", 4000);
	    Customer c1 = new Customer("Ahmet", 4000);
	    Customer c2 = new Customer("Veli", 4000);
	    Customer c3 = new Customer("Ahmet", 4000);
	    Customer c4 = new Customer("Cakar", 4000);
	    Customer c5 = new Customer("Ersun", 4000);
	    Customer c6 = new Customer("Yanal", 4000);

        Bank bankofAmerica = new Bank();
        bankofAmerica.addCustomer(c0);
        bankofAmerica.addCustomer(c1);
        bankofAmerica.addCustomer(c2);
        bankofAmerica.addCustomer(c3);
        bankofAmerica.addCustomer(c4);
        bankofAmerica.addCustomer(c5);
        bankofAmerica.addCustomer(c6);

        bankofAmerica.process();
        bankofAmerica.process();
        bankofAmerica.process();
        bankofAmerica.process();
        bankofAmerica.process();
        bankofAmerica.process();
        bankofAmerica.process();

    }
}
