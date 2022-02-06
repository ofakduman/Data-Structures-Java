package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class OrderedList<E extends Comparable<E>> implements Iterable{
    private List<E> theList = new LinkedList<>();

    public void add(E obj) {
        ListIterator<E> iter = theList.listIterator();
        // Find the insertion position and insert.
        while (iter.hasNext()) {
            if (obj.compareTo(iter.next()) < 0) {
                // Iterator has stepped over the first element
                // that is greater than the element to be inserted.
                // Move the iterator back one.
                iter.previous();// Insert the element.
                iter.add(obj);
                // Exit the loop and return.
                return;
            }
        }
        // assert: All items were examined and no item is larger than
        // the element to be inserted.
        // Add the new item to the end of the list.
        iter.add(obj);
    }

    public void add2(E obj){
        ListIterator<E> iter = theList.listIterator(theList.size());
        while (iter.hasPrevious()){
            if (obj.compareTo(iter.previous()) > 0) {
                iter.next();// Insert the element.
                iter.add(obj);
                // Exit the loop and return.
                return;
            }
        }
        iter.add(obj);

    }

    /** Returns the element at the specified position.
     @param index The specified position
     @return The element at position index
     */
    public E get(int index) {
        return theList.get(index);
    }
    /** Returns an iterator to this OrderedList.
     @return The iterator, positioning it before the first element
     */
    public Iterator<E> iterator() {
        return theList.iterator();
    }

    /**
     *  A method to return size of the containing linked list size
     * @return size of the list
     */
    public int size(){
        return theList.size();
    }


    /**
     *  A method to remove target element int he list
     * @param target element to wanted to remove from list
     */
    public void remove(E target) {
        ListIterator<E> iter = theList.listIterator();
        while (iter.hasNext()) {
            if (target.equals(iter.next())) {
                iter.remove();
                return;
            }
        }
    }


    /**
     *  A method to remove target int index element int he list
     * @param index
     */
    public void removeIndex(int index){
        theList.listIterator(index).remove();
    }

}
