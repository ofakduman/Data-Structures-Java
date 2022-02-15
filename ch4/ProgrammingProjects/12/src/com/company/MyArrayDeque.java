package com.company;


import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

public class MyArrayDeque <E> extends ArrayQueue2<E> implements Deque<E> {

    @Override
    public void addFirst(Object o) {
        add(0,(E) o);
    }


    @Override
    public void addLast(Object o) {
        add(o);
    }

    @Override
    public boolean offerFirst(E o) {
         add(0,o);
         return true;
    }

    @Override
    public boolean offerLast(Object o) {
        return add(o);
    }

    @Override
    public E removeFirst() {
        return remove(0);
    }

    @Override
    public E removeLast() {
        return remove();
    }

    @Override
    public E pollFirst() {
        if (super.getSize() == 0)
            return null;

        return remove(0);
    }

    @Override
    public E pollLast() {
        return poll();
    }

    @Override
    public E getFirst() {
        return get(0);
    }

    @Override
    public E getLast() {
        return get(size()-1);
    }

    @Override
    public E peekFirst() {
        if (size()==0)
            return null;
        return get(0);
    }

    @Override
    public E peekLast() {
        if (size() == 0)
            return null;
        return get(size()-1);
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        for (int i = 0; i <size(); i++) {
            if (get(i).equals(o)) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        for (int i = size()-1; i <=0; i--) {
            if (get(i).equals(o)) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean offer(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void push(Object o) {
        add(o);

    }

    @Override
    public E pop() {
        if (size()==0)
            return null;
        else return(remove());

    }

    @Override
    public Iterator descendingIterator() {
        return null;
    }

}
