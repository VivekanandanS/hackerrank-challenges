package com.hackerrank.tree;

import java.util.*;

import com.hackerrank.tree.HeightOfBinaryTree;

public class LevelOrderTraversal {


    public static Map<Integer, List<Node>> map = new TreeMap<Integer, List<Node>>();


    public static void levelOrder(Node root) {
        int height = HeightOfBinaryTree.height(root);
        for (int i = 0; i <= height; i++) {
            System.out.println("Height " + i);
            printNodeAtGivenLevel(root, i);
        }
    }

    public static void printNodeAtGivenLevel(Node root, int height) {

        if (null == root)
            return;
        if (height == 0)
            System.out.println(root.data + " ");
        else if (height > 0) {

            printNodeAtGivenLevel(root.left, height - 1);
            printNodeAtGivenLevel(root.right, height - 1);
        }
    }


    public static void main(String[] args) {
        Node root = null;
        int[] input = new int[]{1, 2, 5, 3, 6, 4};
        for (int i = 0; i < input.length; i++) {
            root = Node.insert(root, input[i]);
        }
        System.out.println("Start");
        levelOrder(root);
    }
}