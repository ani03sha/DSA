package org.redquark.dsa.datastructures.lists;

/**
 * Linked List implementation
 *
 * @author Anirudh Sharma
 */
public class LinkedList implements List {

    // Head of the linked list
    public Node head;

    /**
     * This method traverses the entire linked list from the head
     */
    @Override
    public String traversal() {
        // Get the reference of the head node
        Node temp = head;
        // Output of the traversal
        StringBuilder output = new StringBuilder();
        // Loop until we reach at the end of the list
        while (temp != null) {
            output.append(temp.data).append("   ");
            temp = temp.next;
        }
        return output.toString();
    }

    /**
     * This method returns the data stored in the node at the given position
     *
     * @param index - position
     * @return data stored at the given position
     */
    @Override
    public int get(int index) {
        // Counter to keep track of traversed nodes
        int count = 0;
        // Get the reference of the head in temp
        Node temp = head;
        // Loop until we reach to the end of the list or at the desired position
        while (temp != null && count < index) {
            temp = temp.next;
            count++;
        }
        return temp != null ? temp.data : -1;
    }

    /**
     * This method inserts a new node at the beginning of the linked list
     *
     * @param data - data to be inserted in the node
     */
    @Override
    public void insertAtHead(int data) {
        // Create a new node with the given data
        Node node = new Node(data);
        // Check if the linked list exists or not
        if (head == null) {
            head = node;
            return;
        }
        // Make the next of this node point to the current head node
        node.next = head;
        // Make this node as the new head
        head = node;
    }

    /**
     * This method inserts new node at the end of the linked list
     *
     * @param data - data to be inserted in the node
     */
    @Override
    public void insertAtTail(int data) {
        // Create a new node wit the given data
        Node node = new Node(data);
        // Check if the linked list exists or not
        if (head == null) {
            head = node;
            return;
        }
        // Get the reference of the head in the temp
        Node temp = head;
        // Loop until we reach to the end of the linked list
        while (temp.next != null) {
            temp = temp.next;
        }
        // Point the current last node to the node we created
        temp.next = node;
    }

    /**
     * This method adds a new node at the given index
     *
     * @param data  - data to be saved in the new node
     * @param index - index at which the new node is to be added
     */
    @Override
    public void insertAtIndex(int data, int index) {
        // Create a new node with the given data
        Node node = new Node(data);
        // Check if the linked list exists and the index is zero
        if (head == null && index == 0) {
            head = node;
        }
        // Check if the node is to be added at the head
        else if (index == 0) {
            node.next = head;
            head = node;
        } else {
            // Counter which keeps track of number of nodes traversed
            int count = 0;
            // Get the reference of the head in temp
            Node temp = head;
            // Loop until we reach at the end of the list or at the desired position
            while (temp != null && count < index - 1) {
                temp = temp.next;
                count++;
            }
            // Check if the current node is not null
            if (temp != null) {
                // Make the next of new node as the next of the current node
                node.next = temp.next;
                // Make the next of the current node as the new node
                temp.next = node;
            }
        }
    }

    @Override
    public void remove(Node node) {
        // If the node to be removed is the head of the linked list
        if (head == node) {
            head = head.next;
        } else {
            // Get the reference of the head in temp
            Node temp = head;
            // Loop until we reach to the end of the linked list or at the node just before the one which is to be
            // deleted
            while (temp != null) {
                if (temp.next == node) {
                    temp.next = node.next;
                    break;
                }
                temp = temp.next;
            }
        }
    }
}
