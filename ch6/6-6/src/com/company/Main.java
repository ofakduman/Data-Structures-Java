package com.company;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
	// write your code here
        final double P1 = 0.8;
        final double P2 = 0.2;
        Queue<PrintDocument> printQueue =
                new KWPriorityQueue<>(25, (left, right) -> {
            double leftValue = P1 * left.getSize() + P2 * left.getTimeStamp();
            double rightValue = P1 * right.getSize() + P2 * right.getTimeStamp();
            return Double.compare(leftValue, rightValue);
        });
    }
}
