package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello there");
        Stack<String> names = new Stack<>();
        names.push("Jonathan");
        names.push("Dustin");
        names.push("Robin");
        names.push("Debbie");
        names.push("Rich");
        System.out.println(names.isEmpty());
        System.out.println(names);
        names.push("Jane");
        names.push("Joseph");
        String top = names.pop();
        String nextTop = names.peek();

        System.out.println("top:" + top + "\nnextTop: " + nextTop);

        while (!names.isEmpty()) {
            System.out.println(names.pop());
        }


    }
}
