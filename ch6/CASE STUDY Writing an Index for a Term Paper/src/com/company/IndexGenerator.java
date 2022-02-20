package com.company;

import java.io.*;
import java.util.*;
/** Class to build an index. */
public class IndexGenerator {
    // Data Fields
    /** Tree for storing the index. */
    private final TreeSet<String> index;
    /** Pattern for extracting words from a line. A word is a string of
     one or more letters or numbers or ' characters */
    private static final String PATTERN =
            "[\\p{L}\\p{N}']+";
    // Methods
    public IndexGenerator() {
        index = new TreeSet<String>();
    }
    /** Reads each word in a data file and stores it in an index
     along with its line number.
     post: Lowercase form of each word with its line
     number is stored in the index.
     @param scan A Scanner object
     */
    public void buildIndex(Scanner scan) {
        int lineNum = 0; // line number
        // Keep reading lines until done.
        while (scan.hasNextLine()) {
            lineNum++;
            // Extract each token and store it in index.
            String token;
            while ((token = scan.findInLine(PATTERN)) != null) {
                token = token.toLowerCase();
                index.add(String.format("%s, %3d", token, lineNum));
            }
            if(scan.hasNextLine())
                scan.nextLine(); // Clear the scan buffer
        }
    }
    /** Displays the index, one word per line. */
    public void showIndex() {
        index.forEach(next -> System.out.println(next));
    }
    public void showIndex2() {
        // Use an iterator to access and display tree data.
        for (String next : index) {
            System.out.println(next);
        }
    }
}
