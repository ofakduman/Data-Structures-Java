package com.company;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * PROGRAMMING
 * 1. Write a recursive method to find the sum of all values stored in an array of integers.
 * 2. Write a recursive linear search method with a recursive step that finds the last occurrence
 * of a target in an array, not the first. You will need to modify the linear search method so
 * that the last element of the array is always tested, not the first. You will need to pass the
 * current length of the array as an argument.
 * 3. Implement the method for Self‐Check Exercise 4. You will need to keep track of the largest
 * value found so far through a method parameter.
 * 4. Implement the method for Self‐Check Exercise 5. You will need to keep track of the current
 * position in the string through a method paramete
 */
public class Programming {
    public int sum(ArrayList<Integer> arrayList){
        return sum(arrayList, arrayList.size(), 0);
    }

    private int sum(ArrayList<Integer> arrayList, int len, int iter){
        if (len == iter)
            return 0;
        else
            return arrayList.get(iter) + sum(arrayList, len, iter+1);
    }

    public <T> int sum2(T[] items) {
        return sum2(items, items.length, 0);
    }

    private <T> int sum2(T[] items, int len, int iter){
        if (len==iter)
            return 0;
        else
            return (Integer) items[iter] +sum2(items, len, iter+1);
    }

    public int linearSearch(Object[] items,Object target){
        return linearSearch(items,target, items.length-1 );
    }

    private int linearSearch(Object[] items,
                                    Object target, int lastIter) {
        if (lastIter == -1)
            return -1;
        else if (target.equals(items[lastIter]))
            return lastIter;
        else
            return linearSearch(items, target, lastIter - 1);
    }


    public int largestValue(Integer[] array){
        if (array.length == 0)
            throw new ArrayIndexOutOfBoundsException("dude array's length is not vallid");

        return largestValue(array, array.length,array[0], 1);
    }

    private int largestValue(Integer[] array, int len ,int largest, int iter){
        if (iter == len)
            return largest;
        else{
            if (array[iter]>largest)
                largest = array[iter];
            return largestValue(array,len, largest, iter+1);
        }
    }

    public int findIndex(String str, Character target){
        return findIndex(str, target, 0);
    }

    private int findIndex(String str, Character target, int iter){
        if (iter == str.length())
            return -1;
        else if (str.charAt(iter) == target)
            return iter;
        else
            return findIndex(str, target, iter+1);
    }
}
