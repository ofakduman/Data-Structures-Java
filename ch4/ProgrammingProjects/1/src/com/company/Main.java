package com.company;

/**
 * @author Omer F. Akduman
 * date: 11.02.2022
 */

public class Main {
    /** Programming
     *1. Add a method isPalindromeLettersOnly to the PalindromeFinder class that bases its findings
     * only on the letters in a string (ignoring spaces, digits, and other characters that are not letters).
     */


    public static void main(String[] args) {
        String str = "kay ak ... .";
        boolean isPoli = PalindromeFinder.isPalindromeLettersOnly(str);
        System.out.println(str + " is polindrome?: " + isPoli);
    }
}
