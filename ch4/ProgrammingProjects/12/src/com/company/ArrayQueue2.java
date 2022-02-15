package com.company;

import java.util.*;

/** Implements the Queue interface using a circular array. */
public class ArrayQueue2<E> extends MyArrayList<E>
        implements Queue<E> {

    @Override
    public boolean offer(E e) {
        return add(e);
    }

    @Override
    public E remove() {
        return remove(0);
    }

    @Override
    public E poll() {
        if (super.getSize() == 0)
            return null;

        return remove(super.getSize());
    }

    @Override
    public E element() {
        return null;
    }

    @Override
    public E peek() {
        return get(size()-1);
    }

    @Override
    public int size() {
        return super.getSize();
    }

    @Override
    public boolean isEmpty() {
        if (size()==0)
            return true;
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}