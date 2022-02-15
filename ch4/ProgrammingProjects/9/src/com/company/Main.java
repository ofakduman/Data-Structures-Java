package com.company;

/**
 * @author Omer Faruk Akduman
 */

public class Main {

    /**
     * 9. Another approach to checking for palindromes would be to store the characters of the string being
     * checked in a stack and then remove half of the characters, pushing them onto a second stack. When
     * you are finished, if the two stacks are equal, then the string is a palindrome. This works fine if the
     * string has an even number of characters. If the string has an odd number of characters, an additional
     * character should be removed from the original stack before the two stacks are compared. It
     * does not matter what this character is because it doesn’t have to be matched. Design, code, and test
     * a program that implements this approach.
     */

    public static void main(String[] args) {
        String str1 = "Kamil";
        String str2 = "Hayta";
        String str3 = "KaYaK";
        String str4 = "kelek";
        String str5 = "";
        String str6 = "xxxxx";

        PolindromeCheck p = new PolindromeCheck();

        System.out.println(p.isPolindrome(str1));
        System.out.println(p.isPolindrome(str2));
        System.out.println(p.isPolindrome(str3));
        System.out.println(p.isPolindrome(str4));
        System.out.println(p.isPolindrome(str5));
        System.out.println(p.isPolindrome(str6));
    }
}
