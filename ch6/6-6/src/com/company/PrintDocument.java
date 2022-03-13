package com.company;

public class PrintDocument implements Comparable{

    private int number_of_bytes;
    private int time_stamp;

    @Override
    public int compareTo(Object o) {
        return 0;
    }
    public int getSize(){
        return number_of_bytes;
    }

    public int getTimeStamp(){
        return time_stamp;
    }
}
