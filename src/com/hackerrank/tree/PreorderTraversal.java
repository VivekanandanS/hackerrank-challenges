package com.hackerrank.tree;

public class PreorderTraversal {

    class Node {
        int data;
        Node left;
        Node right;
    }

    public static void preOrder(Node root) {

        if(null == root)
            return;
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
}
