package org.redquark.dsa.datastructures.stacks;

/**
 * @author Anirudh Sharma
 * <p>
 * This class represents each node in the internal linked list of stack
 */
public class Node {

    // Data to be stored in the node
    final int data;
    // pointer that points to the next node of this node
    Node next;

    Node(int data) {
        this.data = data;
    }
}
