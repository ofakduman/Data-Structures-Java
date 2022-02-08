package com.company;

/**
 * Written by: Omer F. Akduman
 * 8.02.2022
 */


import java.util.Iterator;
import java.util.ListIterator;

public class Main {

    /**
     7. To mimic the procedure used by Josephus and his band strictly, the person eliminated remains in the
     circle until the next one is chosen. Modify your program to take this into account. You may need to
     modify the circular‐linked list class to make a copy of an iterator. Does this change affect the outcome?


     -> This change cannot affect the outcome.
     -> Solution is not accurate i couldnt solve copy and reuse iterator
     */
    public static void main(String[] args) {
	// write your code here
        CircularList<String> names = new CircularList<>();
        names.add("n1");
        names.add("n2");
        names.add("n3");
        names.add("n4");
        names.add("n5");
        names.add("n6");
        names.add("n7");
        names.add("n8");
        names.add("n9");
        names.add("n10");
        names.add("Josephus");
        names.add("n12");
        names.add("n13");
        names.add("n14");
        names.add("n15");
        names.add("n16");
        names.add("n17");
        names.add("n18");
        names.add("n19");
        names.add("n20");

        int n = names.size();
        int m = 20; //number of counts
        print(names);
      /*  ListIterator iter = names.listIterator(5);
        ListIterator iter2 = names.copyListIterator(iter);
        System.out.println(iter.next());
        iter.remove();
        System.out.println(iter2.next());
        System.out.println(iter.next());
*/
        solveJosephProblem(names, 12);


    }

    /**
     *
     * @param names a circular linked list object where to contain Josephues and friends
     * @param count initial count and where to count after start again for example count 2 and there are 20 people
     *               first 2. man will gone die after 4 then 6 and so on
     */
    public static void solveJosephProblem(CircularList<String> names, int count ){
        ListIterator iter = names.listIterator();
        ListIterator iterBeforeOne = names.copyListIterator(iter);

        int step = 0;
        String removed = "";

        while(names.size()!=1){
            step++;
            for (int i = 0; i < count-1; i++) {
                iter.next();
            }
            iterBeforeOne = names.copyListIterator(iter);
            removed = (String) iterBeforeOne.next();
            iterBeforeOne.remove();
            System.out.println(step+". step: "+ removed + " removed");print(names);
        }

    }

    public static <E> void print(CircularList<E> names){
        Iterator iter = names.listIterator();
        int count = 0;

        for (int i = 0; i < names.size()-1; i++) {
            System.out.print(iter.next()+ " => ");
        }
        System.out.println(iter.next());
        System.out.println();
    }
}
