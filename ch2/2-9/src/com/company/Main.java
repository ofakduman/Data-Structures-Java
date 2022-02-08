package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        MyLinkedList<String> myList = new MyLinkedList<>();

        myList.add("Halo");
        myList.add("alo");
        myList.add("ahmet");
        myList.add("cakar");
        myList.add("abdul");
        myList.add("kerim");
        myList.add("durmaz");
        myList.add("sinan");
        print(myList);
        Iterator iter = myList.listIterator(0);
        iter.next();
        iter.remove();
        print(myList);

    }

    public static void print(MyLinkedList<String> myList){
        ListIterator<String> myIter = myList.listIterator();
        while(myIter.hasNext()){
            System.out.print(myIter.next()+ " => ");
        }
        System.out.println("null\n=====================================================");
    }
}
