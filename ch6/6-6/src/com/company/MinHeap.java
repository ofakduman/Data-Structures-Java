package com.company;

import java.util.*;

public class MinHeap <E extends Comparable<E>>{
    private static final int INITIAL_CAPACITY = 10;
    private int size = 0;
    private List<E> elData ;

    MinHeap(){
        elData = new ArrayList<>(INITIAL_CAPACITY);
    }
    MinHeap(int initial_capacity){
        elData = new ArrayList<>(initial_capacity);
    }

    private int getLeftChildIndex(int parent_index){ return 2*parent_index+1;}
    private int getRightChildIndex(int parent_index){ return 2*parent_index+2;}
    private int getParentIndex(int child_index){ return (child_index-1)/2;}

    private boolean hasLeftChild(int index){ return getLeftChildIndex(index)<elData.size();}
    private boolean hasRightChild(int index){ return getRightChildIndex(index)<elData.size();}
    private boolean hasParent(int index){ return getParentIndex(index)>=0;}

    private E leftChild(int index){return elData.get(getLeftChildIndex(index));}
    private E rightChild(int index){return elData.get(getRightChildIndex(index));}
    private E parent(int index){return elData.get(getParentIndex(index));}

    private void swap(int index1, int index2){
        E temp = elData.get(index1);
        elData.set(index1,elData.get(index2));
        elData.set(index2,temp);
    }

    public E peek(){
        if (elData.size() == 0)
            throw new IllegalStateException("Heap is empty!");
        return elData.get(elData.size()-1);
    }

    public E pop(){
        if (elData.size() == 0){
            throw new IllegalStateException("Heap is empty!");
        }
        E popedOne = elData.get(0);
        elData.set(0,elData.get(elData.size()-1));
        elData.remove(elData.size()-1);
        heapifyDown();
        return popedOne;
    }


    public void add(E anItem){
        elData.add(anItem);
        heapifyUp();
    }

    public void heapifyUp(){
        int index = elData.size()-1;
        while(hasParent(index) && (parent(index).compareTo(elData.get(index))==1)){
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }

    public void heapifyDown(){
        int index = 0;
        while (hasLeftChild(index)){
            int smallerChildIndex = getLeftChildIndex(index);

            if (hasRightChild(index) && (rightChild(index).compareTo(leftChild(index))==-1)){
                smallerChildIndex = getRightChildIndex(index);
            }
            if (elData.get(index).compareTo(elData.get(smallerChildIndex))==-1)
                break;
            else
                swap(index,smallerChildIndex);
            index = smallerChildIndex;
        }
    }

    public void print(){
        Iterator it= elData.listIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
