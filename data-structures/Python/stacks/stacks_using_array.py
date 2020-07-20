"""
@author Anirudh Sharma
Implementation of Stacks using Arrays in Python
"""

# Maximum size of the Stack
SIZE = 10
# Top of the stack
top = -1
# Underlying array
a = [0] * SIZE


class StackUsingArray():
    def __init__(self):
        global top
        top = -1


def push(n):
    global top
    top = top + 1
    if top > SIZE - 1:
        raise Exception("Stack is overflowed")
    else:
        a[top] = n


def is_empty():
    return top < 0


def pop():
    global top
    global a
    if top < 0:
        raise Exception("Stack is underflowed")
    else:
        x = a[top]
        top -= 1
        return x


def peek():
    global top
    global a
    if top < 0:
        raise Exception("Stack is underflowed")
    else:
        return a[top]