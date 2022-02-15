package com.company;

import java.util.Stack;

public class Bank {

    Stack<Customer> customers = new Stack<>();
    public static int countOfProcess = 0;
    public static int totalCustomer = 0;

    public void addCustomer(Customer customer){
        customers.push(customer);
        totalCustomer++;
    }

    public void process(){

        Customer processCustomer = customers.peek();
        //now process will be occured then customer leave the list
        customers.pop();
        totalCustomer--;
        countOfProcess++;
        if (countOfProcess%5==0)
            inform();
    }

    private void inform(){
        if (totalCustomer>0)
            System.out.println("Process customer: " + countOfProcess +"\nRemain customer: " + totalCustomer +"\nNext Customer:" +
                customers.peek().getName());
    }

}
