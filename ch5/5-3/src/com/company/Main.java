package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String[] greetings = {"Hi", "Hello", "Shalom"};
        int posHello = linearSearch(greetings, "Hello");
        //System.out.println(posHello);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(9);
        Integer [] intArr = {3222,322221,33,4,52,324,5,6,3,324,7,555,8,9};
        String str = "Ahmet cakar dediki benim adim ahmet Goethe cakar";

        Programming p = new Programming();

        System.out.println(p.sum(arrayList));

        System.out.println(p.sum2(arrayList.toArray()));

        System.out.println(p.linearSearch(intArr,4));

        System.out.println(p.largestValue(intArr));

        System.out.println(p.findIndex(str, 'G'));
    }

    /** Recursive linear search method (in RecursiveMethods.java).
     @param items The array being searched
     @param target The item being searched for
     @param posFirst The position of the current first element
     @return The subscript of target if found; otherwise –1
     */
    private static int linearSearch(Object[] items,
                                    Object target, int posFirst) {
        if (posFirst == items.length)
            return -1;
        else if (target.equals(items[posFirst]))
            return posFirst;
        else
            return linearSearch(items, target, posFirst + 1);
    }

    /** Wrapper for recursive linear search method (in
     RecursiveMethods.java).
     @param items The array being searched
     @param target The object being searched for
     @return The subscript of target if found; otherwise –1
     */
    public static int linearSearch(Object[] items, Object target) {
        return linearSearch(items, target, 0);
    }



    /** Recursive binary search method (in RecursiveMethods.java).
     @param <T> The item type
     @param items The array being searched
     @param target The object being searched for
     @param first The subscript of the first element
     @param last The subscript of the last element
     @return The subscript of target if found; otherwise –1.
     */
    private static <T> int binarySearch(T[] items, Comparable<T> target,
                                        int first, int last) {
        if (first > last)
            return -1; // Base case for unsuccessful search.
 else {
            int middle = (first + last) / 2; // Next probe index.
            int compResult = target.compareTo(items[middle]);
            if (compResult == 0)
                return middle; // Base case for successful search.
            else if (compResult < 0)
                return binarySearch(items, target, first, middle - 1);
            else
                return binarySearch(items, target, middle + 1, last);
        }
    }
    /** Wrapper for recursive binary search method (in RecursiveMethods.java).
     @param <T> The item type.
     @param items The array being searched
     @param target The object being searched for
     @return The subscript of target if found; otherwise –1.
     */
    public static <T> int binarySearch(T[] items, Comparable<T> target) {
        return binarySearch(items, target, 0, items.length - 1);
    }
}
