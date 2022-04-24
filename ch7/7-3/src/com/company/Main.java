package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashTableOpen<Integer, String> hot = new HashTableOpen<>();
        hot.put(31,"ali");
        hot.put(28,"ali");
        hot.put(15,"ali");
        hot.put(3,"ali");
        hot.put(-9,"ali");
        hot.put(104,"kamil");
        hot.remove(-9);
        System.out.println(hot.toString());
    }
}
