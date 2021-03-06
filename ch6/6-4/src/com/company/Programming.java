package com.company;

import java.util.function.BiFunction;

/**
 * PROGRAMMING
 * 1. Write a lambda expression that takes a double argument (x) and an integer argument (n).
 * The method result should be the double value raised to the power n. Do this using a Java
 * API method and also using a loop.
 * 4. Write a general postOrderTraverse method for the BinaryTree class similar to the (Check BinaryTree.java file)
 * preOrderTraverse method.
 * 5. Write a general inOrderTraverse method for the BinaryTree class similar to the preOrderTraverse method. (Check BinaryTree.java file)
 */
public class Programming {
    public static void main(String[] args){
        /**
         *  * PROGRAMMING
         *  * 1. Write a lambda expression that takes a double argument (x) and an integer argument (n).
         *  * The method result should be the double value raised to the power n. Do this using a Java
         */
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
