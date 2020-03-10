package com.hackerrank.tree;

public class TopView {

    class Node {
        int data;
        Node left;
        Node right;
    }

    public static  void printLeft(Node root){
        if(null == root)
            return;
        printLeft(root.left);
        System.out.println(root.data);
    }


    public static  void printRight(Node root){
        if(null == root)
            return;
        printLeft(root.right);
        System.out.println(root.data);
    }

    public static void topView(Node root) {

        printLeft(root);
        System.out.println(root.data);
        printRight(root);

    }

}
