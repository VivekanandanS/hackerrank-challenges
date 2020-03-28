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

        for (int i = 0; (i < indexes.length) && (i < numberOfNodes); i++) {

            if (indexes[i][0] > 0)
                tree[i].left = tree[indexes[i][0] - 1];

            if (indexes[i][1] > 0)
                tree[i].right = tree[indexes[i][1] - 1];

        }

        doDepthAnalysis(tree[0], 1);
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


            int h, k;
            k = h = queries[i];


            System.out.println("K :" + k);
            System.out.println("H :" + h);
            List<Node> nodesAtDepth = null;
            while ( h  < depth.length  &&  depth[h].size() > 0) {
                nodesAtDepth = depth[h];
                System.out.println("Current Depth : " + h);
                System.out.println(depth[h].toString());
                nodesAtDepth.forEach(node -> {

                    System.out.println("Current Node " + node);
                    System.out.println("Current Left" + node.left);
                    System.out.println("Current Right" + node.right);
                    System.out.println();

                    Node current = tree[node.data - 1];
                    Node temp = current.right;
                    current.right = current.left;
                    current.left = temp;
                    tree[node.data - 1] = current;


                    System.out.println("Current Node " + tree[node.data - 1]);
                    System.out.println("Current Left" + tree[node.data - 1].left);
                    System.out.println("Current Right" + tree[node.data - 1].right);
                    System.out.println();

                });

                h += k;
                System.out.println("Next Depth : " + h);
                System.out.println();
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


        indexes = new int[][]{
                {2, 3},
                {-1, -1},
                {-1, -1},

        };


        /*indexes = new int[][]{
                {2, 3},
                {4, -1},
                {5, -1},
                {6, -1},
                {7, 8},
                {-1, 9},
                {-1, -1},
                {10, 11},
                {-1, -1},
                {-1, -1},
                {-1, -1}
        };*/

        int[] queries = new int[]{1, 1};


        numberOfNodes = 3;

        int[][] result = swapNodes(indexes, queries);
        for (int resultRowItr = 0; resultRowItr < result.length; resultRowItr++) {

            for (int resultColumnItr = 0; resultColumnItr < result[resultRowItr].length; resultColumnItr++) {
                System.out.print(String.valueOf(result[resultRowItr][resultColumnItr]));
                if (resultColumnItr != result[resultRowItr].length - 1) {
                    System.out.print(" ");
                }
            }
            if (resultRowItr != result.length - 1)
                System.out.println();
        }

    }
}
