package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, String> aMap = new HashMap<>();
        // HashMap implements Map
        aMap.put("J", "Jane");
        aMap.put("B", "Bill");
        aMap.put("S", "Sam");
        aMap.put("B1", "Bob");
        aMap.put("B2", "Bill");
        System.out.println("B1 maps to " + aMap.get("B1"));
        System.out.println("Bill maps to " + aMap.get("Bill"));

    }

    /** Reads each word in a data file and stores it in an index
     along with a list of line numbers where it occurs.
     @post Lowercase form of each word with its line
     number is stored in the index.
     @param scan A Scanner object
     */
    public void buildIndex(Scanner scan) {
        Map<String, List<Integer>> index = null;

        int lineNum = 0; // Line number
        // Keep reading lines until done.
        while (scan.hasNextLine()) {
            lineNum++;
            // Extract each token and store it in index.
            String token;
            while ((token = scan.findInLine(PATTERN)) != null) {
                token = token.toLowerCase();
                // Get the list of line numbers for token
                List<Integer> lines = index.getOrDefault(token, new ArrayList<>());
                lines.add(lineNum);
                index.put(token, lines); // Store new list of line numbers
            }
            scan.nextline(); // Clear the scan buffer
        }
    }
}
