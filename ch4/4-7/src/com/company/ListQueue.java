package com.company;

import java.util.*;
/** Implements the Queue interface using a single‐linked list. */
public class ListQueue<E> extends AbstractQueue<E>
        implements Queue<E> {
    // Data Fields
    /** Reference to front of queue. */
    private Node<E> front;
    /** Reference to rear of queue. */
    private Node<E> rear;
    /** Size of queue. */
    private int size;
    // Insert inner class Node<E> for single‐linked list here.
    // (See Listing 2.1.)
    // Methods
    /** Insert an item at the rear of the queue.
     @post item is added to the rear of the queue.
     @param item The element to add
     @return true (always successful)
     */
    @Override
    public boolean offer(E item) {
        // Check for empty queue.
        if (front == null) {
            rear = new Node<>(item);
            front = rear;
        } else {
            // Allocate a new node at end, store item in it, and
            // link it to old end of queue.
            rear.next = new Node<>(item);
            rear = rear.next;
        }
        size++;
        return true;
    }
/** Remove the entry at the front of the queue and return it
 if the queue is not empty.
 @post front references item that was second in the queue.
 @return The item removed if successful, or null if not
 */
@Override
public E poll() {
    E item = peek();
    // Retrieve item at front.
    if (item == null)
        return null;
    // Remove item at front.
    front = front.next; size--;
    return item;
    // Return data at front of queue.
}
    /** Return the item at the front of the queue without removing it.
     @return The item at the front of the queue if successful;
     return null if the queue is empty
     */
    @Override
    public E peek() {
        if (size == 0)
            return null;
        else
            return front.data;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }


    private class Node<E>{
        private E data;
        private Node<E> next;

        public Node(Node<E> nodeRef, E _data){
            data =_data;
            next = nodeRef;
        }
        public Node(E elData){
            data = elData;
            next = null;
        }
    }
    // Insert class Iter and other required methods.
}