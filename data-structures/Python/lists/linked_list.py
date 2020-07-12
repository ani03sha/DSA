"""
@author Anirudh Sharma
Implementation of Linked List in Python
"""


# This class represents each node of the linked list
class Node:
    """
    data - data to be stored in the node
    next - pointer to the next node in the linked list
    """
    def __init__(self, data):
        self.data = data
        self.next = None


# Linked List implementation in Python
class LinkedList():
    def __init__(self, data):
        a = Node(data)
        # Initialize the head of the linked list
        self.head = a


def traversal(linked_list):
    # Output string
    output = ''
    # Taking the reference of head in a temporary variable
    temp = linked_list.head
    # Loop until we reach at the end of the list
    while temp is not None:
        output += str(temp.data) + '   '
        temp = temp.next
    return output


def get(linked_list, index):
    # Counter that will keep track of the traversed nodes
    count = 0
    # Get the reference of the head in temp
    temp = linked_list.head
    # Loop until we reach to the end of the list or at the desired position
    while temp is not None and count < index:
        temp = temp.next
        count += 1
    return temp.data if temp is not None else -1


def insert_at_head(linked_list, data):
    # Create a new node with the given data
    node = Node(data)
    # Check if the linked list exists
    if linked_list.head is None:
        linked_list.head = node
        return
    # Make the next of this node point to the current head
    node.next = linked_list.head
    # Make the new node as the new head
    linked_list.head = node


def insert_at_tail(linked_list, data):
    # Create a new node with the given data
    node = Node(data)
    # Check if the linked list exists
    if linked_list.head is None:
        linked_list.head = node
        return
    # Get the reference of the head in temp
    temp = linked_list.head
    # Loop until we reach to the last node of the list
    while temp.next is not None:
        temp = temp.next
    # Make the current last node point to the node we created
    temp.next = node


def insert_at_index(linked_list, data, index):
    # Create a new node with the given data
    node = Node(data)
    # Check if the linked list exists or the given index is zero
    if linked_list.head is Node and index == 0:
        linked_list.head = node
    # Check if the index is zero
    elif index == 0:
        # Make the new node as the head
        node.next = linked_list.head
        linked_list.head = node
    else:
        # Counter to keep track of number of nodes in linked list
        count = 0
        # Get the reference of the head in the temp
        temp = linked_list.head
        # Loop until we reach the position or we reach at the end of the list
        while temp is not None and count < index - 1:
            temp = temp.next
            count += 1
        # Check if we have not reached at the end of the list
        if temp is not None:
            # Make the next of the new node to the next of current node represented by temp
            node.next = temp.next
            # Make the next of current node to the new node
            temp.next = node


def remove(linked_list, node):
    # If the node to be deleted is the head of the linked list
    if linked_list.head == node:
        linked_list.head = linked_list.head.next
        # Free the memory
        del node
    # In other cases
    else:
        # Get the reference of the head
        temp = linked_list.head
        # Loop until we reach to the node which is previous to the node to be deleted
        while temp is not None:
            if temp.next == node:
                temp.next = node.next
                # Free the memory
                del node
                break
            temp = temp.next
