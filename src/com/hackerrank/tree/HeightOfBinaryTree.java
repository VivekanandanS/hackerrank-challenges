package com.hackerrank.tree;


public class HeightOfBinaryTree {

    public static int height(Node root) {
        if (null == root)
            return -1;
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left, right) + 1;
    }


}