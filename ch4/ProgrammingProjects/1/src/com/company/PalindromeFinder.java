package com.company;

import java.util.ArrayDeque;
import java.util.Deque;

/** Class with methods to check whether a string is a palindrome. */
public class PalindromeFinder {
    /** Fills a stack of characters from an input string.
     * @param inputString the string to be checked
     * @return a stack of characters in inputString
     */
    private static Deque<Character> fillStack(String inputString) {
        Deque<Character> charStack = new ArrayDeque<>();
        for (int i = 0; i < inputString.length(); i++) {
            charStack.push(inputString.charAt(i));
        }
        return charStack;
    }
    /**
     * Builds the reverse of a string by calling fillsStack
     * to push its characters onto a stack and then popping them
     * and appending them to a new string.
     * @post The stack is empty.
     * @return The string containing the characters in the stack
     */
    private static String buildReverse(String inputString) {
        Deque<Character> charStack = fillStack(inputString);
        StringBuilder result = new StringBuilder();
        while (!charStack.isEmpty()) {
            // Remove top item from stack and append it to result.
            result.append(charStack.pop());
        }
        return result.toString();
    }
    /** Calls buildReverse and compares its result to inputString
     * @param inputString the string to be checked
     * @return true if inputString is a palindrome, false if not
     */
    public static boolean isPalindrome(String inputString) {
        return inputString.equalsIgnoreCase(buildReverse(inputString));
    }

    /** Calls buildReverse and compares its result to inputString
     * @param inputString the string to be checked
     * @param onlyLetter for check only letter not include except letter
     * @return true if inputString is a palindrome, false if not
     */
    public static boolean isPalindrome(String inputString,boolean onlyLetter) {
        if (onlyLetter)
            inputString = inputString.replaceAll("[^a-zA-Z]","");
        return inputString.equalsIgnoreCase(buildReverse(inputString));
    }

    /** Calls buildReverse and compares its result to inputString
     * @param inputString the string to be checked
     * @param onlyLetter for check only letter not include except letter
     * @return true if inputString is a palindrome, false if not
     */
    public static boolean isPalindromeLettersOnly(String inputString) {
        inputString = inputString.replaceAll("[^a-zA-Z]","");
        return inputString.equalsIgnoreCase(buildReverse(inputString));
    }
}
