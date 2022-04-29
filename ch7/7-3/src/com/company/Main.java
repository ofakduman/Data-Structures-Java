package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {


    }

    public static int calculatePrimeNumber(){
        int table_size = 101;
        double traschHold = 0.8;

        int bound = (int) (table_size *traschHold);

        while (bound>2){
            if (isPrime(bound)==true)
                return bound;
            bound-=1;
        }

        return 2;
    }

    private static boolean isPrime(int number){
        int iter_numb = number -1;
        while (iter_numb>1){
            if (number%iter_numb==0)
                return false;
            iter_numb-=1;
        }
        return true;
    }
}
