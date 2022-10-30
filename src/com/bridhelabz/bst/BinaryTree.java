package com.bridhelabz.bst;

public class BinaryTree<T extends Comparable>{
    private Node<T> root;

    private Node<T> addRecursively(Node<T> current, T value) {
        if (current == null) {
            return new Node<>(value);
        }
        int comapreResult = value.compareTo(current.value);
        if (comapreResult == 0) {
            return current;
        }
        if (comapreResult < 0) {
            current.left = addRecursively(current.left, value);
        } else {
            current.right = addRecursively(current.right, value);
        }
        return current;
    }

    public void add(T value) {
        this.root = this.addRecursively(root, value);
    }

    private int getSizeRecursively(Node<T> current) {
        return current == null ? 0: 1 + this.getSizeRecursively(current.left) + this.getSizeRecursively(current.right);
    }

    public int getSize() {
        return this.getSizeRecursively(root);
    }
}
