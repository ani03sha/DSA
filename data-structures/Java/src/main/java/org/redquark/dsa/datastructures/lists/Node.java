package org.redquark.dsa.datastructures.lists;

/**
 * @author Anirudh Sharma
 * This class represents each node in the linked list
 */
public class Node {
    // Data to be stored in the node
    final int data;
    // pointer that points to the next node of this node
    Node next;

    /**
     * This constructor creates a new node with the specified data
     *
     * @param data - data to be stored in the node
     */
    Node(int data) {
        this.data = data;
    }
}
