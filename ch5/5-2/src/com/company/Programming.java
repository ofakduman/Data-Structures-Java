package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Programming {

    private List<Integer> fibonaccis = new ArrayList<>();

    public Programming(){
        fibonaccis.add(0);
        fibonaccis.add(1);
    }

    /**
     * PROGRAMMING
     * 1. Write a recursive method for raising x to the power n that works for negative n as well as
     *  positive n. Use the fact that x
     * 2. Modify the factorial method to throw an IllegalArgumentException if n is negative.
     * 3. Modify the Fibonacci method to throw an illegal argument exception if its argument is less
     * than or equal to zero.
     * 4. Write a class that has an iterative method for calculating Fibonacci numbers. Use an array
     * that saves each Fibonacci number as it is calculated. Your method should take advantage
     * of the existence of this array so that subsequent calls to the method simply retrieve the
     * desired Fibonacci number if it has been calculated. If not, start with the largest Fibonacci
     * number in the array rather than repeating all calculations.
     */

    /**
     * A method to find pow(5,2) = 25
     * @param x base number
     * @param n upper number
     * @returns result of the calculation
     */
    public double pow(int x, int n){
        if (n < 0)
            return negativePow(x,n);
        else
            return positivePow(x,n);
    }

    private double positivePow(int x, int n){
        if (n == 0)
            return 1;

        else
            return x * positivePow(x, n-1);
    }


    private double negativePow(int x, int n){
        if (n == 0)
            return 1;
        else
            return (1/(double)x) * negativePow(x, n+1);
    }

    public int factorial(int n){
        if (n<=0)
            throw new IllegalArgumentException("Mina kurekle girdigim baska sayi mi bulamadin");
        if (n == 1)
            return 1;
        else
            return n * factorial(n-1);
    }

    public int fibonacci(int n){
        if (n<fibonaccis.size())
            return fibonaccis.get(n);
        else{
            for (int i = fibonaccis.size(); i <= n; i++) {
                fibonaccis.add(fibonaccis.get(i-1)+fibonaccis.get(i-2));
            }
        }
        return fibonaccis.get(n);
    }

}
