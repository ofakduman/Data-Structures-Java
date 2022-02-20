package com.company;

import java.util.TreeSet;

/**
 * PROGRAMMING
 * 1. Write methods contains and remove for the BinarySearchTree class. Use methods find and
 * delete to do the work.
 * 2. Self‐Check Exercise 4 indicates that two items can be used to replace a data item in a
 * binary search tree. Rewrite method delete so that it retrieves the leftmost element in the
 * right subtree instead. You will also need to provide a method findSmallestChild.
 * 3. Write a main method to test a binary search tree. Write a toString method that returns the
 * tree contents in ascending order (using an inorder traversal) with newline characters separating the tree elements.
 * 4. Write a main method for the index generator that declares new Scanner and IndexGenerator
 * objects. The Scanner can reference any text file stored on your hard drive.
 */
public class Main {

    public static void main(String[] args) {
        BinarySearchTree<String> bst = new BinarySearchTree<>();
        BinarySearchTree<Integer> bstint = new BinarySearchTree<>();
        bst.add("melehat");
        bst.add("ocerkn");
        bst.add("pirasa");
        bst.add("kalan");
        bst.add("baho");
        bst.add("baa");
        bst.add("lufer");
        bst.add("lale");
        bst.add("math");
        bst.add("nigar");
        bst.add("nadide");
        bst.add("nulifer");
        bst.add("pirasa");
        System.out.println(bst.toString());

        System.out.println(bst.findSmallestChild(bst.root));

        bstint
    }
}
//    private BinaryTree.Node<E> delete(BinaryTree.Node<E> localRoot, E item) {
//        if (localRoot == null) {
//            // item is not in the tree.
//            deleteReturn = null;
//            return localRoot;
//        }
//        // Search for item to delete.
//        int compResult = item.compareTo(localRoot.data);
//        if (compResult < 0) {
//            // item is smaller than localRoot.data.
//            localRoot.left = delete(localRoot.left, item);
//            return localRoot;
//        } else if (compResult > 0) {
//            // item is larger than localRoot.data.
//            localRoot.right = delete(localRoot.right, item);
//            return localRoot;
//        } else {
//            // item is at local root.
//            deleteReturn = localRoot.data;
//            if (localRoot.left == null) {
//                // If there is no left child, return right child
//                // which can also be null.
//                return localRoot.right;
//            } else if (localRoot.right == null) {
//                // If there is no right child, return left child.
//                return localRoot.left;
//            } else {
//                // Node being deleted has 2 children, replace the data
//                // with inorder predecessor.
//                if (localRoot.left.right == null) {
//                    // The left child has no right child.
//                    // Replace the data with the data in the
//                    // left child.
//                    localRoot.data = localRoot.left.data;
//                    // Replace the left child with its left child.
//                    localRoot.left = localRoot.left.left;
//                    return localRoot;
//                } else {
//                    // Search for the inorder predecessor (ip) and
//                    // replace deleted node's data with ip.
//                    localRoot.data = findLargestChild(localRoot.left);
//                    return localRoot;
//                }
//            }
//        }
//    }