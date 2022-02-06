package com.company;

public class MyDoubleLinkedList<E> {

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public MyDoubleLinkedList(){

    }

    /**
     * Add an item to the front of the list.
     *
     * @param item The item to be added
     */
    public void addFirst(E item) {
        if (size == 0) {
            head = new Node<>(item);
            tail = head;
        }
        else {
            Node<E> temp = new Node<>(item);
            temp.next = head;
            head.prev = temp;
            head = temp;
            head.next.prev = head;
        }
        size++;
    }

    /** A method to add an item after wanted nodeRef
     * @param item will gonna added item in the list
     * @param nodeRef a reference node to add node after it
     * */
    public void addAfter(E item, Node<E> nodeRef){
        Node<E> temp = new Node<>(item);
        temp.next = nodeRef.next;
        temp.prev = nodeRef;
        if (nodeRef.next == null){
            tail=temp;
        }
        else{
            nodeRef.next.prev = temp;
        }
        nodeRef.next = temp;
        size++;
    }

    /** A method to add an item last of the list
     * @param item will gonna added item in the list
     * */
    private void addLast(E item){
        Node<E> temp = new Node<>(item);
        tail.next = temp;
        temp.prev = tail;
        tail = temp;
        size++;
    }

    /**
     *  A method to adds an entry end of the list
     * @param anEntry is which wanted to entry
     * @return always boolean if there is no error
     */
    public boolean add(E anEntry){
        return add(size,anEntry);
    }

    /**
     *  A method to adds an entry to wanted index
     * @param index wanted index
     * @param anEntry wanted item to add
     * @return always true if there is no error
     */
    public boolean add(int index, E anEntry){
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }

        if (index == 0)
            addFirst(anEntry);

        else if (index==size)
            addLast(anEntry);

        else{
            Node<E> nodeRef = getNode(index);
            addAfter(anEntry, nodeRef);
        }

        return true;
    }

    /**
     *  A method to get reference node given index
     * @param index wanted to node's reference
     * @return a reference node given index's
     */
    private Node<E> getNode(int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        Node<E> nodeRef = head;

        for (int i = 0; i < index; i++) {
            nodeRef=nodeRef.next;
        }
        return nodeRef;
    }

    /**
     *  A method to get size of the list
     * @return size of the list
     */
    public int size(){ return size;}

    /**
     *  A method to returns element at position index
     * @param index returned data's index
     * @return given indexes data
     */
    public E get(int index){
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        Node<E> nodeRef = head;
        for (int i = 0; i < index; i++) {
            nodeRef = nodeRef.next;
        }
        return nodeRef.data;
    }

    /**
     *  Adds an element to wanted reference item before
     * @param item that will gonna add to list
     * @param reference item add before this reference
     * @return always true if there is no error and and item in the list
     *              false if there is no item in the list
     */
    public boolean addBefore(E item, E reference){
        Node<E> nodeRef = findNode(reference);
        if (nodeRef == null)
            return false;
        if (nodeRef == head)
            addFirst(item);
        else
            addAfter(item, nodeRef.prev);

        return true;
    }


    /**
     *  A method to find target data's Node and return its references
     * @param target wanted to Nodes references item
     * @return target datas references if data found
     *                  else return null
     */
    public Node<E> findNode(E target){
        Node<E> nodeRef = head;
        for (int i = 0; i < size; i++) {
            if(nodeRef.data.equals(target))
                return nodeRef;
            nodeRef = nodeRef.next;
        }
        return null;
    }

    /***
     *  A method to remove first element in the list
     * @return removed Node's data
     */
    public E removeFirst(){
        Node<E> temp = head;
        if (size == 1){
            head = null;
            tail = null;
        }
        else if (head!=null) {
            head = head.next;
            head.prev = null;
        }
        size--;
        return temp.data;
    }

    /***
     *  A method to remove last element in the list
     * @return removed Node's data
     */
    public E removeLast(){
        Node<E> temp = tail;
        if (size == 1){
            head = null;
            tail = null;
        }
        else if (tail!=null) {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        return temp.data;
    }


    /***
     *  A method to remove after reference node element in the list
     * @return removed Node's data
     */
    public E removeAfter(Node<E> nodeRef){
        Node<E> temp = nodeRef.next;
        nodeRef.next = temp.next;
        temp.next.prev = nodeRef;
        size--;
        return temp.data;
    }

    /**
     * A method to provide remove target item from list
     * @param targetItem wanted item removed from list
     * @return removed nodes data if data is in the list
     */
    public E removeItem(E targetItem){
        Node<E> nodeRef = findNode(targetItem);
        if (nodeRef == head)
            return removeFirst();
        else if (nodeRef == tail)
            return removeLast();
        else
            return removeAfter(nodeRef);
    }

    private class Node<E> {
        /** The data value. */
        private E data;
        /** The link to the next node. */
        private Node<E> next = null;
        /** The link to the previous node. */
        private Node<E> prev = null;

        /** Construct a node with the given data value.
         @param dataItem The data value
         */
        public Node(E dataItem) {
            data = dataItem;
            next = null;
            prev = null;
        }
    }
}
