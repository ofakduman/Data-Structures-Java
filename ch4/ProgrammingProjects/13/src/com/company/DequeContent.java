package com.company;

import java.util.Deque;
import java.util.LinkedList;

public class DequeContent {
    private Deque<Character> elData = new LinkedList<>();

    public void storeDeque( String line){
        for (int i = 0; i < line.length(); i++) {
            elData.add(line.charAt(i));
        }
    }

    public void display(){

        Deque<Character> newDq = new LinkedList<>();
        newDq.addAll(elData);
        Character element = null;

        while(!newDq.isEmpty()) {
            element = newDq.pop();
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public void print(){
        System.out.println(elData);
    }

    public  void reverseOrder(){
        Deque newDq = new LinkedList<>();
        Character ch = null;
        while(!elData.isEmpty()){
            ch = elData.removeLast();
            newDq.addLast(ch);
        }
        elData = newDq;
    }
}
