package com.company;

public class Main {

    public static void main(String[] args) {
        LinkedListRec<String> aList = new LinkedListRec<String>();
        aList.add("bye");
        aList.add("hello");
        System.out.println(aList.size() + ", " + aList.toString());
        aList.replace("hello", "welcome");
        aList.add("OK");
        aList.remove("bye");
        aList.remove("hello");
        System.out.println(aList.size() + ", " + aList.toString());

        aList.insertBefore("velhasil", "OK");
        aList.addHead("kamil");
        aList.insertBefore("kamil","kazim");
        aList.insertBefore( "OK", "velhasil");
        aList.insertBefore( "OK", "kunteper");
        System.out.println(aList.size() + ", " + aList.toString());
        aList.reverse();

        aList.insert("mistral",0);
        aList.insert("pecete", aList.size()-1);
        System.out.println(aList.size() + ", " + aList.toString());
        aList.remove(0);
        System.out.println(aList.size() + ", " + aList.toString());
        aList.remove(aList.size()-1);
        System.out.println(aList.size() + ", " + aList.toString());
        aList.remove(3);
        System.out.println(aList.size() + ", " + aList.toString());


    }
}
