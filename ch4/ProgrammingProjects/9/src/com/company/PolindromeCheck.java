package com.company;

import java.util.Stack;

/**
 * A class which has one method for check line(given string) is polindrom or not with given conditions:
 * 9. Another approach to checking for palindromes would be to store the characters of the string being
 * checked in a stack and then remove half of the characters, pushing them onto a second stack. When
 * you are finished, if the two stacks are equal, then the string is a palindrome. This works fine if the
 * string has an even number of characters. If the string has an odd number of characters, an additional
 * character should be removed from the original stack before the two stacks are compared. It
 * does not matter what this character is because it doesn’t have to be matched. Design, code, and test
 * a program that implements this approach.
 */
public class PolindromeCheck {
    public boolean isPolindrome(String line){
        int counter = 0;
        int len = line.length();
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for (int i = 0; i < len; i++) {
            stack1.push(line.charAt(i));
        }

        for (int i = 0; i < (int) len/2; i++) {
            stack2.push(stack1.pop());
        }

        if (len%2==1 && len>1)
            stack1.pop();

        return stack1.equals(stack2);
    }
}
