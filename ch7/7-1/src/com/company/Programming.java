package com.company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * PROGRAMMING
 * 1. Assume you have declared three sets a, b, and c and that sets a and b store objects. Write
 * statements that use methods from the Set interface to perform the following operations:
 * a. c = (a ∪ b)
 * b. c = (a ∩ b)
 * c. c = (a – b)
 * d. if (a ⊂ b)
 *  c = a;
 * else
 *  c = b;
 * 2. Write a toString method for a class that implements the Set interface and displays the set
 * elements in the form shown in Example 9.1.
 */
public class Programming {
    public static void main(String []args){
        String[] listA = {"Ann", "Sally", "Jill", "Sally"};
        String[] listB = {"Bob", "Bill", "Ann", "Jill", "Meal", "cancanba", "kklema"};
        String[] listC = {"Hilmi", "Kamil", "Vilerael", "Barca", "Madrid", "Benzema"};

        Set<String> setA = new HashSet<>();
        Set<String> setAcopy = new HashSet<>();
        Set<String> setB = new HashSet<>(); // Copy of setA
        Set<String> setBcopy = new HashSet<>(); // Copy of setA
        Set<String> setC = new HashSet<>();
        Set<String> setCcopy = new HashSet<>();


        for (String str: listA) {
            setA.add(str);
            setAcopy.add(str);
        }


        for (String str: listB){
            setB.add(str);
            setBcopy.add(str);
        }

        for (String str: listC) {
            setC.add(str);
            setCcopy.add(str);
        }

        /**
         *a. c = (a ∪ b)
         *b. c = (a ∩ b)
         *c. c = (a – b)
         *d. if (a ⊂ b)
         */

        //a
        System.out.println(setA);
        System.out.println(setA.addAll(setB));
        setC = setA;
        System.out.println("a. c = (a ∪ b)");
        System.out.println(setC);

        //b
        setA.removeAll(setA);
        for (String s:
             setAcopy) {
            setA.add(s);
        }

        System.out.println(setA.retainAll(setB));
        setC = setA;
        System.out.println("a. c = (a ∩ b)");
        System.out.println(setC);

    }


}
