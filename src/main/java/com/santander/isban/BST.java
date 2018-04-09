package com.santander.isban;

public class BST {


    static class Node {
        int key;
        Node left;
        Node right;

        Node(int key) {
            this.key = key;
        }
    }

    private static int counter;


    /*
    * Complete the function below.
    */
    static void createBST(int[] keys) {

        Node root = null;
        counter = 0;

        for (int key : keys) {
            if (root != null) {
                insert(root, key);
            } else {
                root = new Node(key);
            }

            System.out.println(counter);

        }


    }


    private static void insert(Node root, int key) {

        counter++;

        if (key < root.key) {
            if (root.left == null) {
                root.left = new Node(key);
            } else {
                insert(root.left, key);
            }
        } else {
            if (root.right == null) {
                root.right = new Node(key);
            } else {
                insert(root.right, key);
            }
        }

    }

}
