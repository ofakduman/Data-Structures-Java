package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // Create the sets.
        String[] listA = {"Ann", "Sally", "Jill", "Sally"};
        String[] listB = {"Bob", "Bill", "Ann", "Jill"};
        Set<String> setA = new HashSet<>();
        Set<String> setAcopy = new HashSet<>(); // Copy of setA
        Set<String> setB = new HashSet<>();
        // Load sets from arrays.
        for (String s : listA) {
            setA.add(s);
            setAcopy.add(s);
        }
        for (String s : listB) {
            setB.add(s);
        }
        System.out.println("The 2 sets are: " + "\n" + setA
                + "\n" + setB);
        // Display the union and intersection.
        setA.addAll(setB); // Set union
        setAcopy.retainAll(setB); // Set intersection
        System.out.println("Items in set union are: " + setA);
        System.out.println("Items in set intersection are: "
                + setAcopy);
    }
}
