package Maximum_Depth_of_Binary_Tree_leetcode;

//Given the root of a binary tree,return its maximum depth.
//A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

class Solution {
    int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.getLeft());
        int right = maxDepth(root.getRight());
        return 1 + Math.max(left, right);
    }
}