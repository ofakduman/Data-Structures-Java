package com.company;

import java.util.LinkedList;
import java.util.ListIterator;

public class SelfCheck {
    public static void main(String[] args) {
        System.out.println("Q1:");
        question1();
        System.out.println("Q2:");
        question2();
        System.out.println("Q3");
        //question3(); gives an error because before use remove operation of iterator we should use next or prev method

    }

    public static void question2(){
        /**
         * 2. In Question 1, what if we change the statement
         * iteratorToSam.previous();
         *  to
         * iteratorToSam.next();
         */

        LinkedList<String> myList = new LinkedList<>();
        myList.add("Tom");
        myList.add("Dick");
        myList.add("Harry");
        myList.add("Sam");

        myList.indexOf("Sam");

        print(myList);

        int indexOfSam = myList.indexOf("Sam");

        ListIterator<String> iteratorToSam = myList.listIterator(indexOfSam);
        iteratorToSam.next();

        iteratorToSam.remove();
        System.out.println("After Code Fragement do");
        print(myList);

    }

    public static void question3(){
        /**
         * 3. In Question 1, what if we omit the statement
         * iteratorToSam.previous();
         */
        LinkedList<String> myList = new LinkedList<>();
        myList.add("Tom");
        myList.add("Dick");
        myList.add("Harry");
        myList.add("Sam");

        myList.indexOf("Sam");

        print(myList);

        int indexOfSam = myList.indexOf("Sam");

        ListIterator<String> iteratorToSam = myList.listIterator(indexOfSam);

        iteratorToSam.remove();
        System.out.println("After Code Fragement do");
        print(myList);

    }
    public static void question1(){
        /**
         * The method indexOf, part of the List interface, returns the index of the first occurrence of
         * an object in a List. What does the following code fragment do?
         * int indexOfSam = myList.indexOf("Sam");
         * ListIterator<String> iteratorToSam = myListlistIterator(indexOfSam);
         * iteratorToSam.previous();
         * iteratorToSam.remove();
         *  where the internal nodes of myList (type LinkedList<String>) are shown in the figure
         * below:
         * Tom => Dick => Harry => Sam => null
         */
        LinkedList<String> myList = new LinkedList<>();
        myList.add("Tom");
        myList.add("Dick");
        myList.add("Harry");
        myList.add("Sam");

        myList.indexOf("Sam");

        print(myList);

        int indexOfSam = myList.indexOf("Sam");

        ListIterator<String> iteratorToSam = myList.listIterator(indexOfSam);
        iteratorToSam.previous();

        iteratorToSam.remove();
        System.out.println("After Code Fragement do");
        print(myList);
    }

    public static void print(LinkedList<String> myList){
        ListIterator<String> myIterator = myList.listIterator();
        String name;
        while(myIterator.hasNext()){
            name = myIterator.next();
            System.out.print(name+" => ");
        }

        System.out.println("null\n"+"==========================================");
    }
}
