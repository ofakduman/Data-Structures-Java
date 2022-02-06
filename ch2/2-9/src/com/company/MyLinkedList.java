package com.company;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/** Class KWLinkedList implements a double‐linked list and
 a ListIterator. */
public class MyLinkedList<E> {
// Data Fields
    /** A reference to the head of the list. */
    private Node<E> head = null;
    /** A reference to the end of the list. */
    private Node<E> tail = null;
    /** The size of the list. */
    private int size = 0;

    /** Add an item at position index.
     @param index The position at which the object is to be
     inserted
     @param obj The object to be inserted
     @throws IndexOutOfBoundsException if the index is out
     of range (i < 0 || i > size())
     */
    public void add(int index, E obj) {
        listIterator(index).add(obj);
    }

    public void add(E obj){
        listIterator(size).add(obj);
    }

    public void remove(int index){
        listIterator(index).remove();
    }

    /**
     * Return a ListIterator at the given position
     * @param i The index to start the listIterator at
     * @return A list iterator at the specified index
     */
    public MyListIter listIterator(int i)
    {
        return new MyListIter(i);
    }

    public MyListIter listIterator()
    {
        return new MyListIter(0);
    }


    /** Get the element at position index.
     @param index Position of item to be retrieved
     @return The item at index
     */
    public E get(int index) {
        return listIterator(index).next();
    }

    /** Inner class to implement the ListIterator interface. */
    private class MyListIter implements ListIterator<E> {
        /**
         * A reference to the next item.
         */
        private Node<E> nextItem;
        /**
         * A reference to the last item returned.
         */
        private Node<E> lastItemReturned;
        /**
         * The index of the current item.
         */
        private int index = 0;

        /**
         * Construct a KWListIter that will reference the ith item.
         *
         * @param i The index of the item to be referenced
         */
        public MyListIter(int i) {
            // Validate i parameter.
            if (i < 0 || i > size) {
                throw new IndexOutOfBoundsException("Invalid index " + i);
            }
            lastItemReturned = null; // No item returned yet.
            // Special case of last item.
            if (i == size) {
                index = size;
                nextItem = null;
            } else { // Start at the beginning
                nextItem = head;
                for (index = 0; index < i; index++) {
                    nextItem = nextItem.next;
                }
            }
        }
        /**
         * Inserts obj as the first element of the list
         * @param obj The object to be inserted
         */
        public void addFirst(E obj)
        {
            listIterator().add(obj);
        }

        /**
         * Inserts obj as the last element of the list
         * @param obj The object to be inserted
         */
        public void addLast(E obj)
        {
            listIterator(size).add(obj);
        }

        /**
         * Returns the object at the specified index
         * @param index  The index at which we will return the item
         * @return The object at the specified index
         */
        public E get(int index)
        {
            return listIterator(index).next();
        }

        /**
         * Returns the object at the end of the list
         * @return The object at the end of the list
         * @throws NoSuchElementException if the list is empty
         */
        public E getLast()
        {
            return get(size-1);
        }

        /**
         * Returns the object at the beginning of the list
         * @return The object at the beginning of the list
         * @throws NoSuchElementException if the list is empty
         */
        public E getFirst()
        {
            return get(0);
        }

        /**
         * Return the size of the list
         * @return The size of the list
         */
        public int getSize() {
            return size;
        }
        /**
         * Indicate whether movement forward is defined.
         *
         * @return true if call to next will not throw an exception
         */
        public boolean hasNext() {
            return nextItem != null;
        }

        /**
         * Move the iterator forward and return the next item.
         *
         * @return The next item in the list
         * @throws NoSuchElementException if there is no such object
         */
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            lastItemReturned = nextItem;
            nextItem = nextItem.next;
            index++;
            return lastItemReturned.data;
        }

        /**
         * Indicate whether movement backward is defined.
         *
         * @return true if call to previous will not throw an exception
         */
        public boolean hasPrevious() {
            return (nextItem == null && size != 0)
                    || nextItem.prev != null;
        }

