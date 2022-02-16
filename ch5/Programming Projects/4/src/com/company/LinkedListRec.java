package com.company;

import java.util.Objects;

/**
 * PROGRAMMING
 * 1. Write an equals method for the LinkedListRec class that compares this LinkedListRec object to
 * one specified by its argument. Two lists are equal if they have the same number of nodes and store
 * the same information at each node. Don’t use the size method.
 * 2. Write a search method that returns true if its argument is stored as the data field of a
 * LinkedListRec node and returns false if its argument is not stored in any node.
 * 3. Write a recursive method insertBefore that inserts a specified data object before the
 * first occurrence of another specified data object. For example, the method call
 * aList.insertBefore(target, inData) would insert the object referenced by inData in a
 * new node just before the first node of aList that stores a reference to target as its data.
 * 4. Write a recursive method reverse that reverses the elements in a linked list.
 * 5. Code method insert in Self‐Check Exercise 3.
 * 6. Code method remove in Self‐Check Exercise 4.
 */

public class LinkedListRec<E> {
    /** The list head */
    private Node<E> head;
    // Insert inner class Node<E> here. See Listing 2.1.

    /** Finds the size of a list.
     @param head The head of the current list
     @return The size of the current list
     */
    private int size(Node<E> head) {
        if (head == null)
            return 0;
        else
            return 1 + size(head.next);
    }

    public void addAtEnd(E obj){
        if (head == null)
            addHead(obj);
        else addAtEnd(head, obj);
    }

    private void addAtEnd(Node<E> current, E obj){
        if (current.next == null){
            Node<E> temp = new Node<>(obj);
            current.next = temp;
        }
        else
            addAtEnd(current.next, obj);
    }



    /** Wrapper method for finding the size of a list.
     @return The size of the list
     */
    public int size() {
        return size(head);
    }

    public boolean empty(){
        return head ==null;
    }

    public boolean isEmpty(){
        return empty();
    }

    public void insertAfter(E target, E obj){
        insertAfter(head, target, obj);
    }


    private void insertAfter(Node<E> current, E target, E obj){
        if (current==null)
            return;
        else if (current.data.equals(target)){
            Node<E> temp = new Node<>(obj);
            temp.next = current.next;
            current.next = temp;
        }
        else insertAfter(current.next, target, obj );
    }

    public void addAtHead(E obj){
        addHead(obj);
    }

    /** Returns the string representation of a list.
     @param head The head of the current list
     @return The state of the current list
     */
    private String toString(Node<E> head) {
        if (head == null)
            return "null";
        else
            return head.data + "\t->\t" + toString(head.next);
    }
    /** Wrapper method for returning the string representation of a list.
     @return The string representation of the list
     */
    public String toString() {
        return toString(head);
    }

    /** Replaces all occurrences of oldObj with newObj.
     post: Each occurrence of oldObj has been replaced by newObj.
     @param head The head of the current list
     @param oldObj The object being removed
     @param newObj The object being inserted
     */
    private void replace(Node<E> head, E oldObj, E newObj) {
        if (head != null) {
            if (oldObj.equals(head.data))
                head.data = newObj;
            replace(head.next, oldObj, newObj);
        }
    }
    /** Wrapper method for replacing oldObj with newObj.
     post: Each occurrence of oldObj has been replaced by newObj.
     @param oldObj The object being removed
     @param newObj The object being inserted
     */
    public void replace(E oldObj, E newObj) {
        replace(head, oldObj, newObj);
    }



    /** Adds a new node to the end of a list.
     @param head The head of the current list
     @param data The data for the new node
     */
    private void add(Node<E> head, E data) {
        // If the list has just one element, add to it.
        if (head.next == null)
            head.next = new Node<>(data);
        else
            add(head.next, data); // Add to rest of list.
    }

    /** Wrapper method for adding a new node to the end of a list.
     @param data The data for the new node
     */
    public void add(E data) {
        if (head == null)
            head = new Node<>(data); // List has 1 node.
        else
            add(head, data);
    }

    public E peekFront(){
        if (isEmpty())
            return null;
        else
            return head.data;
    }

    public E peekEnd(){
        if (isEmpty())
            return null;
        else
            return peekEnd(head);
    }

    private E peekEnd(Node<E> current){
        if (current.next == null)
            return current.data;
        else
            return peekEnd(current.next);
    }

    /** Removes a node from a list.
    post: The first occurrence of outData is removed.
    @param head The head of the current list
    @param pred The predecessor of the list head
    @param outData The data to be removed
    @return true if the item is removed
    and false otherwise
    */
    private boolean remove(Node<E> head, Node<E> pred, E outData) {
        if (head == null) // Base case – empty list.
            return false;
        else if (head.data.equals(outData)) { // 2nd base case.
            pred.next = head.next; // Remove head.
            return true;
        } else
            return remove(head.next, head, outData);
    }


