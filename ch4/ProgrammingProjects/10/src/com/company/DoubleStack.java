package com.company;

import java.util.Arrays;

public class DoubleStack<E> {
    private E [] theData;
    private int size1 = 0;
    private int size2 = 0;
    private int capacity = 0;
    private final static int INITIALCAPACITY = 10;


    DoubleStack(){
        theData = (E[]) new Object[INITIALCAPACITY];
        capacity = INITIALCAPACITY;
    }

    DoubleStack(int capacity){
        theData = (E[]) new Object[capacity];
        this.capacity = capacity;
    }

    public E push(int stackNo,E element){
        if (size1+size2 == capacity)
            reallocate();

        if (stackNo==1){
            theData[size1++] = element;
        }
        else if (stackNo == 2){
            theData[capacity-size2-1] = element;
            size2++;
        }
        return element;
    }

    private void reallocate(){
        capacity = 2*capacity;
        theData = Arrays.copyOf(theData, capacity);
    }

    public E pop(int stackNo){
        E temp = null;
        if (stackNo == 1){
            if (size1 == 0)
                throw new ArrayIndexOutOfBoundsException();
            temp = theData[size1-1];
            size1--;
        }
        else if (stackNo == 2){
            if(size2 == 0)
                throw new ArrayIndexOutOfBoundsException();
            temp = theData[capacity-size2];
            size2--;
        }
        return temp;
    }

    public E peek(int stackNo){
        if (stackNo == 1){
            if (size1==0)
                return null;
            return theData[size1-1];
        }
        else if (stackNo == 2){
            if (size2==0) {
                return null;
            }
            return theData[capacity-size2];
        }

        return null;
    }

    public boolean empty(int stackNo){
        if (stackNo == 1)
            return size1 == 0;

        else if(stackNo == 2)
            return size2 == 0;

        return false;
    }

    public boolean isEmpty(int stackNo){
        return empty(stackNo);
    }


    public double getSize(int stackNo){
        if (stackNo==1)
            return size1;
        else if (stackNo == 2)
            return size2;
        return -1;
    }

    public double getSize(){
        return theData.length;
    }

}
