package com.hackerrank.tree;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @expected o/p
 * 1 2 4 14 23 37 108 111 115 116 83 84 85
 * @see `https://www.hackerrank.com/challenges/tree-top-view/problem`
 */

public class VerticalOrder {

    public static TreeMap<Integer, ArrayList<Node>> map = new TreeMap<Integer, ArrayList<Node>>();


    public static class Node {
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }


    }


    public static void traverse(Node root, int value) {

    }

    public static void verticalTraverse(Node root, int value) {
        if (null == root)
            return;
        ;
        ArrayList<Node> list = map.get(value);
        if (null == list)
            list = new ArrayList<Node>();
        list.add(root);
        map.put(value, list);
        verticalTraverse(root.left, value - 1);
        verticalTraverse(root.right, value + 1);
    }


    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] inputs = new int[]{37, 23, 108, 59, 86, 64, 94, 14, 105, 17, 111, 65, 55, 31, 79, 97, 78, 25, 50, 22, 66, 46, 104, 98, 81, 90, 68, 40, 103, 77, 74, 18, 69, 82, 41, 4, 48, 83, 67, 6, 2, 95, 54, 100, 99, 84, 34, 88, 27, 72, 32, 62, 9, 56, 109, 115, 33, 15, 91, 29, 85, 114, 112, 20, 26, 30, 93, 96, 87, 42, 38, 60, 7, 73, 35, 12, 10, 57, 80, 13, 52, 44, 16, 70, 8, 39, 107, 106, 63, 24, 92, 45, 75, 116, 5, 61, 49, 101, 71, 11, 53, 43, 102, 110, 1, 58, 36, 28, 76, 47, 113, 21, 89, 51, 19, 3};
        inputs = new int[]{1, 2, 5, 3, 6, 4};
        Node root = null;
        for (int i = 0; i < inputs.length; i++) {
            root = insert(root, inputs[i]);
        }
        scan.close();
        verticalTraverse(root, 0);
        System.out.println(map.toString());
    }
}