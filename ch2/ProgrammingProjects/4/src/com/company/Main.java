package com.company;
/**
 * Written by: Omer F. Akduman
 * 8.02.2022
 */
public class Main {

    /**
     * 4. Write a program to manage a list of students waiting to register for a course as described in
     * Section 2.5. Operations should include adding a new student at the end of the list, adding a new
     * student at the beginning of the list, removing the student from the beginning of the list, and removing a student by name.
     */

    /**
     * Normally add operation adds end of the list
     * addFirst method add the element beginning of the list
     * removeFirst method remove element from beginning
     * removeItem item remove by the element
     */
    public static void main(String[] args) {
	// write your code here
        MySingleLinkedList<String> names = new MySingleLinkedList<>();

        names.add("kamil");
        names.add("adnan");
        names.add("mehmet");
        names.add("avni");
        names.add("celik");
        names.addFirst("Hami");
        names.print();
        names.removeItem("mehmet");
        System.out.println("======================");
        names.print();
    }
}
