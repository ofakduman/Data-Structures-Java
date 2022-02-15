package com.company;

import java.util.Stack;

public class Main {

    /**
     * Operating systems sometimes use a fixed array storage area to accommodate a pair of stacks such
     * that one grows from the bottom (with its first item stored at index 0) and the other grows from the
     * top (with its first item stored at the highest array index). As the stacks grow, the top of the stacks
     * will move closer together.
     * [0]
     * stack 1 stack 2
     * [top1] [top2]
     * The stacks are full when the two top elements are stored in adjacent array elements (top2 == top1 +
     * 1). Design, code, and test a class DoubleStack that implements this data structure. DoubleStack
     * should support the normal stack operations (push, pop, peek, empty, etc.). Each stack method
     * should have an additional int parameter that indicates which of the stacks (1 or 2) is being
     * processed. For example, push(1, item) will push item onto stack 1.
     */

    public static void main(String[] args) {
        DoubleStack<String> ds = new DoubleStack<>();

        ds.push(1,"Ahmet");
        ds.push(2,"Veli");

        ds.push(1,"Kayser");
        ds.push(1,"Souze");
        ds.push(1,"Hamdi");
        ds.push(2,"Lanayda");
        ds.push(2,"Kemal");
        ds.push(2,"Gecer");
        ds.push(2,"Talim");
        ds.push(2,"Terbiye");
        ds.push(2,"Kevase");
        ds.push(2,"Gucci");

        System.out.println(ds.peek(1));
        System.out.println(ds.peek(2));

        System.out.println("size1: "+ds.getSize(2));
        System.out.println("size2: "+ds.getSize(1));

        System.out.println("total len: " + ds.getSize());

    }
}
