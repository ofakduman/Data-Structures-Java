package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<DirectoryEntry> theDirectory =
                new ArrayList<>();

        theDirectory.add(new DirectoryEntry("Jane Smith", "555‐549‐1234"));
        int index = theDirectory.indexOf(new DirectoryEntry("Jane Smith", ""));
        System.out.println(index);
        System.out.println(theDirectory.get(0).getName());

        List<Double> myList = new ArrayList<>();
        myList.add(3.456);
        myList.add(5.0);
        double result = myList.get(0) + myList.get(1);
        System.out.println("Result is " + result);

        Directory d = new Directory();
        d.getTheDirectory().add(new DirectoryEntry("Jane Smith", "555‐549‐1234"));


    }

    /** Add an entry to theDirectory or change an existing entry.
     @param aName The name of the person being added or changed
     @param newNumber The new number to be assigned
     @return The old number, or if a new entry, null
     */
    public static String addOrChangeEntry(String aName, String newNumber) {

        return "kk";
    }
}
