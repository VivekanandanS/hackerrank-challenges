package com.hackerrank.tree;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwapNodes {


    public static int numberOfNodes = 0;
    public static Node[] tree = null;
    public static List[] depth = null;
    public static int index = 0;

    public static void construct(int[][] indexes) {
        tree = new Node[numberOfNodes];
        depth = new ArrayList[numberOfNodes];

        for (int i = 0; i < numberOfNodes; i++) {
            tree[i] = new Node(i + 1);
            depth[i] = new ArrayList<>();
        }

        for (int i = 0; i < indexes.length; i++) {
            if (indexes[i][0] > 0)
                tree[i].left = tree[indexes[i][0] - 1];

            if (indexes[i][1] > 0)
                tree[i].right = tree[indexes[i][1] - 1];
        }

        doDepthAnalysis(tree[0], 0);
    }


    public static void doDepthAnalysis(Node root, int height) {
        if (null == root)
            return;
        depth[height].add(root);
        doDepthAnalysis(root.left, height + 1);
        doDepthAnalysis(root.right, height + 1);
    }


    static int[][] swapNodes(int[][] indexes, int[] queries) {

        int[][] result = new int[queries.length][indexes.length];
        construct(indexes);
        for (int i = 0; i < queries.length; i++) {

            List<Node> nodesAtDepth = depth[queries[i] - 1];
            int h, k;
            k = h = queries[i];
            while (h <= numberOfNodes) {
                nodesAtDepth.forEach(node -> {
                    Node current = tree[node.data - 1];
                    Node temp = current.right;
                    current.right = current.left;
                    current.left = temp;
                });
                h += k;
            }


            index = 0;
            result[i] = traversal(tree[0], new int[numberOfNodes]);
        }

        return result;
    }


    public static int[] traversal(Node root, int[] result) {

        if (null == root)
            return result;
        result = traversal(root.left, result);
        result[index++] = root.data;
        result = traversal(root.right, result);
        return result;

    }


    public static void main(String[] args) {

        int[][] indexes = new int[][]{
                {2, 3},
                {-1, 4},
                {-1, 5},
                {-1, -1},
                {-1, -1}

        };
        int[] queries = new int[]{2};
        numberOfNodes = 5;

        int[][] result = swapNodes(indexes, queries);
        /*for (int resultRowItr = 0; resultRowItr < result.length; resultRowItr++) {

            for (int resultColumnItr = 0; resultColumnItr < result[resultRowItr].length; resultColumnItr++) {
                System.out.print(String.valueOf(result[resultRowItr][resultColumnItr]));
                if (resultColumnItr != result[resultRowItr].length - 1) {
                    System.out.println(" ");
                }
            }
            if (resultRowItr != result.length - 1)
                System.out.println();
        }*/

    }
}
