package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {


        Node<String> head = null;
        Node<String> tail = null;

        Node<String> tom = new Node<>("Tom");
        Node<String> dick = new Node<>("Dick");
        Node<String> harry = new Node<>("Harry");
        Node<String> sam = new Node<>("Sam");

        MyDoubleLinkedList<String> names = new MyDoubleLinkedList<>();

        names.add("Tom");
        names.add("Dick");
        names.add("Harry");
        names.add("Sam");

        System.out.println(names.get(2));
        System.out.println(names.size());

        System.out.println("==========================");
        print(names);

        names.add(4,"Avni");
        print(names);
        names.add(0,"celik");
        print(names);

        programming1();
    }

    /**<<This is the objection of the 2.6 Programming part 1. program>>
     * 1. For the double‐linked list shown in Figure 2.20, assume head references the first list node
     * and tail references the last list node. Write statements to do each of the following:
     * a. Insert "Bill" before "Tom".
     * b. Insert "Sue" before "Sam".
     * c. Remove "Bill".
     * d. Remove "Sam".
     */

    public static void programming1(){
        MyDoubleLinkedList<String> names = new MyDoubleLinkedList<>();
        names.add("Tom");
        names.add("Dick");
        names.add("Harry");
        names.add("Sam");
        //a. Insert "Bill" before "Tom".
        names.addBefore("Bill","Tom");
        print(names);
        //b. Insert "Sue" before "Sam".
        names.addBefore("Sue","Sam");
        print(names);
        //c. Remove "Bill".
        names.removeItem("Bill");
        print(names);
        //d. Remove "Sam".
        names.removeItem("Sam");
        print(names);
    }

    public static void print(MyDoubleLinkedList<String> names){
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        System.out.println("==========================");
    }

    public static void print(Node<String> nodeRef){
        for (int i = 0; i < 5; i++) {
            System.out.println(nodeRef.data);
            nodeRef = nodeRef.next;
        }
        System.out.println("==========================");
    }
}
