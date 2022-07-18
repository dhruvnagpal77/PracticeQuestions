package Maximum_Depth_of_Binary_Tree_leetcode;

//Definition for a Binary search tree.
class BinarySearchTree {
    private TreeNode root;

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public TreeNode getRoot() {
        return root;
    }

    void insert(int val) {
        TreeNode newNode = new TreeNode(val);
        if (this.root == null) {
            this.root = newNode;
            return;
        }
        TreeNode currentNode = this.root;
        while (true) {
            //Left
            if (val < currentNode.getValue()) {
                if (currentNode.getLeft() == null) {
                    currentNode.setLeft(newNode);
                    return;
                }
                currentNode = currentNode.getLeft();
            } else {
                //Right
                if (currentNode.getRight() == null) {
                    currentNode.setRight(newNode);
                    return;
                }
                currentNode = currentNode.getRight();
            }
        }

    }
}