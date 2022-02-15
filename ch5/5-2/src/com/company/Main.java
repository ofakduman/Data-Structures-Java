package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(gcd(36, 24));

        System.out.println(fibonacciStart(7));

        Programming p = new Programming();
        System.out.println(p.pow(5,2));
        System.out.println(p.pow(5,-2));

        //System.out.println(p.factorial(-5));
        System.out.println(fibonacciStart(9));
        System.out.println(p.fibonacci(5));
        System.out.println(p.fibonacci(9));
    }

    /** Recursive gcd method (in RecursiveMethods.java).
     pre: m > 0 and n > 0
     @param m The larger number
     @param n The smaller number
     @return Greatest common divisor of m and n
     */
    public static double gcd(int m, int n) {
        if (m % n == 0)
            return n;
        else
            return gcd(n, m % n);
    }


    /** Recursive O(n) method to calculate Fibonacci numbers
     (in RecursiveMethods.java).
     pre: n >= 1
     @param fibCurrent The current Fibonacci number
     @param fibPrevious The previous Fibonacci number
     @param n The count of Fibonacci numbers left to calculate
     @return The value of the Fibonacci number calculated so far
     */
    private static int fibo(int fibCurrent, int fibPrevious, int n) {
        if (n == 1)
            return fibCurrent;
        else
            return fibo(fibCurrent + fibPrevious, fibCurrent, n - 1);
    }

    /** Wrapper method for calculating Fibonacci numbers
     (in RecursiveMethods.java).
     pre: n >= 0
     @param n The position of the desired Fibonacci number
     @return The value of the nth Fibonacci number
     */
    public static int fibonacciStart(int n) {
        if (n == 0)
            return 0;
        else
            return fibo(1, 0, n);
    }
}
