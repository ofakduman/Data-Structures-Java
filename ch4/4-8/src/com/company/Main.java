package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Deque<String> s = new LinkedList<>();

        String k = s.peek();
        System.out.println(k);

        Deque<String> stackOfStrings = new ArrayDeque<>();

        stackOfStrings.push("Hello");
        String one = stackOfStrings.pop();
        if (!stackOfStrings.isEmpty())
            System.out.println(stackOfStrings.peek());
        stackOfStrings.push("Good bye");
        for (String two : stackOfStrings)
            System.out.println(two);

        stackOfStrings.offer("away");
        String three = stackOfStrings.remove();
        System.out.println("three: " + three);

    }
}
