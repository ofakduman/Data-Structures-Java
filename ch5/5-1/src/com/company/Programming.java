package com.company;

/**
 * PROGRAMMING
 * 1. Write a recursive method toNumber that forms the integer sum of all digit characters in a string.
 * For example, the result of toNumber("3ac4") would be 7. Hint: If next is a digit character ('0'
 * through '9'), Character.isDigit(next) is true and the numeric value of next is Character.
 * digit(next, 10).
 * 2. Write a recursive method stutter that returns a string with each character in its argument
 * repeated. For example, if the string passed to stutter is "hello", stutter will return the
 * string "hheelllloo".
 * 3. Write a recursive method that implements the recursive algorithm for searching a string in
 * Self‐Check Exercise 7. The method heading should be
 * public static boolean searchString(String str, char ch)
 */
public class Programming {

    /**
     * A method to sum of all digit characters in the line
     * @param line is a string containing wanted to sum of digits
     * @return sum of digit that are containing numbers
     */
    public static int toNumber(String line){
        if (line == null || line.isEmpty())
            return 0;
        else if (Character.isDigit(line.charAt(0)))
            return Character.getNumericValue(line.charAt(0)) + toNumber(line.substring(1));
        else
            return toNumber(line.substring(1));
    }


    /**
     * A method to returns a string with each character in its argument
     *  * repeated. For example, if the string passed to stutter is "hello", stutter will return the
     *  * string "hheelllloo".
     * @param word to wanted argument to stutter
     * @return words stutter form as a String
     */
    public static String stutter(String word){
        if (word == null || word.isEmpty())
            return "";
        else
            return word.charAt(0) +""+ word.charAt(0) + stutter(word.substring(1));
    }


    /** A method to Write a recursive algorithm that determines whether a specified target character is present
     in a string. It should return true if the target is present and false if it is not. The stopping
     steps should be
     a. a string reference to null or a string of length 0, the result is false
     b. the first character in the string is the target, the result is true.
     The recursive step would involve searching the rest of the string.
     *
     * @param line searched line
     * @param target a char to expected to want in line
     * @return true if char at the line
     *          false if char not at the line
     */

    public static boolean searchString(String line, char target){
        if ( line == null || line.isEmpty())
            return false;
        else if (line.charAt(0) == target)
            return true;
        else
            return searchString(line.substring(1),target);
    }
}
