package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        StackInt<Character> s = new ListStack<>();
        s.push('H');
        s.push('a');
        s.push('p');
        s.push('p');
        s.push('y');
        s.push('i');
        s.push('s');
        char ch1 = s.pop(); s.pop();
        s.push(' ' );
        char ch2 = s.peek();

        LinkedStack<Character> s2 = new LinkedStack<>();
        s2.push('H');
        s2.push('a');
        s2.push('p');
        s2.push('p');
        s2.push('y');
        s2.push('i');
        s2.push('s');
        ch1 = s2.pop(); s2.pop();
        s2.push(' ' );
        ch2 = s2.peek();



        System.out.println("ch1: " + ch1 + "\tch2: " + ch2);
        System.out.println("linkedSize: " + s2.size());
    }
}
