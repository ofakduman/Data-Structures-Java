package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = "onlar acimi bilemez hacim";
        System.out.println(s);
        String news = Programming.getReverseString(s);
        System.out.println(news);

        System.out.println(        Programming.polindromeApproach2("Kayak"));
        System.out.println(        Programming.polindromeApproach2("AMA"));
        System.out.println(        Programming.polindromeApproach2("AAAA"));

    }
}
