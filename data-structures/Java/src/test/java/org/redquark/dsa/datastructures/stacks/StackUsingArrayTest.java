package org.redquark.dsa.datastructures.stacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


class StackUsingArrayTest {

    private final StackUsingArray stackUsingArray = new StackUsingArray();

    @BeforeEach
    void setUp() {
        stackUsingArray.push(1);
        stackUsingArray.push(2);
        stackUsingArray.push(3);
        stackUsingArray.push(4);
    }

    @Test
    void testPush() {
        assertEquals(4, stackUsingArray.peek());
        stackUsingArray.push(5);
        assertEquals(5, stackUsingArray.peek());
        stackUsingArray.push(6);
        stackUsingArray.push(7);
        stackUsingArray.push(8);
        stackUsingArray.push(9);
        stackUsingArray.push(10);
        assertEquals(10, stackUsingArray.peek());
        assertThrows(StackOverflowError.class, () -> stackUsingArray.push(11));
    }

    @Test
    void testIsEmpty() {
        assertFalse(stackUsingArray.isEmpty());
        stackUsingArray.pop();
        stackUsingArray.pop();
        stackUsingArray.pop();
        stackUsingArray.pop();
        assertTrue(stackUsingArray.isEmpty());
        stackUsingArray.push(5);
        assertFalse(stackUsingArray.isEmpty());
        stackUsingArray.pop();
        assertTrue(stackUsingArray.isEmpty());
    }

    @Test
    void testPop() {
        assertEquals(4, stackUsingArray.pop());
        assertEquals(3, stackUsingArray.pop());
        assertEquals(2, stackUsingArray.pop());
        assertEquals(1, stackUsingArray.pop());
        assertThrows(RuntimeException.class, stackUsingArray::pop);
        stackUsingArray.push(5);
        assertEquals(5, stackUsingArray.pop());
        assertThrows(RuntimeException.class, stackUsingArray::pop);
    }

    @Test
    void testPeek() {
        assertEquals(4, stackUsingArray.peek());
        assertEquals(4, stackUsingArray.peek());
        stackUsingArray.pop();
        assertEquals(3, stackUsingArray.peek());
        stackUsingArray.pop();
        assertEquals(2, stackUsingArray.peek());
        stackUsingArray.pop();
        stackUsingArray.pop();
        assertThrows(RuntimeException.class, stackUsingArray::peek);
    }
}