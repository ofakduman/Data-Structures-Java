package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer>  numbers  = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        print(numbers);
        System.out.println();
        print2(numbers);

        Iterator<Integer> iter = numbers.iterator();

        removeDivInt(numbers,2);
        print2(numbers);

    }

    public static void removeDivInt(LinkedList<Integer> numbers, int divisor){
        Iterator<Integer> iter = numbers.iterator();
        int number = 0;
        while (iter.hasNext()){
            number = iter.next();
            if (number%divisor == 0) {
                iter.remove();
            }
        }
    }

    public static void print(LinkedList<Integer> numbers){
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i)+ " ");
        }
    }

    public static void print2(LinkedList<Integer> numbers){
        Iterator<Integer> iter = numbers.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next() + " ");
        }
        System.out.println();
    }
}
