package com.company;

public class Main {
    /**
     * 4. Write a LinkedListRec class that has the following methods: size, empty, insertBefore,
     * insertAfter, addAtHead, addAtEnd, remove, replace, peekFront, peekEnd, removeFront,
     * removeEnd, toString. Use recursion to implement most of these methods.
     */
    public static void main(String[] args) {
        LinkedListRec<String> llr = new LinkedListRec<>();

        System.out.println(llr.empty());
        llr.add("shawty");
        System.out.println(llr.empty());
        llr.insertAfter("shawty", "boss");
        System.out.println(llr.toString());
        llr.insertBefore("boss", "seyho");
        llr.addAtEnd("YokMerco");
        llr.addAtHead("sivistim");
        System.out.println(llr.toString());
        llr.removeEnd();
        llr.removeFront();
        System.out.println(llr.toString());


    }
}
