package com.hackerrank.tree;

/**
 * Post Order
 *  Left -> Right -> Root
 */
public class PostOrderTraversal {

    class Node {
        int data;
        Node left;
        Node right;
    }

    public static void postOrder(Node root) {

        if(null == root)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);


    }
}
