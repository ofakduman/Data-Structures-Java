package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Programming {
    public static void main(String[] args) {
        List<String> myList = new LinkedList<>();
        myList.add("Marcus");
        myList.add("Aurelius");
        myList.add("Goethe");
        myList.add("Ahmet");
        myList.add("Cakar");
        myList.add("Aurelius");
        myList.add("Goethe");
        myList.add("Cakar");

        System.out.println(indexOf(myList, "Cakar"));
        System.out.println(lastIndexOf(myList, "Cakar"));
    }

    /**
     * PROGRAMMING
     * 1. Write the method indexOf as specified in the List interface by adapting the code shown in
     * Example 2.13 to return the index of the first occurrence of an object.
     * 2. Write the method lastIndexOf specified in the List interface by adapting the code shown
     * in Example 2.13 to return the index of the last occurrence of an object.
     * 3. Write a method indexOfMin that returns the index of the minimum item in a List, assuming
     * that each item in the list implements the Comparable interface.
     */

    /**
     * 1. Write the method indexOf as specified in the List interface by adapting the code shown in
     * Example 2.13 to return the index of the first occurrence of an object.
     **/
    public static int indexOf(List<String> myList,String target){
        ListIterator<String> myIter = myList.listIterator();
        int index = 0;
        while(myIter.hasNext()){
            if (target.equals(myIter.next()))
                return index;
            index++;
        }
        return -1;
    }

    /**
     * * 2. Write the method lastIndexOf specified in the List interface by adapting the code shown
     *      * in Example 2.13 to return the index of the last occurrence of an object.
     *
     * @param myList
     * @param target
     * @return
     */
    public static int lastIndexOf(List<String> myList,String target){
        ListIterator<String> myIter = myList.listIterator();
        int index = 0;
        int lastOne = -1;
        while(myIter.hasNext()){
            if (target.equals(myIter.next()))
                lastOne = index;
            index++;
        }
        return lastOne;
    }

    /**
     * * 3. Write a method indexOfMin that returns the index of the minimum item in a List, assuming
     *      * that each item in the list implements the Comparable interface.
     */

}
