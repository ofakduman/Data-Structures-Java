package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Locale;

public class Programming {
    /**
     * 1. Write a method that reads a line and reverses the words in the line (not the characters)
     * using a stack. For example, given the following input:
     * The quick brown fox jumps over the lazy dog
     * you should get the following output:
     * dog lazy the over jumps fox brown quick The
     */

    /**
     * A method to provide programming 1 object which is: that reads a line and reverses the words in the line
     * @param line a line wanted to reverses
     * @return a string that line's reversed
     */
    public static String getReverseString(String line) {
        return buildReverse(line);
    }

    /**
     * A method to fills the stack
     * @param line a bunch of string
     * @return a stack containing by string
     */
    private static Deque<String> fillStack(String line){
        Deque<String> stringStack = new ArrayDeque<>();
        String [] tokens = line.split(" ");
        for (int i = 0; i < tokens.length; i++) {
            stringStack.push(tokens[i]);
        }
        return stringStack;
    }


    /**
     * A method to build reverse of the line
     * @param line is bunch of string
     * @return line's reversed version as a string
     */
    private static String buildReverse(String line){
        Deque<String> stringStack = fillStack(line);
        StringBuilder result = new StringBuilder();

        while(!stringStack.isEmpty()){
            if (stringStack.size()==1)
                result.append(stringStack.pop());
            else
                result.append(stringStack.pop()+" ");
        }
        return result.toString();
    }

    /**
     * 2. Three different approaches to finding palindromes are discussed in the Analysis section of
     * that case study. Code the first approach.
     * First Approach:
     * you could set up a loop in which you compare the characters at each
     * end of a string as you work toward the middle.
     * If any pair of characters is different, the string can’t be a palindr
     */

    public static boolean polindromeApproach1(String string){
        string = string.toLowerCase(Locale.ROOT);
        int size = string.length();
        for (int i = 0; i < (int) string.length()/2; i++) {
            if (string.charAt(i) != string.charAt(size-i-1))
                return false;
        }
        return true;
    }

    /**
     *
     *3. Code the second approach to find palindromes.
     *
     * Another approach would be to scan a string backward (from right to left) and append each character to the
     * end of a new string, which would become the reverse of the original string. Then you can
     * see whether the strings are equal.
     */

    public static boolean polindromeApproach2(String string){
        string = string.toLowerCase(Locale.ROOT);
        StringBuilder newString = new StringBuilder();
        int size = string.length();
        for (int i = size-1; i >= 0; i--) {
            newString.append(string.charAt(i));
        }
        return string.equals(newString.toString());
    }
}