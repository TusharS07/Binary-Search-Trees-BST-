package com.bridhelabz.bst;

public class Main {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.add(56);
        binaryTree.add(30);
        binaryTree.add(70);

        int size = binaryTree.getSize();
        System.out.println(size);
    }

}
