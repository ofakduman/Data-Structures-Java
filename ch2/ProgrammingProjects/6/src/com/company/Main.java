package com.company;

/**
 * Written by: Omer F. Akduman
 * 8.02.2022
 */


import java.util.Iterator;
import java.util.ListIterator;

public class Main {

    /**
     * 6. The Josephus problem is named after the historian Flavius Josephus, who lived between the years 37
     * and 100 CE. Josephus was also a reluctant leader of the Jewish revolt against the Roman Empire.
     * When it appeared that Josephus and his band were to be captured, they resolved to kill themselves.
     * Josephus persuaded the group by saying, “Let us commit our mutual deaths to determination by lot.
     * He to whom the first lot falls, let him be killed by him that hath the second lot, and thus fortune shall
     * make its progress through us all; nor shall any of us perish by his own right hand, for it would be
     * unfair if, when the rest are gone, somebody should repent and save himself” (Flavius Josephus, The
     * Wars of the Jews, Book III, Chapter 8, Verse 7, tr. William Whiston, 1737). Yet that is exactly what
     * happened; Josephus was left for last, and he and the person he was to kill surrendered to the Romans.
     * Although Josephus does not describe how the lots were assigned, the following approach is generally
     * believed to be the way it was done. People form a circle and count around the circle some predetermined number.
     * When this number is reached, that person receives a lot and leaves the circle. The
     * count starts over with the next person. Using the circular‐linked list developed in Exercise 4,
     * simulate this problem. Your program should take two parameters: n, the number of people who start, and
     * m, the number of counts. For example, try n 20 and m 12. Where does Josephus need to be in
     * the original list so that he is the last one chosen?
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

        int step = 0;
        String removed = "";

        while(names.size()!=1){
            step++;
            for (int i = 0; i < count-1; i++) {
                iter.next();
            }
            removed = (String) iter.next();
            iter.remove();
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
