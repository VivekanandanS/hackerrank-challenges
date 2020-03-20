package com.hackerrank.tree;

public class InOrderTraversal {


    public static void inOrder(Node root) {
        if(null == root)
            return;
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
}
