package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int array[] = {3,4,5,-12,-123,3,73,-1,23,12};
        int sum = 9;
        System.out.println("Array size: " + array.length + "\nSum value: "+ sum);
        long startTime = System.nanoTime();
        find_pairs(array,sum);
        long stopTime = System.nanoTime();
        System.out.println("Execution time is: "+ (stopTime - startTime)/100);


        System.out.println("\nRecursion Function: ");
        System.out.println("Array size: " + array.length + "\nSum value: "+ sum);
        long startTime2 = System.nanoTime();
        find_pairs(array,sum);
        long stopTime2 = System.nanoTime();
        System.out.println("Execution time is: "+ (stopTime2 - startTime2)/100);
    }

    private static void find_pairs(int []arr, int sum){
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]+arr[j]==sum)
                    count++;
            }
        }
        System.out.println("Found: " + count + " pairs");
    }

    /**
     * A wrapper method that find pairs of numbers with the given sum
     * @param arr elements in there
     * @param sum target sum int value
     */
    public void recursiveFindPairs(int []arr, int sum){
        recurrrence_find_pairs(arr, 0,0,sum);
    }

    /**
     * A recursive method that
     * @param arr our datas in there
     * @param index is represents the outher loops iter
     * @param count is represents total number of pair
     * @param sum is targeted sum number
     */
    private static void recurrrence_find_pairs(int []arr, int index, int count, int sum){
        if (arr.length-1 == index) {
            System.out.println("Found: " + count + " pairs");
            return;
        }
        else
            count+=inner_loop(arr, index, index+1,0,sum);
            recurrrence_find_pairs(arr,index+1,count, sum);
    }

    /**
     *  A method that represents the inner loops iteration
     * @param arr holds int array
     * @param index outer loops stabil number
     * @param current_index is for inner loop's iter
     * @param total_pairs is for inner loop total finding pairs
     * @param sum is targeted um
     * @return 1 + itself if there is a pair that sums are equal to targeted sum
     */
    private static int inner_loop(int []arr, int index ,int current_index, int total_pairs,int sum){
        if (arr.length == current_index)
            return 0;
        if (arr[index]+arr[current_index]==sum)
            return 1+ inner_loop(arr,index,current_index+1,total_pairs+1,sum);
        else
            return inner_loop(arr,index,current_index+1,total_pairs,sum);
    }
}
