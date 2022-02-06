package com.company;

/** Class to represent a linked list with a link from each node to the next
 node. SingleLinkedList does not implement the List interface.
 */
public class MySingleLinkedList<E> {
    /**
     * Reference to list head.
     */
    private Node<E> head = null;
    /**
     * The number of items in the list
     */
    private int size = 0;

    /**
     * Add an item to the front of the list.
     *
     * @param item The item to be added
     */
    public void addFirst(E item) {
        head = new Node<>(item, head);
        size++;
    }

    /** Add a node after a given node
     @param node The node preceding the new item
     @param item The item to insert
     */
    private void addAfter(Node<E> node, E item) {
        node.next = new Node<>(item, node.next);
        size++;
    }

    /** Remove the node after a given node
     @param node The node before the one to be removed
     @return The data from the removed node, or null
     if there is no node to remove
     */
    private E removeAfter(Node<E> node) {
        Node<E> temp = node.next;
        if (temp != null) {
            node.next = temp.next;
            size--;
            return temp.data;
        } else {
            return null;
        }
    }

    /** Remove the first node from the list
     @return The removed node's data or null if the list is empty
     */
    private E removeFirst() {
        Node<E> temp = head;
        if (head != null) {
            head = head.next;
        }
        // Return data at old head or null if list is empty
        if (temp != null) {
            size--;
            return temp.data;
        } else {
            return null;
        }
    }

    /** Find the node at a specified position
     @param index The position of the node sought
     @return The node at index or null if it does not exist
     */
    private Node<E> getNode(int index) {
        Node<E> node = head;
        for (int i = 0; i < index && node != null; i++) {
            node = node.next;
        }
        return node;
    }

    /** Get the data at index
     @param index The position of the data to return
     @return The data at index
     @throws IndexOutOfBoundsException if index is out of range
     */
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        Node<E> node = getNode(index);
        return node.data;
    }


    /** Store a reference to anEntry in the element at position index.
     @param index The position of the item to change
     @param newValue The new data
     @return The data previously at index
     @throws IndexOutOfBoundsException if index is out of range
     */
    public E set(int index, E newValue) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        Node<E> node = getNode(index);
        E result = node.data;
        node.data = newValue;
        return result;
    }

    /** Insert the specified item at index
     @param index The position where item is to be inserted
     @param item The item to be inserted
     @throws IndexOutOfBoundsException if index is out of range
     */
    public void add(int index, E item) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        if (index == 0) {
            addFirst(item);
        } else {
            Node<E> node = getNode(index-1);
            addAfter(node, item);
        }
    }

    /** Append item to the end of the list
     @param item The item to be appended
     @return true (as specified by the Collection interface)
     */
    public boolean add(E item) {
        add(size, item);
        return true;
    }


    private static class Node<E> {
        // Data Fields
        /**
         * The reference to the data.
         */
        private E data;
        /**
         * The reference to the next node.
         */
        private Node<E> next;

        // Constructors

        /**
         * Creates a new node with a null next field.
         *
         * @param dataItem The data stored
         */
        private Node(E dataItem) {
            data = dataItem;
            next = null;
        }

        /**
         * Creates a new node that references another node.
         *
         * @param dataItem The data stored
         * @param nodeRef  The node referenced by new node
         */
        private Node(E dataItem, Node<E> nodeRef) {
            data = dataItem;
            next = nodeRef;
        }

    }

    //print the names to console
    public void print(){
        Node<E> nodeRef = head;
        while(nodeRef!=null){
            System.out.println(nodeRef.data+" ");
            nodeRef = nodeRef.next;
        }
    }

    /**<<This is the objection of the 2.5 Programming part 1. program>>
     * Objection:Using the single‐linked list shown in Figure 2.16, and assuming that head references the first
     * Node and tail references the last Node, write statements to do each of the following:
     * a. Insert "Bill" before "Tom".
     * b. Insert "Sue" before "Sam".
     * c. Remove "Bill".
     * d. Remove "Sam".
     */
    public void programming1(){
        Node<E> nodeRef = head;
        Node<E> tail = getTail();
        //a. Insert "Bill" before "Tom".
        addFirst((E) "Bill");
        //b. Insert "Sue" before "Sam".
        nodeRef = getBefore((E)"Sam");
        addAfter(nodeRef,(E)"Sue");
        //c. Remove "Bill".
        removeItem(((E)"Bill"));
        //d. Remove "Sam".
        removeItem(((E)"Sam"));
    }

    /** A getter method to size
     * @return size of the list
     *<<This is the objection of the 2.5 Programming part 2. program>>
     * */
    public int size(){return size;}

    /** Remove the first occurrence of element item.
     @param item The item to be removed
     @return true if item is found and removed; otherwise, return false.
      *<<This is the objection of the 2.5 Programming part 5. program>>
     */
    public boolean remove(E item){
        E data = removeItem(item);
        if (data == null)
            return false;
        return true;
    }

    /** A method to remove a node which has targetItem data
     * @param targetItem is wanted to remove node's data
     * @return removed item if given targetItem is in the list
     *          otherwise return null or exception error
     * */
    public E removeItem(E targetItem){
        return remove(indexOf(targetItem));
    }

    /** A method to remove a node specific index
     * @param index is wanted to remove index
     * @return removed item if given index is valid
     *          otherwise return null or exception error
     *<<This is the objection of the 2.5 Programming part 4. program>>
     * */
    public E remove(int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        if (index == 0)
            return removeFirst();

        return removeAfter(getNode(index));
    }

    /** Insert a new item before the one at position index,
     starting at 0 for the list head. The new item is inserted between the one
     at position index‐1 and the one formerly at position index.
     @param index The index where the new item is to be inserted
     @param item The item to be inserted
     @throws IndexOutOfBoundsException if the index is out of range
     *<<This is the objection of the 2.5 Programming part 6. program>>
     *     Objection: Write the following method myAdd for class SingleLinkedList<E> without using any helper
      * methods.
     */
    public void myAdd(int index, E item){
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        if (index == 0)
            head = new Node<>(item, head);
        else{
            Node<E> nodeRef = head;
            for (int i = 0; i < index; i++) {
                nodeRef = nodeRef.next;
            }
            nodeRef.next = new Node<>(item, nodeRef.next);
        }
        size++;
    }

    /** A method to find targetItems index
     * @param targetItem is wanted indexes item
     * @return index if found targetItems index
     *          otherwise returns -1
     *<<This is the objection of the 2.5 Programming part 3. program>>
     * */
    public int indexOf(E targetItem){
        int index = 0;
        Node<E> nodeRef = head;
        while (nodeRef.next != null){
            if (nodeRef.data.equals(targetItem)) {
                return index;
            }
            index += 1;
            nodeRef = nodeRef.next;
        }
        if (nodeRef.data.equals(targetItem))
            return index;
        return -1;
    }

    /** A method to get a node before target node which has given item
     * @param targetItem is target item
     * @return nodeRef if targetItem is in the list otherwise return null
     * **/
    public Node<E> getBefore(E targetItem){
        Node<E> nodeRef = head;
        while(nodeRef.next != null){
            if(nodeRef.next.data.equals(targetItem))
                return nodeRef;
            else
                nodeRef = nodeRef.next;
        }
        return null;
    }


    public Node<E> getTail(){
        Node<E> nodeRef = head;
        while(nodeRef.next != null){
            nodeRef = nodeRef.next;
        }
        return nodeRef;
    }
}