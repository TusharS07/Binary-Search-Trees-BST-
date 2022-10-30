package com.bridhelabz.bst;

public class Node<T extends Comparable> {
    T value;
    Node<T> left;
    Node<T> right;

    public Node(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
