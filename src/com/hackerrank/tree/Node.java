package com.hackerrank.tree;

public class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }


    public static Node insert(Node root, int data) {
        if (root == null)
            return new Node(data);
        Node cursor;
        if (data <= root.data) {
            cursor = insert(root.left, data);
            root.left = cursor;
        } else {
            cursor = insert(root.right, data);
            root.right = cursor;
        }
        return root;
    }

    @Override
    public String toString() {
        return data + "";
    }
}
