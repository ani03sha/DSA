package org.redquark.dsa.datastructures.lists;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LinkedListTest {

    private final LinkedList linkedList = new LinkedList();

    @BeforeEach
    void setUp() {
        linkedList.head = new Node(1);
        linkedList.head.next = new Node(2);
        linkedList.head.next.next = new Node(3);
        linkedList.head.next.next.next = new Node(4);
        linkedList.head.next.next.next.next = new Node(5);
    }

    @Test
    void testTraversal() {
        String expected = "1   2   3   4   5   ";
        assertEquals(expected, linkedList.traversal());
    }

    @Test
    void testGet() {
        assertEquals(3, linkedList.get(2));
        assertEquals(1, linkedList.get(0));
        assertEquals(-1, linkedList.get(9));
    }

    @Test
    void testInsertAtHead() {
        linkedList.insertAtHead(6);
        assertEquals(6, linkedList.get(0));
        linkedList.insertAtHead(7);
        assertEquals(7, linkedList.get(0));
    }

    @Test
    void testInsertAtTail() {
        linkedList.insertAtTail(6);
        assertEquals(6, linkedList.get(5));
        linkedList.insertAtTail(7);
        assertEquals(7, linkedList.get(6));
    }

    @Test
    void testInsertAtIndex() {
        linkedList.insertAtIndex(6, 1);
        assertEquals(2, linkedList.get(2));
        assertEquals(5, linkedList.get(5));
        linkedList.insertAtIndex(7, 4);
        assertEquals(4, linkedList.get(5));
    }

    @Test
    void testRemove() {
        linkedList.remove(linkedList.head);
        assertEquals(2, linkedList.get(0));
        linkedList.remove(linkedList.head.next.next);
        assertEquals(5, linkedList.get(2));
    }
}