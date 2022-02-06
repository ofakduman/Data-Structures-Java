package com.company;

import java.util.Date;

/**
 * 1. Develop a program to maintain a list of homework assignments. When an assignment is assigned,
 * add it to the list, and when it is completed, remove it. You should keep track of the due date. Your
 * program should provide the following services:
 *  Add a new assignment.
 *  Remove an assignment.
 *  Provide a list of the assignments in the order they were assigned.
 *  Find the assignment(s) with the earliest due date.
 */
public class Main {

    public static void main(String[] args) {
        Date d1 = new Date(2000, 11, 21);
        Date d2 = new Date(2001, 8, 21);
        Date d3 = new Date(2000, 1, 11);
        Date d4 = new Date(2000, 3, 21);
        Date d5 = new Date(2000, 6, 1);
        Date d6 = new Date(2000, 4, 13);
        Date d7 = new Date(2000, 1, 3);
        Date d8 = new Date(2000, 8, 2);

        System.out.println(d1);
        Homeworks homeworks = new Homeworks();


        Homework hw1 = new Homework("CSE", d1);
        Homework hw2 = new Homework("PHSY", d2);
        Homework hw3 = new Homework("CHEM", d3);
        Homework hw4 = new Homework("MEC", d4);
        Homework hw5 = new Homework("AMM", d5);
        Homework hw6 = new Homework("GOT", d6);
        Homework hw7 = new Homework("ME", d7);
        Homework hw8 = new Homework("MET", d8);

        homeworks.add(hw1);
        homeworks.add(hw2);
        homeworks.add(hw3);
        homeworks.add(hw4);
        homeworks.add(hw5);
        homeworks.add(hw6);
        homeworks.add(hw7);
        homeworks.add(hw8);

        homeworks.showAll();
    }


}
