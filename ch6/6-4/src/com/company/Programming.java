package com.company;

import java.util.function.BiFunction;

/**
 * PROGRAMMING
 * 1. Write a lambda expression that takes a double argument (x) and an integer argument (n).
 * The method result should be the double value raised to the power n. Do this using a Java
 * API method and also using a loop.
 * 2. Write and test a Java class that enters two numbers and displays the result of calling each
 * lambda expression in Programming Exercise 1. Also, compare the results to make sure
 * that they are the same.
 * 3. Modify the program in Example 6.6 to use two function objects that calculate trigonometric values
 * and display the angle and corresponding values for each function object on the
 * same line.
 * 4. Write a general postOrderTraverse method for the BinaryTree class similar to the
 * preOrderTraverse method.
 * 5. Write a general inOrderTraverse method for the BinaryTree class similar to the preOrderTraverse method.
 */
public class Programming {
    public static void main(String[] args){
        BiFunction<Double, Integer, Double> lambda = (x,n)->{
            Double result = 1.0;
            for (int i = 0; i < n; i++) {
                result*=x;
            }
            return result;
        };

        System.out.println(lambda.apply(12.5,2));
    }
}
