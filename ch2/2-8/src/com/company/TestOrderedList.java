package com.company;
import java.util.*;


public class TestOrderedList {
    /** Traverses ordered list and displays each element.
     Displays an error message if an element is out of order.
     @param testList An ordered list of integers
     */
    public static void traverseAndShow(OrderedList<Integer> testList) {
        int prevItem = testList.get(0);
        // Traverse ordered list and display any value that
        // is out of order.
        for (Integer thisItem : testList) {
            System.out.println(thisItem);
            if (prevItem > thisItem)
                System.out.println("*** FAILED, value is " + thisItem);
            prevItem = thisItem;
        }
    }
    public static void main(String[] args) {
        OrderedList<Integer> testList = new OrderedList<>();
        final int MAX_INT = 500;
        final int START_SIZE = 100;
        // Create a random number generator.
        Random random = new Random();
        // Fill list with START_SIZE random values.
        for (int i = 0; i < START_SIZE; i++) {
            int anInteger = random.nextInt(MAX_INT);
            testList.add2(anInteger);
        }
        // Add to beginning and end of list.
        testList.add2(-1);
        testList.add2(MAX_INT + 1);
        traverseAndShow(testList); // Traverse and display.
        // Remove first, last, and middle elements.
        Integer first = testList.get(0);
        Integer last = testList.get(testList.size() - 1);
        Integer middle = testList.get(testList.size() / 2);
        //System.out.println("first:" + first);
        testList.remove(first);
        testList.remove(last);
        testList.remove(middle);
        traverseAndShow(testList); // Traverse and display.
    }
}
