package com.hackerrank.tree;

/**
 * @see `https://www.hackerrank.com/challenges/tree-huffman-decoding/problem`
 */
public class HuffmanDecoding {


    public int traverse(Node root, String s, int index) {
        if ((int)root.data == 0 && s.charAt(index) == '1')
            return traverse(root.right, s, index + 1);
        if ((int)root.data == 0 && s.charAt(index) == '0')
            return traverse(root.left, s, index + 1);
        System.out.print(root.data);
        return index;
    }

    void decode(String s, Node root) {

        for (int i = 0; i < s.length(); i++) {
            i = traverse(root, s, i) - 1;
        }
    }
}
