package org.redquark.dsa.datastructures.stacks;

/**
 * @author Anirudh Sharma
 * <p>
 * This class represents the implementation of the Stack data structure using arrays
 */
public class StackUsingArray implements Stack {

    // Maximum size of the stack
    private static final int SIZE = 10;
    // Top of the stack
    private int top;
    // Internal array that will store the elements
    private final int[] a = new int[SIZE];

    /**
     * Default constructor
     */
    public StackUsingArray() {
        // Initialize top to -1 which is an invalid index for array
        // thus, it determines that the stack is empty
        top = -1;
    }

    /**
     * This method inserts and element in the stack
     *
     * @param n the element to be inserted
     */
    @Override
    public void push(int n) {
        // Check if the stack is already full
        if (top >= SIZE - 1) {
            throw new StackOverflowError("Stack is overflowed");
        } else {
            // Increment the top first
            top += 1;
            // Insert this value at the new top
            a[top] = n;
        }
    }

    /**
     * This method checks if the stack is empty or not
     *
     * @return true, if stack is empty, false otherwise
     */
    @Override
    public boolean isEmpty() {
        // If top is negative, which means the stack is empty
        return top < 0;
    }

    /**
     * This method removes the top of the stack and returns it
     *
     * @return top of the stack
     */
    @Override
    public int pop() {
        if (top < 0) {
            throw new RuntimeException("Stack is underflowed");
        } else {
            return a[top--];
        }
    }

    /**
     * This method returns top of the stack without removing it
     *
     * @return top of the stack
     */
    @Override
    public int peek() {
        if (top < 0) {
            throw new RuntimeException("Stack is underflowed");
        } else {
            return a[top];
        }
    }
}
