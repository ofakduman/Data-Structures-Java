package com.company;

public class Main {

    /**
     * 2. Provide a complete implementation of class LinkedStack and test it on each of the applications in
     * this chapter.
     */
    public static void main(String[] args) {
        StackInt<String> s = new LinkedStack<>();
        s.push("test");
        System.out.println(s.peek());
        System.out.println(s.pop());


    }
}
