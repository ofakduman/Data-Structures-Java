package com.company;

import java.util.*;
/** Class ListStack<E> implements the interface StackInt<E> as
 an adapter to the List.
 @param <E> The type of elements in the stack.
 */
public class ListStack<E> implements StackInt<E> {
    /** The List containing the data */
    private List<E> theData;
    /** Construct an empty stack using an ArrayList as the container. */
    public ListStack() {
        theData = new ArrayList<>();
    }
    /** Push an object onto the stack.
     @post The object is at the top of the stack.
     @param obj The object to be pushed
     @return The object pushed
     */
    @Override
    public E push(E obj) {
        theData.add(obj);
        return obj;
    }
    /** Peek at the top object on the stack.
     @return The top object on the stack
     @throws NoSuchElementException if the stack is empty
     */
    @Override
    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return theData.get(theData.size() - 1);
    }
    /** Pop the top object off the stack.
     @post The object at the top of the stack is removed.
     @return The top object, which is removed
     @throws NoSuchElementException if the stack is empty
     */
    @Override
    public E pop() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return theData.remove(theData.size() - 1);
    }
    /** See whether the stack is empty.
     @return true if the stack is empty
     */
    @Override
    public boolean isEmpty() {
        return theData.isEmpty();
    }

    /**
     * Programming
     *2- Write method size for the ArrayList implementation.
     */

    public int size(){
        return theData.size();
    }

}