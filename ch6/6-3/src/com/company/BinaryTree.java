package com.company;

import java.io.Serializable;
import java.util.Scanner;

/** Class for a binary tree that stores type E objects. */
public class BinaryTree<E> implements Serializable {
    // Insert inner class Node<E> here.
    // Data Field
    /**
     * The root of the binary tree
     */
    protected Node<E> root;

    /**
     * Class to encapsulate a tree node.
     */
    public BinaryTree() {
        root = null;
    }

    protected BinaryTree(Node<E> root) {
        this.root = root;
    }

    /** Constructs a new binary tree with data in its root leftTree
     as its left subtree and rightTree as its right subtree.
     */
    public BinaryTree(E data, BinaryTree<E> leftTree,
                      BinaryTree<E> rightTree) {
        root = new Node<>(data);
        if (leftTree != null) {
            root.left = leftTree.root;
        } else {
            root.left = null;
        }
        if (rightTree != null) {
            root.right = rightTree.root;
        } else {
            root.right = null;
        }
    }

    /** Return the left subtree.
     @return The left subtree or null if either the root or
     the left subtree is null
     */
    public BinaryTree<E> getLeftSubtree() {
        if (root != null && root.left != null) {
            return new BinaryTree<>(root.left);
        } else {
            return null;
        }
    }

    /** Determine whether this tree is a leaf.
     @return true if the root has no children
     */
    public boolean isLeaf() {
        return (root.left == null && root.right == null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        toString(root, 1, sb);
        return sb.toString();
    }
    /** Converts a sub‐tree to a string.
     Performs a preorder traversal.
     @param node The local root
     @param depth The depth
     @param sb The StringBuilder to save the output
     */
    private void toString(Node<E> node, int depth,
                          StringBuilder sb) {
        for (int i = 1; i < depth; i++) {
            sb.append(" ");
        }
        if (node == null) {
            sb.append("null\n");
        } else {
            sb.append(node.toString());
            sb.append("\n");
            toString(node.left, depth + 1, sb);
            toString(node.right, depth + 1, sb);
        }
    }


    /** Method to read a binary tree.
     pre: The input consists of a preorder traversal
     of the binary tree. The line "null" indicates a null tree.
     @param scan the Scanner attached to the input file.
     @return The binary tree
     */
    public static BinaryTree<String> readBinaryTree(Scanner scan) {
        // Read a line and trim leading and trailing spaces.
        String data = scan.nextLine().trim();
        if (data.equals("null")) {
            return null;
        } else {
            BinaryTree<String> leftTree = readBinaryTree(scan);

            BinaryTree<String> rightTree = readBinaryTree(scan);
            return new BinaryTree<>(data, leftTree, rightTree);
        }
    }
    protected static class Node<E> implements Serializable {
        // Data Fields
        /**
         * The information stored in this node.
         */
        protected E data;
        /**
         * Reference to the left child.
         */
        protected Node<E> left;
        /**
         * Reference to the right child.
         */
        protected Node<E> right;
        // Constructors

        /**
         * Construct a node with given data and no children.
         *
         * @param data The data to store in this node
         */
        public Node(E data) {
            this.data = data;
            left = null;
            right = null;
        }
        // Methods

        /**
         * Return a string representation of the node.
         *
         * @return A string representation of the data fields
         */
        public String toString() {
            return data.toString();
        }
    }
}