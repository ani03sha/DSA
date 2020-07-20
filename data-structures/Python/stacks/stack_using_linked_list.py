"""
@author Anirudh Sharma
Implementation of Stacks using Linked Lists in Python
"""


class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class StackUsingLinkedList:
    def __init__(self):
        self.head = None
        self.top = None


def push(stack, n):
    # Create a new node with the given data
    n = Node(n)
    # When the stack is empty
    if is_empty(stack):
        stack.head = n
        stack.top = n
    else:
        stack.top.next = n
        stack.top = n


def is_empty(stack):
    return stack.top is None


def pop(stack):
    if is_empty(stack):
        raise Exception("Stack is underflowed")
    else:
        data = stack.top.data
        # If there is only one node
        if stack.head == stack.top:
            stack.top = None
            stack.head = None
        else:
            # Get reference of the head
            temp = stack.head
            while temp.next != stack.top:
                temp = temp.next
            temp.next = None
            del stack.top
            stack.top = temp
        return data


def peek(stack):
    if is_empty(stack):
        raise Exception("Stack is underflowed")
    else:
        return stack.top.data
