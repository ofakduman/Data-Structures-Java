package com.company;

import java.util.Arrays;

public class MyArrayList<E> {
    private static int INITIAL_CAPACITY = 10;
    private E[] elData;
    private int size;   //current size
    private int capacity = 10;

    @SuppressWarnings("unchecked")
    public MyArrayList(){
        capacity = INITIAL_CAPACITY;
        elData = (E[]) new Object [capacity];
    }

    public MyArrayList(int initialCapacity){
        capacity = initialCapacity;
        elData = (E[]) new Object [capacity];
    }

    public boolean add(E anEntry){
        if (size == capacity)
            reallocate();
        elData[size++] = anEntry;
        return true;
    }

    public void add(int index, E anEntry){
        if (index<0 || index>=size)
            throw new ArrayIndexOutOfBoundsException(index);
        if (size == capacity)
            reallocate();

        //shift data elements from index to size-1
        for (int i = size; i > index ; i--)
            elData[i] = elData[i-1];
        //add element in the data
        elData[index] = anEntry;
        size++;
    }

    public E get(int index){
        if (index < 0 || index>=size)
            throw new ArrayIndexOutOfBoundsException(index);
        return elData[index];
    }

    public E set(int index, E anEntry){
        if (index<0||index>=size)
            throw new ArrayIndexOutOfBoundsException(index);
        E oldValue = elData[index];
        elData[index] = anEntry;
        return oldValue;
    }

    public E remove(int index){
        if (index<0 || index>=size)
            throw new ArrayIndexOutOfBoundsException(index);
        E removedData = elData[index];
        for (int i = index; i < size-1 ; i++) {
            elData[i]=elData[i+1];
        }
        size--;
        return removedData;
    }

    private void reallocate(){
        capacity = 2*capacity;
        elData = Arrays.copyOf(elData, capacity);
    }

    public void removeAddLast(int index){
        if (index<0 || index>=size)
            throw new ArrayIndexOutOfBoundsException(index);

        E removed = elData[index];
        for (int i = index; i < size-1; i++)
            elData[i] = elData[i+1];

        elData[size-1] = removed;
    }

    public int getSize(){return size;}

    public int indexOf(E anEntry){
        for (int i = 0; i < size; i++) {
            if (elData[i].equals(anEntry))
                return i;
        }
        return -1;
    }
}
