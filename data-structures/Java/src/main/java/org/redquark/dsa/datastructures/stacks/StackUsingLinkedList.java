package org.redquark.dsa.datastructures.stacks;

/**
 * @author Anirudh Sharma
 * This class implements stack data structure using Linked List
 */
public class StackUsingLinkedList implements Stack {

    // Head of the internal linked list
    Node head;
    // Top of the stack
    Node top;

    /**
     * Default constructor
     */
    public StackUsingLinkedList() {
        head = null;
        top = null;
    }

    /**
     * This method inserts and element in the stack
     *
     * @param n the element to be inserted
     */
    @Override
    public void push(int n) {
        // Create a new node with the given data
        Node node = new Node(n);
        // Check for base condition
        if (isEmpty()) {
            head = node;
        } else {
            top.next = node;
        }
        top = node;
    }

    /**
     * This method checks if the stack is empty or not
     *
     * @return true, if stack is empty, false otherwise
     */
    @Override
    public boolean isEmpty() {
        return this.top == null;
    }

    /**
     * This method removes the top of the stack and returns it
     *
     * @return top of the stack
     */
    @Override
    public int pop() {
        // Check if the stack is empty
        if (isEmpty()) {
            throw new RuntimeException("Stack is underflowed");
        } else {
            // Get the data from the top node
            int data = this.top.data;
            // Check if the stack has only one element
            if (this.head == this.top) {
                this.top = null;
                this.head = null;
            } else {
                // Get the reference of the head
                Node temp = head;
                while (temp.next != this.top) {
                    temp = temp.next;
                }
                temp.next = null;
                this.top = temp;
            }
            return data;
        }
    }

    /**
     * This method returns top of the stack without removing it
     *
     * @return top of the stack
     */
    @Override
    public int peek() {
        // Check if the stack is empty
        if (isEmpty()) {
            throw new RuntimeException("Stack is underflowed");
        } else {
            // Get the data from the top node
            return this.top.data;
        }
    }
}
