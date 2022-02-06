package com.company;

public class Main {

    public static void main(String[] args) {
        int[] anArray = {0, 1, 2, 3, 4, 5, 6, 7};
        for (int i = 3; i < anArray.length - 1; i++)
        anArray[i + 1] = anArray[i];
        for (int i = 0; i < anArray.length; i++) {
            System.out.print(anArray[i]+"  ");
        }

        int [] anArray2 = {0, 1, 2, 3, 4, 5, 6, 7};
        for (int i = anArray2.length - 1; i > 3; i--)
            anArray2[i] = anArray2[i - 1];

        System.out.println();
        for (int i = 0; i < anArray.length; i++) {
            System.out.print(anArray2[i]+"  ");
        }

        System.out.println();
        MyArrayList<Integer> myArray = new MyArrayList<>(1000000000);
        myArray.add(0);
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.add(4);
        myArray.add(5);
        myArray.add(6);
        myArray.add(7);
        myArray.add(8);
        myArray.add(9);
        myArray.add(10);
        myArray.add(11);


        print(myArray);

        System.out.println();
        myArray.removeAddLast(3);
        print(myArray);
        System.out.println();
        System.out.println(myArray.indexOf(3));

    }
    
    
    public static void print(MyArrayList<Integer> myArray){
        for (int i = 0; i < myArray.getSize(); i++) {
            System.out.print(myArray.get(i)+" ");
        }
    }
}
