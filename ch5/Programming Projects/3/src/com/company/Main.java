package com.company;

/**
 *  3. Write a recursive method that converts a decimal integer to a binary string. Write a recursive
 * method that converts a binary string to a decimal integer.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(toBinary(10));
        System.out.println(Math.pow(5,3));
        String s = "1010";
        System.out.println(toDecimal(s));
    }

    public static int toDecimal(String binary){

        return toDecimal(binary, 0);
    }

    static int toDecimal(String binary,int i)
    {
        // If we reached last character
        int n = binary.length();
        if (i == n-1)
            return binary.charAt(i) - '0';

        // Add current tern and recur for
        // remaining terms
        return ((binary.charAt(i) - '0') << (n-i-1)) +
                toDecimal(binary, i+1);
    }


    public static int toBinary(int decimal_number)
    {
        if (decimal_number == 0)
            return 0;

        else

            return (decimal_number % 2 + 10 *
                    toBinary(decimal_number / 2));
    }


}
