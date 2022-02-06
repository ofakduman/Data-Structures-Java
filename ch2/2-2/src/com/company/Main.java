package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<String> myList = new ArrayList<>();

        myList.add("Bashful");
        myList.add("Awful");
        myList.add("Jumpy");
        myList.add("Happy");
        myList.add(2, "Doc");

        System.out.println(myList.size());
    }
}
