package com.company;

/** A Node is the building block for a double‐linked list. */
public class Node<E> {
    /** The data value. */
    public E data;
    /** The link to the next node. */
    public Node<E> next = null;
    /** The link to the previous node. */
    public Node<E> prev = null;

    /** Construct a node with the given data value.
     @param dataItem The data value
     */
    public Node(E dataItem) {
        data = dataItem;
    }
}
