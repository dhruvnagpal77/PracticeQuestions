package Maximum_Depth_of_Binary_Tree_leetcode;

//Definition for a binary tree node.
public class TreeNode {
    private int val;
    private TreeNode left;
    private TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    int getValue() {
        return this.val;
    }

    TreeNode getLeft() {
        return this.left;
    }

    TreeNode getRight() {
        return this.right;
    }

    void setValue(int val) {
        this.val = val;
    }

    void setLeft(TreeNode left) {
        this.left = left;

    }

    void setRight(TreeNode right) {
        this.right = right;
    }
}