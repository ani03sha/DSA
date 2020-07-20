package org.redquark.dsa.datastructures.stacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StackUsingLinkedListTest {

    private final StackUsingLinkedList stackUsingLinkedList = new StackUsingLinkedList();

    @BeforeEach
    void setUp() {
        stackUsingLinkedList.push(1);
        stackUsingLinkedList.push(2);
        stackUsingLinkedList.push(3);
        stackUsingLinkedList.push(4);
    }

    @Test
    void testPush() {
        assertEquals(4, stackUsingLinkedList.peek());
        stackUsingLinkedList.push(5);
        assertEquals(5, stackUsingLinkedList.peek());
        stackUsingLinkedList.push(6);
        stackUsingLinkedList.push(7);
        stackUsingLinkedList.push(8);
        stackUsingLinkedList.push(9);
        stackUsingLinkedList.push(10);
        assertEquals(10, stackUsingLinkedList.peek());
    }

    @Test
    void testIsEmpty() {
        assertFalse(stackUsingLinkedList.isEmpty());
        stackUsingLinkedList.pop();
        stackUsingLinkedList.pop();
        stackUsingLinkedList.pop();
        stackUsingLinkedList.pop();
        assertTrue(stackUsingLinkedList.isEmpty());
        stackUsingLinkedList.push(5);
        assertFalse(stackUsingLinkedList.isEmpty());
        stackUsingLinkedList.pop();
        assertTrue(stackUsingLinkedList.isEmpty());
    }

    @Test
    void testPop() {
        assertEquals(4, stackUsingLinkedList.pop());
        assertEquals(3, stackUsingLinkedList.pop());
        assertEquals(2, stackUsingLinkedList.pop());
        assertEquals(1, stackUsingLinkedList.pop());
        assertThrows(RuntimeException.class, stackUsingLinkedList::pop);
        stackUsingLinkedList.push(5);
        assertEquals(5, stackUsingLinkedList.pop());
        assertThrows(RuntimeException.class, stackUsingLinkedList::pop);
    }

    @Test
    void testPeek() {
        assertEquals(4, stackUsingLinkedList.peek());
        assertEquals(4, stackUsingLinkedList.peek());
        stackUsingLinkedList.pop();
        assertEquals(3, stackUsingLinkedList.peek());
        stackUsingLinkedList.pop();
        assertEquals(2, stackUsingLinkedList.peek());
        stackUsingLinkedList.pop();
        stackUsingLinkedList.pop();
        assertThrows(RuntimeException.class, stackUsingLinkedList::peek);
    }
}