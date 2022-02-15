package com.company;

public class Main {
    /**
     * 12. Write a class MyArrayDeque that extends class ArrayQueue.
     * Class MyArrayDeque should implement the Deque interface.
     * Test your new class by comparing its operation to that of the ArrayDeque
     * class in the Java Collections Framework.
     */

    public static void main(String[] args) {
        MyArrayDeque<String> ad = new MyArrayDeque<>();

        ad.add("ne");
        ad.add("sen");
        ad.add("yagmursun");
        ad.add("nedeben");
        ad.add("camur");


    }
}
