package com.company;
/**
 * Written by: Omer F. Akduman
 * 6.02.2022
 */

public class Main {
    /**
     * Programming Project
     * 3. Provide a multiple method for your polynomial class. To multiply, you iterate through polynomial A
     * and then multiply all terms of polynomial B by the current term of polynomial A. You then add each
     * term you get by multiplying two terms to the polynomial result.
     * Hint: to multiply two terms, multiply their coefficients and add their exponents. For example,2x^3 multiply 4x^2 is  8x^5.
     */
    public static void main(String[] args) {
        Polynomial poly = new Polynomial();

        String polinom = "2x^3 + x^2";
        String polinom2 = "4x^2";

        poly.readPoly(polinom);
        poly.show();
        System.out.println("\nafter multiply");
        poly.multiply(polinom2);
        poly.show();
    }
}
