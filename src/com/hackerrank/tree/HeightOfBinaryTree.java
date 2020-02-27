package com.hackerrank.tree;


import java.util.*;
import java.io.*;

class Node<T> {
    Node left;
    Node right;
    T data;

    Node(T data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

    public static int height(Node root) {
        if (null == root)
            return -1;
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left, right) + 1;
    }


}