package com.company;

public class Main {

    public static void main(String[] args) {

        Programming p = new Programming();

        System.out.println(p.toNumber("3ac4"));
        String s = "hello";
        System.out.println(p.stutter(s));



    }

    /** Recursive method length (in RecursiveMethods.java).
     @param str The string
     @return The length of the string
     */
    public static int len(String str){

        if (str.isEmpty())
            return 0;
        else
            return 1 + len(str.substring(1)) ;
    }


    /** Recursive method printChars (in RecursiveMethods.java).
     post: The argument string is displayed, one character per line.
     @param str The string
     */

    public static void print(String str){
        if (str==null || str.isEmpty())
            return ;
        else {
            print(str.substring(1));
            System.out.println(str.charAt(0));
        }
    }

    public static int mystery(int n) {
        if (n == 0)
            return 0;
        else
            return n * n + mystery(n - 1);
    }

    public static int mystery2(int n) {
        if (n == 1)
            return 1;
        else
            return n * n + mystery(n - 1);
    }

    public static boolean present(String line, char target){
        if ( line == null || line.isEmpty())
            return false;
        else if (line.charAt(0) == target)
            return true;
        else
            return present(line.substring(1),target);
    }







}
