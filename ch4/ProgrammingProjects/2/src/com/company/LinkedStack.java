package com.company;

import java.util.NoSuchElementException;

/** Class to implement interface StackInt<E> as a linked list. */
public class LinkedStack<E> implements StackInt<E> {
    // Insert inner class Node<E> here. (See Listing 2.1)
    // Data Fields
    /**
     * The reference to the first stack node.
     */
    private Node<E> topOfStackRef = null;

    private int size = 0;
/** Insert a new item on top of the stack.
 @post The new item is the top item on the stack.
 All other items are one position lower.
 @param obj The item to be inserted
 @return The item that was inserted
 */
@Override
public E push(E obj) {
    topOfStackRef = new Node<>(obj, topOfStackRef);
    size++;
    return obj;
}
    /** Remove and return the top item on the stack.
     @pre The stack is not empty.
     @post The top item on the stack has been
     removed and the stack is one item smaller.
     @return The top item on the stack
     @throws NoSuchElementException if the stack is empty
     */
    @Override
    public E pop() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        else {
            E result = topOfStackRef.data;
            topOfStackRef = topOfStackRef.next;
            size--;
            return result;
        }
    }
    /** Return the top item on the stack.
     @pre The stack is not empty.
     @post The stack remains unchanged.
     @return The top item on the stack
     @throws NoSuchElementException if the stack is empty
     */
    @Override
    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException ();
        }
        else {
            return topOfStackRef.data;
        }
    }
    /** See whether the stack is empty.
     @return true if the stack is empty
     */
    @Override
    public boolean isEmpty() {
        return topOfStackRef == null;
    }

    private class Node<E> {
        /** The data value. */
        private E data;
        /** The link to the next node. */
        private Node<E> next = null;
        /** The link to the previous node. */
        private Node<E> prev = null;

        /** Construct a node with the given data value.
         * @param dataItem The data value
         * @param refNode
         */
        public Node(E dataItem, Node<E> refNode) {
            data = dataItem;
            next = refNode;
        }
    }

    /** Programming
     * 1. Write a method size for class LinkedStack<E> that returns the number of elements currently on a LinkedStack<E>.
     */

    public int size(){
        return size;
    }
}
