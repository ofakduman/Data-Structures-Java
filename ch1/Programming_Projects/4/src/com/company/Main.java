/**
 * @Author Omer F. Akduman
 * 
 */
package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Bank tosunBank = new Bank();
        Account []accounts = new Account[5];
        Customer []customers = new Customer[5];
        customers[0] = new Adult("ali", "kapali sss", 28, "3131");
        customers[1] = new Adult("kaya", "kkkk carsi", 18, "3131");
        customers[2] = new Senior("veli", "AAA mahallesi", 23, "3131");
        customers[3] = new Adult("meltem", "fatih carsi", 44, "3131");
        customers[4] = new Student("Dursun", "Taksim", 55, "3131");

        accounts[0] = new SavingsAccount(customers[0], 3000);
        accounts[1] = new CheckingAccount(customers[1], 4000);
        accounts[2] = new SavingsAccount(customers[2], 5000);
        accounts[3] = new CheckingAccount(customers[3], 6000);
        accounts[4] = new SavingsAccount(customers[4], 50);

        tosunBank.addAccount(accounts[0]);
        tosunBank.addAccount(accounts[1]);
        tosunBank.addAccount(accounts[2]);
        tosunBank.addAccount(accounts[3]);
        tosunBank.addAccount(accounts[4]);

        System.out.println(tosunBank.getAccountCount());

        tosunBank.printAccounts();

        tosunBank.makeDeposit(tosunBank.getAccount(10003),1000);

        tosunBank.printAccounts();

    }
}
