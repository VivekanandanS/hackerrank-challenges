package com.hackerrank.tree;

/**
 * @see  `https://www.hackerrank.com/challenges/binary-search-tree-lowest-common-ancestor`
 */
class LowestCommonAncester {

    public static Node lca(Node root, int v1, int v2) {
        /** Edge case, solving either v1 or v2 to be root node **/
        if(root.data == v1 || root.data == v2)
            return root;
        /** If current node falls in between v1 and v2 (might be down somewhere on the tree, why should I care about) **/
        if((root.data > v1 && root.data < v2 )|| (root.data < v1 && root.data > v2 ))
            return root;
        /** Both are on right to the node **/
        if(root.data < v1 && root.data < v2)
            return lca(root.right,  v1,  v2);
        /** Both are on left to the node **/
        return lca(root.left,  v1,  v2);
    }

}
