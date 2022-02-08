package com.company;

import java.util.Iterator;
/**
 * Written by: Omer F. Akduman
 * 8.02.2022
 */

/**
 * 5. A circular‐linked list has no need of a head or tail. Instead, you need only a reference to a current
 * node, which is the nextNode returned by the Iterator. Implement such a CircularList class. For
 * a nonempty list, the Iterator.hasNext method will always return true.
 *
 */
public class Main {

    public static void main(String[] args) {
        CircularList<String> names = new CircularList<>();
        names.add("kamil");
        names.add("ahsen");
        names.add("veli");
        names.add("tir");
        names.add("q3");
        names.add("kelebek");
        names.add("mersin");
        names.add("silifke");


        printCircularList(names);


    }

    public static void printCircularList(CircularList<String> aCircularList){
        Iterator iter = aCircularList.listIterator();
        int index = 0;
        int size = aCircularList.size();
        System.out.println(size);
        System.out.println(iter.hasNext());

        while(iter.hasNext()){
            System.out.println(iter.next());
            if (index++==size) {
                System.out.println("End of the list\n================================");

            }
        }

    }
}