    /** Wrapper method for removing a node (in LinkedListRec).
     post: The first occurrence of outData is removed.
     @param outData The data to be removed
     @return true if the item is removed,
     and false otherwise
     */
    public boolean remove(E outData) {
        if (head == null)
            return false;
        else if (head.data.equals(outData)) {
            head = head.next;
            return true;
        } else
            return remove(head.next, head, outData);
    }


    private static class Node<E>
    {
        //data fields
        private E data; // reference to the data
        private Node<E> next; // reference to the next node

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
     /**
      *  PROGRAMMING
      * 1. Write an equals method for the LinkedListRec class that compares this LinkedListRec object to
      * one specified by its argument. Two lists are equal if they have the same number of nodes and store
      * the same information at each node. Don’t use the size method.
      */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LinkedListRec)) return false;

        LinkedListRec<E> that = (LinkedListRec<E>) o;

        return Objects.equals(head, that.getHead());
    }

    public Node<E> getHead(){ return head;}

    public E get(int index){
        if (index>=size())
            throw new ArrayIndexOutOfBoundsException("Index must be more than -1 and less than "+ size());
        return get(head, index, 0);
    }

    private E get(Node<E> current, int index, int iter){
        if (index == iter)
            return current.data;
        else
            return get(current.next, index, iter+1);
    }

    /** Programming
     * 2. Write a search method that returns true if its argument is stored as the data field of a
     * LinkedListRec node and returns false if its argument is not stored in any node.
     */

    public boolean search(E target){
        return search(head, target);
    }

    private boolean search(Node<E> current, E target){
        if (current==null)
            return false;
        else if (current.data.equals(target))
            return true;
        return search(current.next, target);
    }


    /**
     * Programming
     * 3. Write a recursive method insertBefore that inserts a specified data object before the
     * first occurrence of another specified data object. For example, the method call
     * aList.insertBefore(target, inData) would insert the object referenced by inData in a
     * new node just before the first node of aList that stores a reference to target as its data.
     */

    public void insertBefore(E target, E inData){
        if (0==size())
            throw new ArrayIndexOutOfBoundsException("There is no element in the list");
        else if (head.data.equals(target))
            addHead(inData);

        else insertBefore(head.next, head, target, inData);
    }

    public void addHead(E data){
        Node<E> temp = new Node<>(data);
        temp.next = head;
        head = temp;
    }

    private void insertBefore(Node<E> current, Node<E> beforeOne, E target,E inData){
        if (current == null)
            return;

        else if (current.data.equals(target)){
            Node<E> temp = new Node<>(inData);
            beforeOne.next = temp;
            temp.next = current;
        }
        else insertBefore(current.next, current, target, inData);
    }

    /** Programming
     * 4. Write a recursive method reverse that reverses the elements in a linked list.
     */

    public void reverse(){
        reverse(head);
    }

    private void reverse(Node<E> current){
        if (current==null)
            return;
        else{
            reverse(current.next);
            System.out.println(current.data);
        }
    }

    /**
     * Programming
     *
     * 5. Code method insert in Self‐Check Exercise 3.
     *
     * 3. Write a recursive algorithm for method insert(E obj, int index)
     * where index is the position of the insertion.
     */

    public void insert(E obj, int index){
        if (index>=size() || index<0)
            throw new ArrayIndexOutOfBoundsException("Index must be between size and -1 (exclusive)");

        if (index == 0)
            addHead(obj);
        else
            insert(head.next, obj,index, 1);
    }

    private void insert(Node<E> current,E obj, int index, int iter){
        if(iter == index){
            Node<E> temp = new Node<>(obj);
            temp.next = current.next;
            current.next = temp;
        }
        else insert(current.next,obj ,index, iter+1);
    }

    /**
     *  Programming
     *  6. Code method remove in Self‐Check Exercise 4.
     *  4. Write a recursive algorithm for method remove(int index) where index is the position of
     * the item to be removed.
     */

    public E remove(int index){
        if (index>size() || index<0)
            throw new ArrayIndexOutOfBoundsException("Index must be between size and -1 (exclusive)");

        else if (size()==0){
            return null;
        }

        else if(index == 0) {
            E removed = head.data;
            head = head.next;
            return removed;
        }

        else
            return remove(head, index, 1);

    }

    private E remove(Node<E> before, int index, int iter){
        if (iter == index){
            E removed = before.next.data;
            before.next = before.next.next;
            return removed;
        }
        else return remove(before.next, index, iter+1);
    }

    public void removeFront(){
        head = head.next;
    }

    public void removeEnd(){
        if (size()==0)
            return;
        else if (size()==1)
            head = null;

        removeEnd(head);
    }

    private void removeEnd(Node<E> current){
        if (current.next.next==null)
            current.next=null;
        else
            removeEnd(current.next);
    }
}