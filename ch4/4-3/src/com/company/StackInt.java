package com.company;

import java.util.NoSuchElementException;

public interface StackInt<E> {

    public E push(E obj);
    public E peek();
    public E pop();
    public boolean isEmpty();

}
