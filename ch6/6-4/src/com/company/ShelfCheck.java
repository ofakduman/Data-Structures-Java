package com.company;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

@java.lang.FunctionalInterface
interface FunctionalInterface{
    public void apply();
}

public class ShelfCheck {
    public static void main(String[] args){


//        BiConsumer<String , String> f1= (x, y) -> {
//            System.out.println(x);
//            System.out.println("_________________");
//            System.out.println(y);
//            System.out.println("_________________");
//            System.out.println("_________________");
//        };


        //fq(->System.out.println("Hello"));

        printWithFunc((x,y)->{
            System.out.println(x);
            System.out.println("_________________");
            System.out.println(y);
            System.out.println("_________________");
            System.out.println("_________________");
        });


        sqrtmm((x,y)->Math.sqrt((x*x + y*y)));

        bigger((x)-> x>1);
        //System.out.println(4>0);
    }

    public static void fq(FunctionalInterface fi){
        fi.apply();
    }

    public static void printWithFunc(BiConsumer<String, String> bic){
        bic.accept("hello", "Mr. President");
    }

    public static void sqrtmm(BiConsumer<Integer, Integer> f){
        f.accept(3,7);
    }

    public static void bigger(Function<Double, Boolean> f){
        System.out.println("fonksiyonun icindeki + "+f.apply(+44.0));
    }

}
