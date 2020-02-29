package main.com.hackerrank.tree;


/**
 * @see  `https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree`
 */
public class IsBinarySearchTree {

    class Node {
        int data;
        Node left;
        Node right;
    }

    boolean checkBST(Node root) {
        if(null == root)
            return true;
        if(null != root.left && root.left.data > root.data)
            return false;
        if(null != root.right && root.right.data < root.data)
            return false;
        return checkBST(root.left) || checkBST(root.right);
    }


}
