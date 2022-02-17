package com.company;
import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.*;

public class Main {


    interface MyFunctionType {
        public int apply(int x, int y);
    }

    public static void main(String[] args) {
	// write your code here
      /*  MyFunctionType mFT = (x,y) -> {
            if (x>y)
                return x;
            return y;
        };

        System.out.println(mFT.apply(15,9));
        BiConsumer<Integer, Integer> mFT2 = (x, y) -> {
            System.out.println("fonk girdi");
        };
        mFT2.accept(3,5);

        Function<Integer, Double> f;
        f = angle -> Math.cos(Math.toRadians(angle));
        show(0, 360, 30, f);

        *///show(0, 360, 30, angle -> Math.cos(Math.toRadians(angle))); //more compact way

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(9);
        nums.add(8);
        nums.add(1);

        nums.forEach(System.out::println);

    }

    /** Displays values associated with function f in the range specified.
     * @param low the lower bound
     * @param high the upper bound
     * @param step the increment
     * @param f the function object
     */
    public static void show(int low, int high, int step,
                            Function<Integer, Double> f) {
        for (int i = low; i <= high; i += step) {
            System.out.println(i + ": " + f.apply(i));
        }
    }
}
