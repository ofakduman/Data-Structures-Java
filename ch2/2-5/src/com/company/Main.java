package com.company;

public class Main {

    public static void main(String[] args) {
        MySingleLinkedList<String> names= new MySingleLinkedList<>();
        names.myAdd(0,"Tom");
        names.add(1,"Dick");
        names.add(2,"Harry");
        names.add(3,"Sam");
        names.print();
        names.programming1();
        System.out.println("Yeni Liste");
        names.print();
        System.out.println(names.indexOf("Tom"));


    }
}
