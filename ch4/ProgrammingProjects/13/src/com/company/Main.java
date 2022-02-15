package com.company;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    /**
     * 13. Write a program that reads in a sequence of characters and stores each character in a deque.
     * Display the deque contents. Then use a second deque to store the characters in reverse order. When
     * done, display the contents of both deques.
     */

    public static void main(String[] args) {

    DequeContent dqC = new DequeContent();
    String line = "darilmak yok hic haketmedik";

        dqC.storeDeque(line);
        System.out.println("stored one: ");
        dqC.display();
        dqC.reverseOrder();
        System.out.println("reversed one: ");
        dqC.display();
    }
}
