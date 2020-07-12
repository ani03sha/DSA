package org.redquark.dsa.datastructures.lists;

public interface List {

    String traversal();
    int get(int index);
    void insertAtHead(int data);
    void insertAtTail(int data);
    void insertAtIndex(int data, int index);
    void remove(Node node);
}
