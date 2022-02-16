package com.company;

public class Main {
    /**
     * 5. As discussed in Chapter 3, a palindrome is a word that reads the same left to right as right to left.
     * Write a recursive method that determines whether its argument string is a palindrome.
     */
    public static void main(String[] args) {
        String str = "";
        System.out.println(isPolindrome(str));
    }

    public static boolean isPolindrome(String str){
        if (str.length()==0)
            return true;
        else
            return isPolindrome(str, 0, str.length());
    }

    private static boolean isPolindrome(String str, int step, int len){
        if (len/2<step)
            return true;
        else if (str.charAt(step) != str.charAt(len - (step+1)))
            return false;
        else
            return isPolindrome(str, step+1, len);
    }
}
