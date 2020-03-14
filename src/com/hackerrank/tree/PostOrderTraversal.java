package com.hackerrank.tree;

/**
 * Post Order
 *  Left -> Right -> Root
 */
public class PostOrderTraversal {

    public static void postOrder(Node root) {

        if(null == root)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);


    }
}