        /**
         * Move the iterator backward and return the previous item.
         *
         * @return The previous item in the list
         * @throws NoSuchElementException if there is no such object
         */
        public E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            if (nextItem == null) { // Iterator is past the last element
                nextItem = tail;
            } else {
                nextItem = nextItem.prev;
            }
            lastItemReturned = nextItem;
            index--;
            return lastItemReturned.data;
        }

        @Override
        public int nextIndex() {
            return 0;
        }

        @Override
        public int previousIndex() {
            return 0;
        }

        @Override
        public void remove() {
            if(lastItemReturned == null) { //invalid expression; must have an item to remove
                throw new IllegalStateException();
            }
            if(lastItemReturned == nextItem) //if the last call made was a previous call
            {
                if (lastItemReturned == head) { //remove at head
                    nextItem = head.next; //move iterator to second item
                    nextItem.prev = null; //pull head out
                    head = nextItem; //move head pointer
                } else if (lastItemReturned == tail) { //removing tail
                    nextItem = tail.prev; //move pointer to item before tail
                    nextItem.next = null; //erase pointer to tail
                    tail = nextItem; //move tail pointer
                    index--; //move index
                } else { //removing from middle
                    //link items around element
                    nextItem.prev.next = nextItem.next;
                    nextItem.next.prev = nextItem.prev;
                    nextItem = nextItem.next; //move pointer
                }
            } else { //if the last call made was a next call
                if (lastItemReturned == head) { //remove at head
                    nextItem.prev = null; //pull head out
                    head = nextItem; //move head pointer
                    index--; //decrease index
                } else if (lastItemReturned == tail) { //removing tail
                    lastItemReturned.prev.next = null;//item before tail points to null
                    nextItem = lastItemReturned.prev;//next item is the new tail
                    tail = nextItem; //update tail
                    index--; //decrease index
                } else { //remove from middle
                    lastItemReturned.prev.next = nextItem;
                    nextItem.prev = lastItemReturned.prev;
                    index--; //decrease index
                }
            }
            size--; //Decrease size, regardless of where the element is removed from
            lastItemReturned = null;
        }



        @Override
        public void set(E e) {

        }

        /**
         * Add a new item between the item that will be returned
         * by next and the item that will be returned by previous.
         * If previous is called after add, the element added is
         * returned.
         *
         * @param obj The item to be inserted
         */
        public void add(E obj) {
            if (head == null) { // Add to an empty list.
                head = new Node<>(obj);
                tail = head;
            } else if (nextItem == head) { // Insert at head.
                // Create a new node.
                Node<E> newNode = new Node<>(obj);
                // Link it to the nextItem.
                newNode.next = nextItem;  // Step 1
                // Link nextItem to the new node.
                nextItem.prev = newNode;  // Step 2
                // The new node is now the head.
                head = newNode; // Step 3
            } else if (nextItem == null) { // Insert at tail.
                // Create a new node.
                Node<E> newNode = new Node<>(obj);
                // Link the tail to the new node.
                tail.next = newNode; // Step 1
                // Link the new node to the tail.
                newNode.prev = tail; // Step 2
                // The new node is the new tail.
                tail = newNode; // Step 3
            } else { // Insert into the middle.
                // Create a new node.
                Node<E> newNode = new Node<>(obj);
                // Link it to nextItem.prev.
                newNode.prev = nextItem.prev; // Step 1
                nextItem.prev.next = newNode; // Step 2
                // Link it to the nextItem.
                newNode.next = nextItem; // Step 3
                nextItem.prev = newNode; // Step 4
            }
            // Increase size and index and set lastItemReturned.
            size++;
            index++;
            lastItemReturned = null;
        } // End of method add.
    }

    private static class Node<E>
    {
        //data fields
        private E data; // reference to the data
        private Node<E> next; // reference to the next node
        private Node<E> prev; //reference to previous node

        //Constructors

        /**
         * Create a new node with a null next field.
         * @param dataItem The data stored
         */
        private Node(E dataItem)
        {
            data = dataItem;
            next = null;
        }

        /**
         * Create a new node that references another node
         * @param dataItem The data stored
         * @param nodeRef The node referenced by new node
         */
        private Node(E dataItem, Node<E> nodeRef)
        {
            data = dataItem;
            next = nodeRef;
        }
    }
}