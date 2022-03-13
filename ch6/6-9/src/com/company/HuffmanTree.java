package com.company;

import com.sun.source.tree.BinaryTree;

import java.util.*;
import java.io.*;
/** Class to represent and build a Huffman tree. */
public class HuffmanTree implements Serializable {
    // Nested Classes

    /**
     * A datum in the Huffman tree.
     */
    public static class HuffData implements Serializable {
        // Data Fields
        /**
         * The weight or probability assigned to this HuffData.
         */
        private double weight;
        /**
         * The alphabet symbol if this is a leaf.
         */
        private char symbol;

        public HuffData(double weight, Character symbol) {
            this.weight = weight;
            this.symbol = symbol;
        }
    }
    // Data Fields
    /**
     * A reference to the completed Huffman tree.
     */
    private BinaryTree<HuffData> huffTree;
    Queue<BinaryTree<HuffData>> theQueue
            = new PriorityQueue<>(symbols.length,
            (lt, rt) ->Double.compare(lt.getData().weight,
            rt.getData().weight)
            );
    HuffData sum = new HuffData(wl + wr, '\u0000');
    BinaryTree<HuffData> newTree
            = new BinaryTree<>(sum, left, right);

    /**
     * Builds the Huffman tree using the given alphabet and weights.
     * post: huffTree contains a reference to the Huffman tree.
     *
     * @param symbols An array of HuffData objects
     */
    public void buildTree(HuffData[] symbols) {
        Queue<BinaryTree<HuffData>> theQueue
                = new PriorityQueue<>(symbols.length,
                (lt, rt) ->Double.compare(lt.getData().weight,
                rt.getData().weight));
        // Load the queue with the leaves.
        for (HuffData nextSymbol : symbols) {
            BinaryTree<HuffData> aBinaryTree =
                    new BinaryTree<>(nextSymbol, null, null);
            theQueue.offer(aBinaryTree);
        }
        // Build the tree.
        while (theQueue.size() > 1) {
            BinaryTree<HuffData> left = theQueue.poll();
            BinaryTree<HuffData> right = theQueue.poll();
            double wl = left.getData().weight;
            double wr = right.getData().weight;
            HuffData sum = new HuffData(wl + wr, '\u0000');
            BinaryTree newTree =
                    new BinaryTree<>(sum, left, right);
            theQueue.offer(newTree);
        }
        // The queue should now contain only one item.
        huffTree = theQueue.poll();
    }
}